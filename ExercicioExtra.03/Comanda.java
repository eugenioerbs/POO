/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */

public class Comanda {
    private String codigo;
    public ArrayList<Produto> produtos;
    
    public Comanda (String codigo) {
        setCodigo(codigo);
        produtos = new ArrayList<>();
        
    }//construtor

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    public void incluirProdutoNaComanda (Produto p, ArrayList<Comanda> comandas, String codigo) {
        Comanda comandaProcurada = null;
        boolean comandaEncontrada = false;
        
        for (Comanda a : comandas) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                comandaProcurada = a;
                comandaEncontrada = true;
                break;
            }
        }
        
        if (comandaEncontrada != false) {
            comandaProcurada.produtos.add(p);
        } else if (comandaEncontrada != true) {
            JOptionPane.showMessageDialog(null, "Comanda não encontrada, ou não existe");
        }
    }
    
    
    public double finalizarComanda (String codigo, ArrayList<Comanda> comandas) {
        double calculo = 0;
        
        for (Comanda a : comandas) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                for (Produto b : a.getProdutos()) {
                    calculo += (b.getValor() * b.getQuantidade());
                }
                return calculo;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Comanda não encontrada, ou não existe");
        return 0;      
    }
    
    
}//classe
