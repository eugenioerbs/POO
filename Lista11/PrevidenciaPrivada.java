/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Eugênio
 */

public class PrevidenciaPrivada extends Investimento {
    private double valor;
    
    public PrevidenciaPrivada (double saldo, double valor) {
        super(saldo);
        setValor(valor);
        
    }


    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    public void investir () {
        setSaldo(getSaldo() + valor);
    }

    
    @Override
    public double calcularValorPagar() {
        return 0;
    }
    
    

    
}
