package component;

import ProgramVisual.EditDataAnggota;
import ProgramVisual.InfoDataAnggota;
import static ProgramVisual.MenuPendaftar.pn_utama;
import database.KoneksiDatabase;
import database.PendaftarDatabase;
import entity.PendaftarEntity;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ButtonAnggotaKeluarga extends javax.swing.JPanel {
    private PendaftarEntity pendaftar;
    private Connection conn = null;

    public ButtonAnggotaKeluarga(PendaftarEntity pendaftar) {
        initComponents();
        if(pendaftar != null){
            this.pendaftar = pendaftar;
            txtNama.setText(pendaftar.getNamaLengkap());
            txtStatusDiKeluarga.setText(pendaftar.getStatusKeluarga());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Function.PanelRound();
        txtNama = new javax.swing.JLabel();
        btnViewData = new javax.swing.JLabel();
        btnEditAnggota = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        txtStatusDiKeluarga = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0,0,0,0)
        );
        setOpaque(false);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNama.setForeground(new java.awt.Color(18, 111, 111));
        txtNama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNama.setText("Nama Anggota Keluarga");

        btnViewData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_view_29px_4.png"))); // NOI18N
        btnViewData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewDataMouseClicked(evt);
            }
        });

        btnEditAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_edit_delivery_terms_32px.png"))); // NOI18N
        btnEditAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditAnggotaMouseClicked(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_trash_29px_2.png"))); // NOI18N
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        txtStatusDiKeluarga.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtStatusDiKeluarga.setForeground(new java.awt.Color(18, 111, 111));
        txtStatusDiKeluarga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtStatusDiKeluarga.setText("Status Di Keluarga");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStatusDiKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewData)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(txtStatusDiKeluarga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewDataMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new InfoDataAnggota(pendaftar));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btnViewDataMouseClicked

    private void btnEditAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditAnggotaMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new EditDataAnggota(pendaftar));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btnEditAnggotaMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
         int isDelete = JOptionPane.showConfirmDialog(this, 
                    "Data Dengan Nik : "+pendaftar.getNik()+" \nAkan DIHAPUS!", "Anda Yakin Ingin MengHapus nya ?", 
                    JOptionPane.YES_NO_CANCEL_OPTION);
         if (isDelete == 0) {
            conn = new KoneksiDatabase().connect();
            Statement statement = null;
            String delete = "DELETE FROM "+PendaftarDatabase.TABLE_NAME+" WHERE "+PendaftarDatabase.NIK+" = '"+pendaftar.getNik()+"' ";
            try {
                statement = conn.createStatement();
                int rs = statement.executeUpdate(delete);
                if (rs > 0) {
                    JOptionPane.showMessageDialog(this, "Berhasil Menghapus Data Dengan Nik : "+pendaftar.getNik());
                }
            } catch (SQLException ex) {
                Logger.getLogger(ButtonAnggotaKeluarga.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ButtonAnggotaKeluarga.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ButtonAnggotaKeluarga.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnEditAnggota;
    private javax.swing.JLabel btnViewData;
    private Function.PanelRound panelRound1;
    private javax.swing.JLabel txtNama;
    private javax.swing.JLabel txtStatusDiKeluarga;
    // End of variables declaration//GEN-END:variables

}
