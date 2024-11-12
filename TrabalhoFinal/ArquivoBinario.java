/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Usuario
 */

public class ArquivoBinario {
    
    
    public void salvarArquivo (File file, String texto) {
        try (ObjectOutputStream out =  new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(texto);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String abrirArquivo (File file) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (String) in.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    
    
}//classe
