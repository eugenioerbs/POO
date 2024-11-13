/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */

public class Comanda {
    private ArrayList<Item> itens = new ArrayList<>();
    private TipoBuffet tipoBuffet;
    
    public Comanda (TipoBuffet tipoBuffet) throws IllegalArgumentException {
        setTipoBuffet(tipoBuffet);
        itens = new ArrayList<>();
        
    }//construtor

    
    public TipoBuffet getTipoBuffet() {
        return tipoBuffet;
    }

    public void setTipoBuffet(TipoBuffet tipoBuffet) throws IllegalArgumentException {
        if (tipoBuffet == null) {
            throw new IllegalArgumentException("Deve ser informado um tipo de buffet");
        }
         this.tipoBuffet = tipoBuffet;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }    
    
    
    public double calcularValorComanda (Comanda comand) {
         double calculo = 0;
        
        if (comand.tipoBuffet == TipoBuffet.LIVRE) {           
            calculo = 30;  
            
        } else if (comand.tipoBuffet == TipoBuffet.QUILO) {
                for (Item a : itens) {
                calculo += a.getValor();
               }
        }

        return calculo;
    }
    
    
    public void incluirItem (Item i, Comanda comand) {
        boolean itemEncontrado = false;
        
        for (Item a : itens) {
            if (a.getNome().equalsIgnoreCase(i.getNome())) {
                JOptionPane.showMessageDialog(null, "Este item ja existe na comanda!");
                itemEncontrado = true;
                break;
            }
        }
        
        if (itemEncontrado != true) {
            itens.add(i);
            JOptionPane.showMessageDialog(null, "Item adicionado com sucesso na comanda!");
        }       
    }
    
    
    public void removerItem (Item i) {
        boolean itemEncontrado = false;
        Item itemDesejado = null;
        
        for (Item a : itens) {
            if (a.getNome().equalsIgnoreCase(i.getNome())) {
                itemDesejado = a;
                itemEncontrado = true;
                break;
            }
        }
        
        if (itemEncontrado != false && itemDesejado != null) {
            itens.remove(itemDesejado);
            JOptionPane.showMessageDialog(null, "Item adicionado com sucesso na comanda!");
        }           
    }
    
    
}//classe
