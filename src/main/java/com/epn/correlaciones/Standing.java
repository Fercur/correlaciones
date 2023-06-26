/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epn.correlaciones;
import com.epn.correlaciones.Operaciones;
import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class Standing {
    double Py;
    double Ty;
    double RGP;
    double rg;
    double API;
    double Psep;
    double Tsep;
    double Na;

    public Standing() {
    }
    

    public Standing(double Py, double Ty, double RGP, double rg, double API, double Psep, double Tsep, double Na) {
        this.Py = Py;
        this.Ty = Ty;
        this.RGP = RGP;
        this.rg = rg;
        this.API = API;
        this.Psep = Psep;
        this.Tsep = Tsep;
        this.Na = Na;
    }

    
  public double calcularPb(double RGP,double rg){
          double Pb=18.2*(Math.pow((RGP/rg),0.83)*Math.pow(10,0.00091*Ty-0.0125*API)-1.4);
          return Pb;
  }
  public double calcularRs(double rg,double Py,double API,double Ty){
      double Rs=rg*Math.pow((Py/18.2+1.4)*Math.pow(10, 0.0125*API-0.00091*Ty),1.2048);
      return Rs;
  }
  public ArrayList<Double> calcularBo(double Rs,double API,double rg,double Ty){
      ArrayList<Double> calBo=new ArrayList<>();
      double ro=141.5/(131.5+API);
      double Bo=0.9759+1.2*Math.pow(10,-4)*Math.pow((Rs*Math.pow(rg/ro,0.5)+1.25*Ty),1.2);
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
