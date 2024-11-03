/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.io.File;

/**
 *
 * @author Eugênio
 */

public class Diretorio {
    private String nomeDiretorio;
    private int tamanho;
    
    public Diretorio (String nomeDiretorio) throws Exception {
        setNomeDiretorio(nomeDiretorio);
        File diretorio = new File(nomeDiretorio);
        if (!diretorio.isDirectory()) {
            throw new Exception("Não é um diretório");
        }
        tamanho = 0;
        tamanho = infoDiretorio(diretorio);
        System.out.println("Tamanho total: " + tamanho);
        
    }//consturtor

    
    public String getNomeDiretorio() {
        return nomeDiretorio;
    }

    public void setNomeDiretorio(String nomeDiretorio) throws Exception {
        if (nomeDiretorio.isBlank()) {
            throw new Exception("Nome deve ser informado");
        }
        this.nomeDiretorio = nomeDiretorio;
    }
    
    
    public int infoDiretorio (File diretorio) throws Exception { 
        File[] conteudoDiretorio = diretorio.listFiles();
        
        for (File item : conteudoDiretorio) {
            if (item.isDirectory()) {
                System.out.println(item.getName());
                infoDiretorio(item);
            } else {
                System.out.println(item.getName());
                tamanho += item.length();
            }
            
        }
        return tamanho;
    }
    public static void main(String[] args) throws Exception{
        Diretorio diretorio = new Diretorio("C:\\Users\\Eugênio\\Documents\\NetBeansProjects");
    }
    
}//classe
