package ProgramVisual;

import database.KoneksiDatabase;
import database.PendaftarDatabase;
import entity.KaryawanEntity;
import entity.UserEntity;
import helper.Role;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PengaturanAkun extends javax.swing.JPanel {
    private Connection con = null;
    private Statement st = null;
    private UserEntity user = null;
    private KaryawanEntity karyawan = null;
    private String role = "";
    
    public PengaturanAkun() {
        initComponents();  
    }
    
    public PengaturanAkun(UserEntity user) {
        initComponents();  
        this.user = user;
        dataProfile();
    }
    
    public PengaturanAkun(KaryawanEntity karyawan) {
        initComponents();  
        this.karyawan = karyawan;
        dataProfile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound2 = new Function.PanelRound();
        panelLogin = new Function.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        panelType = new Function.PanelRound();
        panelNama = new Function.PanelRound();
        panelEmail = new Function.PanelRound();
        panelNoKK = new Function.PanelRound();
        panelNoHP = new Function.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new Function.PanelRound();
        lblSubmit = new javax.swing.JLabel();
        panelAlamat = new Function.PanelRound();
        btnDelete = new javax.swing.JLabel();

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        panelLogin.setBackground(new java.awt.Color(227, 245, 245));
        panelLogin.setToolTipText("");
        panelLogin.setPreferredSize(new java.awt.Dimension(735, 657));
        panelLogin.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_man_in_red_shirt_150px.png"))); // NOI18N
        panelLogin.add(jLabel2);
        jLabel2.setBounds(280, 40, 170, 130);

        welcome.setBackground(new java.awt.Color(102, 102, 102));
        welcome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Selamat Datang");
        panelLogin.add(welcome);
        welcome.setBounds(290, 180, 130, 30);

        panelType.setBackground(new java.awt.Color(204, 204, 204));
        panelType.setRoundBottomLeft(20);
        panelType.setRoundBottomRight(20);
        panelType.setRoundTopLeft(20);
        panelType.setRoundTopRight(20);

        tipe.setBackground(new java.awt.Color(204, 204, 204));
        tipe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipe.setBorder(null);

        javax.swing.GroupLayout panelTypeLayout = new javax.swing.GroupLayout(panelType);
        panelType.setLayout(panelTypeLayout);
        panelTypeLayout.setHorizontalGroup(
            panelTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTypeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tipe, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelTypeLayout.setVerticalGroup(
            panelTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipe, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLogin.add(panelType);
        panelType.setBounds(220, 470, 260, 40);

        panelNama.setBackground(new java.awt.Color(204, 204, 204));
        panelNama.setRoundBottomLeft(20);
        panelNama.setRoundBottomRight(20);
        panelNama.setRoundTopLeft(20);
        panelNama.setRoundTopRight(20);

        nameProfile.setBackground(new java.awt.Color(204, 204, 204));
        nameProfile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameProfile.setBorder(null);

        javax.swing.GroupLayout panelNamaLayout = new javax.swing.GroupLayout(panelNama);
        panelNama.setLayout(panelNamaLayout);
        panelNamaLayout.setHorizontalGroup(
            panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nameProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelNamaLayout.setVerticalGroup(
            panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLogin.add(panelNama);
        panelNama.setBounds(220, 220, 260, 40);

        panelEmail.setBackground(new java.awt.Color(255, 255, 255));
        panelEmail.setRoundBottomLeft(20);
        panelEmail.setRoundBottomRight(20);
        panelEmail.setRoundTopLeft(20);
        panelEmail.setRoundTopRight(20);

        emailProfile.setBackground(new java.awt.Color(255, 255, 255));
        emailProfile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailProfile.setBorder(null);
        emailProfile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailProfileKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelEmailLayout = new javax.swing.GroupLayout(panelEmail);
        panelEmail.setLayout(panelEmailLayout);
        panelEmailLayout.setHorizontalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(emailProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelEmailLayout.setVerticalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLogin.add(panelEmail);
        panelEmail.setBounds(220, 370, 260, 40);

        panelNoKK.setBackground(new java.awt.Color(204, 204, 204));
        panelNoKK.setRoundBottomLeft(20);
        panelNoKK.setRoundBottomRight(20);
        panelNoKK.setRoundTopLeft(20);
        panelNoKK.setRoundTopRight(20);

        nokkku.setBackground(new java.awt.Color(204, 204, 204));
        nokkku.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nokkku.setBorder(null);

        javax.swing.GroupLayout panelNoKKLayout = new javax.swing.GroupLayout(panelNoKK);
        panelNoKK.setLayout(panelNoKKLayout);
        panelNoKKLayout.setHorizontalGroup(
            panelNoKKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoKKLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nokkku, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelNoKKLayout.setVerticalGroup(
            panelNoKKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoKKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nokkku, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLogin.add(panelNoKK);
        panelNoKK.setBounds(220, 270, 260, 40);

        panelNoHP.setBackground(new java.awt.Color(255, 255, 255));
        panelNoHP.setRoundBottomLeft(20);
        panelNoHP.setRoundBottomRight(20);
        panelNoHP.setRoundTopLeft(20);
        panelNoHP.setRoundTopRight(20);

        nohpku.setBackground(new java.awt.Color(255, 255, 255));
        nohpku.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nohpku.setBorder(null);

        javax.swing.GroupLayout panelNoHPLayout = new javax.swing.GroupLayout(panelNoHP);
        panelNoHP.setLayout(panelNoHPLayout);
        panelNoHPLayout.setHorizontalGroup(
            panelNoHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nohpku, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelNoHPLayout.setVerticalGroup(
            panelNoHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nohpku, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLogin.add(panelNoHP);
        panelNoHP.setBounds(220, 420, 260, 40);

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("* Dapat Diubah");
        panelLogin.add(jLabel1);
        jLabel1.setBounds(490, 430, 100, 20);

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("* Dapat Diubah");
        panelLogin.add(jLabel3);
        jLabel3.setBounds(490, 380, 100, 20);

        btnSubmit.setBackground(new java.awt.Color(45, 105, 141));
        btnSubmit.setRoundBottomLeft(20);
        btnSubmit.setRoundBottomRight(20);
        btnSubmit.setRoundTopLeft(20);
        btnSubmit.setRoundTopRight(20);
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });

        lblSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubmit.setForeground(new java.awt.Color(255, 255, 255));
        lblSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubmit.setText("SUBMIT");
        lblSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnSubmitLayout = new javax.swing.GroupLayout(btnSubmit);
        btnSubmit.setLayout(btnSubmitLayout);
        btnSubmitLayout.setHorizontalGroup(
            btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSubmitLayout.setVerticalGroup(
            btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLogin.add(btnSubmit);
        btnSubmit.setBounds(300, 520, 120, 32);

        panelAlamat.setBackground(new java.awt.Color(255, 255, 255));
        panelAlamat.setRoundBottomLeft(20);
        panelAlamat.setRoundBottomRight(20);
        panelAlamat.setRoundTopLeft(20);
        panelAlamat.setRoundTopRight(20);

        txtAlamat.setBackground(new java.awt.Color(255, 255, 255));
        txtAlamat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAlamat.setBorder(null);

        javax.swing.GroupLayout panelAlamatLayout = new javax.swing.GroupLayout(panelAlamat);
        panelAlamat.setLayout(panelAlamatLayout);
        panelAlamatLayout.setHorizontalGroup(
            panelAlamatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlamatLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelAlamatLayout.setVerticalGroup(
            panelAlamatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlamatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLogin.add(panelAlamat);
        panelAlamat.setBounds(220, 320, 260, 40);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/delete.png"))); // NOI18N
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        panelLogin.add(btnDelete);
        btnDelete.setBounds(500, 320, 40, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailProfileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailProfileKeyPressed

    }//GEN-LAST:event_emailProfileKeyPressed

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        editToDatabase("");
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        btnSubmit.setBackground(colorHover(btnSubmit.getBackground()));
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        btnSubmit.setBackground(colorHover(btnSubmit.getBackground()));
    }//GEN-LAST:event_btnSubmitMouseExited

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        editToDatabase(txtAlamat.getText());
    }//GEN-LAST:event_btnDeleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDelete;
    private Function.PanelRound btnSubmit;
    public static final javax.swing.JTextField emailProfile = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblSubmit;
    public static final javax.swing.JTextField nameProfile = new javax.swing.JTextField();
    public static final javax.swing.JTextField nohpku = new javax.swing.JTextField();
    public static final javax.swing.JTextField nokkku = new javax.swing.JTextField();
    private Function.PanelRound panelAlamat;
    private Function.PanelRound panelEmail;
    private Function.PanelRound panelLogin;
    private Function.PanelRound panelNama;
    private Function.PanelRound panelNoHP;
    private Function.PanelRound panelNoKK;
    private Function.PanelRound panelRound2;
    private Function.PanelRound panelType;
    public static final javax.swing.JTextField tipe = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtAlamat = new javax.swing.JTextField();
    public static final javax.swing.JLabel welcome = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables

    private java.awt.Color colorHover(java.awt.Color color){
        java.awt.Color blue = new java.awt.Color(45,105,141);
        java.awt.Color grey = new java.awt.Color(125,125,125);
        if(color.equals(blue)){
            return grey;
        }else{
            return blue;
        }
    }
    
    private void dataProfile(){
        if (user != null) {
            role = Role.USER.toString();
            String alamat = "";
            String sql = "SELECT pendaftar.alamat FROM user, pendaftar WHERE user.id = pendaftar.id_user AND user.id = "+user.getId()+" LIMIT 1;";
            try {
                con = new KoneksiDatabase().connect();
                st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    alamat = rs.getString(PendaftarDatabase.ALAMAT);
                }
            } catch (SQLException e) {
                System.out.println("ERROR di Pengaturan Akun : "+e.getMessage());
            }finally{
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(PengaturanAkun.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (st != null) {
                    try {
                        st.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(PengaturanAkun.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            setTextField(user.getNamaLengkap(), user.getNoHp(), 
                    user.getNoKK(), user.getEmail(), alamat, role);
        } else if(karyawan != null){
            role = karyawan.getRole();
            setTextField(karyawan.getNama(), karyawan.getNoHp(), 
                    String.valueOf(karyawan.getNoPegawai()), karyawan.getEmail(), karyawan.getAlamat(), role);
        }
        setNoEditable();
    }
    
    private void ubahFielData(){
        if (role.equals(Role.USER.toString())) {
            user.setEmail(emailProfile.getText());
            user.setNoHp(nohpku.getText());
        }else{
            karyawan.setEmail(emailProfile.getText());
            karyawan.setNoHp(nohpku.getText());
            karyawan.setAlamat(txtAlamat.getText());
        }
    }
    
    
    private void setTextField(String nama, String noHp, String noKK, String email, String alamat, String role){
        nameProfile.setText(nama);
        nohpku.setText(noHp);
        nokkku.setText(noKK);
        emailProfile.setText(email);
        txtAlamat.setText(alamat);
        tipe.setText(role);
    }
    
    private void setNoEditable(){
        nameProfile.setEditable(false);
        nokkku.setEditable(false);
        tipe.setEditable(false);
    }
    
    private void editToDatabase(String hapusAlamat){
        String sql = "";
        String emai = emailProfile.getText();
        String noHp = nohpku.getText();
        String alamat = txtAlamat.getText();

        if (role.equals(Role.USER.toString())) {
            sql = "UPDATE user, pendaftar SET user.email='"+emai+"', user.no_hp ='"+noHp+"', pendaftar.alamat = '"+alamat+"' WHERE user.id = pendaftar.id_user AND user.id = "+user.getId()+" LIMIT 1";

            if (hapusAlamat != null && !hapusAlamat.equals("")) {
                sql = "UPDATE pendaftar SET pendaftar.alamat = '' WHERE pendaftar.id_user = "+user.getId()+" LIMIT 1";
                txtAlamat.setText("");
            }
        } else {
            sql = "UPDATE karyawan SET karyawan.email='"+emai+"', karyawan.no_hp ='"+noHp+"', karyawan.alamat = '"+alamat+"' WHERE karyawan.no_pegawai  = "+karyawan.getNoPegawai()+" LIMIT 1";
            if (hapusAlamat != null && !hapusAlamat.equals("")) {
                sql = "UPDATE karyawan SET karyawan.alamat = '' WHERE karyawan.no_pegawai  = "+karyawan.getNoPegawai()+" LIMIT 1";
                 txtAlamat.setText("");
            }
        }

        try {
            con = new KoneksiDatabase().connect();
            st = con.createStatement();
            int rs = st.executeUpdate(sql);

            if (rs != 0) {
                if (hapusAlamat != null && !hapusAlamat.equals("")) {
                    JOptionPane.showMessageDialog(this, "Berhasil Menghapus Alamat!");
                } else {
                    JOptionPane.showMessageDialog(this, "Berhasil Merubah Data!");
                }
                ubahFielData();
                dataProfile();
            }
        } catch (SQLException e) {
            System.out.println("ERROR di Pengaturan Akun : "+e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PengaturanAkun.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PengaturanAkun.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
