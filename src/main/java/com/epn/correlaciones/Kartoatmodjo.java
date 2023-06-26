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
public class Kartoatmodjo {
    double Py;
    double Ty;
    double RGP;
    double rg;
    double API;
    double Psep;
    double Tsep;
    double Na;
    public Kartoatmodjo(){}

    public Kartoatmodjo(double Py, double Ty, double RGP, double rg, double API, double Psep, double Tsep, double Na) {
        this.Py = Py;
        this.Ty = Ty;
        this.RGP = RGP;
        this.rg = rg;
        this.API = API;
        this.Psep = Psep;
        this.Tsep = Tsep;
        this.Na = Na;
    }
    public double calcularPb(double Psep,double Tsep,double Rs,double rg,double Ty, double API,JLabel jLPb,JLabel jLrgc,JLabel jLabelA,JLabel jLabelB,JLabel jLabelC,JLabel jLabelD,JLabel jLrgcNum){
        double A,B,C,D;
        if(API<=30){
            A=0.059558;
            B=0.7972;
            C=13.1405;
            D=0.9986;
        } else{
            A=0.03150;
            B=0.7587;
            C=11.2895;
            D=0.9143;
        }
        double rgc=rg*(1+0.1595*Math.pow(API,0.4078)*Math.pow(Tsep, -0.2466)*Math.log(Psep/114.7));
        double Pb=Math.pow(Rs/(A*Math.pow(rgc,B)*Math.pow(10,(C*API/(Ty+460)))),D);
        jLPb.setText("<html> Pb= 14.7 - 6054.7 lpca <br> Ty=75-320 °F <br> Rs= 0-2890 PCN/BN <br>API= 14.4-58.9 °API <br> rg=0.379-1.709(aire=1)</html>");
        jLrgc.setText("<html> Pb= 14.7 - 514.7 lpca <br> Ty=65-186 °F <br> API= 14.4-58.9 °API <br> rg=0.379-1.709(aire=1)</html>");
        jLrgcNum.setText(""+rgc);
        jLabelA.setText("A= "+A);
        jLabelB.setText("B= "+B);
        jLabelC.setText("C= "+C);
        jLabelD.setText("C= "+D);
        return Pb;
    }
    public double calcularRs(double rg, double Py, double Ty, double API,double Tsep,double Psep, JLabel jLrgc,JLabel jLA,JLabel jLB,JLabel jLC,JLabel jLD){
         double A,B,C,D;
        if(API<=30){
            A=0.059558;
            B=0.7972;
            C=13.1405;
            D=0.9986;
        } else{
            A=0.03150;
            B=0.7587;
            C=11.2895;
            D=0.9143;
        }
        double rgc=rg*(1+0.1595*Math.pow(API,0.4078)*Math.pow(Tsep, -0.2466)*Math.log(Psep/114.7));
        double Rs=A*Math.pow(rgc,B)*Math.pow(Py,1/D)*Math.pow(10,(C*API)/(Ty+460));
        jLA.setText("A= "+A);
        jLB.setText("B= "+B);
        jLC.setText("C= "+C);
        jLD.setText("C= "+D);
        return Rs;
    }
public ArrayList<Double> calcularBo(double API,double Tsep,double Psep,double Rs, double rg, double Ty) {
    ArrayList<Double> calBo = new ArrayList<>();
    double rgc=rg*(1+0.1595*Math.pow(API,0.4078)*Math.pow(Tsep, -0.2466)*Math.log(Psep/114.7));
    double ro=141.5/(131.5+API);
    double F=Math.pow(Rs,0.755)*Math.pow(rgc,0.25)*Math.pow(ro,-1.5)+0.45*Ty;
    double Bo=0.98496+1*Math.pow(10,-4)*Math.pow(F,1.5);
    calBo.add(ro);
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
