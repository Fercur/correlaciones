/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.epn.vista;
import com.epn.componentes.Imagen;
import com.epn.componentes.Validaciones;
import com.epn.correlaciones.Datos;
import com.epn.correlaciones.Kartoatmodjo;
import com.epn.correlaciones.Muhammad;

import com.epn.correlaciones.Operaciones;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;


/**
 *
 * @author valer
 */
public class MuhammadFront extends javax.swing.JFrame {
Muhammad opMuhammad=new Muhammad();
Operaciones opGeneral=new Operaciones();
Validaciones vali=new Validaciones();
Datos constructorD;

    public double Py, Ty, RGP,rg, API, Psep, Tsep, Na;
    /**
     * Creates new form StandingFront
     */
    public MuhammadFront() {
        initComponents();
        cargar();
        Imagen img = new Imagen();
        img.mostrarImagenes(JL_PB,"");
        img.mostrarImagenes(JL_RS,"");
        img.mostrarImagenes(JL_Z,"");
        
        
    }
    public void cargar(){
    jTpy.setText(String.valueOf(Py));
    jTapiGlasso.setText(String.valueOf(API));
    jTtyGlasso.setText(String.valueOf(Ty));
    jTrgGlasso.setText(String.valueOf(rg));
    jTpsepGlasso.setText(String.valueOf(Psep));
    jTtsepGlasso.setText(String.valueOf(Tsep));
    jTnaGlasso.setText(String.valueOf(Na));
    jTrgpGlasso.setText(String.valueOf(RGP));
       
        
        double Pb=opMuhammad.calcularPb(API, RGP, rg, Ty).get(1);
        double ro=opMuhammad.calcularPb(API, RGP, rg, Ty).get(0);
        double Rs=opMuhammad.calcularRs(rg, ro, Ty);
        double FBo=opMuhammad.calcularBo(ro, API, Tsep, Psep, Rs, rg, Ty).get(0);
        double Bo=opMuhammad.calcularBo(ro, API, Tsep, Psep, Rs, rg, Ty).get(1);
        double sPc=opGeneral.calcularZ(rg, Py, Ty).get(0);
        double sTc=opGeneral.calcularZ(rg, Py, Ty).get(1);
        double sPr=opGeneral.calcularZ(rg, Py, Ty).get(2);
        double sTr=opGeneral.calcularZ(rg, Py, Ty).get(3);
        double A=opGeneral.calcularZ(rg, Py, Ty).get(4);
        double B=opGeneral.calcularZ(rg, Py, Ty).get(5);
        double C=opGeneral.calcularZ(rg, Py, Ty).get(6);
        double D=opGeneral.calcularZ(rg, Py, Ty).get(7);
        double Z=opGeneral.calcularZ(rg, Py, Ty).get(8);
        double Bg=opGeneral.calcularBg(Ty, Z, Py);
        double Bt=opGeneral.calcularBt(Bo, RGP, Rs, Bg);
        double DVwT=opGeneral.calcularBw(Ty, Py).get(0);
        double DVwP=opGeneral.calcularBw(Ty, Py).get(1);
        double Bw=opGeneral.calcularBw(Ty, Py).get(2);
        double Ars=opGeneral.calcularRsw(Ty, Na, Py).get(0);
        double Brs=opGeneral.calcularRsw(Ty, Na, Py).get(1);
        double Crs=opGeneral.calcularRsw(Ty, Na, Py).get(2);
        double Csalrs=opGeneral.calcularRsw(Ty, Na, Py).get(3);
        double Rsw=opGeneral.calcularRsw(Ty, Na, Py).get(4);
        double Zeta=opGeneral.calcularUo(ro, Rs, Ty).get(0);
        double Ye=opGeneral.calcularUo(ro, Rs, Ty).get(1);
        double Exis=opGeneral.calcularUo(ro, Rs, Ty).get(2);
        double uod=opGeneral.calcularUo(ro, Rs, Ty).get(3);
        double aminus=opGeneral.calcularUo(ro, Rs, Ty).get(4);
        double bminus=opGeneral.calcularUo(ro, Rs, Ty).get(5);
        double Uo=opGeneral.calcularUo(ro, Rs, Ty).get(6);
        double Mg=opGeneral.calcularUg(rg, Z, Ty, Py).get(0);
        double dg=opGeneral.calcularUg(rg, Z, Ty, Py).get(1);
        double ExisUg=opGeneral.calcularUg(rg, Z, Ty, Py).get(2);
        double YeUg=opGeneral.calcularUg(rg, Z, Ty, Py).get(3);
        double Ka=opGeneral.calcularUg(rg, Z, Ty, Py).get(4);
        double Ug=opGeneral.calcularUg(rg, Z, Ty, Py).get(5);
        double Uw=opGeneral.calcularUw(Ty);
        double Co=opGeneral.calcularCo(Py, Pb, Ty, ro, Rs);
        double dreducida=opGeneral.calcularCg(sPr, sTr, Z, sPc).get(0);
        double Trcte=opGeneral.calcularCg(sPr, sTr, Z, sPc).get(1);
        double Csr=opGeneral.calcularCg(sPr, sTr, Z, sPc).get(2);
        double Cg=opGeneral.calcularCg(sPr, sTr, Z, sPc).get(3);
        double amay=opGeneral.calcularCw(Py, Ty, Rsw).get(0);
        double bmay=opGeneral.calcularCw(Py, Ty, Rsw).get(1);
        double cmay=opGeneral.calcularCw(Py, Ty, Rsw).get(2);
        double Cwp=opGeneral.calcularCw(Py, Ty, Rsw).get(3);
        double Cw=opGeneral.calcularCw(Py, Ty, Rsw).get(4);
        double Deno=opGeneral.calculardeno(ro, rg, Rs, Bo);
        double Deng=opGeneral.calculardeng(Mg, Z, Ty, Py);
        double Dwcn=opGeneral.calculardena(Na, Bw).get(0);
        double Dena=opGeneral.calculardena(Na, Bw).get(1);
        
        
        vali.truncar(Pb,jTpb);
        vali.truncar(Rs,jTrs);
        vali.truncar(ro, jTroGlasso);
        vali.truncar(FBo, jTABo);
        vali.truncar(Bo,jTboGlasso);
        vali.truncar(sPc,jTspcGlasso);
        vali.truncar(sTc,jTstcGlasso);
        vali.truncar(sPr,jTsprGlasso);
        vali.truncar(sTr,jTstrGlasso);
        vali.truncar(A,jTaGlasso);
        vali.truncar(B,jTbGlasso);
        vali.truncar(C,jTcGlasso);
        vali.truncar(D,jTdGlasso);
        vali.truncar(Z,jTzGlasso);
        vali.truncar(Bg,jTbgGlasso);
        vali.truncar(Bt,jTbtGlasso);
        vali.truncar(DVwT,jTdvwtGlasso);
        vali.truncar(DVwP,jTdvwpGlasso);
        vali.truncar(Bw,jTbwGlasso);
        vali.truncar(Ars,jTarsGlasso);
        vali.truncar(Brs,jTbrsGlasso);
        vali.truncar(Crs,jTcrsGlasso);
        vali.truncar(Csalrs,jTcsalrsGlasso);
        vali.truncar(Rsw,jTrswGlasso);
        vali.truncar(Zeta,jTzetaGlasso);
        vali.truncar(Ye,jTyeGlasso);
        vali.truncar(Exis,jTexisGlasso);
        vali.truncar(uod,jTuodGlasso);
        vali.truncar(aminus,jTaminusGlasso);
        vali.truncar(bminus,jTbminusGlasso);
        vali.truncar(Uo,jTuoGlasso);
        vali.truncar(Mg,jTmgGlasso);
        vali.truncar(dg,jTdgGlasso);
        vali.truncar(ExisUg,jTexisugGlasso);
        vali.truncar(YeUg,jTyeugGlasso);
        vali.truncar(Ka,jTkaGlasso);
        vali.truncar(Ug,jTugGlasso);
        vali.truncar(Uw,jTuwGlasso);
        vali.truncar(Co,jTco);
        vali.truncar(dreducida,jTdred);
        vali.truncar(Trcte,jTtrcte);
        vali.truncar(Csr,jTcsr);
        vali.truncar(Cg,jTcg);
        vali.truncar(amay,jTamay);
        vali.truncar(bmay,jTbmay);
        vali.truncar(cmay,jTcmay);
        vali.truncar(Cwp,jTcwp);
        vali.truncar(Cw,jTcw);
        vali.truncar(Deno,jTdeno);
        vali.truncar(Deng,jTdeng);
        vali.truncar(Dwcn,jTdwcn);
        vali.truncar(Dena,jTdena);
    }
    public void leerDatos(){
        Py=Double.parseDouble(jTpy.getText());
        Ty=Double.parseDouble(jTtyGlasso.getText());
        RGP=Double.parseDouble(jTrgpGlasso.getText());
        rg=Double.parseDouble(jTrgGlasso.getText());
        API=Double.parseDouble(jTapiGlasso.getText());
        Psep=Double.parseDouble(jTpsepGlasso.getText());
        Tsep=Double.parseDouble(jTtsepGlasso.getText());
        Na=Double.parseDouble(jTnaGlasso.getText());
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTpb = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTrs = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTspcGlasso = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTsprGlasso = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTstcGlasso = new javax.swing.JTextField();
        jTstrGlasso = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTaGlasso = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTbGlasso = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTcGlasso = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTdGlasso = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTzGlasso = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        JL_RS = new javax.swing.JLabel();
        JL_PB = new javax.swing.JLabel();
        JL_Z = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTbgGlasso = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTroGlasso = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTboGlasso = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTbtGlasso = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTdvwtGlasso = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTdvwpGlasso = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTbwGlasso = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jTABo = new javax.swing.JTextField();
        JL_bg = new javax.swing.JLabel();
        JL_bo = new javax.swing.JLabel();
        JL_bw = new javax.swing.JLabel();
        JL_bt1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jTcsalrsGlasso = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTarsGlasso = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jTbrsGlasso = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTcrsGlasso = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jTrswGlasso = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        JL_rsw = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jTzetaGlasso = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jTyeGlasso = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTexisGlasso = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTuoGlasso = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jTuodGlasso = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jTaminusGlasso = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jTbminusGlasso = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jTmgGlasso = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTdgGlasso = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jTexisugGlasso = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jTyeugGlasso = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jTkaGlasso = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTugGlasso = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jTuwGlasso = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        JL_ug = new javax.swing.JLabel();
        JL_uos1 = new javax.swing.JLabel();
        JL_uw = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jTco = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jTcg = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jTdred = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jTtrcte = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jTcsr = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jTcwp = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jTcw = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jTamay = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jTbmay = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jTcmay = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        JL_co = new javax.swing.JLabel();
        JL_cg = new javax.swing.JLabel();
        JL_cw = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jTdeno = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jTdeng = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jTdwcn = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTdena = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        JL_po = new javax.swing.JLabel();
        JL_pg = new javax.swing.JLabel();
        JL_pw = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTpy = new javax.swing.JTextField();
        jTtyGlasso = new javax.swing.JTextField();
        jTrgpGlasso = new javax.swing.JTextField();
        jTrgGlasso = new javax.swing.JTextField();
        jTapiGlasso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTpsepGlasso = new javax.swing.JTextField();
        jTtsepGlasso = new javax.swing.JTextField();
        jTnaGlasso = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JBregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel1.setText("Correlación Muhammad Ali Al-Marhoun");
        jLabel1.setAlignmentX(0.5F);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Pb=");

        jLabel19.setText("[lpca]");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Rs=");

        jLabel22.setText("[PCN/BN]");

        jLabel23.setText("sPc=");

        jLabel25.setText("sPr=");

        jLabel24.setText("[lpca]");

        jLabel26.setText("[lpca]");

        jLabel27.setText("sTc=");

        jLabel29.setText("sTr=");

        jLabel28.setText("[°R]");

        jLabel30.setText("[°R]");

        jLabel31.setText("A=");

        jLabel32.setText("B=");

        jLabel33.setText("C=");

        jLabel34.setText("D=");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Z=");

        jLabel44.setText("Factor de compresibilidad");

        jLabel45.setText("Método de Brill y Beggs");

        JL_RS.setText("IMG");

        JL_PB.setText("IMG");

        JL_Z.setText("IMG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTpb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTrs, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel22))
                        .addComponent(JL_RS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTcGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTaGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTbGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTdGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTsprGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTstrGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTspcGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTstcGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28))
                            .addComponent(JL_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTzGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(JL_PB, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(737, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel45)
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JL_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTspcGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jTstcGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTzGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTsprGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25)
                                .addComponent(jLabel26)
                                .addComponent(jTstrGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTaGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jTbGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jTcGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jTdGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jTpb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(JL_RS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(JL_PB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Características del fluido", jPanel3);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("Bg=");

        jLabel37.setText("ϒo=");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setText("Bo=");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Bt=");

        jLabel40.setText("ΔVwT=");

        jLabel41.setText("ΔVwP=");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("Bw=");

        jLabel43.setText("[BY/BN]");

        jLabel46.setText("Método de McCain");

        jLabel111.setText("A=");

        JL_bg.setText("IMG");

        JL_bo.setText("IMG");

        JL_bw.setText("IMG");

        JL_bt1.setText("IMG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jTbgGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(jTbtGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTroGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(jTboGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTABo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(251, 251, 251))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JL_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_bo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(251, 251, 251)))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTdvwpGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTdvwtGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(31, 31, 31)
                        .addComponent(jTbwGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JL_bw, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(289, 289, 289)
                    .addComponent(JL_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(527, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(JL_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_bw, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTbgGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(jTbtGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdvwtGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdvwpGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTbwGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(JL_bo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTboGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTroGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTABo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(JL_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(421, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Factores volumétricos", jPanel2);

        jLabel49.setText("Csal=");

        jLabel55.setText("[PCN/BN]");

        jLabel56.setText("A=");

        jLabel57.setText("B=");

        jLabel58.setText("C=");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setText("Rsw=");

        jLabel47.setText("Método de McCain");

        JL_rsw.setText("IMG");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(JL_rsw, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel60)
                        .addGap(18, 18, 18)
                        .addComponent(jTrswGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel55))
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTarsGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTbrsGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTcsalrsGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTcrsGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTrswGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(jLabel55)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JL_rsw, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTarsGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jTbrsGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(jTcrsGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcsalrsGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Solubilidad del gas en el agua", jPanel5);

        jLabel59.setText("Zeta=");

        jLabel61.setText("Ye=");

        jLabel62.setText("Exis=");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setText("µos=");

        jLabel63.setText("[cps]");

        jLabel64.setText("uod=");

        jLabel65.setText("aminus=");

        jLabel66.setText("bminus=");

        jLabel67.setText("Mg=");

        jLabel68.setText("[lb/lbmol]");

        jLabel69.setText("Exis=");

        jLabel72.setText("ρgas=");

        jLabel73.setText("[gr/cm^3]");

        jLabel70.setText("Ye=");

        jLabel71.setText("Ka=");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setText("µg=");

        jLabel74.setText("[cps]");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setText("Viscosidad del agua");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setText("Viscosidad del petróleo");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setText("Viscosidad del gas");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel75.setText("µw=");

        jLabel76.setText("[cps]");

        jLabel105.setText("Método de Lee, González y Eakin");

        jLabel106.setText("Método de Beggs y Robinson");

        jLabel107.setText("Método de Van Wingen");

        JL_ug.setText("IMG");

        JL_uos1.setText("IMG");

        JL_uw.setText("IMG");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTuwGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel76))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTmgGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel68))
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTexisugGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel72)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTdgGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel70)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTyeugGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel73))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTkaGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(151, 151, 151)
                                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTugGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel74)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTuoGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel63)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTuodGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel65)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTaminusGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel66)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTbminusGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTzetaGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel61)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTyeGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTexisGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(95, 95, 95)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_ug, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_uw, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(563, Short.MAX_VALUE)
                    .addComponent(JL_uos1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(145, 145, 145)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTzetaGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel61)
                    .addComponent(jTyeGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jTexisGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jTuodGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jTaminusGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jTbminusGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTuoGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel105))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTmgGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdgGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72)
                            .addComponent(jLabel73))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jTexisugGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jTyeugGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(JL_ug, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel71)
                        .addComponent(jTkaGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTugGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51)
                        .addComponent(jLabel74)))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel107))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTuwGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JL_uw, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(JL_uos1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(341, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Viscosidad", jPanel4);

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel77.setText("Compresibilidad del petróleo en 1/lpc");

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel78.setText("Co=");

        jLabel79.setText("[1/lpc]");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel80.setText("Compresibilidad del gas en 1/lpc");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel81.setText("Cg=");

        jLabel82.setText("[1/lpc]");

        jLabel83.setText("ρreducida=");

        jLabel84.setText("(DZ/DDR)s Trcte=");

        jLabel85.setText("Csr=");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel86.setText("Compresibilidad del agua en 1/lpc");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel87.setText("Cwp=");

        jLabel88.setText("[1/lpc]");

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel89.setText("Cw=");

        jLabel90.setText("[1/lpc]");

        jLabel91.setText("AMAY=");

        jLabel92.setText("BMAY=");

        jLabel93.setText("CMAY=");

        jLabel108.setText("Método de McCain, Rollins y Villena");

        jLabel109.setText("Método de Meehan");

        jLabel110.setText("Método de Mattar, Brar y Aziz");

        JL_co.setText("IMG");

        JL_cg.setText("IMG");

        JL_cw.setText("IMG");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel79))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel91)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTamay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel92)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTbmay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel93)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTcmay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTcg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel82))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTcwp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel88))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTcw, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel90))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTdred, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTtrcte, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTcsr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_co, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_cg, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_cw, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_co, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel110))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(jTdred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(jTtrcte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(jTcsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JL_cg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)
                    .addComponent(jLabel82))
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel109))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTcwp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTcw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel89)
                            .addComponent(jLabel90)
                            .addComponent(JL_cw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91)
                            .addComponent(jTamay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(jTbmay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jTcmay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Compresibilidad", jPanel6);

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel94.setText("Densidad del petróleo");

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel95.setText("ρo=");

        jLabel96.setText("[lbs/pie^3]");

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel97.setText("Densidad del gas");

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel98.setText("ρg=");

        jLabel99.setText("[lbs/pie^3]");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel100.setText("Densidad del agua");

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel101.setText("ρwcn=");

        jLabel102.setText("[lbs/pie^3]");

        jLabel103.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel103.setText("ρw=");

        jLabel104.setText("[lbs/pie^3]");

        jLabel48.setText("Método de McCain");

        JL_po.setText("IMG");

        JL_pg.setText("IMG");

        JL_pw.setText("IMG");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTdeno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel96))
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_po, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel103)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTdena, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel104))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel101)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTdwcn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel102)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTdeng, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel99)
                                .addGap(128, 128, 128)
                                .addComponent(JL_pg, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(JL_pg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_po, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel95)
                                    .addComponent(jTdeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel96))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel97)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel98)
                                    .addComponent(jTdeng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel99))))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jLabel48))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101)
                            .addComponent(jTdwcn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(jTdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JL_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Densidad", jPanel7);

        jLabel2.setText("Presión de yacimiento [Py]");

        jLabel3.setText("Temperatura de yacimiento [Ty]");

        jLabel4.setText("Relación gas petróleo [RGP]");

        jLabel5.setText("Gravedad especifica del gas [ϒg]");

        jLabel6.setText("Gravedad especifica del petroleo [API]");

        jTpy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpyActionPerformed(evt);
            }
        });
        jTpy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTpyKeyTyped(evt);
            }
        });

        jTtyGlasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtyGlassoActionPerformed(evt);
            }
        });

        jLabel10.setText("[Lpaca]");

        jLabel11.setText("[°F]");

        jLabel12.setText("[adimensional]");

        jLabel13.setText("[PCN/BN]");

        jLabel14.setText("[adimensional]");

        jLabel7.setText("Presión del separador [Psep]");

        jLabel8.setText("Temperatura del separador [Tsep]");

        jLabel9.setText("Salinidad [Na]");

        jLabel15.setText("[Lpaca]");

        jLabel16.setText("[°F]");

        jLabel17.setText("[ppm]");

        JBregresar.setText("Regresar");
        JBregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTpy, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTrgGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTrgpGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTtyGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTapiGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBregresar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTnaGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTtsepGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTpsepGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTpsepGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTtsepGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTnaGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(27, 27, 27)
                        .addComponent(JBregresar)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTpy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTtyGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTrgpGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTrgGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTapiGlasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTpyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpyActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpyActionPerformed

    private void jTtyGlassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtyGlassoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtyGlassoActionPerformed

    private void jTpyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpyKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpyKeyTyped

    private void JBregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBregresarActionPerformed
        Bienvenida bienvenida=new Bienvenida();
        leerDatos();
        constructorD=new Datos(Py, Ty, RGP, rg, API, Psep, Tsep, Na);
        bienvenida.Py=constructorD.getPy();
        bienvenida.Ty=constructorD.getTy();
        bienvenida.API=constructorD.getAPI();
        bienvenida.Na=constructorD.getNa();
        bienvenida.Psep=constructorD.getPsep();
        bienvenida.Tsep=constructorD.getTsep();
        bienvenida.rg=constructorD.getRg();
        bienvenida.RGP=constructorD.getRGP();
        
        bienvenida.setVisible(true);
        bienvenida.cargar();
        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_JBregresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MuhammadFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuhammadFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuhammadFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuhammadFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuhammadFront().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBregresar;
    private javax.swing.JLabel JL_PB;
    private javax.swing.JLabel JL_RS;
    private javax.swing.JLabel JL_Z;
    private javax.swing.JLabel JL_bg;
    private javax.swing.JLabel JL_bo;
    private javax.swing.JLabel JL_bt1;
    private javax.swing.JLabel JL_bw;
    private javax.swing.JLabel JL_cg;
    private javax.swing.JLabel JL_co;
    private javax.swing.JLabel JL_cw;
    private javax.swing.JLabel JL_pg;
    private javax.swing.JLabel JL_po;
    private javax.swing.JLabel JL_pw;
    private javax.swing.JLabel JL_rsw;
    private javax.swing.JLabel JL_ug;
    private javax.swing.JLabel JL_uos1;
    private javax.swing.JLabel JL_uw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTABo;
    private javax.swing.JTextField jTaGlasso;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTamay;
    private javax.swing.JTextField jTaminusGlasso;
    private javax.swing.JTextField jTapiGlasso;
    private javax.swing.JTextField jTarsGlasso;
    private javax.swing.JTextField jTbGlasso;
    private javax.swing.JTextField jTbgGlasso;
    private javax.swing.JTextField jTbmay;
    private javax.swing.JTextField jTbminusGlasso;
    private javax.swing.JTextField jTboGlasso;
    private javax.swing.JTextField jTbrsGlasso;
    private javax.swing.JTextField jTbtGlasso;
    private javax.swing.JTextField jTbwGlasso;
    private javax.swing.JTextField jTcGlasso;
    private javax.swing.JTextField jTcg;
    private javax.swing.JTextField jTcmay;
    private javax.swing.JTextField jTco;
    private javax.swing.JTextField jTcrsGlasso;
    private javax.swing.JTextField jTcsalrsGlasso;
    private javax.swing.JTextField jTcsr;
    private javax.swing.JTextField jTcw;
    private javax.swing.JTextField jTcwp;
    private javax.swing.JTextField jTdGlasso;
    private javax.swing.JTextField jTdena;
    private javax.swing.JTextField jTdeng;
    private javax.swing.JTextField jTdeno;
    private javax.swing.JTextField jTdgGlasso;
    private javax.swing.JTextField jTdred;
    private javax.swing.JTextField jTdvwpGlasso;
    private javax.swing.JTextField jTdvwtGlasso;
    private javax.swing.JTextField jTdwcn;
    private javax.swing.JTextField jTexisGlasso;
    private javax.swing.JTextField jTexisugGlasso;
    private javax.swing.JTextField jTkaGlasso;
    private javax.swing.JTextField jTmgGlasso;
    private javax.swing.JTextField jTnaGlasso;
    private javax.swing.JTextField jTpb;
    private javax.swing.JTextField jTpsepGlasso;
    private javax.swing.JTextField jTpy;
    private javax.swing.JTextField jTrgGlasso;
    private javax.swing.JTextField jTrgpGlasso;
    private javax.swing.JTextField jTroGlasso;
    private javax.swing.JTextField jTrs;
    private javax.swing.JTextField jTrswGlasso;
    private javax.swing.JTextField jTspcGlasso;
    private javax.swing.JTextField jTsprGlasso;
    private javax.swing.JTextField jTstcGlasso;
    private javax.swing.JTextField jTstrGlasso;
    private javax.swing.JTextField jTtrcte;
    private javax.swing.JTextField jTtsepGlasso;
    private javax.swing.JTextField jTtyGlasso;
    private javax.swing.JTextField jTugGlasso;
    private javax.swing.JTextField jTuoGlasso;
    private javax.swing.JTextField jTuodGlasso;
    private javax.swing.JTextField jTuwGlasso;
    private javax.swing.JTextField jTyeGlasso;
    private javax.swing.JTextField jTyeugGlasso;
    private javax.swing.JTextField jTzGlasso;
    private javax.swing.JTextField jTzetaGlasso;
    // End of variables declaration//GEN-END:variables
}
