/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * home.java
 *
 * Created on Apr 17, 2015, 3:41:40 PM
 */
package gs;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.*;
import java.io.FileInputStream;
import java.net.URI;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Date;
import javax.imageio.ImageIO;
import javax.swing.border.LineBorder;

/**
 *
 * @author souka
 */
public class home extends javax.swing.JFrame {
  
    String path;
    Connexion maconnexion = new Connexion();
    Statement stmt;
    ResultSet rs;
    PreparedStatement ps;
    byte[] pic;
    
   public home() {
         try {
             initComponents();
             
             // background color and size for login interface
             this.getContentPane().setBackground(new Color(242,242,242));
             this.setBounds(WIDTH, WIDTH, 550, 550);
             jPanel3.setBackground(new Color(254,250,243));
             jPanel3.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),2));
             jButton6.setBackground(new Color(254,250,243));
             jButton11.setBackground(new Color(254,250,243));
             jButton1.setBackground(new Color(254,250,243));
             jButton6.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
             jButton11.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
             jButton1.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
             
             stmt=maconnexion.obtenirConnexion().createStatement();
             ps=maconnexion.obtenirConnexion().prepareStatement("select a.idagence from agence a join stagiaire s on(a.idagence=s.idagence) where s.datefinstage< CURDATE()");
             rs=ps.executeQuery();
             while(rs.next()){
                 stmt.executeUpdate("update agence set dispo='true' where idagence="+rs.getString(1));
             }
         } catch (SQLException ex) {
             Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
         }
      
      
        
 }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Agencelibre = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton13 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Affectation = new javax.swing.JFrame();
        jTextField18 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jTextField23 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField28 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        Statistiques = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        Nouvelleagence = new javax.swing.JFrame();
        jLabel33 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox();
        jButton15 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        Rechercherstagiaire = new javax.swing.JFrame();
        jButton25 = new javax.swing.JButton();
        jTextField43 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        inscrire = new javax.swing.JFrame();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();

        Menu.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Menu.setAutoRequestFocus(false);
        Menu.setBackground(new java.awt.Color(-1328478,true));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(-66829,true));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 24));
        jButton2.setForeground(new java.awt.Color(-10212853,true));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/magnifier12.png"))); // NOI18N
        jButton2.setText("Rechercher ");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 480, 82));

        jButton3.setBackground(new java.awt.Color(-66829,true));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 24));
        jButton3.setForeground(new java.awt.Color(-10212853,true));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/statistics.png"))); // NOI18N
        jButton3.setText("Statistiques");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 480, 82));

        jButton4.setBackground(new java.awt.Color(-66829,true));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 24));
        jButton4.setForeground(new java.awt.Color(-10212853,true));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plussign1.png"))); // NOI18N
        jButton4.setText("Nouveau stagiaire ");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 480, 82));

        jButton10.setBackground(new java.awt.Color(-66829,true));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton10.setForeground(new java.awt.Color(-10212853,true));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cross106.png"))); // NOI18N
        jButton10.setText("Deconnexion");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 150, 40));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.gif"))); // NOI18N
        Menu.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton7.setBackground(new java.awt.Color(-66829,true));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 24));
        jButton7.setForeground(new java.awt.Color(-10212853,true));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home168.png"))); // NOI18N
        jButton7.setText("Nouvelle agence");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 480, 82));

        jLabel7.setBackground(new java.awt.Color(-66829,true));
        jLabel7.setFont(new java.awt.Font("Dialog", 2, 36));
        jLabel7.setForeground(new java.awt.Color(-1671680,true));
        jLabel7.setText("   Gestion des stagiaires ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabel7.setOpaque(true);
        Menu.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 420, -1));

        Agencelibre.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(-66829,true));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setForeground(new java.awt.Color(-10214646,true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel3.setForeground(new java.awt.Color(-11394294,true));
        jLabel3.setText("Region :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel4.setForeground(new java.awt.Color(-11394294,true));
        jLabel4.setText("Les agences  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 30));

        jComboBox1.setBackground(new java.awt.Color(-66829,true));
        jComboBox1.setMaximumRowCount(4);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, 30));

        jButton13.setBackground(new java.awt.Color(-66829,true));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton13.setForeground(new java.awt.Color(-11394294,true));
        jButton13.setText("Retour au menu");
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 160, 42));

        jButton5.setBackground(new java.awt.Color(-66829,true));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton5.setForeground(new java.awt.Color(-11394294,true));
        jButton5.setText("Affecter Stagiaire");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 160, 43));

        jComboBox2.setBackground(new java.awt.Color(-66829,true));
        jComboBox2.setMaximumRowCount(4);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 30));

        jLabel16.setFont(new java.awt.Font("Dialog", 2, 18));
        jLabel16.setForeground(new java.awt.Color(-1671680,true));
        jLabel16.setText("Veuillez sélectionner d'abord une agence libre :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        Agencelibre.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 138, 530, 390));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.gif"))); // NOI18N
        Agencelibre.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 222, -1));

        Affectation.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        Affectation.getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 170, 27));
        jTextField18.getAccessibleContext().setAccessibleName("");
        jTextField18.getAccessibleContext().setAccessibleDescription("");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel21.setForeground(new java.awt.Color(-11394294,true));
        jLabel21.setText("Prenom :");
        Affectation.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 27));
        jLabel21.getAccessibleContext().setAccessibleName("");

        Affectation.getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 170, 27));
        jTextField19.getAccessibleContext().setAccessibleName("");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel22.setForeground(new java.awt.Color(-11394294,true));
        jLabel22.setText("E-mail :");
        Affectation.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 27));
        jLabel22.getAccessibleContext().setAccessibleName("");

        Affectation.getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 170, 27));
        jTextField20.getAccessibleContext().setAccessibleName("");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel23.setForeground(new java.awt.Color(-11394294,true));
        jLabel23.setText("CIN :");
        Affectation.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 27));
        jLabel23.getAccessibleContext().setAccessibleName("");

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        Affectation.getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 170, 27));
        jTextField21.getAccessibleContext().setAccessibleName("");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel24.setForeground(new java.awt.Color(-11394294,true));
        jLabel24.setText("Nom :");
        Affectation.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 27));
        jLabel24.getAccessibleContext().setAccessibleName("");

        Affectation.getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 170, 27));
        jTextField22.getAccessibleContext().setAccessibleName("");

        jButton8.setBackground(new java.awt.Color(-66829,true));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton8.setForeground(new java.awt.Color(-11394294,true));
        jButton8.setText("Ajouter la photo ");
        jButton8.setAutoscrolls(true);
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Affectation.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 180, 60));
        Affectation.getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 170, 27));
        jTextField23.getAccessibleContext().setAccessibleName("");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel25.setForeground(new java.awt.Color(-11394294,true));
        jLabel25.setText("Tel :");
        Affectation.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, 27));
        jLabel25.getAccessibleContext().setAccessibleName("");
        jLabel25.getAccessibleContext().setAccessibleDescription("");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel26.setForeground(new java.awt.Color(-11394294,true));
        jLabel26.setText("Adresse :");
        Affectation.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, 27));
        jLabel26.getAccessibleContext().setAccessibleName("");

        Affectation.getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 170, 27));
        jTextField25.getAccessibleContext().setAccessibleName("");

        jTextField26.setToolTipText("");
        jTextField26.setFocusCycleRoot(true);
        jTextField26.setFocusTraversalPolicyProvider(true);
        jTextField26.setNextFocusableComponent(jTextField27);
        Affectation.getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 170, 27));
        jTextField26.getAccessibleContext().setAccessibleName("");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel27.setForeground(new java.awt.Color(-11394294,true));
        jLabel27.setText("Recommandé(e) par :");
        Affectation.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, 27));
        jLabel27.getAccessibleContext().setAccessibleName("");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel28.setForeground(new java.awt.Color(-11394294,true));
        jLabel28.setText("Date début  :");
        Affectation.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, 27));
        jLabel28.getAccessibleContext().setAccessibleDescription("");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel29.setForeground(new java.awt.Color(-11394294,true));
        jLabel29.setText("Date fin :");
        Affectation.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, 27));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel30.setForeground(new java.awt.Color(-11394294,true));
        jLabel30.setText("Sujet :");
        Affectation.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, 27));
        jLabel30.getAccessibleContext().setAccessibleDescription("");

        jButton9.setBackground(new java.awt.Color(-66829,true));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton9.setForeground(new java.awt.Color(-10214646,true));
        jButton9.setText("Enregistrer");
        jButton9.setToolTipText("");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Affectation.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 245, 50));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel31.setForeground(new java.awt.Color(-11394294,true));
        jLabel31.setText("Formation :");
        Affectation.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 27));
        jLabel31.getAccessibleContext().setAccessibleName("");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel32.setForeground(new java.awt.Color(-11394294,true));
        jLabel32.setText("Niveau :");
        Affectation.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, 27));
        Affectation.getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 170, 27));
        jTextField27.getAccessibleContext().setAccessibleName("");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel34.setForeground(new java.awt.Color(-11394294,true));
        jLabel34.setText("Etablissement de formation :");
        Affectation.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, 27));
        jLabel34.getAccessibleContext().setAccessibleName("");

        jDateChooser2.setToolTipText("");
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setMinSelectableDate(new java.util.Date(-62135765923000L));
        Affectation.getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 170, 27));
        jDateChooser2.getAccessibleContext().setAccessibleName("");

        Affectation.getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 170, 27));
        jTextField28.getAccessibleContext().setAccessibleName("");
        jTextField28.getAccessibleContext().setAccessibleDescription("");

        jDateChooser3.setDateFormatString("yyyy-MM-dd");
        Affectation.getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 170, 27));
        jDateChooser3.getAccessibleContext().setAccessibleName("");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(82, 35, 10));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        Affectation.getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 170, 27));
        jComboBox3.getAccessibleContext().setAccessibleName("");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(228, 110, 42));
        jLabel62.setText("Les champs indiqués par une * sont obligatoires.");
        Affectation.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(228, 110, 42));
        jLabel63.setText("*");
        Affectation.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 395, -1, -1));
        jLabel63.getAccessibleContext().setAccessibleDescription("");

        jLabel64.setPreferredSize(new java.awt.Dimension(120, 150));
        jLabel64.setRequestFocusEnabled(false);
        Affectation.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 150));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(228, 110, 42));
        jLabel65.setText("*");
        Affectation.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 195, -1, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(228, 110, 42));
        jLabel66.setText("*");
        Affectation.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 245, -1, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(228, 110, 42));
        jLabel67.setText("*");
        Affectation.getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 395, -1, -1));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(228, 110, 42));
        jLabel70.setText("*");
        Affectation.getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, -1, -1));

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(228, 110, 42));
        jLabel72.setText("*");
        Affectation.getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 345, -1, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(228, 110, 42));
        jLabel73.setText("*");
        Affectation.getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 195, -1, -1));

        Statistiques.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(-66829,true));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel8.setForeground(new java.awt.Color(-11394294,true));
        jLabel8.setText("Nombre total des stagiaires :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 25));
        jLabel8.getAccessibleContext().setAccessibleName("");
        jLabel8.getAccessibleContext().setAccessibleDescription("");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel9.setForeground(new java.awt.Color(-11394294,true));
        jLabel9.setText("Nombre total des regions : ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 25));
        jLabel9.getAccessibleContext().setAccessibleName("");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel10.setForeground(new java.awt.Color(-11394294,true));
        jLabel10.setText("Nombre total des agences : ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 25));
        jLabel10.getAccessibleContext().setAccessibleName("");

        jTextField2.setDisabledTextColor(new java.awt.Color(-1671680,true));
        jTextField2.setEnabled(false);
        jTextField2.setFocusable(false);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 70, 25));
        jTextField2.getAccessibleContext().setAccessibleName("");

        jTextField5.setDisabledTextColor(new java.awt.Color(230, 126, 0));
        jTextField5.setEnabled(false);
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 70, 25));
        jTextField5.getAccessibleContext().setAccessibleName("");
        jTextField5.getAccessibleContext().setAccessibleDescription("");

        jTextField6.setDisabledTextColor(new java.awt.Color(230, 126, 0));
        jTextField6.setEnabled(false);
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 70, 25));
        jTextField6.getAccessibleContext().setAccessibleName("");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel20.setForeground(new java.awt.Color(-1671680,true));
        jLabel20.setText("Statistiques général :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        Statistiques.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 270));

        jPanel4.setBackground(new java.awt.Color(-66829,true));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel11.setForeground(new java.awt.Color(-11394294,true));
        jLabel11.setText("Par année : ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 25));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel13.setForeground(new java.awt.Color(-11394294,true));
        jLabel13.setText("1ére semestre :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 25));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel14.setForeground(new java.awt.Color(-11394294,true));
        jLabel14.setText("2éme semestre :");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 25));
        jLabel14.getAccessibleContext().setAccessibleDescription("");

        jPanel4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 70, 25));
        jTextField7.getAccessibleContext().setAccessibleName("");

        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 70, 25));
        jTextField8.getAccessibleContext().setAccessibleName("");

        jPanel4.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 70, 25));
        jTextField9.getAccessibleContext().setAccessibleName("");

        jComboBox4.setBackground(new java.awt.Color(-66829,true));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 90, 25));
        jComboBox4.getAccessibleContext().setAccessibleDescription("");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel15.setForeground(new java.awt.Color(-11394294,true));
        jLabel15.setText("Sélectionnez une année :");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 25));
        jLabel15.getAccessibleContext().setAccessibleDescription("");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel38.setForeground(new java.awt.Color(-1671680,true));
        jLabel38.setText("Année / Semestre :");
        jLabel38.setToolTipText("");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        Statistiques.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 330, 270));
        jPanel4.getAccessibleContext().setAccessibleName("");
        jPanel4.getAccessibleContext().setAccessibleDescription("");

        jPanel5.setBackground(new java.awt.Color(-66829,true));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox7.setBackground(new java.awt.Color(-66829,true));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 160, 25));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel18.setForeground(new java.awt.Color(-11394294,true));
        jLabel18.setText("Nombre total des stagiaires :");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 25));
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 80, 25));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel12.setForeground(new java.awt.Color(-11394294,true));
        jLabel12.setText("Filière :");
        jLabel12.setAutoscrolls(true);
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 25));
        jLabel12.getAccessibleContext().setAccessibleDescription("");

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel59.setForeground(new java.awt.Color(-1671680,true));
        jLabel59.setText("Par Filière :");
        jPanel5.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        Statistiques.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 270));
        jPanel5.getAccessibleContext().setAccessibleName("");

        jPanel8.setBackground(new java.awt.Color(-66829,true));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox8.setBackground(new java.awt.Color(-66829,true));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, 25));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel19.setForeground(new java.awt.Color(-11394294,true));
        jLabel19.setText("Niveau :");
        jLabel19.setAutoscrolls(true);
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 25));
        jLabel19.getAccessibleContext().setAccessibleDescription("");

        jPanel8.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 80, 25));

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel60.setForeground(new java.awt.Color(-11394294,true));
        jLabel60.setText("Nombre total des stagiaires :");
        jLabel60.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 25));

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel61.setForeground(new java.awt.Color(-1671680,true));
        jLabel61.setText("Par Niveau :");
        jPanel8.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        Statistiques.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 330, 270));

        Nouvelleagence.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.gif"))); // NOI18N
        Nouvelleagence.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel6.setBackground(new java.awt.Color(-66829,true));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox5.setBackground(new java.awt.Color(-66829,true));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox5.setVerifyInputWhenFocusTarget(false);
        jPanel6.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, 30));

        jButton15.setBackground(new java.awt.Color(-66829,true));
        jButton15.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton15.setForeground(new java.awt.Color(-10212853,true));
        jButton15.setText("Enregistrer ");
        jButton15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 180, 51));

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel40.setForeground(new java.awt.Color(-11394294,true));
        jLabel40.setText("Nom de l'agence :");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 30));
        jLabel40.getAccessibleContext().setAccessibleName("");

        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, 30));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel39.setForeground(new java.awt.Color(-11394294,true));
        jLabel39.setText("Nom de région :");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 30));
        jLabel39.getAccessibleContext().setAccessibleName("");

        Nouvelleagence.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 138, 530, 390));

        Rechercherstagiaire.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton25.setBackground(new java.awt.Color(-1513240,true));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/recherche.gif"))); // NOI18N
        jButton25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 90, 30));

        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 100, 30));
        jTextField43.getAccessibleContext().setAccessibleName("");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel56.setForeground(new java.awt.Color(-11394294,true));
        jLabel56.setText("Veuillez saisir le CIN :");
        Rechercherstagiaire.getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, 30));
        jLabel56.getAccessibleContext().setAccessibleName("");
        jLabel56.getAccessibleContext().setAccessibleDescription("");

        Rechercherstagiaire.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 120, 150));

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel46.setForeground(new java.awt.Color(-11394294,true));
        jLabel46.setText("Nom :");
        jLabel46.setAlignmentX(0.5F);
        Rechercherstagiaire.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 27));
        jLabel46.getAccessibleContext().setAccessibleDescription("");

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel48.setForeground(new java.awt.Color(-11394294,true));
        jLabel48.setText("Prenom :");
        jLabel48.setAlignmentX(0.5F);
        Rechercherstagiaire.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 27));
        jLabel48.getAccessibleContext().setAccessibleDescription("");

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel47.setForeground(new java.awt.Color(-11394294,true));
        jLabel47.setText("E-mail :");
        jLabel47.setAlignmentX(0.5F);
        Rechercherstagiaire.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 27));

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel44.setForeground(new java.awt.Color(-11394294,true));
        jLabel44.setText("Tel :");
        jLabel44.setAlignmentX(0.5F);
        Rechercherstagiaire.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 27));
        jLabel44.getAccessibleContext().setAccessibleDescription("");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel43.setForeground(new java.awt.Color(-11394294,true));
        jLabel43.setText("Adresse :");
        jLabel43.setAlignmentX(0.5F);
        Rechercherstagiaire.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 27));

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel41.setForeground(new java.awt.Color(-11394294,true));
        jLabel41.setText("Institut");
        jLabel41.setAlignmentX(0.5F);
        Rechercherstagiaire.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, 27));

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel42.setForeground(new java.awt.Color(-11394294,true));
        jLabel42.setText("Formation :");
        jLabel42.setAlignmentX(0.5F);
        Rechercherstagiaire.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, 27));
        jLabel42.getAccessibleContext().setAccessibleDescription("");

        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 27));
        jTextField31.getAccessibleContext().setAccessibleName("");
        jTextField31.getAccessibleContext().setAccessibleDescription("");

        Rechercherstagiaire.getContentPane().add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 170, 27));
        jTextField33.getAccessibleContext().setAccessibleName("");

        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 170, 27));
        jTextField32.getAccessibleContext().setAccessibleName("");

        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 170, 27));
        jTextField30.getAccessibleContext().setAccessibleName("");

        jTextField29.setVerifyInputWhenFocusTarget(false);
        Rechercherstagiaire.getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 170, 27));
        jTextField29.getAccessibleContext().setAccessibleName("");

        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 170, 27));
        jTextField35.getAccessibleContext().setAccessibleName("");

        Rechercherstagiaire.getContentPane().add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 170, 27));
        jTextField34.getAccessibleContext().setAccessibleName("");

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel55.setForeground(new java.awt.Color(-11394294,true));
        jLabel55.setText("Niveau :");
        Rechercherstagiaire.getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 27));
        jLabel55.getAccessibleContext().setAccessibleName("");
        jLabel55.getAccessibleContext().setAccessibleDescription("");

        Rechercherstagiaire.getContentPane().add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 170, 27));
        jTextField41.getAccessibleContext().setAccessibleDescription("");

        jTextField42.setEditable(false);
        Rechercherstagiaire.getContentPane().add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 170, 27));
        jTextField42.getAccessibleContext().setAccessibleName("");
        jTextField42.getAccessibleContext().setAccessibleDescription("");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel50.setForeground(new java.awt.Color(-11394294,true));
        jLabel50.setText("Nom agence :");
        Rechercherstagiaire.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, 27));
        jLabel50.getAccessibleContext().setAccessibleName("");
        jLabel50.getAccessibleContext().setAccessibleDescription("");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel52.setForeground(new java.awt.Color(-11394294,true));
        jLabel52.setText("Recommandé(e) par :");
        Rechercherstagiaire.getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 208, 27));
        jLabel52.getAccessibleContext().setAccessibleName("");
        jLabel52.getAccessibleContext().setAccessibleDescription("");

        Rechercherstagiaire.getContentPane().add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 170, 27));
        jTextField37.getAccessibleContext().setAccessibleDescription("");

        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 170, 27));
        jTextField39.getAccessibleContext().setAccessibleDescription("");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel53.setForeground(new java.awt.Color(-11394294,true));
        jLabel53.setText("Date début :");
        Rechercherstagiaire.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, 27));
        jLabel53.getAccessibleContext().setAccessibleName("");
        jLabel53.getAccessibleContext().setAccessibleDescription("");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel51.setForeground(new java.awt.Color(-11394294,true));
        jLabel51.setText("Date fin :");
        Rechercherstagiaire.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, 27));
        jLabel51.getAccessibleContext().setAccessibleName("");
        jLabel51.getAccessibleContext().setAccessibleDescription("");

        Rechercherstagiaire.getContentPane().add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 170, 27));
        jTextField40.getAccessibleContext().setAccessibleName("");
        jTextField40.getAccessibleContext().setAccessibleDescription("");

        Rechercherstagiaire.getContentPane().add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 170, 27));
        jTextField36.getAccessibleContext().setAccessibleDescription("");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel49.setForeground(new java.awt.Color(-11394294,true));
        jLabel49.setText("Sujet :");
        Rechercherstagiaire.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, 27));
        jLabel49.getAccessibleContext().setAccessibleName("");
        jLabel49.getAccessibleContext().setAccessibleDescription("");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel54.setForeground(new java.awt.Color(-11394294,true));
        jLabel54.setText("Remarque :");
        Rechercherstagiaire.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, 27));
        jLabel54.getAccessibleContext().setAccessibleName("");
        jLabel54.getAccessibleContext().setAccessibleDescription("");

        Rechercherstagiaire.getContentPane().add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 170, 27));
        jTextField38.getAccessibleContext().setAccessibleDescription("");

        jButton27.setBackground(new java.awt.Color(-66829,true));
        jButton27.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton27.setForeground(new java.awt.Color(-10214646,true));
        jButton27.setText("Retour au menu");
        jButton27.setToolTipText("");
        jButton27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, 210, 50));

        jButton28.setBackground(new java.awt.Color(-66829,true));
        jButton28.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton28.setForeground(new java.awt.Color(-10214646,true));
        jButton28.setText("Enregistrer modification");
        jButton28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 210, 50));

        jButton18.setBackground(new java.awt.Color(-66829,true));
        jButton18.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton18.setForeground(new java.awt.Color(-10214646,true));
        jButton18.setText("Afficher tous");
        jButton18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 210, 40));

        jButton26.setBackground(new java.awt.Color(-66829,true));
        jButton26.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton26.setForeground(new java.awt.Color(-11394294,true));
        jButton26.setText(">>");
        jButton26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Rechercherstagiaire.getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 143, 30));

        jButton29.setBackground(new java.awt.Color(-66829,true));
        jButton29.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton29.setForeground(new java.awt.Color(-11394294,true));
        jButton29.setText(">");
        jButton29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Rechercherstagiaire.getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 143, 30));

        jButton30.setBackground(new java.awt.Color(-66829,true));
        jButton30.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton30.setForeground(new java.awt.Color(-11394294,true));
        jButton30.setText(" <");
        jButton30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Rechercherstagiaire.getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 143, 30));

        jButton31.setBackground(new java.awt.Color(-66829,true));
        jButton31.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton31.setForeground(new java.awt.Color(-11394294,true));
        jButton31.setText("<<");
        jButton31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        Rechercherstagiaire.getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 143, 30));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(228, 110, 42));
        jLabel68.setText("AAAA-MM-JJ");
        Rechercherstagiaire.getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, 27));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(228, 110, 42));
        jLabel69.setText("AAAA-MM-JJ");
        Rechercherstagiaire.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, -1, 27));

        inscrire.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.gif"))); // NOI18N
        inscrire.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel7.setBackground(new java.awt.Color(-66829,true));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton16.setBackground(new java.awt.Color(-66829,true));
        jButton16.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton16.setForeground(new java.awt.Color(-10212853,true));
        jButton16.setText("S'inscrire");
        jButton16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 180, 51));

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel57.setForeground(new java.awt.Color(-11394294,true));
        jLabel57.setText("Mot de passe :");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 30));

        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, 30));

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel58.setForeground(new java.awt.Color(-11394294,true));
        jLabel58.setText("Nom utilisateur :");
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 30));
        jPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, 30));

        inscrire.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 470, 340));
        jPanel7.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(-1006727,true));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(-66829,true));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setForeground(new java.awt.Color(-11394294,true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setVerifyInputWhenFocusTarget(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 102, 150, 30));
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 177, 150, 30));
        jPasswordField1.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel1.setForeground(new java.awt.Color(-11394294,true));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user168.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 95, 30, 40));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel2.setForeground(new java.awt.Color(-10278390,true));
        jLabel2.setText("Mot de passe :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 30));

        jButton11.setBackground(new java.awt.Color(-66829,true));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton11.setForeground(new java.awt.Color(-10278390,true));
        jButton11.setText("Se connecter");
        jButton11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 150, 50));

        jButton1.setBackground(new java.awt.Color(-66829,true));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton1MouseWheelMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 177, 50, 30));
        jButton1.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel5.setForeground(new java.awt.Color(-10278390,true));
        jLabel5.setText("Nom d'utilisateur :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 105, -1, 30));
        jLabel5.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock6.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 175, 40, 30));
        jLabel6.getAccessibleContext().setAccessibleDescription("");

        jButton6.setBackground(new java.awt.Color(-66829,true));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton6.setForeground(new java.awt.Color(-10278390,true));
        jButton6.setText("S'inscrire");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 470, 340));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.gif"))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 208, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
            //Agences libres
     
     String requete_agence= "select nomagence from agence where idregion=(select idregion from region"
             + " where nomregion=?) and dispo='true' order by idagence";

     try {
         Object obj = evt.getSource();
         if(jComboBox1==obj){
             jComboBox2.removeAllItems();
         ps=maconnexion.obtenirConnexion().prepareStatement(requete_agence);
         ps.setString(1, jComboBox1.getSelectedItem().toString());
           rs=ps.executeQuery();
           while(rs.next()){
                             jComboBox2.addItem(rs.getString(1));
                         }
           
                if (  jComboBox2.getSelectedItem() == null) {
             jButton5.setEnabled(false);
        }
       
                        
                          else{
         jButton5.setEnabled(true);
         }
    }}
           catch(Exception e ){
             System.out.println(e);
     }

}//GEN-LAST:event_jComboBox1ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  //button affecter 
  Affectation.setVisible(true);
  Affectation.setBounds(WIDTH, WIDTH, 900, 700);
  Affectation.getContentPane().setBackground(new Color(242,242,242));
  
  
  
