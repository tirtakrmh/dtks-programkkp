package ProgramVisual;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import database.KaryawanDatabase;
import database.KoneksiDatabase;
import database.UserDatabase;
import entity.KaryawanEntity;
import entity.UserEntity;
import java.sql.*;
import helper.Role;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {
    private Connection con = null;
    private  PreparedStatement stat= null;
    int xx, xy;

    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        Image icon = Toolkit.getDefaultToolkit().getImage("jkt.png");  
        setIconImage(icon);
    }

        private void deleteLayer() {
         txtusername.setText("");
         txtpassword.setText("");
        }
        
    private void validasiLogin() {
        String queryUser = "SELECT * FROM "+UserDatabase.TABLE_NAME+" WHERE "+UserDatabase.NO_KK+" = ? AND "+UserDatabase.PASSWORD+" = ? ";
        String queryKaryawan = "SELECT * FROM " + KaryawanDatabase.TABLE_NAME 
                + " WHERE (" + KaryawanDatabase.NO_PEGAWAI + " = ? OR " + KaryawanDatabase.USERNAME + " = ?) AND " + KaryawanDatabase.PASSWORD + " = ? ";

        try {
            if(txtusername.getText().equals("") || txtpassword.getPassword().equals("")) {
                JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong !", "Pesan", JOptionPane.ERROR_MESSAGE);
                deleteLayer();
            } else {
                con = new KoneksiDatabase().connect();
                ResultSet rs = null;
                stat = con.prepareStatement(queryUser);
                stat.setString(1, txtusername.getText());
                stat.setString(2, String.valueOf(txtpassword.getPassword()));
                rs = stat.executeQuery();
                if (!rs.next()) {
                    stat = con.prepareStatement(queryKaryawan);
                    stat.setString(1, txtusername.getText());
                    stat.setString(2, txtusername.getText());
                    stat.setString(3, String.valueOf(txtpassword.getPassword()));
                    rs = stat.executeQuery();
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(rootPane, "No KK/ No Pegawai Atau Password Salah", "Pesan", JOptionPane.ERROR_MESSAGE);
                    } else {
                        int noPegawai = rs.getInt(KaryawanDatabase.NO_PEGAWAI);
                        String nama = rs.getString(KaryawanDatabase.NAMA);
                        String role = rs.getString(KaryawanDatabase.ROLE);
                        String username = rs.getString(KaryawanDatabase.USERNAME);
                        String password = rs.getString(KaryawanDatabase.PASSWORD);
                        String noHp = rs.getString(KaryawanDatabase.NO_HP);
                        String email = rs.getString(KaryawanDatabase.EMAIL);
                        String tempatTugas = rs.getString(KaryawanDatabase.TEMPAT_TUGAS);
                        String alamat = rs.getString(KaryawanDatabase.ALAMAT);
                        KaryawanEntity karyawan = new KaryawanEntity(noPegawai, nama, role, username, password, noHp, email, tempatTugas, alamat);

                        if (role.equals(Role.PETUGAS.toString())) {
                            dispose();
                            new MenuPetugas(karyawan).setVisible(true);
                        } else {
                            dispose();
                            new MenuAdmin(karyawan).setVisible(true);
                        }
                        System.out.println(karyawan.toString());
                        JOptionPane.showMessageDialog(null, "Successfully Login "+txtusername.getText()+"");
                    }
                } else{
                    int id = rs.getInt(UserDatabase.ID);
                    String noKK = rs.getString(UserDatabase.NO_KK);
                    String namaLengkap = rs.getString(UserDatabase.NAMA_LENGKAP);
                    String email = rs.getString(UserDatabase.EMAIL);
                    String noHp = rs.getString(UserDatabase.NO_HP);
                    String password = rs.getString(UserDatabase.PASSWORD);
                    UserEntity user = new UserEntity(id, noKK, namaLengkap, email, noHp, password);
                    dispose();
                    new MenuPendaftar(user).setVisible(true);
                    JOptionPane.showMessageDialog(null, "Successfully Login "+txtusername.getText()+"");
                }
            }
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        panelDesktop = new Function.PanelRound();
        bg22 = new Function.bg2();
        panelLogin = new Function.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        panelroundusername = new Function.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        panelroundpassword = new Function.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btndaftar = new javax.swing.JLabel();
        btnlogin = new Function.RoundButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelCheckKK = new Function.PanelRound();
        buttonCheckKK = new Function.RoundButton();
        checknokk = new javax.swing.JTextField();
        close = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelDesktop.setBackground(new java.awt.Color(255, 255, 255));
        panelDesktop.setRoundBottomLeft(30);
        panelDesktop.setRoundBottomRight(30);
        panelDesktop.setRoundTopLeft(30);
        panelDesktop.setRoundTopRight(30);

        bg22.setBackground(new java.awt.Color(255, 255, 255));
        bg22.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout bg22Layout = new javax.swing.GroupLayout(bg22);
        bg22.setLayout(bg22Layout);
        bg22Layout.setHorizontalGroup(
            bg22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        bg22Layout.setVerticalGroup(
            bg22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        panelLogin.setBackground(new java.awt.Color(227, 245, 245));
        panelLogin.setRoundBottomLeft(30);
        panelLogin.setRoundBottomRight(30);
        panelLogin.setRoundTopLeft(30);
        panelLogin.setRoundTopRight(30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("LOGIN DTKS");

        panelroundusername.setBackground(new java.awt.Color(255, 255, 255));
        panelroundusername.setRoundBottomLeft(20);
        panelroundusername.setRoundBottomRight(20);
        panelroundusername.setRoundTopLeft(20);
        panelroundusername.setRoundTopRight(20);

        txtusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusername.setText("No KK/No Pegawai");
        txtusername.setBorder(null);
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusernameKeyPressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_user_32px_1.png"))); // NOI18N

        javax.swing.GroupLayout panelroundusernameLayout = new javax.swing.GroupLayout(panelroundusername);
        panelroundusername.setLayout(panelroundusernameLayout);
        panelroundusernameLayout.setHorizontalGroup(
            panelroundusernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelroundusernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelroundusernameLayout.setVerticalGroup(
            panelroundusernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelroundusernameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelroundusernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusername))
                .addGap(10, 10, 10))
        );

        panelroundpassword.setBackground(new java.awt.Color(255, 255, 255));
        panelroundpassword.setRoundBottomLeft(20);
        panelroundpassword.setRoundBottomRight(20);
        panelroundpassword.setRoundTopLeft(20);
        panelroundpassword.setRoundTopRight(20);
        panelroundpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelroundpasswordFocusGained(evt);
            }
        });

        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setText("********");
        txtpassword.setBorder(null);
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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_key_32px.png"))); // NOI18N

        javax.swing.GroupLayout panelroundpasswordLayout = new javax.swing.GroupLayout(panelroundpassword);
        panelroundpassword.setLayout(panelroundpasswordLayout);
        panelroundpasswordLayout.setHorizontalGroup(
            panelroundpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelroundpasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelroundpasswordLayout.setVerticalGroup(
            panelroundpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelroundpasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelroundpasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Belum Mendaftar?");

        btndaftar.setBackground(new java.awt.Color(45, 105, 141));
        btndaftar.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        btndaftar.setForeground(new java.awt.Color(45, 105, 141));
        btndaftar.setText("Daftar Disini");
        btndaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndaftarMouseClicked(evt);
            }
        });

        btnlogin.setBackground(new java.awt.Color(45, 105, 141));
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOGIN");
        btnlogin.setBorderColor(new java.awt.Color(45, 105, 141));
        btnlogin.setColor(new java.awt.Color(45, 105, 141));
        btnlogin.setColorClick(new java.awt.Color(45, 105, 141));
        btnlogin.setColorOver(new java.awt.Color(45, 105, 141));
        btnlogin.setRadius(10);
        btnlogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnloginMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnloginMouseMoved(evt);
            }
        });
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnloginMousePressed(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        btnlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnloginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btndaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(panelLoginLayout.createSequentialGroup()
                                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelroundusername, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelroundpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(panelroundusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelroundpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndaftar)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pendaftaran Dibuka pada tanggal 23 November 2023");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sampai dengan 10 Desember 2023");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("CEK STATUS DTKS");

        panelCheckKK.setBackground(new java.awt.Color(255, 255, 255));
        panelCheckKK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 105, 141), 2));
        panelCheckKK.setRoundBottomLeft(30);
        panelCheckKK.setRoundBottomRight(30);
        panelCheckKK.setRoundTopLeft(30);
        panelCheckKK.setRoundTopRight(30);

        buttonCheckKK.setForeground(new java.awt.Color(255, 255, 255));
        buttonCheckKK.setText("Check");
        buttonCheckKK.setBorderColor(new java.awt.Color(45, 105, 141));
        buttonCheckKK.setColor(new java.awt.Color(45, 105, 141));
        buttonCheckKK.setColorClick(new java.awt.Color(45, 105, 141));
        buttonCheckKK.setColorOver(new java.awt.Color(45, 105, 141));
        buttonCheckKK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonCheckKKMousePressed(evt);
            }
        });
        buttonCheckKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheckKKActionPerformed(evt);
            }
        });

        checknokk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        checknokk.setText("Masukan Nomor KK");
        checknokk.setBorder(null);
        checknokk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                checknokkFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                checknokkFocusLost(evt);
            }
        });
        checknokk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checknokkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCheckKKLayout = new javax.swing.GroupLayout(panelCheckKK);
        panelCheckKK.setLayout(panelCheckKKLayout);
        panelCheckKKLayout.setHorizontalGroup(
            panelCheckKKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCheckKKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checknokk, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCheckKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCheckKKLayout.setVerticalGroup(
            panelCheckKKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCheckKKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonCheckKK, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addComponent(checknokk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_close_window_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDesktopLayout = new javax.swing.GroupLayout(panelDesktop);
        panelDesktop.setLayout(panelDesktopLayout);
        panelDesktopLayout.setHorizontalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesktopLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(panelDesktopLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCheckKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelDesktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(close)
                .addContainerGap())
        );
        panelDesktopLayout.setVerticalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesktopLayout.createSequentialGroup()
                .addGroup(panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDesktopLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bg22, 45, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDesktopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(close)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCheckKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        validasiLogin();
    }//GEN-LAST:event_btnloginActionPerformed

    private void btndaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndaftarMouseClicked
        this.setVisible(false);
        new Register().setVisible(true);
    }//GEN-LAST:event_btndaftarMouseClicked

    private void panelroundpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelroundpasswordFocusGained

    }//GEN-LAST:event_panelroundpasswordFocusGained

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
        String pass = String.valueOf(txtpassword.getPassword());

        if(pass.equals("")||pass.equals("********")){
            txtpassword.setText("********");
        }
    }//GEN-LAST:event_txtpasswordFocusLost

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        String pass = String.valueOf(txtpassword.getPassword());

        if(pass.equals("********")){
            txtpassword.setText("");
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
        String uname = txtusername.getText();

        if(uname.equals("")||uname.equals("No KK/No Pegawai")){
            txtusername.setText("No KK/No Pegawai");
        }
    }//GEN-LAST:event_txtusernameFocusLost

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        String uname = txtusername.getText();

        if(uname.equals("No KK/No Pegawai")){
            txtusername.setText("");
        }
    }//GEN-LAST:event_txtusernameFocusGained

    private void checknokkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checknokkFocusGained
        String uname = checknokk.getText();

        if(uname.equals("Masukan Nomor KK")){
            checknokk.setText("");
        }
    }//GEN-LAST:event_checknokkFocusGained

    private void checknokkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checknokkFocusLost
        String uname = checknokk.getText();

        if(uname.equals("")||uname.equals("Masukan Nomor KK")){
            checknokk.setText("Masukan Nomor KK");
        }
    }//GEN-LAST:event_checknokkFocusLost

    private void checknokkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checknokkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checknokkActionPerformed

    private void buttonCheckKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheckKKActionPerformed
        try {
            String nokk = checknokk.getText();
            if (nokk.equals("") || nokk.equals("Masukan Nomor KK")) {
                JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!", "Pesan", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM " + UserDatabase.TABLE_NAME + " WHERE " + UserDatabase.NO_KK + " = ?";
                con = new KoneksiDatabase().connect();
                stat = con.prepareStatement(sql);
                stat.setString(1, nokk);
                ResultSet rs = stat.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Nomor KK " + nokk + " Sudah Terdaftar");
                } else {
                    JOptionPane.showMessageDialog(this, "Nomor KK " + nokk + " Tidak Terdaftar", "Pesan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error occurred: " + e.getMessage());
        }finally{
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (stat != null) {
                    try {
                        stat.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    }//GEN-LAST:event_buttonCheckKKActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx , y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void txtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtpassword.requestFocus();
        }
    }//GEN-LAST:event_txtusernameKeyPressed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnlogin.requestFocus();
        }
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void btnloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnloginKeyPressed
            validasiLogin();
    }//GEN-LAST:event_btnloginKeyPressed

    private void btnloginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseMoved

    }//GEN-LAST:event_btnloginMouseMoved

    private void btnloginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseDragged


    }//GEN-LAST:event_btnloginMouseDragged

    private void btnloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMousePressed

    }//GEN-LAST:event_btnloginMousePressed

    private void buttonCheckKKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCheckKKMousePressed

    }//GEN-LAST:event_buttonCheckKKMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Function.bg2 bg22;
    private javax.swing.JLabel btndaftar;
    private Function.RoundButton btnlogin;
    private Function.RoundButton buttonCheckKK;
    private javax.swing.JTextField checknokk;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Function.PanelRound panelCheckKK;
    private Function.PanelRound panelDesktop;
    private Function.PanelRound panelLogin;
    private Function.PanelRound panelroundpassword;
    private Function.PanelRound panelroundusername;
    public static final javax.swing.JPasswordField txtpassword = new javax.swing.JPasswordField();
    public static final javax.swing.JTextField txtusername = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables

    private void prosesActionPerformed(ActionEvent actionEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
