public class FuncionariosMolde {
   private String nome;
   private double salario;
    
   public FuncionariosMolde (String nome, double salario){
       this.nome = nome;
       this.salario = salario;
   }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    
    public double calcularIrpf (){
        double valorPagar = 0.0;

        if (salario <= 1903.98) {
      
    } else if (salario <= 2826.65) {
        double diferenca = (salario - 1903.98) * 7.5;
        valorPagar = diferenca / 100;
      
    } else if (salario <= 3751.05) {
        double diferenca1 = (2826.65 - 1903.98) * 7.5;
        double diferenca2 = (salario - 2826.65) * 15;
        valorPagar = (diferenca1 + diferenca2) / 100;
      
    } else if (salario <= 4664.68) {
        double diferenca1 = (2826.65 - 1903.98) * 7.5;
        double diferenca2 = (3751.05 - 2826.65) * 15;
        double diferenca3 = (salario - 3751.05) * 22.5;
        valorPagar = (diferenca1 + diferenca2 + diferenca3) / 100;
        
    } else if (salario > 4664.68) {
        double diferenca1 = (2826.65 - 1903.98) * 7.5;
        double diferenca2 = (3751.05 - 2826.65) * 15;
        double diferenca3 = (4664.68 - 3751.05) * 22.5;
        double diferenca4 = (salario - 4664.68) * 27.5;
        valorPagar = (diferenca1 + diferenca2 + diferenca3 + diferenca4) / 100;

    }
        return valorPagar;
    }
   
   
   
} // classe
