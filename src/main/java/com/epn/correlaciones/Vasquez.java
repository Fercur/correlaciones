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
public class Vasquez {
    double Py;
    double Ty;
    double RGP;
    double rg;
    double API;
    double Psep;
    double Tsep;
    double Na;
public Vasquez(){
    
}
    public Vasquez(double Py, double Ty, double RGP, double rg, double API, double Psep, double Tsep, double Na) {
        this.Py = Py;
        this.Ty = Ty;
        this.RGP = RGP;
        this.rg = rg;
        this.API = API;
        this.Psep = Psep;
        this.Tsep = Tsep;
        this.Na = Na;
    }
    
    public ArrayList<Double> calcularPb(double API,double RGP,double rg,double Tsep,double Psep,double Ty){
        ArrayList<Double> calPb=new ArrayList<>();
        double AVB;
        if(API<=30){
            AVB=27.64;
        }else{
            AVB=56.06;
        }
        double CVB;
        if(API<=30){
            CVB=1.0937;
        }else{
            CVB=1.187;
        }
        double Ggasp=rg*(1+5.912*Math.pow(10,-5)*API*Tsep*Math.log(Psep+14.7)/114.7);
        double Pb=Math.pow(AVB*(RGP/Ggasp)*Math.pow(10,(-Ggasp*API/(Ty+460))),(1/CVB));
        calPb.add(AVB);
        calPb.add(CVB);
        calPb.add(Ggasp);
        calPb.add(Pb);
        return calPb;
    }
    public double calcularRs(double Ggasp,double BVB, double AVB, double Ty,double API,double Py){
     double Rs=Ggasp*Math.pow(Py,BVB)/AVB*Math.pow(10,BVB*API/(Ty+460));
     return Rs;
    }
    public ArrayList<Double> calcularBo(double Ty,double API,double Rs,double Ggasp){
        ArrayList<Double> calBo=new ArrayList<>();
        double AVBo,BVBo,CVBo;
        if(API<=30){
            AVBo=4.677*Math.pow(10,-4);
        }else{
            AVBo=4.67*Math.pow(10,-4);
        }
        if(API<=30){
            BVBo=1.751*Math.pow(10,-5);
        }else{
            BVBo=1.1*Math.pow(10,-5);
        }
        if(API<=30){
            CVBo=-1.8106*Math.pow(10,-8);
        }else{
            CVBo=1.337*Math.pow(10, -9);
        }
        double Bo=1+AVBo*Rs+BVBo*(Ty-60)*(API/Ggasp)+CVBo*Rs*(Ty-60)*(API/Ggasp);
        calBo.add(AVBo);
        calBo.add(BVBo);
        calBo.add(CVBo);
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
