/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import static Interfaz.Window.main;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import proyecto2.so.Main;

/**
 *
 * @author jesusmachta
 */
public class Window extends javax.swing.JFrame {
//    Main main= new Main();

    /**
     * Creates new form Window
     */
    public Window() throws InterruptedException {
//        this.setVisible(true); 
        initComponents();
        this.setLocationRelativeTo(null);
        colaStarTrek1.setEditable(false);
        colaStarTrek2.setEditable(false);
        colaStarTrek3.setEditable(false);
        colaStarTrekRefuerzo.setEditable(false);
        
        colaStarWars1.setEditable(false);
        colaStarWars2.setEditable(false);
        colaStarWars3.setEditable(false);
        colaStarWarsRefuerzo.setEditable(false);
        ganadorStarTrek.setEditable(false);
        ganadorStarWars.setEditable(false);
        t1.setEditable(false);
        t1.setText(Integer.toString(Main.ia.getDayDuration()));
        //Main.ia.setDayDuration(Integer.parseInt(t1.getText()));
//        t1.setText(Integer.toString(1));
        
        
//        main.admin.crearPersonajes();




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
        jPanel2 = new javax.swing.JPanel();
        PeleaStarTrek = new javax.swing.JLabel();
        PeleaStarWars = new javax.swing.JLabel();
        nombrePersonajeStarWars = new javax.swing.JLabel();
        idPersonajeStarTrek = new javax.swing.JLabel();
        nombrePersonajeStarTrek = new javax.swing.JLabel();
        idPersonajeStarWars = new javax.swing.JLabel();
        doing = new javax.swing.JLabel();
        StarWarsWL = new javax.swing.JLabel();
        StarTrekWL = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        poderStarWars = new javax.swing.JLabel();
        poderStarTrek = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        colaStarWarsRefuerzo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        colaStarTrek1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        colaStarTrek2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        colaStarWars1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        colaStarWars2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        colaStarWars3 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        colaStarTrek3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        colaStarTrekRefuerzo = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ganadorStarWars = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        ganadorStarTrek = new javax.swing.JTextArea();
        cantGanadoresStarTrek = new javax.swing.JLabel();
        cantGanadoresStarWars = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102,60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PeleaStarTrek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(PeleaStarTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 140));