//            jTextField27.setText("");
//            jTextField26.setText("");
//            jTextField25.setText("");
//            jTextField20.setText("");
//            jTextField21.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
//            jTextField23.setText("");
//            jComboBox3.setSelectedItem(null);
//            jTextField22.setText("");
//            jDateChooser2.setDate(null);
//            jDateChooser3.setDate(null);
//            jTextField28.setText("");
//         
       jComboBox3.removeAllItems();
       jButton9.setBackground(new Color(254,250,243));
       jButton9.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
       jButton8.setBackground(new Color(254,250,243));
       jButton8.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
        jComboBox3.addItem("indéfini");
        jComboBox3.addItem("Bac");
        jComboBox3.addItem("Bac+1");
        jComboBox3.addItem("Bac+2");
        jComboBox3.addItem("Bac+3");
        jComboBox3.addItem("Bac+4");
        jComboBox3.addItem("Bac+5");

          
}//GEN-LAST:event_jButton5ActionPerformed
  
      
  
private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         try {
             // button choisir photo
             jFileChooser1.setVisible(true);
             
             if ( jFileChooser1.showOpenDialog(null) == jFileChooser1.APPROVE_OPTION) {
                 path = jFileChooser1.getSelectedFile().getAbsolutePath();
         jLabel64.setIcon(new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));

             }
         } catch (Exception ex) {
             Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
         }

        
             
}//GEN-LAST:event_jButton8ActionPerformed

