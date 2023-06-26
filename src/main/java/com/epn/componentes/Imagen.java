/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.componentes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author valer
 */
public class Imagen {
  
    public ImageIcon redimensionarImagen(String path, int ancho, int alto) {
        ImageIcon miImagen=null;
        if(path!=null){
        miImagen= new ImageIcon(path);
        }
   
        Image img = miImagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        ImageIcon imagenRedimiensionada = new ImageIcon(img);
        return imagenRedimiensionada;
        
    }  
    public void mostrarImagenes(JLabel cuadro,String path) {
      
       
        cuadro.setIcon(redimensionarImagen(path, cuadro.getWidth(), cuadro.getHeight()));

    }
}
