package ProgramVisual;


import database.KoneksiDatabase;
import database.UserDatabase;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;

public class Register extends javax.swing.JFrame {
    int xx, xy;
    
    int positionX = 0, position=0;
    
    private Connection con = null;
    private Statement st = null;
    
    public Register() {
        initComponents();
        setTitle("Formulir Pendaftaran");
        setResizable(false);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));

        Image icon = Toolkit.getDefaultToolkit().getImage("jkt.png");  
        setIconImage(icon);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/p_visual", "root", "");
            st = con.createStatement();

        } catch(Exception e) {
//            JOptionPane.showMessageDialog(null, "Failure Connected Database");
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        panelRound1 = new Function.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        txtnokk = new javax.swing.JTextField();
        txtfullname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtnohp = new javax.swing.JTextField();
        karakter1 = new Function.karakter();
        jLabel1 = new javax.swing.JLabel();
        btnregis = new Function.RoundButton();
        btnlogin = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        close = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(45, 105, 141));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 105, 141));
        jLabel4.setText("Menu Pendaftaran");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);

        jLabel5.setBackground(new java.awt.Color(45, 105, 141));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 105, 141));
        jLabel5.setText("Menu Pendaftaran");

        txtnokk.setForeground(new java.awt.Color(45, 105, 141));
        txtnokk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnokk.setText("Masukan Nomor KK");
        txtnokk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 105, 141), 2));
        txtnokk.setPreferredSize(new java.awt.Dimension(6, 20));
        txtnokk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnokkFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnokkFocusLost(evt);
            }
        });
        txtnokk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnokkActionPerformed(evt);
            }
        });
        txtnokk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnokkKeyPressed(evt);
            }
        });

        txtfullname.setForeground(new java.awt.Color(45, 105, 141));
        txtfullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfullname.setText("Nama Lengkap");
        txtfullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 105, 141), 2));
        txtfullname.setPreferredSize(new java.awt.Dimension(6, 20));
        txtfullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfullnameFocusLost(evt);
            }
        });
        txtfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfullnameActionPerformed(evt);
            }
        });
        txtfullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfullnameKeyPressed(evt);
            }
        });

        txtemail.setForeground(new java.awt.Color(45, 105, 141));
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemail.setText("Email");
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 105, 141), 2));
        txtemail.setPreferredSize(new java.awt.Dimension(6, 20));
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });

        txtnohp.setForeground(new java.awt.Color(45, 105, 141));
        txtnohp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnohp.setText("Nomor Handphone");
        txtnohp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 105, 141), 2));
        txtnohp.setPreferredSize(new java.awt.Dimension(6, 20));
        txtnohp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnohpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnohpFocusLost(evt);
            }
        });
        txtnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnohpActionPerformed(evt);
            }
        });
        txtnohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnohpKeyPressed(evt);
            }
        });

        karakter1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Sudah Memiliki Akun ?");

        javax.swing.GroupLayout karakter1Layout = new javax.swing.GroupLayout(karakter1);
        karakter1.setLayout(karakter1Layout);
        karakter1Layout.setHorizontalGroup(
            karakter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(karakter1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        karakter1Layout.setVerticalGroup(
            karakter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, karakter1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnregis.setBackground(new java.awt.Color(45, 105, 141));
        btnregis.setForeground(new java.awt.Color(255, 255, 255));
        btnregis.setText("Daftar");
        btnregis.setBorderColor(new java.awt.Color(45, 105, 141));
        btnregis.setColor(new java.awt.Color(45, 105, 141));
        btnregis.setColorClick(new java.awt.Color(45, 105, 141));
        btnregis.setColorOver(new java.awt.Color(45, 105, 141));
        btnregis.setRadius(10);
        btnregis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisActionPerformed(evt);
            }
        });
        btnregis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnregisKeyPressed(evt);
            }
        });

        btnlogin.setBackground(new java.awt.Color(45, 105, 141));
        btnlogin.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(45, 105, 141));
        btnlogin.setText("Login Disini");
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });

        txtpassword.setForeground(new java.awt.Color(45, 105, 141));
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setText("********");
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 105, 141), 2));
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_close_window_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(77, 77, 77))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnokk, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(txtnohp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(karakter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnregis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(txtnokk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnohp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(karakter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogin))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnokkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnokkFocusGained
        String uname = txtnokk.getText();

        if(uname.equals("Masukan Nomor KK")){
            txtnokk.setText("");
        }
    }//GEN-LAST:event_txtnokkFocusGained

    private void txtnokkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnokkFocusLost
        String uname = txtnokk.getText();

        if(uname.equals("")||uname.equals("Masukan Nomor KK")){
            txtnokk.setText("Masukan Nomor KK");
        }
    }//GEN-LAST:event_txtnokkFocusLost

    private void txtnokkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnokkActionPerformed

    }//GEN-LAST:event_txtnokkActionPerformed

    private void txtnokkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnokkKeyPressed
        String nokk = txtnokk.getText();
        int lengthnokk = nokk.length();

        char c = evt.getKeyChar();

        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
            if(lengthnokk<15) {
                txtnokk.setEditable(true);
            } else {
                txtnokk.setEditable(false);
            }
        } else {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
                txtnokk.setEditable(true);
            } else {
                txtnokk.setEditable(false);
            }
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtfullname.requestFocus();
        }
    }//GEN-LAST:event_txtnokkKeyPressed

    private void txtfullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfullnameFocusGained
        String fullname = txtfullname.getText();

        if(fullname.equals("Nama Lengkap")){
            txtfullname.setText("");
        }
    }//GEN-LAST:event_txtfullnameFocusGained

    private void txtfullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfullnameFocusLost
        String fullname = txtfullname.getText();

        if(fullname.equals("") || fullname.equals("Nama Lengkap")){
            txtfullname.setText("Nama Lengkap");
        }
    }//GEN-LAST:event_txtfullnameFocusLost

    private void txtfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfullnameActionPerformed

    private void txtfullnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfullnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtemail.requestFocus();
        }
    }//GEN-LAST:event_txtfullnameKeyPressed

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        String email = txtemail.getText();

        if(email.equals("Email")){
            txtemail.setText("");
        }
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        String email = txtemail.getText();

        if(email.equals("")||email.equals("Email")){
            txtemail.setText("Email");
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtnohp.requestFocus();
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtnohpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnohpFocusGained
        String nohp = txtnohp.getText();

        if(nohp.equals("Nomor Handphone")){
            txtnohp.setText("");
        }
    }//GEN-LAST:event_txtnohpFocusGained

    private void txtnohpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnohpFocusLost
        String nohp = txtnohp.getText();

        if(nohp.equals("")||nohp.equals("Nomor Handphone")){
            txtnohp.setText("Nomor Handphone");
        }
    }//GEN-LAST:event_txtnohpFocusLost

    private void txtnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnohpActionPerformed

    private void txtnohpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnohpKeyPressed
        String nohp = txtnohp.getText();
        int lengthnohp = nohp.length();

        char c = evt.getKeyChar();

        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
            if(lengthnohp<15) {
                txtnohp.setEditable(true);
            } else {
                txtnohp.setEditable(false);
            }
        } else {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
                txtnohp.setEditable(true);
            } else {
                txtnohp.setEditable(false);
            }
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtpassword.requestFocus();
        }
    }//GEN-LAST:event_txtnohpKeyPressed
   
    private void btnregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisActionPerformed
        validasiData();
    }//GEN-LAST:event_btnregisActionPerformed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnloginMouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx , y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        String pass = String.valueOf(txtpassword.getPassword());

        if(pass.equals("********")){
            txtpassword.setText("");
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
        String pass = String.valueOf(txtpassword.getPassword());

        if(pass.equals("")||pass.equals("********")){
            txtpassword.setText("********");
        }
    }//GEN-LAST:event_txtpasswordFocusLost

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnregis.requestFocus();
        }
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void btnregisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnregisKeyPressed
    }//GEN-LAST:event_btnregisKeyPressed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnlogin;
    private Function.RoundButton btnregis;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private Function.karakter karakter1;
    private Function.PanelRound panelRound1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtnohp;
    private javax.swing.JTextField txtnokk;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables

    private void validasiData() {
        if (isFormEmpty()) {
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong !", "Pesan", JOptionPane.ERROR_MESSAGE);
        } else if (!isNomorKKValid()) {
            JOptionPane.showMessageDialog(this, "Minimal Input 10 Kata Pada Form Nomor KK !", "Pesan", JOptionPane.ERROR_MESSAGE);
        } else if (!isFullNameValid()) {
            JOptionPane.showMessageDialog(this, "Minimal Input 5 Kata Pada Form FullName !", "Pesan", JOptionPane.ERROR_MESSAGE);
        } else if (!isEmailValid()) {
            JOptionPane.showMessageDialog(this, "Minimal Input 10 Kata Pada Form Email !", "Pesan", JOptionPane.ERROR_MESSAGE);
        } else if (!isNomorHpValid()) {
            JOptionPane.showMessageDialog(this, "Minimal Input 10 Kata Pada Form Nomor Handphone !", "Pesan", JOptionPane.ERROR_MESSAGE);
        } else if (!isPasswordValid()) {
            JOptionPane.showMessageDialog(this, "Minimal Input 8 Kata Pada Form Password !", "Pesan", JOptionPane.ERROR_MESSAGE);
        } else {
            if (isAlreadyRegistered()) {
                JOptionPane.showMessageDialog(null, "Nomor KK / Email Sudah Terdaftar");
            } else {
                if (insertDataToDatabase()) {
                    JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
                    this.setVisible(false);
                    new Login().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error Contact Admin");
                }
            }
        }
    }

    private boolean isFormEmpty() {
        return txtnokk.getText().isEmpty() || txtfullname.getText().isEmpty() || txtemail.getText().isEmpty() || txtnohp.getText().isEmpty() || 
                String.valueOf(txtpassword.getPassword()).isEmpty() || txtnokk.getText().equals("") || txtfullname.getText().equals("Masukan Nomor KK") || 
                txtfullname.getText().equals("") || txtfullname.getText().equals("Nama Lengkap") || txtemail.getText().equals("") || 
                txtemail.getText().equals("Email") || txtnohp.getText().equals("") || txtnohp.getText().equals("Nomor Handphone") || 
                txtpassword.getPassword().equals("") || txtpassword.getPassword().equals("********");
    }

    private boolean isNomorKKValid() {
        return txtnokk.getText().length() >= 10;
    }

    private boolean isFullNameValid() {
        return txtfullname.getText().length() >= 5;
    }

    private boolean isEmailValid() {
        return txtemail.getText().length() >= 10;
    }

    private boolean isNomorHpValid() {
        return txtnohp.getText().length() >= 10;
    }

    private boolean isPasswordValid() {
        return String.valueOf(txtpassword.getPassword()).length() >= 8;
    }

    private boolean isAlreadyRegistered() {
        try {
            con = new KoneksiDatabase().connect();
            String sql = "SELECT * FROM "+UserDatabase.TABLE_NAME+" WHERE "+UserDatabase.NO_KK+" = ? OR "+UserDatabase.EMAIL+" = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, txtnokk.getText());
            stmt.setString(2, txtemail.getText());
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean insertDataToDatabase() {
        try {
            con = new KoneksiDatabase().connect();
            String sql = "INSERT INTO "+UserDatabase.TABLE_NAME+" VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "0");
            stmt.setString(2, txtnokk.getText());
            stmt.setString(3, txtfullname.getText());
            stmt.setString(4, txtemail.getText());
            stmt.setString(5, txtnohp.getText());
            stmt.setString(6, String.valueOf(txtpassword.getPassword()));
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
