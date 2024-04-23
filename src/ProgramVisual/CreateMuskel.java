package ProgramVisual;

import database.KaryawanDatabase;
import database.KoneksiDatabase;
import database.MuskelDatabase;
import helper.Waktu;
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

public class CreateMuskel extends javax.swing.JPanel {
    private DefaultTableModel model;
    private final Object[] HEADER_MODEL_TABEL = {
       "Id Muskel", "Nama Muskel", "Tanggal Mulai", "Tanggal Berakhir", "Dana"};
    private Connection con = null;
    private Statement st = null;

    public CreateMuskel() {
        initComponents();
        Locale locale = new Locale("id", "ID");
        Locale.setDefault(locale);
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        dataKaryawan();
        clear();
        
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
        jLabel8 = new javax.swing.JLabel();
        NamaField = new Function.PanelRound();
        txtNamaMuskel = new javax.swing.JTextField();
        NoPegawaiField = new Function.PanelRound();
        txtIdMuskel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMuskel = new javax.swing.JTable();
        panelAction = new javax.swing.JPanel();
        btnEdit = new Function.PanelRound();
        lblEdit = new javax.swing.JLabel();
        btnDelete = new Function.PanelRound();
        lblDelete = new javax.swing.JLabel();
        btnSave = new Function.PanelRound();
        lblSave = new javax.swing.JLabel();
        btnReset = new javax.swing.JLabel();
        dateTglBerakhir = new com.toedter.calendar.JDateChooser();
        dateTglMulai = new com.toedter.calendar.JDateChooser();
        TypeField = new Function.PanelRound();
        cbDana = new Combobox.Combobox();
        jSpinner1 = new javax.swing.JSpinner();
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

        jLabel10.setText("* Dana");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(210, 170, 90, 30);

        jLabel8.setText("* Tanggal Berakhir");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(570, 110, 110, 30);

        NamaField.setBackground(new java.awt.Color(255, 255, 255));
        NamaField.setRoundBottomLeft(20);
        NamaField.setRoundBottomRight(20);
        NamaField.setRoundTopLeft(20);
        NamaField.setRoundTopRight(20);

        txtNamaMuskel.setBorder(null);

        javax.swing.GroupLayout NamaFieldLayout = new javax.swing.GroupLayout(NamaField);
        NamaField.setLayout(NamaFieldLayout);
        NamaFieldLayout.setHorizontalGroup(
            NamaFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamaFieldLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtNamaMuskel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        NamaFieldLayout.setVerticalGroup(
            NamaFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNamaMuskel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(NamaField);
        NamaField.setBounds(20, 110, 170, 30);

        NoPegawaiField.setBackground(new java.awt.Color(204, 204, 204));
        NoPegawaiField.setRoundBottomLeft(20);
        NoPegawaiField.setRoundBottomRight(20);
        NoPegawaiField.setRoundTopLeft(20);
        NoPegawaiField.setRoundTopRight(20);

        txtIdMuskel.setEditable(false);
        txtIdMuskel.setBackground(new java.awt.Color(204, 204, 204));
        txtIdMuskel.setBorder(null);

        javax.swing.GroupLayout NoPegawaiFieldLayout = new javax.swing.GroupLayout(NoPegawaiField);
        NoPegawaiField.setLayout(NoPegawaiFieldLayout);
        NoPegawaiFieldLayout.setHorizontalGroup(
            NoPegawaiFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoPegawaiFieldLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtIdMuskel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        NoPegawaiFieldLayout.setVerticalGroup(
            NoPegawaiFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIdMuskel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(NoPegawaiField);
        NoPegawaiField.setBounds(20, 60, 170, 30);

        jLabel2.setText("Id Muskel (Auto)");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(210, 64, 90, 20);

        jLabel3.setText("* Nama Muskel");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(210, 110, 140, 30);

        jLabel4.setText("* Tanggal Mulai");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(570, 60, 100, 30);

        tableMuskel.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMuskel.setRowHeight(25);
        tableMuskel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMuskelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMuskel);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 720, 390);

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
        panelAction.setBounds(360, 150, 280, 112);
        jPanel3.add(dateTglBerakhir);
        dateTglBerakhir.setBounds(370, 110, 190, 30);
        jPanel3.add(dateTglMulai);
        dateTglMulai.setBounds(370, 60, 190, 30);

        TypeField.setBackground(new java.awt.Color(255, 255, 255));
        TypeField.setRoundBottomLeft(20);
        TypeField.setRoundBottomRight(20);
        TypeField.setRoundTopLeft(20);
        TypeField.setRoundTopRight(20);

        cbDana.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Belum Diketahui", "Pemerintah Pusat", "Pemerintah Daerah" }));

        javax.swing.GroupLayout TypeFieldLayout = new javax.swing.GroupLayout(TypeField);
        TypeField.setLayout(TypeFieldLayout);
        TypeFieldLayout.setHorizontalGroup(
            TypeFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TypeFieldLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(cbDana, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TypeFieldLayout.setVerticalGroup(
            TypeFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeFieldLayout.createSequentialGroup()
                .addGroup(TypeFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDana, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(TypeField);
        TypeField.setBounds(20, 170, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_report_file_30px_4.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1);
        jLabel1.setBounds(700, 20, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMuskelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMuskelMouseClicked
        int baris = tableMuskel.getSelectedRow();
        String id = model.getValueAt(baris, 0).toString();
        String namaMuskel = model.getValueAt(baris, 1).toString();
        String tglMulai = model.getValueAt(baris, 2).toString();
        String tglBerakhir = "";
        if (model.getValueAt(baris, 3) != null) {
            tglBerakhir = model.getValueAt(baris, 3).toString();
        }
        String dana = model.getValueAt(baris, 4).toString();

        txtIdMuskel.setText(id);
        txtNamaMuskel.setText(namaMuskel);
        cbDana.setSelectedItem(dana);
        if (!tglMulai.equals("") && tglMulai != null) {
            dateTglMulai.setDate(Waktu.stringToDate(tglMulai));
        } else {
            dateTglMulai.setDate(null);
        }
        if (!tglBerakhir.equals("") && tglBerakhir != null) {
            dateTglBerakhir.setDate(Waktu.stringToDate(tglBerakhir));
        } else {
            dateTglBerakhir.setDate(null);
        }
    }//GEN-LAST:event_tableMuskelMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        if (!txtIdMuskel.getText().equals("") && txtIdMuskel.getText() != null) {
            updateMuskel();
        }else {
            JOptionPane.showMessageDialog(this, "Untuk Mengubah Silahkan Klik Dahulu data di table yang ingin diUbah!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setBackground(colorHover(btnEdit.getBackground()));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setBackground(colorHover(btnEdit.getBackground()));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (txtIdMuskel.getText().equals("") || txtIdMuskel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Untuk Menghapus Silahkan Klik Dahulu data di table yang ingin diUbah!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }else{
             int isDelete = JOptionPane.showConfirmDialog(this, 
                    "Data Muskel Dengan ID : "+txtIdMuskel.getText()+" \nAkan DIHAPUS!", "Anda Yakin Ingin MengHapus nya ?", 
                    JOptionPane.YES_NO_CANCEL_OPTION);
             if (isDelete == 0) {
                deleteKaryawan(txtIdMuskel.getText());
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
        createMuskel();
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
            String namaFile = "src/report/report_muskel.jasper";
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
    private Function.PanelRound NamaField;
    private Function.PanelRound NoPegawaiField;
    private Function.PanelRound TypeField;
    private Function.PanelRound btnDelete;
    private Function.PanelRound btnEdit;
    private javax.swing.JLabel btnReset;
    private Function.PanelRound btnSave;
    private Combobox.Combobox cbDana;
    private com.toedter.calendar.JDateChooser dateTglBerakhir;
    private com.toedter.calendar.JDateChooser dateTglMulai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel judul4;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblSave;
    private javax.swing.JPanel panelAction;
    private javax.swing.JTable tableMuskel;
    private javax.swing.JTextField txtIdMuskel;
    private javax.swing.JTextField txtNamaMuskel;
    // End of variables declaration//GEN-END:variables

    private void dataKaryawan(){
        model = new DefaultTableModel(null, HEADER_MODEL_TABEL);
        tableMuskel.setModel(model);
        con = new KoneksiDatabase().connect();
        Statement statemen = null;
        
        String sql = "SELECT * FROM "+MuskelDatabase.TABLE_NAME+";";

        try {
            statemen = con.createStatement();
            ResultSet resultSet = statemen.executeQuery(sql);
            while (resultSet.next()) {
                String coll1 = resultSet.getString(MuskelDatabase.ID);
                String coll2 = resultSet.getString(MuskelDatabase.NAMA);
                String coll3 = resultSet.getString(MuskelDatabase.TANGGAL_MULAI);
                String coll4 = resultSet.getString(MuskelDatabase.TANGGAL_AKHIR);
                String coll5 = resultSet.getString(MuskelDatabase.DANA);
                
                String[] data = {coll1, coll2, coll3, coll4, coll5};
                model.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "GAGAL MEMBUAT DATA TABLE : "+e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TableDataMuskel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statemen != null) {
                try {
                    statemen.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TableDataMuskel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private boolean validateData() {
        if (txtNamaMuskel.getText().equals("") ||
            dateTglMulai.getDate() == null ||
            dateTglBerakhir.getDate() == null
           ) {
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        String namaMuskel = txtNamaMuskel.getText();
        int length = namaMuskel.length();
        if (length < 5) {
            JOptionPane.showMessageDialog(this, "Minimal Input 5 Kata Pada Form Nama Muskel!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        String tglBerakhir = Waktu.dateParseToString(dateTglBerakhir.getDate());
        String hariIni = Waktu.dateParseToString(new java.util.Date());
        if (tglBerakhir.equals(hariIni)) {
            JOptionPane.showMessageDialog(this, "Tanggal Berakhir Tidak Boleh sama dengan Tanggal Hari Ini!", "Pesan", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void createMuskel() {
        if (!validateData()) {
            return;
        }
        con = new KoneksiDatabase().connect();
        PreparedStatement statement = null;
        try {
                String insert = "INSERT INTO "+MuskelDatabase.TABLE_NAME+" VALUES (?,?,?,?,?)";
                statement = con.prepareStatement(insert);
                statement.setString(1, "0");
                statement.setString(2, txtNamaMuskel.getText());
                statement.setDate(3, new java.sql.Date(dateTglMulai.getDate().getTime()));
                statement.setDate(4, new java.sql.Date(dateTglBerakhir.getDate().getTime()));
                statement.setString(5, cbDana.getSelectedItem().toString());
                
                int rowsInsert = statement.executeUpdate();
                if (rowsInsert > 0) {
                    JOptionPane.showMessageDialog(null, "Data Muskel berhasil dibuat");
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal membuat data Muskel", "INSERT", JOptionPane.ERROR_MESSAGE);
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
                    Logger.getLogger(CreateMuskel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateMuskel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void updateMuskel() {
        if (!validateData()) {
            return;
        }

        con = new KoneksiDatabase().connect();
        PreparedStatement statement = null;

        try {
            String update = "UPDATE "+MuskelDatabase.TABLE_NAME+" SET "+MuskelDatabase.NAMA+" = ?, "+MuskelDatabase.TANGGAL_MULAI+" = ?, "
                +MuskelDatabase.TANGGAL_AKHIR+" = ?, "+MuskelDatabase.DANA+" = ? "
                +"WHERE "+MuskelDatabase.ID+" = ?";


            statement = con.prepareStatement(update);
            statement.setString(1, txtNamaMuskel.getText());
            statement.setDate(2, new java.sql.Date(dateTglMulai.getDate().getTime()));
            statement.setDate(3, new java.sql.Date(dateTglBerakhir.getDate().getTime()));
            statement.setString(4, cbDana.getSelectedItem().toString());
            statement.setString(5, txtIdMuskel.getText());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data Muskel berhasil diperbarui");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal memperbarui data Muskel", "UPDATE", JOptionPane.ERROR_MESSAGE);
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
                    Logger.getLogger(CreateMuskel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateMuskel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void deleteKaryawan(String idMuskel) {
        con = new KoneksiDatabase().connect();
        PreparedStatement statement = null;

        try {
            String delete = "DELETE FROM "+MuskelDatabase.TABLE_NAME+" WHERE "+MuskelDatabase.ID+" = ?";

            statement = con.prepareStatement(delete);
            statement.setString(1, idMuskel);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data Muskel berhasil dihapus");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data Muskel", "DELETE", JOptionPane.ERROR_MESSAGE);
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
                    Logger.getLogger(CreateMuskel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CreateMuskel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void clear(){
        txtIdMuskel.setText("");
        txtNamaMuskel.setText("");
        cbDana.setSelectedIndex(0);
        dateTglMulai.setDate(new java.util.Date());
        dateTglBerakhir.setDate(new java.util.Date());
    }

    public final void header() {
    tableMuskel.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
    tableMuskel.getTableHeader().setBackground(new Color(45, 105, 141));
    tableMuskel.getTableHeader().setForeground(Color.WHITE);
}

    public final void renderer() {
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableMuskel.getTableHeader().getDefaultRenderer();
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
