package ProgramVisual;

import database.KaryawanDatabase;
import database.KoneksiDatabase;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import table.TableCustom;

public class CreateKaryawan extends javax.swing.JPanel {
    private DefaultTableModel model;
    private final Object[] HEADER_MODEL_TABEL = {
        "No Pegawai", "Nama Lengkap", "Email", "No HP", "Tipe Akun", "Tempat Tugas", "Alamat", "Username", "Password"};
    private Connection con = null;
    private Statement st = null;

    public CreateKaryawan() {
        initComponents();
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        dataKaryawan();
        clear();
        Locale locale = new Locale("id", "ID");
        Locale.setDefault(locale);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (column == 0 || column == 1) {
                    setBackground(new Color(45,105,141));
                    setForeground(Color.WHITE);
                } else {
                    setBackground(table.getBackground());
                    setForeground(table.getForeground());
                }
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                return this;
            }
        };
       
        header();
        renderer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        judul4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AlamatField = new Function.PanelRound();
        alamatinput = new javax.swing.JTextField();
        TempatTugasField = new Function.PanelRound();
        tempatTugasinput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        UsernameField = new Function.PanelRound();
        usernameinput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NamaField = new Function.PanelRound();
        namainput = new javax.swing.JTextField();
        NoPegawaiField = new Function.PanelRound();
        noPegawaiInput = new javax.swing.JTextField();
        EmailField = new Function.PanelRound();
        emailinput = new javax.swing.JTextField();
        PasswordField = new Function.PanelRound();
        nohpinput = new javax.swing.JTextField();
        NoHPField = new Function.PanelRound();
        passwordinput = new javax.swing.JPasswordField();
        TypeField = new Function.PanelRound();
        typeUser = new Combobox.Combobox();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKaryawan = new javax.swing.JTable();
        panelAction = new javax.swing.JPanel();
        btnEdit = new Function.PanelRound();
        lblEdit = new javax.swing.JLabel();
        btnDelete = new Function.PanelRound();
        lblDelete = new javax.swing.JLabel();
        btnSave = new Function.PanelRound();
        lblSave = new javax.swing.JLabel();
        btnReset = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(227, 245, 245));
        jPanel3.setPreferredSize(new java.awt.Dimension(710, 659));
        jPanel3.setLayout(null);

        judul4.setBackground(new java.awt.Color(102, 102, 102));
        judul4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        judul4.setForeground(new java.awt.Color(102, 102, 102));
        judul4.setText("CREATE ACCOUNT");
        jPanel3.add(judul4);
        judul4.setBounds(21, 19, 190, 20);

        jLabel10.setText("* Alamat");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(210, 260, 90, 30);

        AlamatField.setBackground(new java.awt.Color(255, 255, 255));
        AlamatField.setRoundBottomLeft(20);
        AlamatField.setRoundBottomRight(20);
        AlamatField.setRoundTopLeft(20);
        AlamatField.setRoundTopRight(20);

        alamatinput.setBorder(null);

        javax.swing.GroupLayout AlamatFieldLayout = new javax.swing.GroupLayout(AlamatField);
        AlamatField.setLayout(AlamatFieldLayout);
        AlamatFieldLayout.setHorizontalGroup(
            AlamatFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlamatFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alamatinput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        AlamatFieldLayout.setVerticalGroup(
            AlamatFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alamatinput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(AlamatField);
        AlamatField.setBounds(20, 260, 170, 30);

        TempatTugasField.setBackground(new java.awt.Color(255, 255, 255));
        TempatTugasField.setRoundBottomLeft(20);
        TempatTugasField.setRoundBottomRight(20);
        TempatTugasField.setRoundTopLeft(20);
        TempatTugasField.setRoundTopRight(20);

        tempatTugasinput.setBorder(null);

        javax.swing.GroupLayout TempatTugasFieldLayout = new javax.swing.GroupLayout(TempatTugasField);
        TempatTugasField.setLayout(TempatTugasFieldLayout);
        TempatTugasFieldLayout.setHorizontalGroup(
            TempatTugasFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TempatTugasFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tempatTugasinput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        TempatTugasFieldLayout.setVerticalGroup(
            TempatTugasFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tempatTugasinput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(TempatTugasField);
        TempatTugasField.setBounds(390, 210, 170, 30);

        jLabel9.setText("* Tempat Tugas");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(580, 210, 90, 30);

        UsernameField.setBackground(new java.awt.Color(255, 255, 255));
        UsernameField.setRoundBottomLeft(20);
        UsernameField.setRoundBottomRight(20);
        UsernameField.setRoundTopLeft(20);
        UsernameField.setRoundTopRight(20);

        usernameinput.setBorder(null);

        javax.swing.GroupLayout UsernameFieldLayout = new javax.swing.GroupLayout(UsernameField);
        UsernameField.setLayout(UsernameFieldLayout);
        UsernameFieldLayout.setHorizontalGroup(
            UsernameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsernameFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        UsernameFieldLayout.setVerticalGroup(
            UsernameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameinput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(UsernameField);
        UsernameField.setBounds(20, 210, 170, 30);

        jLabel8.setText("* Username");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(210, 210, 90, 30);

        NamaField.setBackground(new java.awt.Color(255, 255, 255));
        NamaField.setRoundBottomLeft(20);
        NamaField.setRoundBottomRight(20);
        NamaField.setRoundTopLeft(20);
        NamaField.setRoundTopRight(20);

        namainput.setBorder(null);

        javax.swing.GroupLayout NamaFieldLayout = new javax.swing.GroupLayout(NamaField);
        NamaField.setLayout(NamaFieldLayout);
        NamaFieldLayout.setHorizontalGroup(
            NamaFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamaFieldLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(namainput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        NamaFieldLayout.setVerticalGroup(
            NamaFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namainput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(NamaField);
        NamaField.setBounds(20, 110, 170, 30);

        NoPegawaiField.setBackground(new java.awt.Color(255, 255, 255));
        NoPegawaiField.setRoundBottomLeft(20);
        NoPegawaiField.setRoundBottomRight(20);
        NoPegawaiField.setRoundTopLeft(20);
        NoPegawaiField.setRoundTopRight(20);

        noPegawaiInput.setBorder(null);

        javax.swing.GroupLayout NoPegawaiFieldLayout = new javax.swing.GroupLayout(NoPegawaiField);
        NoPegawaiField.setLayout(NoPegawaiFieldLayout);
        NoPegawaiFieldLayout.setHorizontalGroup(
            NoPegawaiFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoPegawaiFieldLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(noPegawaiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        NoPegawaiFieldLayout.setVerticalGroup(
            NoPegawaiFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noPegawaiInput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(NoPegawaiField);
        NoPegawaiField.setBounds(20, 60, 170, 30);

        EmailField.setBackground(new java.awt.Color(255, 255, 255));
        EmailField.setRoundBottomLeft(20);
        EmailField.setRoundBottomRight(20);
        EmailField.setRoundTopLeft(20);
        EmailField.setRoundTopRight(20);

        emailinput.setBorder(null);

        javax.swing.GroupLayout EmailFieldLayout = new javax.swing.GroupLayout(EmailField);
        EmailField.setLayout(EmailFieldLayout);
        EmailFieldLayout.setHorizontalGroup(
            EmailFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailinput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        EmailFieldLayout.setVerticalGroup(
            EmailFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emailinput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(EmailField);
        EmailField.setBounds(20, 160, 170, 30);

        PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        PasswordField.setRoundBottomLeft(20);
        PasswordField.setRoundBottomRight(20);
        PasswordField.setRoundTopLeft(20);
        PasswordField.setRoundTopRight(20);

        nohpinput.setBorder(null);

        javax.swing.GroupLayout PasswordFieldLayout = new javax.swing.GroupLayout(PasswordField);
        PasswordField.setLayout(PasswordFieldLayout);
        PasswordFieldLayout.setHorizontalGroup(
            PasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordFieldLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(nohpinput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PasswordFieldLayout.setVerticalGroup(
            PasswordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nohpinput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(PasswordField);
        PasswordField.setBounds(390, 110, 170, 30);

        NoHPField.setBackground(new java.awt.Color(255, 255, 255));
        NoHPField.setRoundBottomLeft(20);
        NoHPField.setRoundBottomRight(20);
        NoHPField.setRoundTopLeft(20);
        NoHPField.setRoundTopRight(20);

        passwordinput.setBorder(null);

        javax.swing.GroupLayout NoHPFieldLayout = new javax.swing.GroupLayout(NoHPField);
        NoHPField.setLayout(NoHPFieldLayout);
        NoHPFieldLayout.setHorizontalGroup(
            NoHPFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoHPFieldLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(passwordinput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NoHPFieldLayout.setVerticalGroup(
            NoHPFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordinput, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(NoHPField);
        NoHPField.setBounds(390, 60, 170, 30);

        TypeField.setBackground(new java.awt.Color(255, 255, 255));
        TypeField.setRoundBottomLeft(20);
        TypeField.setRoundBottomRight(20);
        TypeField.setRoundTopLeft(20);
        TypeField.setRoundTopRight(20);

        typeUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "PETUGAS" }));

        javax.swing.GroupLayout TypeFieldLayout = new javax.swing.GroupLayout(TypeField);
        TypeField.setLayout(TypeFieldLayout);
        TypeFieldLayout.setHorizontalGroup(
            TypeFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TypeFieldLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(typeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TypeFieldLayout.setVerticalGroup(
            TypeFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeFieldLayout.createSequentialGroup()
                .addGroup(TypeFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(TypeField);
        TypeField.setBounds(390, 160, 170, 30);

        jLabel2.setText("* No Pegawai");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(210, 64, 90, 20);

        jLabel3.setText("* Nama Lengkap");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(210, 110, 140, 30);

        jLabel4.setText("* Email");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(210, 160, 90, 30);

        jLabel5.setText("* Nomor HP");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(580, 110, 90, 30);

        jLabel6.setText("* Type Akun");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(580, 160, 90, 30);

        jLabel7.setText("* Password");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(580, 60, 90, 30);

        tableKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKaryawan.setRowHeight(25);
        tableKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKaryawan);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 360, 720, 280);

        panelAction.setOpaque(false);

        btnEdit.setBackground(new java.awt.Color(45, 105, 141));
        btnEdit.setRoundBottomLeft(20);
        btnEdit.setRoundBottomRight(20);
        btnEdit.setRoundTopLeft(20);
        btnEdit.setRoundTopRight(20);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
        });

        lblEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdit.setText("EDIT");
        lblEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnEditLayout = new javax.swing.GroupLayout(btnEdit);
        btnEdit.setLayout(btnEditLayout);
        btnEditLayout.setHorizontalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEditLayout.setVerticalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setRoundBottomLeft(20);
        btnDelete.setRoundBottomRight(20);
        btnDelete.setRoundTopLeft(20);
        btnDelete.setRoundTopRight(20);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });

        lblDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDelete.setForeground(new java.awt.Color(255, 255, 255));
        lblDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelete.setText("DELETE");
        lblDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/refresh.png"))); // NOI18N
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelActionLayout = new javax.swing.GroupLayout(panelAction);
        panelAction.setLayout(panelActionLayout);
        panelActionLayout.setHorizontalGroup(
            panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActionLayout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelActionLayout.setVerticalGroup(
            panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(panelAction);
        panelAction.setBounds(390, 260, 280, 112);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_report_file_30px_4.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 740, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(673, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKaryawanMouseClicked
        int baris = tableKaryawan.getSelectedRow();
        String noPegawai = model.getValueAt(baris, 0).toString();
        String namaLengkap = model.getValueAt(baris, 1).toString();
        String email = model.getValueAt(baris, 2).toString();
        String noHp = model.getValueAt(baris, 3).toString();
        String tipeAkun = model.getValueAt(baris, 4).toString();
        String tempatTugas = model.getValueAt(baris, 5).toString();
        String alamat = model.getValueAt(baris, 6).toString();
        String username = model.getValueAt(baris, 7).toString();
        String password = model.getValueAt(baris, 8).toString();

        noPegawaiInput.setText(noPegawai);
        namainput.setText(namaLengkap);
        emailinput.setText(email);
        nohpinput.setText(noHp);
        typeUser.setSelectedItem(tipeAkun);
        tempatTugasinput.setText(tempatTugas);
        alamatinput.setText(alamat);
        usernameinput.setText(username);
        passwordinput.setText(password);
    }//GEN-LAST:event_tableKaryawanMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        updateKaryawan();
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setBackground(colorHover(btnEdit.getBackground()));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setBackground(colorHover(btnEdit.getBackground()));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (noPegawaiInput.getText().equals("") || noPegawaiInput.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Pegawai Tidak Boleh Kosong", "Data Kosong", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
             int isDelete = JOptionPane.showConfirmDialog(this, 
                    "Data Karyawan Dengan No Pegawai : "+noPegawaiInput.getText()+" \nAkan DIHAPUS!", "Anda Yakin Ingin MengHapus nya ?", 
                    JOptionPane.YES_NO_CANCEL_OPTION);
             if (isDelete == 0) {
                deleteKaryawan(noPegawaiInput.getText());
            }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(colorHoverDelete(btnDelete.getBackground()));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(colorHoverDelete(btnDelete.getBackground()));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        createKaryawan();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(colorHover(btnSave.getBackground()));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(colorHover(btnSave.getBackground()));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
       clear();
       dataKaryawan();
    }//GEN-LAST:event_btnResetMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try{
            con = new KoneksiDatabase().connect();
            String namaFile = "src/report/report_karyawan.jasper";
            HashMap parameter = new HashMap();
            File report_file = new File(namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameter, con);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Gagal print Data" + err, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Function.PanelRound AlamatField;
    private Function.PanelRound EmailField;
    private Function.PanelRound NamaField;
    private Function.PanelRound NoHPField;
    private Function.PanelRound NoPegawaiField;
    private Function.PanelRound PasswordField;
    private Function.PanelRound TempatTugasField;
    private Function.PanelRound TypeField;
    private Function.PanelRound UsernameField;
    private javax.swing.JTextField alamatinput;
    private Function.PanelRound btnDelete;
    private Function.PanelRound btnEdit;
    private javax.swing.JLabel btnReset;
    private Function.PanelRound btnSave;
    private javax.swing.JTextField emailinput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel judul4;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblSave;
    private javax.swing.JTextField namainput;
    private javax.swing.JTextField noPegawaiInput;
    private javax.swing.JTextField nohpinput;
    private javax.swing.JPanel panelAction;
    private javax.swing.JPasswordField passwordinput;
    private javax.swing.JTable tableKaryawan;
    private javax.swing.JTextField tempatTugasinput;
    private Combobox.Combobox typeUser;
    private javax.swing.JTextField usernameinput;
    // End of variables declaration//GEN-END:variables

    private void dataKaryawan(){
        model = new DefaultTableModel(null, HEADER_MODEL_TABEL);
        tableKaryawan.setModel(model);
        con = new KoneksiDatabase().connect();
        Statement statemen = null;
        
//         jika ingin admin dapat merubah diri nya sendiri
//        String sql = "SELECT * FROM "+KaryawanDatabase.TABLE_NAME+";";

//         jika ingin admin yang login tidak bisa merubah dirinya sendiri
        String sql = "SELECT * FROM "+KaryawanDatabase.TABLE_NAME+" WHERE "+KaryawanDatabase.NO_PEGAWAI+" <> '"+MenuAdmin.karyawan.getNoPegawai()+"';";

        
        try {
            statemen = con.createStatement();
            ResultSet resultSet = statemen.executeQuery(sql);
            while (resultSet.next()) {
                String coll1 = resultSet.getString(KaryawanDatabase.NO_PEGAWAI);
                String coll2 = resultSet.getString(KaryawanDatabase.NAMA);
                String coll3 = resultSet.getString(KaryawanDatabase.EMAIL);
                String coll4 = resultSet.getString(KaryawanDatabase.NO_HP);
                String coll5 = resultSet.getString(KaryawanDatabase.ROLE);
                String coll6 = resultSet.getString(KaryawanDatabase.TEMPAT_TUGAS);
                String coll7 = resultSet.getString(KaryawanDatabase.ALAMAT);
                String coll8 = resultSet.getString(KaryawanDatabase.USERNAME);
                String coll9 = resultSet.getString(KaryawanDatabase.PASSWORD);
                
                String[] data = {coll1, coll2, coll3, coll4, coll5, coll6, coll7, coll8, coll9};
                model.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "GAGAL MEMBUAT DATA TABLE : "+e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateKaryawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statemen != null) {
                try {
                    statemen.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateKaryawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private boolean validateData() {
        if (noPegawaiInput.getText().equals("") ||
            namainput.getText().equals("") ||
            emailinput.getText().equals("") ||
            nohpinput.getText().equals("") ||
            passwordinput.getPassword().equals("")) {

            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        String uname = noPegawaiInput.getText();
        int lengthun = uname.length();
        if (lengthun < 4) {
            JOptionPane.showMessageDialog(this, "Minimal Input 4 Kata Pada Form No Pegawai!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if (lengthun > 10) {
            JOptionPane.showMessageDialog(this, "Maximal Input 10 Kata Pada Form No Pegawai!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        String value = noPegawaiInput.getText();
        try {
            int intValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Hanya Dapat Inputkan Angka Ke Form No Pegawai!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        String fullname = namainput.getText();
        int lengthfn = fullname.length();
        if (lengthfn < 5) {
            JOptionPane.showMessageDialog(this, "Minimal Input 5 Kata Pada Form Nama Lengkap!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        String email = emailinput.getText();
        int lengthem = email.length();
        if (lengthem < 8) {
            JOptionPane.showMessageDialog(this, "Minimal Input 8 Kata Pada Form Email!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        String nohp = nohpinput.getText();
        int lengthno = nohp.length();
        if (lengthno < 10) {
            JOptionPane.showMessageDialog(this, "Minimal Input 10 Kata Pada Form Nomor Handphone!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        String pass = String.valueOf(passwordinput.getPassword());
        int lengthpass = pass.length();
        if (lengthpass < 8) {
            JOptionPane.showMessageDialog(this, "Minimal Input 8 Kata Pada Form Password!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private void createKaryawan() {
        if (!validateData()) {
            return;
        }
        con = new KoneksiDatabase().connect();
        PreparedStatement statement = null;
        try {
            String cek = "SELECT * FROM "+KaryawanDatabase.TABLE_NAME+" WHERE "+KaryawanDatabase.NO_PEGAWAI+" = ? OR "+KaryawanDatabase.USERNAME+" = ?";
            statement = con.prepareStatement(cek);
            statement.setString(1, noPegawaiInput.getText());
            statement.setString(2, usernameinput.getText());
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Nomor Pegawai atau Username Sudah Terdaftar");
            } else {
                String insert = "INSERT INTO "+KaryawanDatabase.TABLE_NAME+" VALUES (?,?,?,?,?,?,?,?,?)";
                statement = con.prepareStatement(insert);
                statement.setString(1, noPegawaiInput.getText());
                statement.setString(2, namainput.getText());
                statement.setString(3, typeUser.getSelectedItem().toString());
                statement.setString(4, usernameinput.getText());
                statement.setString(5, String.valueOf(passwordinput.getPassword()));
                statement.setString(6, nohpinput.getText());
                statement.setString(7, emailinput.getText());
                statement.setString(8, tempatTugasinput.getText());
                statement.setString(9, alamatinput.getText());
                
                int rowsInsert = statement.executeUpdate();
                if (rowsInsert > 0) {
                    JOptionPane.showMessageDialog(null, "Data Karyawan berhasil dibuat");
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal membuat data Karyawan", "INSERT", JOptionPane.ERROR_MESSAGE);
                }
                dataKaryawan();
                clear();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateKaryawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateKaryawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void updateKaryawan() {
        if (!validateData()) {
            return;
        }

        con = new KoneksiDatabase().connect();
        PreparedStatement statement = null;

        try {
            String update = "UPDATE "+KaryawanDatabase.TABLE_NAME+" SET "+KaryawanDatabase.NAMA+" = ?, "+KaryawanDatabase.ROLE+" = ?, "
                +KaryawanDatabase.USERNAME+" = ?, "+KaryawanDatabase.PASSWORD+" = ?, "+KaryawanDatabase.NO_HP+" = ?, "
                +KaryawanDatabase.EMAIL+" = ?, "+KaryawanDatabase.TEMPAT_TUGAS+" = ?, "+KaryawanDatabase.ALAMAT+" = ? "
                +"WHERE "+KaryawanDatabase.NO_PEGAWAI+" = ?";

            statement = con.prepareStatement(update);
            statement.setString(1, namainput.getText());
            statement.setString(2, typeUser.getSelectedItem().toString());
            statement.setString(3, usernameinput.getText());
            statement.setString(4, String.valueOf(passwordinput.getPassword()));
            statement.setString(5, nohpinput.getText());
            statement.setString(6, emailinput.getText());
            statement.setString(7, tempatTugasinput.getText());
            statement.setString(8, alamatinput.getText());
            statement.setString(9, noPegawaiInput.getText());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data Karyawan berhasil diperbarui");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal memperbarui data Karyawan", "UPDATE", JOptionPane.ERROR_MESSAGE);
            }
            dataKaryawan();
            clear();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateKaryawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateKaryawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void deleteKaryawan(String noPegawai) {
        con = new KoneksiDatabase().connect();
        PreparedStatement statement = null;

        try {
            String delete = "DELETE FROM "+KaryawanDatabase.TABLE_NAME+" WHERE "+KaryawanDatabase.NO_PEGAWAI+" = ?";

            statement = con.prepareStatement(delete);
            statement.setString(1, noPegawai);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data Karyawan berhasil dihapus");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data Karyawan", "DELETE", JOptionPane.ERROR_MESSAGE);
            }
            dataKaryawan();
            clear();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateKaryawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateKaryawan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void clear(){
        noPegawaiInput.setText("");
        namainput.setText("");
        emailinput.setText("");
        nohpinput.setText("");
        typeUser.setSelectedItem("");
        tempatTugasinput.setText("");
        alamatinput.setText("");
        usernameinput.setText("");
        passwordinput.setText("");
        typeUser.setSelectedIndex(0);
    }

    public final void header() {
    tableKaryawan.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
    tableKaryawan.getTableHeader().setBackground(new Color(45, 105, 141));
    tableKaryawan.getTableHeader().setForeground(Color.WHITE);
}

    public final void renderer() {
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableKaryawan.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(45, 105, 141));
        headerRenderer.setForeground(Color.WHITE);
    }
    
    private java.awt.Color colorHover(java.awt.Color color){
        java.awt.Color blue = new java.awt.Color(45, 105, 141);
        java.awt.Color grey = new java.awt.Color(125,125,125);
        if(color.equals(blue)){
            return grey;
        }else{
            return blue;
        }
    }
    
    private java.awt.Color colorHoverDelete(java.awt.Color color){
        java.awt.Color red = new java.awt.Color(255,0,51);
        java.awt.Color grey = new java.awt.Color(125,125,125);
        if(color.equals(red)){
            return grey;
        }else{
            return red;
        }
    }
}
