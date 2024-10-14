
import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eugênio
 */


//LocalDate.now();
//LocalDateTime.now();

public class Movimento {
    private double valor;
    private TipoMovimento tipoMovimento;
    private LocalDate dataAcao;
    private LocalDateTime horaAcao;
       
    public Movimento (double valor, TipoMovimento tipoMovimento, LocalDate dataAcao, LocalDateTime horaAcao) {
        setValor(valor);
        setTipoMovimento(tipoMovimento);
        setHoraAcao(horaAcao);
        
    }

    
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

    public LocalDate getDataAcao() {
        return dataAcao;
    }

    public void setDataAcao(LocalDate dataAcao) {
        this.dataAcao = dataAcao;
    }

    public LocalDateTime getHoraAcao() {
        return horaAcao;
    }

    public void setHoraAcao(LocalDateTime horaAcao) {
        this.horaAcao = horaAcao;
    }
       
    
}
