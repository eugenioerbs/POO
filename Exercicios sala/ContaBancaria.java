
import javax.swing.JOptionPane;


public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public ContaBancaria(String numero, String titular, double saldoInicial) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldoInicial;
   
    } // constructor
    
    //get and set in all variables
    public String getNumero(){
    return numero;
    }
    
    public void setNumero(String numero){
    this.numero = numero;
    }
    
    
    public String getTitular(){
    return titular;
    }
    
    public void setTitular(String titular){
    this.titular = titular;
    }
    
     public double getSaldo(){
    return saldo;
    }
    
    public void setSaldo(double saldo){
    this.saldo = saldo;
    }
    
    //Métodos
      public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor de saque inválido ou insuficiente. ");
        }
    } // métod
      
       public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor de depósito inválido ");
        }
    } // métod
       
       public void transferir(ContaBancaria destino, double valor){
       if (valor > 0 && valor <= saldo ){
           this.sacar(valor);
           destino.depositar(valor);
       } else {
           JOptionPane.showMessageDialog(null, "Transferencia inválida. Verifique o valor e o saldo disponivel.");
       }
       } //
       
    

} // classe
