
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class AppListaSalarial {
    
    private FuncionariosMolde[] vetor;
    private int indice;
    
    public AppListaSalarial (){
        
       vetor = new FuncionariosMolde[2];
       indice = 0;
       
       int op;
        do {          
            String escolha = JOptionPane.showInputDialog("Digite uma opção: "
                    + "\n 1 - Adicionar funcionário (max. 5) "                                      
                    + "\n 2 - Mostrar informações de funcionário "
                     + "\n 3 - Sair");
            
            op = Integer.parseInt(escolha);
            
            switch (op) {
                case 1:
                this.AddFuncionario();
                break;
                case 2:
                this.MostrarFuncionario();
                break;
                default:
                throw new AssertionError();
            }
            
        } while (op != 3);
        
    } // CONSTRUCTOR -----------------------------------------------------------
    
    
    public static void main(String[] args) {
        new AppListaSalarial();
    }
    
    private void AddFuncionario (){
        String nomeM = JOptionPane.showInputDialog("Informe o nome: ");
        String salarioM = JOptionPane.showInputDialog("Informe o salario: ");
        
        double salarioo = Double.parseDouble(salarioM);
        
         if(indice < vetor.length){
             FuncionariosMolde funcionario = new FuncionariosMolde(nomeM, salarioo);
             vetor[indice] = funcionario;
             indice++;
             JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso");
         } else{
             JOptionPane.showMessageDialog(null, "Limite de funcionários atingido");
         }
    } // METOD
   
    
    private void MostrarFuncionario (){
        String buscoEsteFunc = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        for (int a = 0; a < vetor.length; a++){
             if (buscoEsteFunc.equalsIgnoreCase(vetor[a].getNome())){
            JOptionPane.showMessageDialog(null, " Funcionário: " + vetor[a].getNome()
            + "\n Salário: " + df.format(vetor[a].getSalario())
            + "\n IRPF: " + df.format(vetor[a].calcularIrpf()));
        }
       }
    } // METOD
    
   
} // CLASSE