private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

  //button d'ajout
     
           
   
    String requete_insertion = "insert into stagiaire (cin,nom,prenom,email,tel,adresse,recommandation,ecole,formation,niveau,datedebutstage,datefinstage,photo,idagence,sujet)"
            + "values (?,?,?,?,?,?,?,?,?,?,? ,?,?,?,?)";
    try {
        ps=maconnexion.obtenirConnexion().prepareStatement(requete_insertion); 
        stmt=maconnexion.obtenirConnexion().createStatement();
        
        String requete_idagence = "select idagence from agence where nomagence = '"+jComboBox2.getSelectedItem().toString()+"'";
        int idagen =0;
        rs=stmt.executeQuery(requete_idagence);
        while(rs.next()){
        
        idagen =rs.getInt(1);
        System.out.println(idagen);
                
                }
            ps.setString(1, jTextField27.getText());       //cin
            ps.setString(2, jTextField26.getText());   //nom
            ps.setString(3, jTextField25.getText());   //prenom
            
           
            ps.setString(4, jTextField20.getText());   //email
            ps.setString(5, jTextField21.getText());    // tel
            ps.setString(6, jTextField18.getText());    //adresse
            ps.setString(7, jTextField22.getText());   //recommandation
            ps.setString(8, jTextField19.getText());   //etablissement
           
            ps.setString(9, jTextField23.getText());   //formation
            ps.setString(10, jComboBox3.getSelectedItem().toString());  //niveau
            
            ps.setString(11, ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText()); // date debut stage
            ps.setString(12, ((JTextField)jDateChooser3.getDateEditor().getUiComponent()).getText()); //date fin stage
           FileInputStream fin = new FileInputStream(path);
           ps.setBinaryStream(13,fin,fin.available());
            
//            ps.setString(13,path); //photo
            
            ps.setInt(14, idagen);// nom agence
            
            ps.setString(15, jTextField28.getText());// sujet
            

            if( jTextField23.getText().equals("") || 
                    jTextField27.getText().equals("") || jTextField26.getText().equals("") ||  
                    jTextField25.getText().equals("") || jTextField21.getText().equals("") || 
                    jDateChooser2.getDate()== null || jDateChooser3.getDate() == null) 
                            
            {

                JOptionPane.showMessageDialog(null, "Echec d'enregistrer le stagiaire ! \n Vous devez remplir les champs obligatoires.");
            }                    
            else {                                   
                            
            int i = ps.executeUpdate();
            System.out.println(i+"stagiaire ajouté");
            
            JOptionPane.showMessageDialog(null, "Le stagiaire a été ajouté avec succès !");
            
         
        
       if (i>0) {
      String sql_update ="update agence set dispo ='false' where idagence = ? "
              + "and ?  >=  CURDATE()";
      
         
       ps=maconnexion.obtenirConnexion().prepareStatement(sql_update);
        
      ps.setInt(1, idagen);
      ps.setString(2, ((JTextField)jDateChooser3.getDateEditor().getUiComponent()).getText());
      ps.executeUpdate();
       
       }
        
            jLabel64.setIcon(null);
            jComboBox1.setSelectedItem(null);
            jComboBox2.setSelectedItem(null);
            jTextField27.setText("");
            jTextField26.setText("");
            jTextField25.setText("");
            jTextField20.setText("");
            jTextField21.setText("");
            jTextField18.setText("");
            jTextField19.setText("");
            jTextField23.setText("");
            jComboBox3.setSelectedItem(null);
            jTextField22.setText("");
            jDateChooser2.setDate(null);
            jDateChooser3.setDate(null);
            jTextField28.setText("");
    
            Affectation.setVisible(false);
            Agencelibre.setVisible(true);
            
            }
    }catch(Exception e ) {
    System.out.println(e);}


    
}//GEN-LAST:event_jButton9ActionPerformed

