//Eugênio Victor Erbs | Manhã BCC

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codes;





/**
 *
 * @author Eugênio
 */



/**
 * Classe que abriga os atributos, o contrutor e os métodos de identificação de temporada e identificação de valor
 * a pagar.
 * @author Eugênio
 */
public class Estadia {
    private String periodo;
    private int quantidadeDias;
    
    /**
     * Construtor responsável por facilidar a entrada de parâmetros.
     * @param periodo
     * @param quantidadeDias 
     */
    public Estadia(String periodo, int quantidadeDias){
        setPeriodo(periodo);
        setQuantidadeDias(quantidadeDias);
    } // CONSTRUTOR

    
    
    public String getPeriodo() {
        return periodo;
    }
    public int getQuantidadeDias() {
        return quantidadeDias;
    }
    /**
     * 
     * @param periodo
     * @throws IllegalArgumentException 
     */
    public void setPeriodo(String periodo)throws IllegalArgumentException {
        if (periodo.equals("")){
            throw new IllegalArgumentException("Periodo inválido");
        }
        this.periodo = periodo;
    }

    /**
     * Set com lógica responsável por barrar as entradas de dados inválidas.
     * @param quantidadeDias 
     */
    public void setQuantidadeDias(int quantidadeDias) {
        if (quantidadeDias <= 0){
            throw new IllegalArgumentException("Quantidade de dias inválidos");  
        }
        this.quantidadeDias = quantidadeDias;
    }
    
    
    /**
     * Método, com retorno, responsável por manipular os dados de entrada e a partir deles identificar em qual periodo o objeto
     * se encontra.
     * @return 
     */
    public Periodo identificarPeriodo (){
        if (periodo.equals("dezembro") || periodo.equals("janeiro") || periodo.equals("fevereiro")){
            return Periodo.ALTA_TEMPORADA;
        } if (periodo.equals("março") || periodo.equals("abril")){
            return Periodo.MEDIA_TEMPORADA;
        } if (periodo.equals("maio") || periodo.equals("junho") || periodo.equals("julho") || periodo.equals("agosto") || periodo.equals("setembro") || periodo.equals("outubro") || periodo.equals("novembro")){
            return Periodo.BAIXA_TEMPORADA;
        }
        //
        return null;
    }
    
    /**
     * Método com retorno, responsável por manipular os dados de entrada e a partir deles identificar qual valor o "objeto"
     * deverá pagar
     * @return 
     */
    public float precoPagar () {
        Periodo p = identificarPeriodo();
        float respostaCalculoPagar = 0;
        int qntDias = quantidadeDias;
        
        switch (p) {
            case ALTA_TEMPORADA:
            if (qntDias > 7){
               float acrescimoAltaTemp = (150 * 20) / 100;
               float valorFimAltaTemp = 150 + acrescimoAltaTemp;
               float descontoDois = (valorFimAltaTemp * 2) / 100;
               float descontoMaisSeteDias = valorFimAltaTemp - descontoDois;
               respostaCalculoPagar = qntDias * descontoMaisSeteDias;
               
            } else if (qntDias == 1){
               float acrescimoAltaTemp = (150 * 20) / 100;
               float acrescimoSeApenasUm = (acrescimoAltaTemp * 5) / 100;
               float valorFimAltaTemp = 150 + acrescimoSeApenasUm;
               respostaCalculoPagar = qntDias * valorFimAltaTemp;
               
            } else{
               float acrescimoAltaTemp = (150 * 20) / 100;
               float valorFimAltaTemp = 150 + acrescimoAltaTemp;
               respostaCalculoPagar = (qntDias * valorFimAltaTemp);
            }           
            break;
            
            case MEDIA_TEMPORADA:
            if (qntDias == 1){
             float acrescimoUmdia = (150 * 5) / 100; //7,5
             float valorFinal = 150 + acrescimoUmdia; 
             respostaCalculoPagar = qntDias * valorFinal;
            } else if (qntDias > 1) {
             respostaCalculoPagar = qntDias * 150;    
            }   
            break;
            
            
            case BAIXA_TEMPORADA:
              if (qntDias == 1) {
                  float descontoBaixaTemp = (150 * 30) / 100;  // 45
                  float valorFimBaixaTemp = 150 - descontoBaixaTemp; //105
                  float acrescimoo = (valorFimBaixaTemp * 5) / 100; //5,25
                  float valorFim = valorFimBaixaTemp + acrescimoo; // 110,25
                  respostaCalculoPagar = qntDias * valorFim;
              } else if (qntDias > 1){
                  float descontoBaixaTemp = (150 * 30) / 100;  // 45
                  float valorFimBaixaTemp = 150 - descontoBaixaTemp; 
                  respostaCalculoPagar = (qntDias * valorFimBaixaTemp);
              }           
            break;
            
            default:
            throw new AssertionError();
        }
        return respostaCalculoPagar;
    }
    
    
} // CLASSE
