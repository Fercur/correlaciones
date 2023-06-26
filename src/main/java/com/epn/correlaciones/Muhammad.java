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
public class Muhammad {
    double Py;
    double Ty;
    double RGP;
    double rg;
    double API;
    double Psep;
    double Tsep;
    double Na;
    public Muhammad(){}

    public Muhammad(double Py, double Ty, double RGP, double rg, double API, double Psep, double Tsep, double Na) {
        this.Py = Py;
        this.Ty = Ty;
        this.RGP = RGP;
        this.rg = rg;
        this.API = API;
        this.Psep = Psep;
        this.Tsep = Tsep;
        this.Na = Na;
    }
    public ArrayList<Double> calcularPb(double API,double RGP,double rg,double Ty){
        ArrayList<Double> calPb=new ArrayList<>();
        double ro=141.5/(131.5+API);
        double Pb=5.38088*Math.pow(10,-3)*Math.pow(RGP,0.715082)*Math.pow(rg,-1.87784)*Math.pow(ro,3.1437)*Math.pow(Ty+460,1.32657);
        calPb.add(ro);
        calPb.add(Pb);
        return calPb;
    }
      public double calcularRs(double rg,double ro, double Ty){
        double Rs=Math.pow(185.84321*Math.pow(rg,1.87784)*Math.pow(ro,-3.1437)*Math.pow(Ty,-1.32657),1.32657);
        return Rs;
    }
     public ArrayList<Double> calcularBo(double ro,double API,double Tsep,double Psep,double Rs, double rg, double Ty) {
    ArrayList<Double> calBo = new ArrayList<>();
    
    double F=Math.pow(Rs,0.74239)*Math.pow(rg,0.323294)*Math.pow(ro,-1.20204);
    double Bo=0.497069+0.862963*Math.pow(10,-3)*Ty+0.182594*Math.pow(10,-2)*F+0.318099*Math.pow(10,-5)*Math.pow(F,2);
  
    calBo.add(F);
    calBo.add(Bo);
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