private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
  
    
}//GEN-LAST:event_jTextField1FocusLost

private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

}//GEN-LAST:event_jTextField1FocusGained

private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
     
    try{
        Agencelibre.setVisible(false);
    Menu.setVisible(true);
    
      jComboBox1.setSelectedIndex(0);
       jComboBox2.setSelectedIndex(0);}
    catch(Exception e){
    System.out.println(e);
    }
      
}//GEN-LAST:event_jButton13ActionPerformed

private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
//button login
        jLabel7.setBorder(BorderFactory.createLineBorder(new Color(181,181,181),2));
       jButton2.setBackground(new Color(254,250,243));
       jButton2.setBorder(BorderFactory.createLineBorder(new Color(255,217,170), 3));
       jButton4.setBackground(new Color(254,250,243));
       jButton4.setBorder(BorderFactory.createLineBorder(new Color(255,217,170), 3));
       jButton7.setBackground(new Color(254,250,243));
       jButton7.setBorder(BorderFactory.createLineBorder(new Color(255,217,170), 3));
       jButton3.setBackground(new Color(254,250,243));
       jButton3.setBorder(BorderFactory.createLineBorder(new Color(255,217,170), 3));
      jButton10.setBackground(new Color(254,250,243));
       jButton10.setBorder(BorderFactory.createLineBorder(new Color(255,217,170), 3));
       
  
    String sql ="select * from users where username = ? and password = ? ";
    try{
    
    ps=maconnexion.obtenirConnexion().prepareStatement(sql);
    ps.setString(1, jTextField1.getText());
    ps.setString(2, jPasswordField1.getText());
    rs=ps.executeQuery();
   
    if(rs.next()) {
    this.dispose();
    Menu.setVisible(true);
    Menu.setBounds(WIDTH, WIDTH, 650, 700);
    Menu.getContentPane().setBackground(new Color(242,242,242));
    
    
    
    }else {
    
    JOptionPane.showMessageDialog(null, "username and/or incorrect");
     jTextField1.setText("");
    jPasswordField1.setText("");
    }
    }catch(Exception e ){
    System.out.println(e);
    
    }
    
    
    
    
}//GEN-LAST:event_jButton11ActionPerformed

