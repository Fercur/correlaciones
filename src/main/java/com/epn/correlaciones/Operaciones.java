/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.epn.correlaciones;

import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class Operaciones {

    public Operaciones(){
        
    }
    public ArrayList<Double> calcularZ(double rg,double Py,double Ty){
        ArrayList<Double> calZ=new ArrayList<>();
        double sPc= 677+15*rg-37.5*(Math.pow(rg,2));
        double sTc=168+325*rg-12.5*(Math.pow(rg,2));
        double sPr=Py/sPc;
        double sTr=(Ty+460)/sTc;
        double A=1.39*(Math.pow((sTr-0.92),0.5))-0.36*sTr-0.101;
        double B=(0.62-0.23*sTr)*sPr+(0.066/(sTr-0.86)-0.037)*(Math.pow(sPr, 2))+0.32*(Math.pow(sPr,6))/(Math.pow(10,(9*(sTr-1))));
        double C=0.132-0.32*(Math.log10(sTr));
        double D=Math.pow(10,(0.3106-0.49*sTr+0.1824*(Math.pow(sTr, 2))));
        double z=A+(1-A)/(Math.exp(B))+C*(Math.pow(sPr, D));
        calZ.add(sPc);
        calZ.add(sTc);
        calZ.add(sPr);
        calZ.add(sTr);
        calZ.add(A);
        calZ.add(B);
        calZ.add(C);
        calZ.add(D);
        calZ.add(z);
        return calZ;
    }
    public double calcularBg(double Ty,double z,double Py){
        double Bg=0.00504*z*(Ty+460)/Py;
        return Bg;
    }
    public double calcularBt(double Bo,double RGP,double Rs, double Bg){
        double Bt=Bo+(RGP-Rs)*Bg;
        return Bt;
    }
    public ArrayList<Double> calcularBw(double Ty, double Py){
        ArrayList<Double> calBw=new ArrayList<>();
        double DVwT=-1.0001*Math.pow(10,-2)-1.33391*Math.pow(10, -4)*Ty+5.50654*Math.pow(10,-7)*Math.pow(Ty,2);
        double DVwP=-1.95301*Math.pow(10,-9)*Py*Ty-1.72834*Math.pow(10,-13)*Math.pow(Py,2)*Ty-3.58922*Math.pow(10, -7)*Py-2.25341*Math.pow(10, -10)*Math.pow(Py, 2);
        double Bw=(1+DVwP)*(1+DVwT);
        calBw.add(DVwT);
        calBw.add(DVwP);
        calBw.add(Bw);
        return calBw;
    }
    public ArrayList<Double> calcularRsw(double Ty,double Na,double Py){
        ArrayList<Double> calRsw=new ArrayList<>();
        double A=8.15839-6.12265*Math.pow(10, -2)*Ty+1.91663*Math.pow(10, -4)*Math.pow(Ty, 2)-2.1654*Math.pow(10,-7)*Math.pow(Ty, 3);
        double B=1.01021*Math.pow(10,-2)-7.44241*Math.pow(10,-5)*Ty+3.05553*Math.pow(10,-7)*Math.pow(Ty,2)-2.94883*Math.pow(10,-10)*Math.pow(Ty,3);
        double C=(-9.0255+0.130237*Ty-8.53425*Math.pow(10,-4)*Math.pow(Ty,2)+2.34122*Math.pow(10,-6)*Math.pow(Ty,3)-2.37049*Math.pow(10,-9)*Math.pow(Ty,4))*Math.pow(10,-7);
        double Csal=Math.pow(10, (-0.0840655*Math.pow(Ty,-0.285854)*Na*Math.pow(10,-4)));
        double Rsw=(A+B*Py+C*Math.pow(Ty,2))*Csal;
        calRsw.add(A);
        calRsw.add(B);
        calRsw.add(C);
        calRsw.add(Csal);
        calRsw.add(Rsw);
        return calRsw;
    }
    public ArrayList<Double> calcularUo(double ro,double Rs,double Ty){
        ArrayList<Double> calUo=new ArrayList<>();
        double Zeta=3.0324-0.02023*ro;
        double Ye=Math.pow(10,Zeta);
        double Exis=Ye*Math.pow(Ty, -1.163);
        double uod=Math.pow(10,Exis)-1;
        double aminus=10.715*Math.pow((Rs+100),-0.515);
        double bminus=5.44*Math.pow((Rs+150),-0.338);
        double Uo=aminus*Math.pow(uod, bminus);
        calUo.add(Zeta);
        calUo.add(Ye);
        calUo.add(Exis);
        calUo.add(uod);
        calUo.add(aminus);
        calUo.add(bminus);
        calUo.add(Uo);
        
        return calUo;
    }
    public ArrayList<Double> calcularUg(double rg,double z,double Ty,double Py){
        ArrayList<Double> calUg=new ArrayList<>();
        double Mg=28.96*rg;
        double dg=Py*Mg/(10.73*z*(Ty+460))/62.4;
        double Exis=3.5+986/(Ty+460)+0.0*Mg;
        double Ye=2.4-0.2*Exis;
        double Ka=(9.4+0.02*Mg)*Math.pow((Ty+460),1.5)/(209+19*Mg+(Ty+460));
        double Ug=Ka*Math.exp(Exis*Math.pow(dg,Ye))*Math.pow(10,-4);    
        calUg.add(Mg);
        calUg.add(dg);
        calUg.add(Exis);
        calUg.add(Ye);
        calUg.add(Ka);
        calUg.add(Ug);
        return calUg;
    }
    public double calcularUw(double Ty){
        double Uw=Math.exp(1.003-1.479*Math.pow(10,-2)*Ty+1.982*Math.pow(10,-5)*Math.pow(Ty,2));
        return Uw;
    }
    public double calcularCo(double Py,double Pb,double Ty,double ro, double Rs){
        double Co=Math.exp(-7.573-1.45*Math.log(Py)-0.383*Math.log(Pb)+1.402*Math.log(Ty)+0.256*Math.log(ro)+0.449*Math.log(Rs));
        return Co;
    }
    public ArrayList<Double> calcularCg(double sPr, double sTr,double z,double sPc){
        ArrayList<Double> calCg=new ArrayList<>();
        double dreducida=0.27*sPr/(z*sTr);
        double Trcte=0.3265-1.07/sTr-0.5339/Math.pow(sTr,3)-0.01569/Math.pow(sTr,4)-0.05165/Math.pow(sTr,5)+2*dreducida*(0.5475-0.7361/sTr+0.1844/Math.pow(sTr,2))-5*dreducida*0.1056/sTr*(-0.7361+0.1844/sTr)+2*dreducida*0.6134/Math.pow(sTr,3)*(1+0.721*Math.pow(dreducida,2)-Math.pow(0.721*Math.pow(dreducida,2),2))*Math.exp(-0.721*Math.pow(dreducida,2));
        double Csr=1/sPr-0.27/(Math.pow(z,2)*sTr)*(Trcte/(1+dreducida/z*Trcte));
        double Cg=Csr/sPc;
        calCg.add(dreducida);
        calCg.add(Trcte);
        calCg.add(Csr);
        calCg.add(Cg);
        return calCg;
    }   
    public ArrayList<Double> calcularCw(double Py,double Ty, double Rsw){
        ArrayList<Double> calCw=new ArrayList<>();
        double amay=3.8546-0.00013*Py;
        double bmay=-0.01052+4.77*Math.pow(10,-7*Py);
        double cmay=3.9267*Math.pow(10,-5)-8.8*Math.pow(10,-10)*Py;
        double Cwp=(amay+bmay*Ty+cmay*Math.pow(Ty,2))/Math.pow(10,6);
        double Cw=Cwp*(1+0.0088*Rsw);
        calCw.add(amay);
        calCw.add(bmay);
        calCw.add(cmay);
        calCw.add(Cwp);
        calCw.add(Cw);
        return calCw;
    }
    public double calculardeno(double ro, double rg, double Rs, double Bo){
        double deno=(350*ro+29*rg*Rs/379)/(5.615*Bo);
        return deno;
    }
    public double calculardeng(double Mg, double z,double Ty,double Py){
        double deng=Py*Mg/(z*10.73*(Ty+460));
        return deng;
    }
    public ArrayList<Double> calculardena(double Na, double Bw){
        ArrayList<Double> caldena=new ArrayList<>();
        double Dwcn=62.368+0.438603*Math.pow(10,-4)*Na+1.60074*Math.pow(10,-11)*Math.pow(Na,2);
        double dena=Dwcn/Bw;
        caldena.add(Dwcn);
        caldena.add(dena); 
        return caldena;
    }
}
