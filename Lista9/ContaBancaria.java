/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class ContaBancaria {
    private int numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimentos = new ArrayList<>();
    
    public ContaBancaria (int numero, double saldo, Cliente titular) {
        setNumero(numero);
        setSaldo(saldo);
        setTitular(titular);
        movimentos = new ArrayList<>();
        
    }//construtor

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <=0) {
            throw new IllegalArgumentException("Numero nao pode ser menor que 0");
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(ArrayList<Movimento> movimentos) {
        this.movimentos = movimentos;
    }
    
    
    public void depositar (double valorr, String nome, ArrayList<ContaBancaria> contas) {
        if (valorr <= 0) {
            JOptionPane.showMessageDialog(null, "Valor nao pode ser negativo!");
            return;
        }
        
        boolean contaEncontrada = false;
        for (ContaBancaria a : contas) {
            if (a.getTitular().getNome().equalsIgnoreCase(nome)) {
                a.setSaldo(a.getSaldo() + valorr);
                JOptionPane.showMessageDialog(null, "Valor depositado com sucesso :)");
                contaEncontrada = true;
                Movimento movimento = new Movimento(valorr, TipoMovimento.CREDITO, LocalDate.now(), LocalTime.now());
                incluirMovimento(movimento);
                break;
            }
        }
        if (contaEncontrada != true) {
            JOptionPane.showMessageDialog(null, "Conta não foi encontrada :(");
        }
    }
        
    
    public void sacar (double valorr, String nome, ArrayList<ContaBancaria> contas) {
        if (valorr <= 0) {
            JOptionPane.showMessageDialog(null, "Valor nao pode ser negativo!");
            return;
        }
        
        ContaBancaria contaDesejada = null;
        boolean contaEncontrada = false;
        for (ContaBancaria a : contas) {
            if (a.getTitular().getNome().equalsIgnoreCase(nome)) {
                contaDesejada = a;               
                contaEncontrada = true;
                break;
            }
        }
        
        if (contaEncontrada != false && contaDesejada.getSaldo() >= valorr) {
            contaDesejada.setSaldo(contaDesejada.getSaldo() - valorr);
            Movimento movimento = new Movimento(valorr, TipoMovimento.DEBITO, LocalDate.now(), LocalTime.now());
            incluirMovimento(movimento);
            JOptionPane.showMessageDialog(null, "Valor sacado com sucesso :)");
        }
        
        if (contaEncontrada != false && contaDesejada.getSaldo() < valorr) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente :(");
            
        } else if (contaEncontrada != true) {
            JOptionPane.showMessageDialog(null, "Conta não foi encontrada :(");           
        }
        
    }
    
    
        public void transferir (double valorr, String doador, String receptor, ArrayList<ContaBancaria> contas) {       
        
        if (valorr <= 0) {
            JOptionPane.showMessageDialog(null, "O valor não pode ser negativo!");
            return;
        }
                
        ContaBancaria contaDoador = null;        
        boolean doadorEncontrado = false;
        
        for (ContaBancaria a : contas) {            
            if (a.getTitular().getNome().equalsIgnoreCase(doador)) {
                contaDoador = a;
                doadorEncontrado = true;
                break;
            }
        }
        
        if (doadorEncontrado != true) {
            JOptionPane.showMessageDialog(null, "Conta do titular doador não foi encontrada!");
            return;
        }
       
        ContaBancaria contaReceptor = null;        
        boolean receptorEncontrado = false;
        
            for (ContaBancaria b : contas) {
                if (b.getTitular().getNome().equalsIgnoreCase(receptor)) {
                    contaReceptor = b;
                    receptorEncontrado = true;
                    break;
                }
            }
            
            if (receptorEncontrado != true) {
                JOptionPane.showMessageDialog(null, "Conta do titular receptor não foi encontrada!");
                return;
            }
            
            if (contaDoador.saldo < valorr) {
                JOptionPane.showMessageDialog(null, "Saldo do titular doador insuficiente!");
                
            } else {
                contaDoador.setSaldo(contaDoador.getSaldo() - valorr);
                contaReceptor.setSaldo(contaReceptor.getSaldo() + valorr);
                JOptionPane.showMessageDialog(null, "Transferência bem sucedida!");
            }
    }
        
        protected void incluirMovimento (Movimento movimento) {
            movimentos.add(movimento);
        }
    
        
        public String exibirMovimentos (int numero, ArrayList<ContaBancaria> contas) {
            StringBuilder dados = new StringBuilder();
            
            for (ContaBancaria a : contas) {
                if (a.getNumero() == numero) {
                    ArrayList<Movimento> movimentos = a.getMovimentos();
                    
                    if (movimentos.isEmpty()) {
                        dados.append("Nenhum movimento encontrado na conta");
                    } else {
                        for (Movimento m : movimentos) {
                       dados.append("Data: ").append(m.getData()).append("\n")
                            .append("Hora: ").append(m.getHora()).append("\n")
                            .append("Valor R$ ").append(m.getValor()).append("\n")
                            .append("Tipo: ").append(m.getTipoMovimento()).append("\n")
                            .append("\n--------------------------------------------------");
                        }
                    }
                    break;
                }
                
            }
            if (dados.isEmpty()) {
                dados.append("Conta não encontrada :(");
            }
            return dados.toString();
        }
        
    
}//classe
