/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.correlaciones;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author valer
 */
public class Manucci {
    double Py;
    double Ty;
    double RGP;
    double rg;
    double API;
    double Psep;
    double Tsep;
    double Na;
    public Manucci(){}

    public Manucci(double Py, double Ty, double RGP, double rg, double API, double Psep, double Tsep, double Na) {
        this.Py = Py;
        this.Ty = Ty;
        this.RGP = RGP;
        this.rg = rg;
        this.API = API;
        this.Psep = Psep;
        this.Tsep = Tsep;
        this.Na = Na;
    }
    public double calcularPb(double RGP,double rg,double Ty, double API){
        double Pb=84.88*(Math.pow(RGP/rg,0.53)*Math.pow(10,0.000922*Ty-0.0072*API));
        return Pb;
    }
    public double calcularRs(double rg, double Py, double Ty, double API){
        double Rs=rg*Math.pow(Py/84.88*Math.pow(10,0.0072*API-0.000922*Ty),1.8868);
        return Rs;
    }
public ArrayList<Double> calcularBo(double P, double Py, double API, double Rs, double rg, double Ty, int opcion, JLabel labelLim) {
    ArrayList<Double> calBo = new ArrayList<>();

    if (opcion == 1) {
        double deno = 141.5/(131.5-API);
        double Bo = 0.751 * Math.pow(P, -0.274) * Math.pow(Rs, 0.4624) * Math.pow(10, -0.0021 * API);
        String Lim = "<html>Presión [Pb]= 1300-4800 lpca <br> RGP en solución [Rs]= 180-2500 PCN/BN <br> Bob= 1.05-2.4 BY/BN <br> API= 15-39 °API</html>";
        calBo.add(deno);
        calBo.add(Bo);
        labelLim.setText(Lim);
    } else if(opcion == 2){
        double deno = 1.69 * Math.pow(P, -0.0429) * Math.pow(10, -0.000796) * Ty;
        double Bo = 2.49 * (Math.pow(Rs / rg, 0.1046) * Math.pow(Py, -0.0526) * Math.pow(10, -0.48 * deno));
        String Lim = "<html>Presión [Pb]= 115-4650 lpca <br> RGP en solución [Rs]= 50-1300 PCN/BN <br> Bob= 1.12-1.9 BY/BN \n API= 15-36 °API <br> ρo= 0.61-0.87 grs/cc</html>";
        calBo.add(deno);
        calBo.add(Bo);
        labelLim.setText(Lim);
    }

    return calBo;
}


            
    public double getPy() {
        return Py;
    }

    public void setPy(double Py) {
        this.Py = Py;
    }

    public double getTy() {
        return Ty;
    }

    public void setTy(double Ty) {
        this.Ty = Ty;
    }

    public double getRGP() {
        return RGP;
    }

    public void setRGP(double RGP) {
        this.RGP = RGP;
    }

    public double getRg() {
        return rg;
    }

    public void setRg(double rg) {
        this.rg = rg;
    }

    public double getAPI() {
        return API;
    }

    public void setAPI(double API) {
        this.API = API;
    }

    public double getPsep() {
        return Psep;
    }

    public void setPsep(double Psep) {
        this.Psep = Psep;
    }

    public double getTsep() {
        return Tsep;
    }

    public void setTsep(double Tsep) {
        this.Tsep = Tsep;
    }

    public double getNa() {
        return Na;
    }

    public void setNa(double Na) {
        this.Na = Na;
    }
    
    
    
    
    
    
}
