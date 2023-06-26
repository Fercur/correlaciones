/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.componentes;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JLabel;

/**
 *
 * @author valer
 */
public class Validaciones {
    //método --> validar solo número
    public void validarNumeros( KeyEvent evt){ //clase JeyEvent -->Idnetificar eventos desde el teclado
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            //evitar ingreso
            evt.consume();
        }
    }
    //métodos --> ingresar solo letras
    public void validaLetras(KeyEvent evt){
        char validar=evt.getKeyChar();
        if(validar>=33 && validar<=64|| validar>=91 && validar<=96 
                ||validar>=123 && validar<=126||validar>=239
                && validar<=250){
            evt.consume();
        }
    }
    //método--> ingresar solo letras y numeros
    public void validarLetrasNuemros(KeyEvent evt){
        char validar=evt.getKeyChar();
        if(!Character.isLetterOrDigit(validar)){
            evt.consume();
        }
    }
    public void truncar(double valor, javax.swing.JTextField campoTexto){
    DecimalFormat decimalFormat = new DecimalFormat("#.###");
    String valorTruncado = decimalFormat.format(valor);
    campoTexto.setText(valorTruncado);
    }
    public void pasarDatos(JLabel jTpy,JLabel jTapi,JLabel jTty,JLabel jTrg,JLabel jTpsep,JLabel jTtsep,JLabel jTna,JLabel jTrgp,double Py,double API,double Ty,double rg,double Psep,double Tsep,double Na,double RGP){
        jTpy.setText(String.valueOf(Py));
        jTapi.setText(String.valueOf(API));
        jTty.setText(String.valueOf(Ty));
        jTrg.setText(String.valueOf(rg));
        jTpsep.setText(String.valueOf(Psep));
        jTtsep.setText(String.valueOf(Tsep));
        jTna.setText(String.valueOf(Na));
        jTrgp.setText(String.valueOf(RGP));
    }
}
