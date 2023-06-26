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
public class Total {
    double Py;
    double Ty;
    double RGP;
    double rg;
    double API;
    double Psep;
    double Tsep;
    double Na;
    public Total(){}

    public Total(double Py, double Ty, double RGP, double rg, double API, double Psep, double Tsep, double Na) {
        this.Py = Py;
        this.Ty = Ty;
        this.RGP = RGP;
        this.rg = rg;
        this.API = API;
        this.Psep = Psep;
        this.Tsep = Tsep;
        this.Na = Na;
    }
    public double calcularPb(double Rs,double rg,double Ty,double API,JLabel labelA,JLabel labelB,JLabel labelC,JLabel labelD){
    
        double A,B,C,D;
    if(API<=10){
        A=12.8470;
        B=0.9636;
        C=0.000993;
        D=0.034170;
    }else if(API<=35){
        A=25.2755;
        B=0.7617;
        C=0.000835;
        D=0.011292;        
    }else{
        A=216.4711;
        B=0.6922;
        C=-0.000427;
        D=0.023140;
    }
        double Pb=A*Math.pow(Rs/rg,B)*Math.pow(10,C*Ty-D*API);
        labelA.setText("A= "+A);
        labelB.setText("B= "+B);
        labelC.setText("C= "+C);
        labelD.setText("C= "+D);
        return Pb;
    }

    public double calcularRs(double Pb,double rg,JLabel jLabelA,JLabel jLabelB,JLabel jLabelC,JLabel jLabelD){
    double A,B,C,D;
    if(API<=10){
        A=12.2651;
        B=0.03045;
        C=0;
        D=0.96690;
    }else if(API<=35){
        A=15.0057;
        B=0.01520;
        C=4.484*Math.pow(10,-4);
        D=1.09500;        
    }else{
        A=112.9251;
        B=0.02480;
        C=-1.469*Math.pow(10,-3);
        D=1.12900;
    }
        double Rs=rg*Math.pow((Pb*(Math.pow(10,B*API-C*Ty)/A)),D);
        jLabelA.setText("A= "+A);
        jLabelB.setText("B= "+B);
        jLabelC.setText("C= "+C);
        jLabelD.setText("C= "+D);
        return Rs;
    }
public ArrayList<Double> calcularBo(double API, double Rs, double rg, double Ty) {
   ArrayList<Double> calBo=new ArrayList<>();
    double ro=141.5/(131.5-API);
    double Bo=1.022+4.857*Math.pow(10,-4)*Rs-2.009*Math.pow(10,-6)*(Ty-60)*(API/rg)+17.569*Math.pow(10,-9)*Rs*(Ty-60)*(API/rg);
    calBo.add(ro);
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