        PeleaStarWars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(PeleaStarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 130, 140));

        nombrePersonajeStarWars.setForeground(new java.awt.Color(255, 255, 255));
        nombrePersonajeStarWars.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(nombrePersonajeStarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 100, 20));

        idPersonajeStarTrek.setForeground(new java.awt.Color(255, 255, 255));
        idPersonajeStarTrek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(idPersonajeStarTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 20));

        nombrePersonajeStarTrek.setForeground(new java.awt.Color(255, 255, 255));
        nombrePersonajeStarTrek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(nombrePersonajeStarTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 20));

        idPersonajeStarWars.setForeground(new java.awt.Color(255, 255, 255));
        idPersonajeStarWars.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(idPersonajeStarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 100, 20));

        doing.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        doing.setForeground(new java.awt.Color(255, 255, 255));
        doing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        doing.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(doing, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, 30));

        StarWarsWL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(StarWarsWL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 50, 40));

        StarTrekWL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(StarTrekWL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 50, 40));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vs.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, 150));

        poderStarWars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(poderStarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 110, 60));

        poderStarTrek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(poderStarTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 420, 330));

        colaStarWarsRefuerzo.setBackground(new java.awt.Color(51, 0, 102));
        colaStarWarsRefuerzo.setColumns(20);
        colaStarWarsRefuerzo.setForeground(new java.awt.Color(255, 255, 255));
        colaStarWarsRefuerzo.setRows(5);
        jScrollPane1.setViewportView(colaStarWarsRefuerzo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, 50));

        colaStarTrek1.setBackground(new java.awt.Color(51, 0, 102));
        colaStarTrek1.setColumns(20);
        colaStarTrek1.setForeground(new java.awt.Color(255, 255, 255));
        colaStarTrek1.setRows(5);
        colaStarTrek1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        colaStarTrek1.setSelectedTextColor(new java.awt.Color(51, 0, 102));
        colaStarTrek1.setSelectionColor(new java.awt.Color(51, 0, 102));
        jScrollPane2.setViewportView(colaStarTrek1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 50));

        colaStarTrek2.setBackground(new java.awt.Color(51, 0, 102));
        colaStarTrek2.setColumns(20);
        colaStarTrek2.setForeground(new java.awt.Color(255, 255, 255));
        colaStarTrek2.setRows(5);
        jScrollPane3.setViewportView(colaStarTrek2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 50));

        colaStarWars1.setBackground(new java.awt.Color(51, 0, 102));
        colaStarWars1.setColumns(20);
        colaStarWars1.setForeground(new java.awt.Color(255, 255, 255));
        colaStarWars1.setRows(5);
        jScrollPane4.setViewportView(colaStarWars1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, 50));

        colaStarWars2.setBackground(new java.awt.Color(51, 0, 102));
        colaStarWars2.setColumns(20);
        colaStarWars2.setForeground(new java.awt.Color(255, 255, 255));
        colaStarWars2.setRows(5);
        jScrollPane5.setViewportView(colaStarWars2);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, 50));

        colaStarWars3.setBackground(new java.awt.Color(51, 0, 102));
        colaStarWars3.setColumns(20);
        colaStarWars3.setForeground(new java.awt.Color(255, 255, 255));
        colaStarWars3.setRows(5);
        jScrollPane6.setViewportView(colaStarWars3);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, 50));

        colaStarTrek3.setBackground(new java.awt.Color(51, 0, 102));
        colaStarTrek3.setColumns(20);
        colaStarTrek3.setForeground(new java.awt.Color(255, 255, 255));
        colaStarTrek3.setRows(5);
        jScrollPane7.setViewportView(colaStarTrek3);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 240, 50));

        colaStarTrekRefuerzo.setBackground(new java.awt.Color(51, 0, 102));
        colaStarTrekRefuerzo.setColumns(20);
        colaStarTrekRefuerzo.setForeground(new java.awt.Color(255, 255, 255));
        colaStarTrekRefuerzo.setRows(5);
        jScrollPane8.setViewportView(colaStarTrekRefuerzo);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 240, 50));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nivel 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nivel 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nivel 3");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Refuerzo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ganadores StarTrek");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ganadores StarWars");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Refuerzo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nivel 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nivel 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 90, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nivel 1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 60, 20));

        ganadorStarWars.setBackground(new java.awt.Color(51, 0, 102));
        ganadorStarWars.setColumns(20);
        ganadorStarWars.setForeground(new java.awt.Color(255, 255, 255));
        ganadorStarWars.setRows(5);
        jScrollPane9.setViewportView(ganadorStarWars);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 190, 50));

        ganadorStarTrek.setBackground(new java.awt.Color(51, 0, 102));
        ganadorStarTrek.setColumns(20);
        ganadorStarTrek.setForeground(new java.awt.Color(255, 255, 255));
        ganadorStarTrek.setRows(5);
        jScrollPane10.setViewportView(ganadorStarTrek);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 200, 50));

        cantGanadoresStarTrek.setForeground(new java.awt.Color(255, 255, 255));
        cantGanadoresStarTrek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantGanadoresStarTrek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cantGanadoresStarTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 30, 20));

        cantGanadoresStarWars.setForeground(new java.awt.Color(255, 255, 255));
        cantGanadoresStarWars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantGanadoresStarWars.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cantGanadoresStarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 30, 20));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, 30, 20));

        t1.setEditable(false);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 30, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gif robot 3.gif"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 110, 130));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tiempo IA -->");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, -1));

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 30, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño sin título.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        String file=  "src//Imagenes/musica.wav";
        try {
            AudioInputStream aui= AudioSystem.getAudioInputStream(new File(file).getAbsoluteFile());
            try{
            Main.inicio();
            Clip clip=AudioSystem.getClip();
            clip.open(aui);
            clip.start();
//            clip.stop();
////            clip.loop(10);
//            clip.close();
        }catch(Exception e){
                System.out.println(evt);
        }
//InputStream in;

//        try {
//            in = new FileInputStream(new File("src//Interfaz/musica.wav"));
//            AudioStream ad= new AudioStream(in);
//            AudioPlayer.player.start(ad);
//            
//        }catch(Exception e){
//            
//        }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Integer.parseInt(t1.getText())!= 1 && !(Integer.parseInt(t1.getText())<1)) {

            int numInicial = Integer.parseInt(t1.getText()) - 1;
            t1.setText(Integer.toString(numInicial));
         

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
        t1.setEditable(false);
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           int numInicial = Integer.parseInt(t1.getText()) + 1;
            t1.setText(Integer.toString(numInicial));
       
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main.w.setVisible(true);
                System.out.println("Hola");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel PeleaStarTrek;
    public javax.swing.JLabel PeleaStarWars;
    public javax.swing.JLabel StarTrekWL;
    public javax.swing.JLabel StarWarsWL;
    public javax.swing.JLabel cantGanadoresStarTrek;
    public javax.swing.JLabel cantGanadoresStarWars;
    public javax.swing.JTextArea colaStarTrek1;
    public javax.swing.JTextArea colaStarTrek2;
    public javax.swing.JTextArea colaStarTrek3;
    public javax.swing.JTextArea colaStarTrekRefuerzo;
    public javax.swing.JTextArea colaStarWars1;
    public javax.swing.JTextArea colaStarWars2;
    public javax.swing.JTextArea colaStarWars3;
    public javax.swing.JTextArea colaStarWarsRefuerzo;
    public javax.swing.JLabel doing;
    public javax.swing.JTextArea ganadorStarTrek;
    public javax.swing.JTextArea ganadorStarWars;
    public javax.swing.JLabel idPersonajeStarTrek;
    public javax.swing.JLabel idPersonajeStarWars;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JLabel nombrePersonajeStarTrek;
    public javax.swing.JLabel nombrePersonajeStarWars;
    public javax.swing.JLabel poderStarTrek;
    public javax.swing.JLabel poderStarWars;
    public javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
