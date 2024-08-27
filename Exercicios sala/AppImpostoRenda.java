
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class AppImpostoRenda {
    
    private ImpostoRenda [] clientes;
    private int indice;
    
    public AppImpostoRenda (){
        clientes = new ImpostoRenda[10];
        indice = 0;
        
        int op;
        do {
            String opcao = JOptionPane.showInputDialog(" Digite uma opção: "
                    + "\n 1 - Adicionar funcionário (MAX. 10)" 
                    + "\n 2 - Calcular Imposto de renda"                   
                    + "\n 4 - Sair");
            
            op = Integer.parseInt(opcao);
            
            switch (op) {
                
                    case 1:
                    if (indice < clientes.length){
                    String nome = JOptionPane.showInputDialog("Informe seu nome: ");
                    String salarioStr = JOptionPane.showInputDialog("Informe seu salario: ");
                    double salario = Double.parseDouble(salarioStr);
                    ImpostoRenda cliente =  new ImpostoRenda(nome, salario);
                    clientes[indice] = cliente;
                    indice++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Número máximo de funcionários atingido!");
                    }   
                    break;
                    
                    case 2:
                    String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");
                    double salarioCliente = 0.0;
                    
                    for(int a = 0; a < indice; a++){
                        if (clientes[a].getNome().equals(nomeCliente)){
                            salarioCliente = clientes[a].getSalario();
                            break;
                        }
                    }
                    ImpostoRenda clienteParaCalculo = new ImpostoRenda(nomeCliente, salarioCliente);
                    double imposto = clienteParaCalculo.calcularirpf();
                    DecimalFormat df = new DecimalFormat("0.00");
                    String impostoFormatado = df.format(imposto);
                    JOptionPane.showMessageDialog(null, "O imposto a ser pago é: R$ " + impostoFormatado);
                    break;
                    case 4:
                    
                    break;
                    default:
                    throw new AssertionError();
            }
            
        } while (op != 4);
        
        
    } // constructor
    
    public static void main(String[] args) {
        new AppImpostoRenda();
    } // static
    
    
} // classe