private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
 try {
     
         String max_idagence ="select max(idagence) from agence ";
            int maxid=0;
            stmt=maconnexion.obtenirConnexion().createStatement();
            rs=stmt.executeQuery(max_idagence);
            while(rs.next()){
               maxid=rs.getInt(1);
               maxid= maxid+1;
           }
            
           String idregion ="select idregion from region where nomregion = '"+jComboBox5.getSelectedItem().toString()+"'";
            int idreg =0;
            stmt=maconnexion.obtenirConnexion().createStatement();
            rs=stmt.executeQuery(idregion);
            while (rs.next()){
                idreg=rs.getInt(1);
            }
            
            String insertion ="insert into agence (idagence,nomagence,idregion) values (?,?,?)";
            ps=maconnexion.obtenirConnexion().prepareStatement(insertion); 
           
             ps.setInt(1, maxid);
             ps.setString(2, jTextField24.getText());
             ps.setInt(3, idreg);
              ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"Agence ajouté");
         jComboBox5.setSelectedIndex(0);
         jTextField24.setText("");
     
     
        } catch (Exception ex) {
            System.out.println(ex);
        }

    
    
}//GEN-LAST:event_jButton15ActionPerformed

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    
}//GEN-LAST:event_jButton1MouseClicked

private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
// TODO add your handling code here:
  jPasswordField1.setEchoChar((char)0);
   
}//GEN-LAST:event_jButton1MousePressed

private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
// TODO add your handling code here:
     
    
    
}//GEN-LAST:event_jButton1MouseEntered

private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
// TODO add your handling code here:
    
   

    
}//GEN-LAST:event_jButton1MouseExited

private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
// TODO add your handling code here
    
    jPasswordField1.setEchoChar('*');

}//GEN-LAST:event_jButton1MouseReleased

private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField30ActionPerformed

private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField31ActionPerformed

private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField32ActionPerformed

private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField35ActionPerformed

private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField39ActionPerformed

private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
// TODO add your handling code here:
       Rechercherstagiaire.setVisible(false);
       Menu.setVisible(true);
}//GEN-LAST:event_jButton27ActionPerformed



private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
// TODO add your handling code here:
    
             
          String sql_modifier ="update stagiaire set nom=? , prenom=? , email=? , tel=? , adresse=? , ecole=? ,"
                  + " formation=? , niveau=? , recommandation=? , datedebutstage=? ,datefinstage=? ,sujet=? , remarque =?  where cin = ? ";
              
        try {
        String requete_idagence = "select idagence from agence where nomagence = '"+jTextField42.getText()+"'";
        int id =0;
        rs=stmt.executeQuery(requete_idagence);
        while(rs.next()){
        
        id =rs.getInt(1);
        System.out.println(id);
                
                }
          ps=maconnexion.obtenirConnexion().prepareStatement(sql_modifier);
          ps.setString(1, jTextField31.getText()); //NOM
          ps.setString(2, jTextField33.getText()); //PRENOM
          ps.setString(3, jTextField32.getText()); //EMAIL
          ps.setString(4, jTextField30.getText()); //TEL
          ps.setString(5, jTextField29.getText()); //ADRESSE
          ps.setString(6, jTextField35.getText()); //ECOLE
          ps.setString(7, jTextField34.getText()); //FORMATION
          ps.setString(8, jTextField41.getText()); //NIVEAU
          ps.setString(9, jTextField37.getText()); //RECOMMANDATION
          if(jTextField39.getText().equals("")){
              ps.setString(10, null);
              ps.setString(11, null);
          }else{
          ps.setString(10, jTextField39.getText()); //DATEDEBUTSTAGE
          ps.setString(11, jTextField40.getText()); //DATEFINSTAGE
          }
          ps.setString(12, jTextField36.getText()); //SUJET
          ps.setString(13, jTextField38.getText()); //REMARQUE
          ps.setString(14, jTextField43.getText()); //CIN
          int c =ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Les modifications ont été enregistrées ! ");
       if (c>0) {
      String sql_update ="update agence set dispo ='false' where idagence = ? "
              + "and ?  >=  CURDATE()";
      
         
       ps=maconnexion.obtenirConnexion().prepareStatement(sql_update);
        
        ps.setInt(1, id);
      ps.setString(2, jTextField40.getText());
        ps.executeUpdate();
       
       }
        
         
        }catch(Exception e ){
        
        JOptionPane.showMessageDialog(null, e);
        }
                
           
   
    
}//GEN-LAST:event_jButton28ActionPerformed


