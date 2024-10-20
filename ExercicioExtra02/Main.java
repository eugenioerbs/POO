/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */

public class Main {
    ArrayList<Gasto> gastos = new ArrayList();
    private Gasto gasto;
    
    public Main () {
        int op;
        
        do {
            String opcao = JOptionPane.showInputDialog("ESCOLHA\n"
                    + "1 - Registrar gasto\n"
                    + "2 - Calcular total de gastos");
            op = Integer.parseInt(opcao);
            
            switch (op) {
                case 1:
                    String tipoGastoString = JOptionPane.showInputDialog("Informe o tipo de gasto\n"
                            + "1 - Remédio\n"
                            + "2 - Roupa\n"
                            + "3 - Refeição");
                    int tipoGastoInt = Integer.parseInt(tipoGastoString);
                    TipoGasto tipoGasto = identificarTipoGasto(tipoGastoInt);
                    LocalDate data = LocalDate.now();
                    String valorString = JOptionPane.showInputDialog("Informe o valor do gasto");
                    double valor = Double.parseDouble(valorString);
                    String formaPagamentoString = JOptionPane.showInputDialog("Informe a forma de pagamento\n"
                            + "1 - Dinheiro\n"
                            + "2 - Cheque\n"
                            + "3 - Cartão\n"
                            + "4 - Cheque Pré");
                    int formaPagamentoInt = Integer.parseInt(formaPagamentoString);
                    FormaPagamento formaPagamento = identificarFormaPagamento(formaPagamentoInt);
                    
                    try {
                        gasto = new Gasto(tipoGasto, data, valor, formaPagamento);
                        gastos.add(gasto);
                        JOptionPane.showMessageDialog(null, "Gasto registrado :)");
                        
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    
                    
                    break;
                case 2:
                    String dados = gasto.calcularTotalGastos(gastos);
                    JOptionPane.showMessageDialog(null, dados);
                    
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (true);
        
    }//construotor
    public static void main(String[] args) {
        Main main = new Main();
    }
    
    
    public TipoGasto identificarTipoGasto (int tipoGastoInt) {
        switch (tipoGastoInt) {
            case 1:
                return TipoGasto.REMEDIO;
            case 2:
                return TipoGasto.ROUPA;
            case 3:
                return TipoGasto.REFEICAO;
            default:
                break;
        }
        return null;
    }
    
    
    public FormaPagamento identificarFormaPagamento (int formaPagamentoInt) {
        switch (formaPagamentoInt) {
            case 1:
                return FormaPagamento.DINHEIRO;
            case 2:
                return FormaPagamento.CHEQUE;
            case 3:
                return FormaPagamento.CARTAO;
            case 4:
                return FormaPagamento.CHEQUEPRE;
            default:
                break;
        }
        return null;
    }
    
    
}//class
