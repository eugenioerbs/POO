/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Eugênio
 */

public class Movimento {
    private double valor;
    private TipoMovimento tipoMovimento;
    private LocalDate data;
    private LocalTime hora;
    
    public Movimento (double valor, TipoMovimento tipoMovimento, LocalDate data, LocalTime hora) {
        setValor(valor);
        setTipoMovimento(tipoMovimento);
        setData(data);
        setHora(hora);
        
    }//construtor

    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
       
}//classe
