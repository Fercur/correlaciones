/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.correlaciones;

import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class Glasso {
     double Py;
    double Ty;
    double RGP;
    double rg;
    double API;
    double Psep;
    double Tsep;
    double Na;
    public Glasso(){}

    public Glasso(double Py, double Ty, double RGP, double rg, double API, double Psep, double Tsep, double Na) {
        this.Py = Py;
        this.Ty = Ty;
        this.RGP = RGP;
        this.rg = rg;
        this.API = API;
        this.Psep = Psep;
        this.Tsep = Tsep;
        this.Na = Na;
    }
    public ArrayList<Double> calcularPb(double RGP,double rg,double Ty, double API){
        ArrayList<Double> calPb=new ArrayList<>();
        double A=Math.pow(RGP/rg,0.816)*(Math.pow(Ty,0.172)/Math.pow(API,0.989));
        double Pb=Math.pow(10,1.7669+1.744*Math.log10(A)-0.30218*(Math.pow(Math.log10(A),2)));
        calPb.add(A);
        calPb.add(Pb);
        return calPb;
    }
    public ArrayList <Double> calcularRs(double rg, double Py, double Ty, double API){
        ArrayList <Double> calRs=new ArrayList<>();
        double A=Math.pow(10,2.8869-(14.1-3.3093*Math.pow(Math.log10(Py),0.5)));
        double Rs=rg*Math.pow(A*(Math.pow(API,0.989)/Math.pow(Ty,0.172)),1.2255);
        calRs.add(A);
        calRs.add(Rs);
        return calRs;
    }
    public ArrayList <Double> calcularBo(double API, double Rs,double rg, double Ty){
        ArrayList <Double> calBo=new ArrayList<>();
        double ro=141.5/(131.5+API);
        double A=Rs*Math.pow(rg/ro,0.526)+0.968*Ty;
        double Bo=1+Math.pow(10,+6.58511+2.91329*Math.log(A)-0.27683*Math.pow(Math.log(A),2));
        calBo.add(ro);
        calBo.add(A);
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