private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
// TODO add your handling code here:
//    
       
    String requete_rechercher = "select cin,nom,prenom,email,tel,adresse,ecole,formation,niveau,a.nomagence,"
     + " datedebutstage,datefinstage,sujet,recommandation,photo,remarque from stagiaire s  join agence a on (s.idagence=a.idagence) and cin = ? ";
      
    try { 
         ps=maconnexion.obtenirConnexion().prepareStatement(requete_rechercher);         
         ps.setString(1, jTextField43.getText()); //cin
         rs=ps.executeQuery();
      

    if( rs.next()==false){
       JOptionPane.showMessageDialog(null, "Aucun stagiaire trouvé");
   }else {
         jButton31.setEnabled(false);
       jButton30.setEnabled(false);
       jButton29.setEnabled(false);
       jButton26.setEnabled(false);
     
        
         jTextField31.setText(rs.getString(2)); //nom
          jTextField33.setText(rs.getString(3)); //prenom
          jTextField32.setText(rs.getString(4));   //EMAIL
          jTextField30.setText(0+rs.getString(5));   //TEL
          jTextField29.setText(rs.getString(6));    //ADRESSE
          jTextField35.setText(rs.getString(7));  //ETABLISSEMENT
          jTextField34.setText(rs.getString(8)); //FORMATION
         jTextField41.setText(rs.getString(9));  //niveau
          jTextField42.setText(rs.getString(10)); //nom agence
          jTextField39.setText(rs.getString(11));  //DATEDEBUTSTAGE
          jTextField40.setText(rs.getString(12));  //DATEFINSTAGE
          jTextField36.setText(rs.getString(13)); //SUJET
          jTextField37.setText(rs.getString(14));  //RECOMMANDATION
           
          pic=rs.getBytes("photo");
          jLabel45.setIcon(new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));
     //    jLabel45.setIcon(new ImageIcon(new ImageIcon(rs.getString("cheminphoto")).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));
          jTextField38.setText(rs.getString(16));  // Remarque
           

    } }
         catch(SQLException e ) {
          System.out.println(e);
    
                 }
    
}//GEN-LAST:event_jButton25ActionPerformed

private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField43ActionPerformed
   
       
        
private void scroll(){
       jButton26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    rs.last();
               
               jTextField43.setText(rs.getString(1));
          jTextField31.setText(rs.getString(2)); //nom
          jTextField33.setText(rs.getString(3)); //prenom
          jTextField32.setText(rs.getString(4));   //EMAIL
          jTextField30.setText(0+rs.getString(5));   //TEL
          jTextField29.setText(rs.getString(6));    //ADRESSE
          jTextField35.setText(rs.getString(7));  //ETABLISSEMENT
          jTextField34.setText(rs.getString(8)); //FORMATION
          jTextField41.setText(rs.getString(9));  //niveau
          jTextField42.setText(rs.getString(10)); //nom agence
          jTextField39.setText(rs.getString(11));  //DATEDEBUTSTAGE
          jTextField40.setText(rs.getString(12));  //DATEFINSTAGE
          jTextField36.setText(rs.getString(13)); //SUJET
          jTextField37.setText(rs.getString(14));  //RECOMMANDATION
         pic=rs.getBytes("photo");
         jLabel45.setIcon(new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));
            
//        jLabel45.setIcon( new ImageIcon(new ImageIcon(rs.getString("cheminphoto")).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));
         jTextField38.setText(rs.getString(16));  // Remarque
                } catch (SQLException ex) {
                    System.out.println(ex);
                    
                }
            }
        });
       
       jButton29.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent event) {
              
                 try {
                    if(rs.next()){
                    jTextField43.setText(rs.getString(1));
          jTextField31.setText(rs.getString(2)); //nom
          jTextField33.setText(rs.getString(3)); //prenom
          jTextField32.setText(rs.getString(4));   //EMAIL
          jTextField30.setText(0+rs.getString(5));   //TEL
          jTextField29.setText(rs.getString(6));    //ADRESSE
          jTextField35.setText(rs.getString(7));  //ETABLISSEMENT
          jTextField34.setText(rs.getString(8)); //FORMATION
          jTextField41.setText(rs.getString(9));  //niveau
          jTextField42.setText(rs.getString(10)); //nom agence
          jTextField39.setText(rs.getString(11));  //DATEDEBUTSTAGE
          jTextField40.setText(rs.getString(12));  //DATEFINSTAGE
          jTextField36.setText(rs.getString(13)); //SUJET
          jTextField37.setText(rs.getString(14));  //RECOMMANDATION
          pic=rs.getBytes("photo");
          jLabel45.setIcon(new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));       
       
//        jLabel45.setIcon( new ImageIcon(new ImageIcon(rs.getString("cheminphoto")).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));

    jTextField38.setText(rs.getString(16));  // Remarque
                } else {
                         
                    rs.first();
                     jTextField43.setText(rs.getString(1));
          jTextField31.setText(rs.getString(2)); //nom
          jTextField33.setText(rs.getString(3)); //prenom
          jTextField32.setText(rs.getString(4));   //EMAIL
          jTextField30.setText(0+rs.getString(5));   //TEL
          jTextField29.setText(rs.getString(6));    //ADRESSE
          jTextField35.setText(rs.getString(7));  //ETABLISSEMENT
          jTextField34.setText(rs.getString(8)); //FORMATION
          jTextField41.setText(rs.getString(9));  //niveau
          jTextField42.setText(rs.getString(10)); //nom agence
          jTextField39.setText(rs.getString(11));  //DATEDEBUTSTAGE
          jTextField40.setText(rs.getString(12));  //DATEFINSTAGE
          jTextField36.setText(rs.getString(13)); //SUJET
          jTextField37.setText(rs.getString(14));  //RECOMMANDATION
          pic=rs.getBytes("photo");
          jLabel45.setIcon(new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));       
//         jLabel45.setIcon( new ImageIcon(new ImageIcon(rs.getString("cheminphoto")).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));

          jTextField38.setText(rs.getString(16));  // Remarque
               
                    }
                 } catch (SQLException ex) {
                    System.out.println(ex);
                         
                }
                
                
            }
        });
       
       jButton30.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent event) {
              
                  try {
                    if(rs.previous()){      
          jTextField43.setText(rs.getString(1));
          jTextField31.setText(rs.getString(2)); //nom
          jTextField33.setText(rs.getString(3)); //prenom
          jTextField32.setText(rs.getString(4));   //EMAIL
          jTextField30.setText(0+rs.getString(5));   //TEL
          jTextField29.setText(rs.getString(6));    //ADRESSE
          jTextField35.setText(rs.getString(7));  //ETABLISSEMENT
          jTextField34.setText(rs.getString(8)); //FORMATION
          jTextField41.setText(rs.getString(9));  //niveau
          jTextField42.setText(rs.getString(10)); //nom agence
          jTextField39.setText(rs.getString(11));  //DATEDEBUTSTAGE
          jTextField40.setText(rs.getString(12));  //DATEFINSTAGE
          jTextField36.setText(rs.getString(13)); //SUJET
          jTextField37.setText(rs.getString(14));  //RECOMMANDATION
          pic=rs.getBytes("photo");
          jLabel45.setIcon(new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));
//        jLabel45.setIcon(new ImageIcon(new ImageIcon(rs.getString("cheminphoto")).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));

           jTextField38.setText(rs.getString(16));  // Remarque
                } else {
                         
                    rs.last();
                     jTextField43.setText(rs.getString(1));
          jTextField31.setText(rs.getString(2)); //nom
          jTextField33.setText(rs.getString(3)); //prenom
          jTextField32.setText(rs.getString(4));   //EMAIL
          jTextField30.setText(0+rs.getString(5));   //TEL
          jTextField29.setText(rs.getString(6));    //ADRESSE
          jTextField35.setText(rs.getString(7));  //ETABLISSEMENT
          jTextField34.setText(rs.getString(8)); //FORMATION
          jTextField41.setText(rs.getString(9));  //niveau
          jTextField42.setText(rs.getString(10)); //nom agence
          jTextField39.setText(rs.getString(11));  //DATEDEBUTSTAGE
          jTextField40.setText(rs.getString(12));  //DATEFINSTAGE
          jTextField36.setText(rs.getString(13)); //SUJET
          jTextField37.setText(rs.getString(14));  //RECOMMANDATION
          pic=rs.getBytes("photo");
          jLabel45.setIcon(new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH))); 
