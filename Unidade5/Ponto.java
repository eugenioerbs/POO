/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eugênio
 */




public class Ponto {
   private int x;
   private int y;
    
 
    public Ponto (int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    
    public Quadrante identificarQuadrante(){    
        if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
        } if (x < 0 && y > 0) {    
            return Quadrante.SEGUNDO;
        } if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        } if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        } if (x == 0){
            return Quadrante.NENHUM;
        } if (y == 0){
            return Quadrante.NENHUMM;
        }
       return null;
    }
    
    
    public boolean estaIncidindoSobreX(){
        boolean passaNoPorntoX = false;
 
        if (y == 0) {
            passaNoPorntoX = true;
        }       
       return false;
    }
    
    
    public boolean estaIncidindoSobreY(){        
        boolean passaNoPorntoY = false;
        
        if (x == 0) {
            passaNoPorntoY = true;
        }
        return false;
    }

} // CLASSE
    

