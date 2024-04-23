package ProgramVisual;

import static ProgramVisual.MenuPetugas.pn_utama;
import combobox.Combo_Box;
import database.KoneksiDatabase;
import database.*;
import entity.MuskelEntity;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormMuskel extends javax.swing.JPanel {
    private Connection connection = null;
    private PreparedStatement stats = null;
    private MuskelEntity muskel;

    public FormMuskel(MuskelEntity muskel) {
        this.muskel = muskel;
        initComponents();
        cbAlasan.setEnabled(false);
        cbAlasan.setEditable(false);
        if (this.muskel != null) {
            lblTitle.setText("PENDATAAN: "+muskel.getNama());
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        panelSearch = new Function.PanelRound();
        btnSearchNIK = new javax.swing.JLabel();
        txtSearchNIK = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        panelNama = new Function.PanelRound();
        txtNama = new javax.swing.JTextField();
        lblNik = new javax.swing.JLabel();
        panelNik = new Function.PanelRound();
        txtNik = new javax.swing.JTextField();
        lblNoKK = new javax.swing.JLabel();
        panelNoKK = new Function.PanelRound();
        txtNoKK = new javax.swing.JTextField();
        lblKelurahanDom = new javax.swing.JLabel();
        panelKelurahanDom = new Function.PanelRound();
        txtKelurahanDom = new javax.swing.JTextField();
        lblHasilMuskel = new javax.swing.JLabel();
        cbKeterangan = new combobox.Combo_Box();
        cbAlasan = new combobox.Combo_Box();
        panelAction = new javax.swing.JPanel();
        btnSave = new Function.PanelRound();
        lblSave = new javax.swing.JLabel();
        btnReset = new Function.PanelRound();
        lblSave1 = new javax.swing.JLabel();
        btnBack = new Function.PanelRound();
        lblBack = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(227, 245, 245));
        background.setPreferredSize(new java.awt.Dimension(710, 659));

        panelTitle.setOpaque(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText("LIST MUSKEL 2023");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBody.setOpaque(false);

        panelSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSearch.setPreferredSize(new java.awt.Dimension(340, 36));
        panelSearch.setRoundBottomLeft(20);
        panelSearch.setRoundBottomRight(20);
        panelSearch.setRoundTopLeft(20);
        panelSearch.setRoundTopRight(20);

        btnSearchNIK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/magnifying-glass.png"))); // NOI18N
        btnSearchNIK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchNIK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchNIKMouseClicked(evt);
            }
        });

        txtSearchNIK.setBackground(new java.awt.Color(0,0,0,0)
        );
        txtSearchNIK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearchNIK.setForeground(new java.awt.Color(18, 111, 111));
        txtSearchNIK.setText("KETIKAN NIK");
        txtSearchNIK.setBorder(null);
        txtSearchNIK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchNIKFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchNIKFocusLost(evt);
            }
        });
        txtSearchNIK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchNIKKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchNIK, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchNIK)
                .addContainerGap())
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearchNIK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchNIK, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblNama.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblNama.setForeground(new java.awt.Color(18, 111, 111));
        lblNama.setText("NAMA");

        panelNama.setBackground(new java.awt.Color(255, 255, 255));
        panelNama.setPreferredSize(new java.awt.Dimension(340, 36));
        panelNama.setRoundBottomLeft(20);
        panelNama.setRoundBottomRight(20);
        panelNama.setRoundTopLeft(20);
        panelNama.setRoundTopRight(20);

        txtNama.setEditable(false);
        txtNama.setBackground(new java.awt.Color(0,0,0,0)
        );
        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtNama.setForeground(new java.awt.Color(18, 111, 111));
        txtNama.setBorder(null);

        javax.swing.GroupLayout panelNamaLayout = new javax.swing.GroupLayout(panelNama);
        panelNama.setLayout(panelNamaLayout);
        panelNamaLayout.setHorizontalGroup(
            panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNamaLayout.setVerticalGroup(
            panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblNik.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblNik.setForeground(new java.awt.Color(18, 111, 111));
        lblNik.setText("NIK");

        panelNik.setBackground(new java.awt.Color(255, 255, 255));
        panelNik.setPreferredSize(new java.awt.Dimension(340, 36));
        panelNik.setRoundBottomLeft(20);
        panelNik.setRoundBottomRight(20);
        panelNik.setRoundTopLeft(20);
        panelNik.setRoundTopRight(20);

        txtNik.setEditable(false);
        txtNik.setBackground(new java.awt.Color(0,0,0,0)
        );
        txtNik.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtNik.setForeground(new java.awt.Color(18, 111, 111));
        txtNik.setBorder(null);

        javax.swing.GroupLayout panelNikLayout = new javax.swing.GroupLayout(panelNik);
        panelNik.setLayout(panelNikLayout);
        panelNikLayout.setHorizontalGroup(
            panelNikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNik, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNikLayout.setVerticalGroup(
            panelNikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNik, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblNoKK.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblNoKK.setForeground(new java.awt.Color(18, 111, 111));
        lblNoKK.setText("NOKK");

        panelNoKK.setBackground(new java.awt.Color(255, 255, 255));
        panelNoKK.setPreferredSize(new java.awt.Dimension(340, 36));
        panelNoKK.setRoundBottomLeft(20);
        panelNoKK.setRoundBottomRight(20);
        panelNoKK.setRoundTopLeft(20);
        panelNoKK.setRoundTopRight(20);

        txtNoKK.setEditable(false);
        txtNoKK.setBackground(new java.awt.Color(0,0,0,0)
        );
        txtNoKK.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtNoKK.setForeground(new java.awt.Color(18, 111, 111));
        txtNoKK.setBorder(null);

        javax.swing.GroupLayout panelNoKKLayout = new javax.swing.GroupLayout(panelNoKK);
        panelNoKK.setLayout(panelNoKKLayout);
        panelNoKKLayout.setHorizontalGroup(
            panelNoKKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoKKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNoKK, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNoKKLayout.setVerticalGroup(
            panelNoKKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoKKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNoKK, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblKelurahanDom.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblKelurahanDom.setForeground(new java.awt.Color(18, 111, 111));
        lblKelurahanDom.setText("KELURAHAN DOMISILI");

        panelKelurahanDom.setBackground(new java.awt.Color(255, 255, 255));
        panelKelurahanDom.setPreferredSize(new java.awt.Dimension(340, 36));
        panelKelurahanDom.setRoundBottomLeft(20);
        panelKelurahanDom.setRoundBottomRight(20);
        panelKelurahanDom.setRoundTopLeft(20);
        panelKelurahanDom.setRoundTopRight(20);

        txtKelurahanDom.setEditable(false);
        txtKelurahanDom.setBackground(new java.awt.Color(0,0,0,0)
        );
        txtKelurahanDom.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtKelurahanDom.setForeground(new java.awt.Color(18, 111, 111));
        txtKelurahanDom.setBorder(null);

        javax.swing.GroupLayout panelKelurahanDomLayout = new javax.swing.GroupLayout(panelKelurahanDom);
        panelKelurahanDom.setLayout(panelKelurahanDomLayout);
        panelKelurahanDomLayout.setHorizontalGroup(
            panelKelurahanDomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKelurahanDomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtKelurahanDom, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelKelurahanDomLayout.setVerticalGroup(
            panelKelurahanDomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKelurahanDomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtKelurahanDom, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblHasilMuskel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblHasilMuskel.setForeground(new java.awt.Color(18, 111, 111));
        lblHasilMuskel.setText("HASIL MUSKEL");

        cbKeterangan.setForeground(new java.awt.Color(18, 111, 111));
        cbKeterangan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PILIH STATUS KELAYAKAN", "LAYAK", "TIDAK LAYAK" }));
        cbKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKeteranganActionPerformed(evt);
            }
        });

        cbAlasan.setForeground(new java.awt.Color(18, 111, 111));
        cbAlasan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KETERANGAN", "PEGAWAI TETAP PEMERINTAHAN", "MEMILIKI MOBIL", "MEMILIKI NJOP > 1 M", "AIR MINUM KEMASAN", "DINILAI TIDAK MISKIN", "PINDAH LUAR DKI JAKARTA", "PINDAH DALAM DKI JAKARTA", "TIDAK DITEMUKAN", "MENINGGAL DUNIA", "WARGA BINAAN SOSIAL PEMERINTAH" }));

        panelAction.setOpaque(false);

        btnSave.setBackground(new java.awt.Color(45, 105, 141));
        btnSave.setRoundBottomLeft(20);
        btnSave.setRoundBottomRight(20);
        btnSave.setRoundTopLeft(20);
        btnSave.setRoundTopRight(20);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });

        lblSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSave.setForeground(new java.awt.Color(255, 255, 255));
        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave.setText("SAVE");
        lblSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnReset.setBackground(new java.awt.Color(45, 105, 141));
        btnReset.setRoundBottomLeft(20);
        btnReset.setRoundBottomRight(20);
        btnReset.setRoundTopLeft(20);
        btnReset.setRoundTopRight(20);
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetMouseExited(evt);
            }
        });

        lblSave1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSave1.setForeground(new java.awt.Color(255, 255, 255));
        lblSave1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave1.setText("RESET");
        lblSave1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnResetLayout = new javax.swing.GroupLayout(btnReset);
        btnReset.setLayout(btnResetLayout);
        btnResetLayout.setHorizontalGroup(
            btnResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnResetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSave1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnResetLayout.setVerticalGroup(
            btnResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnResetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBack.setBackground(new java.awt.Color(45, 105, 141));
        btnBack.setRoundBottomLeft(20);
        btnBack.setRoundBottomRight(20);
        btnBack.setRoundTopLeft(20);
        btnBack.setRoundTopRight(20);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("BACK");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnBackLayout = new javax.swing.GroupLayout(btnBack);
        btnBack.setLayout(btnBackLayout);
        btnBackLayout.setHorizontalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelActionLayout = new javax.swing.GroupLayout(panelAction);
        panelAction.setLayout(panelActionLayout);
        panelActionLayout.setHorizontalGroup(
            panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelActionLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelActionLayout.setVerticalGroup(
            panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNama)
                            .addComponent(panelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNik)
                            .addComponent(panelNik, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoKK)
                            .addComponent(panelNoKK, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKelurahanDom)
                            .addComponent(panelKelurahanDom, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbAlasan, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                .addComponent(lblHasilMuskel)
                                .addComponent(cbKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panelAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(lblHasilMuskel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addComponent(lblNik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNoKK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNoKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblKelurahanDom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelKelurahanDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addComponent(cbAlasan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(439, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchNIKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNIKKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            searchPendaftar();
        }
    }//GEN-LAST:event_txtSearchNIKKeyPressed

    private void txtSearchNIKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNIKFocusLost
        String nik = txtSearchNIK.getText();
        if(nik.equals("")){
            txtSearchNIK.setText("KETIKAN NIK");
        }
    }//GEN-LAST:event_txtSearchNIKFocusLost

    private void txtSearchNIKFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNIKFocusGained
        String nik = txtSearchNIK.getText();
        if(nik.equals("KETIKAN NIK")){
            txtSearchNIK.setText("");
        }
    }//GEN-LAST:event_txtSearchNIKFocusGained

    private void btnSearchNIKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchNIKMouseClicked
        searchPendaftar();
    }//GEN-LAST:event_btnSearchNIKMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(colorHover(btnSave.getBackground()));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(colorHover(btnSave.getBackground()));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseEntered
        btnReset.setBackground(colorHover(btnReset.getBackground()));
    }//GEN-LAST:event_btnResetMouseEntered

    private void btnResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseExited
        btnReset.setBackground(colorHover(btnReset.getBackground()));
    }//GEN-LAST:event_btnResetMouseExited

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        String insertQuery = "INSERT INTO "+ ValidasiMuskelDatabase.TABLE_NAME +" values(?,?,?,?,?,?)";
        String updateQuery = "UPDATE "+ValidasiMuskelDatabase.TABLE_NAME+" SET "
                + ValidasiMuskelDatabase.KETERANGAN+" = ?, "+ValidasiMuskelDatabase.ALASAN+" = ?, "+ValidasiMuskelDatabase.NO_PEGAWAI+" = ? "
                + "WHERE "+ValidasiMuskelDatabase.NIK_PENDAFTAR+" = ? AND "+ValidasiMuskelDatabase.ID_MUSKEL+" = ?";
        String cekPendaftar = "SELECT * FROM "+ValidasiMuskelDatabase.TABLE_NAME+" WHERE "+ValidasiMuskelDatabase.NIK_PENDAFTAR+" = ? AND "+ValidasiMuskelDatabase.ID_MUSKEL+" = ?";
        
        connection = new KoneksiDatabase().connect();
        String ket = cbKeterangan.getSelectedItem().toString();
        String alasan = cbAlasan.getSelectedItem().toString();
        boolean isOk = false;

        switch (ket) {
            case "LAYAK":
                alasan = "-";
                isOk = true;
                System.out.println(isOk);
                break;
            case "TIDAK LAYAK":
                if (cbAlasan.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Mohon Pilih Alasan Keterangan Nya!", "Alasan", JOptionPane.WARNING_MESSAGE);
                }else{
                    isOk = true;
                }   break;
            default:
                JOptionPane.showMessageDialog(this, "Mohon Pilih Status Kelayakan Nya!", "Kelayakan", JOptionPane.WARNING_MESSAGE);
                break;
        }
        
        if (isOk) {
            try {
                stats = connection.prepareStatement(cekPendaftar);
                String nik = txtNik.getText();
                stats.setString(1, nik);
                stats.setInt(2, muskel.getId());
                ResultSet resultSet = stats.executeQuery();

                if (!resultSet.next()) {
                    stats = connection.prepareStatement(insertQuery);
                    stats.setInt(1, 0);
                    stats.setString(2, ket);
                    stats.setString(3, alasan);
                    stats.setString(4, nik);
                    stats.setInt(5, MenuPetugas.karyawan.getNoPegawai());
                    stats.setInt(6, muskel.getId());
                    System.out.println(muskel.getId());
                    int result = stats.executeUpdate();
                    if (result != 0) {
                         JOptionPane.showMessageDialog(this, "Data dengan nik : "+nik+" \nBerhasil Di Masukan Pada : "+muskel.getNama());
                    }
                }else{
                    int isUpdate = JOptionPane.showConfirmDialog(this, 
                    "Data Dengan Nik : "+nik+" \nSudah Terdaftar pada muskel : "+muskel.getNama()+"", "Anda Yakin Ingin Mengedit nya ?", 
                    JOptionPane.YES_NO_CANCEL_OPTION);

                    if (isUpdate == 0) {
                        stats = connection.prepareStatement(updateQuery);
                        System.out.println("update call");
                        stats.setString(1, ket);
                        stats.setString(2, alasan);
                        stats.setInt(3, MenuPetugas.karyawan.getNoPegawai());
                        stats.setString(4, nik);
                        stats.setInt(5, muskel.getId());
                        System.out.println("Id Muskel : "+muskel.getId());
                        System.out.println("No Pegawai : "+MenuPetugas.karyawan.getNoPegawai());
                        int result = stats.executeUpdate();
                        if (result != 0 ) {
                            JOptionPane.showMessageDialog(this, "Data dengan nik : "+nik+", Berhasil Di Ubah");
                        }
                    }
                }
            } catch (HeadlessException | SQLException e) {
                System.out.println("Error : "+e.getMessage());
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(FormMuskel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (stats != null) {
                    try {
                        stats.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(FormMuskel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtSearchNIK.setText("KETIKAN NIK");
        txtNama.setText("");
        txtNik.setText("");
        txtNoKK.setText("");
        txtKelurahanDom.setText("");
        cbKeterangan.setSelectedIndex(0);
        cbAlasan.setSelectedIndex(0);
        txtNama.requestFocus();
    }//GEN-LAST:event_btnResetMouseClicked

    private void cbKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKeteranganActionPerformed
       if (cbKeterangan.getSelectedIndex() == 2) {
           System.out.println("Tidak layak");
            cbAlasan.setEnabled(true);
            cbAlasan.setEditable(true);
        }else {
           cbAlasan.setEnabled(false);
            cbAlasan.setEditable(false);
       }
    }//GEN-LAST:event_cbKeteranganActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new ListMenuMuskel());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setBackground(colorHover(btnBack.getBackground()));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setBackground(colorHover(btnBack.getBackground()));
    }//GEN-LAST:event_btnBackMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private Function.PanelRound btnBack;
    private Function.PanelRound btnReset;
    private Function.PanelRound btnSave;
    private javax.swing.JLabel btnSearchNIK;
    private combobox.Combo_Box cbAlasan;
    private combobox.Combo_Box cbKeterangan;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblHasilMuskel;
    private javax.swing.JLabel lblKelurahanDom;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNik;
    private javax.swing.JLabel lblNoKK;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblSave1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelAction;
    private javax.swing.JPanel panelBody;
    private Function.PanelRound panelKelurahanDom;
    private Function.PanelRound panelNama;
    private Function.PanelRound panelNik;
    private Function.PanelRound panelNoKK;
    private Function.PanelRound panelSearch;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JTextField txtKelurahanDom;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtNoKK;
    private javax.swing.JTextField txtSearchNIK;
    // End of variables declaration//GEN-END:variables

    private void searchPendaftar() {
        connection = new KoneksiDatabase().connect();
        PreparedStatement preparedStatement;
        String sql = "SELECT "+PendaftarDatabase.TABLE_NAME+"."+PendaftarDatabase.NAMA_LENGKAP+", "+PendaftarDatabase.NIK+", "+UserDatabase.NO_KK+", "+PendaftarDatabase.KELURAHAN_DOMISILI+" "
                + "FROM "+PendaftarDatabase.TABLE_NAME+" ,"+UserDatabase.TABLE_NAME+" "
                + "WHERE "+PendaftarDatabase.TABLE_NAME+"."+PendaftarDatabase.ID_USER+" = "+UserDatabase.TABLE_NAME+"."+UserDatabase.ID+" AND "+PendaftarDatabase.NIK+" = ?";
        if ("".equals(txtSearchNIK.getText()) || "KETIKAN NIK".equals(txtSearchNIK.getText())) {
             JOptionPane.showMessageDialog(this, "Mohon Isikan Nik Terlebih Dahulu", "Search Nik", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, txtSearchNIK.getText());
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    String nama = resultSet.getString(PendaftarDatabase.NAMA_LENGKAP);
                    String nik = resultSet.getString(PendaftarDatabase.NIK);
                    String noKK = resultSet.getString(UserDatabase.NO_KK);
                    String kelurahanDom = resultSet.getString(PendaftarDatabase.KELURAHAN_DOMISILI);

                    txtNama.setText(nama);
                    txtNik.setText(nik);
                    txtNoKK.setText(noKK);
                    txtKelurahanDom.setText(kelurahanDom);
                } else {
                    JOptionPane.showMessageDialog(this, "Data dengan Nik \""+txtSearchNIK.getText()+"\" Tidak Ditemukan!", "Search Nik", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
    
    private java.awt.Color colorHover(java.awt.Color color){
        java.awt.Color blue = new java.awt.Color(45,105,141);
        java.awt.Color grey = new java.awt.Color(125,125,125);
        if(color.equals(blue)){
            return grey;
        }else{
            return blue;
        }
    }

    public Combo_Box getCbAlasan() {
        return cbAlasan;
    }

    public Combo_Box getCbKeterangan() {
        return cbKeterangan;
    }

    public JTextField getTxtKelurahanDom() {
        return txtKelurahanDom;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtNik() {
        return txtNik;
    }

    public JTextField getTxtNoKK() {
        return txtNoKK;
    }

    public JTextField getTxtSearchNIK() {
        return txtSearchNIK;
    }
}