//        jLabel45.setIcon( new ImageIcon(new ImageIcon(rs.getString("cheminphoto")).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));

          jTextField38.setText(rs.getString(16));  // Remarque
               
               
                    }
                 } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        });
       
       
       jButton31.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent event) {
              
                 try {
                    rs.first();
          jTextField43.setText(rs.getString(1));
          jTextField31.setText(rs.getString(2)); //nom
          jTextField33.setText(rs.getString(3)); //prenom
          jTextField32.setText(rs.getString(4));   //EMAIL
          jTextField30.setText(0+rs.getString(5));   //TEL
          jTextField29.setText(rs.getString(6));    //ADRESSE
          jTextField35.setText(rs.getString(7));  //ETABLISSEMENT
          jTextField34.setText(rs.getString(8)); //FORMATION
          jTextField41.setText(rs.getString(9));  //niveau
          jTextField42.setText(rs.getString(10)); //nom agence
          jTextField39.setText(rs.getString(11));  //DATEDEBUTSTAGE
          jTextField40.setText(rs.getString(12));  //DATEFINSTAGE
          jTextField36.setText(rs.getString(13)); //SUJET
          jTextField37.setText(rs.getString(14));  //RECOMMANDATION
          pic=rs.getBytes("photo");
          jLabel45.setIcon(new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));       
//         jLabel45.setIcon(new ImageIcon(new ImageIcon(rs.getString("cheminphoto")).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));

         
           jTextField38.setText(rs.getString(16));  // Remarque
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        });

       

}
private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
// TODO add your handling code here:
           jButton31.setEnabled(true);
       jButton30.setEnabled(true);
       jButton29.setEnabled(true);
       jButton26.setEnabled(true);
     
     try{
         String requete_rechercher = "select cin,nom,prenom,email,tel,adresse,ecole,formation,niveau,a.nomagence,"
                     + " datedebutstage,datefinstage,sujet,recommandation,photo,remarque from stagiaire s  join agence a on (s.idagence=a.idagence) ";
              
            
                 ps=maconnexion.obtenirConnexion().prepareStatement(requete_rechercher);         
                 rs=ps.executeQuery();
                 
                 try{
                 if(rs.next()){
            jTextField43.setText(rs.getString(1));    
          jTextField31.setText(rs.getString(2)); //nom
          jTextField33.setText(rs.getString(3)); //prenom
          jTextField32.setText(rs.getString(4));   //EMAIL
          jTextField30.setText(0+rs.getString(5));   //TEL
          jTextField29.setText(rs.getString(6));    //ADRESSE
          jTextField35.setText(rs.getString(7));  //ETABLISSEMENT
          jTextField34.setText(rs.getString(8)); //FORMATION
          jTextField41.setText(rs.getString(9));  //niveau
          jTextField42.setText(rs.getString(10)); //nom agence
          jTextField39.setText(rs.getString(11));  //DATEDEBUTSTAGE
          jTextField40.setText(rs.getString(12));  //DATEFINSTAGE
          jTextField36.setText(rs.getString(13)); //SUJET
          jTextField37.setText(rs.getString(14));  //RECOMMANDATION
           pic=rs.getBytes("photo");
           jLabel45.setIcon(new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));
//         jLabel45.setIcon(new ImageIcon(new ImageIcon(rs.getString("cheminphoto")).getImage().getScaledInstance(120, 150, java.awt.Image.SCALE_SMOOTH)));

           jTextField38.setText(rs.getString(16));  // Remarque
            }}
                 catch(SQLException e ) {
                  System.out.println(e);
            
                         
                        
                        
                    }
        }
         catch(SQLException ex ) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
          
         }
}//GEN-LAST:event_jButton18ActionPerformed

private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton31ActionPerformed

private void jButton1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton1MouseWheelMoved
// TODO add your handling code here:
}//GEN-LAST:event_jButton1MouseWheelMoved

private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
// TODO add your handling code here:
     try{
    String nombreparannee = "select count(cin) from stagiaire where YEAR(datedebutstage) = ? ";
   
      Object obj = evt.getSource();
         if(jComboBox4==obj){
         
         ps=maconnexion.obtenirConnexion().prepareStatement(nombreparannee);
         ps.setString(1, jComboBox4.getSelectedItem().toString());
           rs=ps.executeQuery();
           while(rs.next()){
                            jTextField7.setText(rs.getString(1));
                          
                         }
           
           String nombrepar1semestre = "select count(cin) from stagiaire where YEAR(datedebutstage) = ? and (month(datedebutstage) between 1 and 6)";
           ps=maconnexion.obtenirConnexion().prepareStatement(nombrepar1semestre);
           ps.setString(1, jComboBox4.getSelectedItem().toString());
           rs=ps.executeQuery();
           while(rs.next()) {
               jTextField8.setText(rs.getString(1));
           }
           
            String nombrepar2semestre = "select count(cin) from stagiaire where YEAR(datedebutstage) = ? and (month(datedebutstage) between 7 and 12)";
           ps=maconnexion.obtenirConnexion().prepareStatement(nombrepar2semestre);
           ps.setString(1, jComboBox4.getSelectedItem().toString());
           rs=ps.executeQuery();
           while(rs.next()) {
               jTextField9.setText(rs.getString(1));
           }
           
         }}catch(Exception e ) {
         System.out.println(e);
         
         }
   
  
    
}//GEN-LAST:event_jComboBox4ActionPerformed

