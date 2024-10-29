/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author tsegatti
 */

public class MensalidadeEnsino implements Pagavel {
    private int nrCreditos;
    private double precoCreditos;
    
    public MensalidadeEnsino (int nrCreditos, double precoCreditos) {
        setNrCreditos(nrCreditos);
        setPrecoCreditos(precoCreditos);
        
    }
    
    
    public int getNrCreditos() {
        return nrCreditos;
    }
    
    public void setNrCreditos(int nrCreditos) {
        this.nrCreditos = nrCreditos;
    }
    
    public double getPrecoCreditos() {
        return precoCreditos;
    }
    
    public void setPrecoCreditos(double precoCreditos) {
        this.precoCreditos = precoCreditos;
    }

    @Override
    public double calcularValorPagar() {
         return nrCreditos * precoCreditos;
    }
    
    
}