private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
//button deconnexion   
    this.setVisible(true);
    Menu.setVisible(false);
    jPasswordField1.setText("");
   jTextField1.setText("");
}//GEN-LAST:event_jButton10ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  //button agences libres
    jComboBox1.setSelectedItem(null);
    jComboBox2.setSelectedItem(null);
   
  jPanel1.setBackground(new Color(254,250,243));
       jPanel1.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),2));
    jButton5.setBackground(new Color(254,250,243));
       jButton5.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
    jButton13.setBackground(new Color(254,250,243));
       jButton13.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
    
    Agencelibre.setVisible(true);
    Agencelibre.setBounds(WIDTH, WIDTH, 600, 600);
    Agencelibre.getContentPane().setBackground(new Color(242,242,242));
    
      String requete_region ="select * from region order by idregion";
        try{
        stmt=maconnexion.obtenirConnexion().createStatement();
        rs = stmt.executeQuery(requete_region);
        while(rs.next()){
            jComboBox1.addItem(rs.getString("nomregion"));
        } }
        catch(SQLException ex){
        System.out.println(ex);
        }
      
             jButton5.setEnabled(false);
      
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 Statistiques.setVisible(true);
 Statistiques.setBounds(WIDTH, WIDTH, 775, 650);
  Statistiques.getContentPane().setBackground(new Color(242,242,242));
     
      
     
       jPanel2.setBackground(new Color(254,250,243));
       jPanel2.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),2));
        jPanel5.setBackground(new Color(254,250,243));
       jPanel5.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),2));
        jPanel4.setBackground(new Color(254,250,243));
       jPanel4.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),2));
        jPanel8.setBackground(new Color(254,250,243));
       jPanel8.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),2));
  
  
    try {
               String nombre_stagiaire ="select count(cin) from stagiaire";
               ps=maconnexion.obtenirConnexion().prepareStatement(nombre_stagiaire);         
                rs=ps.executeQuery();
                 
                 while( rs.next()) {
               
                jTextField2.setText(rs.getString("count(cin)"));
                 }
                 
                 String nombre_region ="select count(idregion) from region";
                 ps=maconnexion.obtenirConnexion().prepareStatement(nombre_region);
                rs=ps.executeQuery();
                 while(rs.next()) {
                 
                 jTextField5.setText(rs.getString("count(idregion)"));
                 }
                  String nombre_agence ="select count(idagence) from agence";
                 ps=maconnexion.obtenirConnexion().prepareStatement(nombre_agence);
                rs=ps.executeQuery();
                 while(rs.next()) {
                 
                 jTextField6.setText(rs.getString("count(idagence)"));
                 }
                 
                  String annees ="select DISTINCT YEAR(datedebutstage) from stagiaire order by YEAR(datedebutstage) desc";
                    jComboBox4.removeAllItems();
                    jComboBox4.addItem(" ");
                  stmt=maconnexion.obtenirConnexion().createStatement();
                  rs = stmt.executeQuery(annees);
                          while(rs.next()){
                       jComboBox4.addItem(rs.getString(1));
                    
                      
        }
                
                          String formation ="select DISTINCT formation from stagiaire where formation ";
                           jComboBox7.removeAllItems();
                           jComboBox7.addItem(" ");
                  stmt=maconnexion.obtenirConnexion().createStatement();
                  rs = stmt.executeQuery(formation);
                          while(rs.next()){
                       jComboBox7.addItem(rs.getString(1));
                   
        }
                           String niveauu ="select DISTINCT niveau from stagiaire where niveau is not null";
                           jComboBox8.removeAllItems();
                           jComboBox8.addItem(" ");
                  stmt=maconnexion.obtenirConnexion().createStatement();
                  rs = stmt.executeQuery(niveauu);
                          while(rs.next()){
                       jComboBox8.addItem(rs.getString(1));
                   
        }
                 
          }catch (Exception e) {
              System.out.println(e);
         
          }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     //button rechercher
   
    Rechercherstagiaire.setVisible(true);
    Rechercherstagiaire.setBounds(WIDTH, WIDTH, 930, 730);
     jButton31.setEnabled(false);
       jButton30.setEnabled(false);
       jButton29.setEnabled(false);
       jButton26.setEnabled(false);
     
    Rechercherstagiaire.getContentPane().setBackground(new Color(242,242,242));
        jButton28.setBackground(new Color(254,250,243));
       jButton28.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
        jButton27.setBackground(new Color(254,250,243));
       jButton27.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
    
       jButton25.setBackground(new Color(254,250,243));
       jButton25.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
       jButton18.setBackground(new Color(254,250,243));
       jButton18.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
       jButton31.setBackground(new Color(254,250,243));
       jButton31.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
       jButton30.setBackground(new Color(254,250,243));
       jButton30.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
       jButton29.setBackground(new Color(254,250,243));
       jButton29.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
       jButton26.setBackground(new Color(254,250,243));
       jButton26.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
       
       jLabel45.setIcon(null);
       jTextField43.setText("");
       jTextField31.setText("");
       jTextField33.setText("");
       jTextField32.setText("");
       jTextField30.setText("");
       jTextField29.setText("");
       jTextField35.setText("");
       jTextField34.setText("");
       jTextField41.setText("");
       jTextField42.setText("");
       jTextField37.setText("");
       jTextField39.setText("");
       jTextField40.setText("");
       jTextField36.setText("");
       jTextField38.setText("");
               
       
    scroll();
    
    
     
   
}//GEN-LAST:event_jButton2ActionPerformed

private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
// TODO add your handling code here:
   
}//GEN-LAST:event_jTextField1MouseClicked

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
// TODO add your handling code here:
     jComboBox5.setSelectedItem(null);
     jTextField24.setText("");
     Nouvelleagence.setVisible(true); 
     Nouvelleagence.setBounds(WIDTH, WIDTH, 600, 600);
     Nouvelleagence.getContentPane().setBackground(new Color(242,242,242));
     jPanel6.setBackground(new Color(254,250,243));
     jPanel6.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),2));
     jButton15.setBackground(new Color(254,250,243));
     jButton15.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));

  
    String requete_region ="select * from region order by idregion";
        try{
        stmt=maconnexion.obtenirConnexion().createStatement();
        ResultSet resultat = stmt.executeQuery(requete_region);
        while(resultat.next()){
            jComboBox5.addItem(resultat.getString("nomregion"));
        } }
        catch(SQLException ex){
        System.out.println(ex);
        }
}//GEN-LAST:event_jButton7ActionPerformed

private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField24ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// TODO add your handling code here:
    inscrire.setVisible(true);
      inscrire.getContentPane().setBackground(new Color(242,242,242));
        inscrire.setBounds(WIDTH, WIDTH, 550, 550);
        this.dispose();
        jPanel7.setBackground(new Color(254,250,243));
       jPanel7.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),2));
       jButton16.setBackground(new Color(254,250,243));
       jButton16.setBorder(BorderFactory.createLineBorder(new Color(255,217,170),3));
    
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
// TODO add your handling code here:
    try{
    String inscrire1 = "insert into users (username,password) values(?,?)";
    
    ps=maconnexion.obtenirConnexion().prepareStatement(inscrire1);
    ps.setString(1, jTextField3.getText());      
    ps.setString(2, jTextField44.getText()); 
    if (jTextField3.getText().equals("") && jTextField44.getText().equals("")) {
    JOptionPane.showMessageDialog(null, "Veuillez entrer un nom d'utilisateur et mot de passe ");
    } else {
    int s =ps.executeUpdate();
   
    if(s>0){
        JOptionPane.showMessageDialog(null, "INSCRIPTION TERMINÉE AVEC SUCCÈS");
    Menu.setVisible(true);
    inscrire.setVisible(false);
    }
    
    }
    }catch(Exception e){
        System.out.println(e);
    }
}//GEN-LAST:event_jButton16ActionPerformed

private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField44ActionPerformed

private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
// TODO add your handling code here:
    //combo formation
    
          try{

          
           String niveau ="select count(cin) from stagiaire where formation = ? "  ;
         
          ps=maconnexion.obtenirConnexion().prepareStatement(niveau);
          ps.setString(1, jComboBox7.getSelectedItem().toString());
          rs=ps.executeQuery();
          while(rs.next()) {
              jTextField4.setText(rs.getString(1));
           
          }
          
          
          
          }catch(Exception e ){
          System.out.println(e);
          }
          
          
}//GEN-LAST:event_jComboBox7ActionPerformed

private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
// TODO add your handling code here:
    //combo niveau
       
          
              try{     

          String formations ="select count(cin) from stagiaire where niveau = ? and niveau is not null";
      
            ps=maconnexion.obtenirConnexion().prepareStatement(formations);
          ps.setString(1, jComboBox8.getSelectedItem().toString());
          rs=ps.executeQuery();
          while(rs.next()) {
              jTextField10.setText(rs.getString(1));
           
          }
          }catch(Exception e ){
          System.out.println(e);
         }
           
          
}//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed


        
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Affectation;
    private javax.swing.JFrame Agencelibre;
    private javax.swing.JFrame Menu;
    private javax.swing.JFrame Nouvelleagence;
    private javax.swing.JFrame Rechercherstagiaire;
    private javax.swing.JFrame Statistiques;
    private javax.swing.JFrame inscrire;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
