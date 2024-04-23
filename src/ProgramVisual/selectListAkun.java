/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramVisual;

import static ProgramVisual.Login.txtpassword;
import static ProgramVisual.Login.txtusername;
import static ProgramVisual.MenuPendaftar.pn_utama;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dower
 */
public class selectListAkun extends javax.swing.JPanel {
    Connection con = null;
    Statement st = null;
    /**
     * Creates new form NewJPanel
     */
    public selectListAkun() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/p_visual", "root", "");
            st = con.createStatement();
            
            tampil();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Data Kosong Silakan Input Terlebih Dahulu");
        }
    }

    protected void kosong() {
        statusProfile.setText("");
        statusName.setText("");
    }
            
    private void tampil() {
        try {
            String sqlSearch = ("SELECT * FROM login WHERE nokk = '"+txtusername.getText()+"' AND password = '"+String.valueOf(txtpassword.getPassword())+"'");
            java.sql.ResultSet rs = st.executeQuery(sqlSearch);
            Boolean strreq = rs.next();

            String id = rs.getString(1);
                
            String sqldata = ("SELECT * FROM datuser WHERE login_id="+id+"");
            java.sql.ResultSet result = st.executeQuery(sqldata);
            Boolean str = result.next();
            
            statusProfile.setText(result.getString(3));
            statusProfile.setEditable(false);
            statusName.setText(result.getString(5));
            statusName.setEditable(false);
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Data Kosong Silakan Input Terlebih Dahulu");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tableTanggalLahir = new Function.PanelRound();
        editAnggota = new javax.swing.JLabel();
        deleteTable = new javax.swing.JLabel();
        viewData = new javax.swing.JLabel();
        judul4 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(227, 245, 245));
        jPanel3.setPreferredSize(new java.awt.Dimension(710, 659));
        jPanel3.setLayout(null);

        tableTanggalLahir.setBackground(new java.awt.Color(255, 255, 255));
        tableTanggalLahir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableTanggalLahir.setRoundBottomLeft(20);
        tableTanggalLahir.setRoundBottomRight(20);
        tableTanggalLahir.setRoundTopLeft(20);
        tableTanggalLahir.setRoundTopRight(20);

        statusProfile.setBorder(null);
        statusProfile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statusProfileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statusProfileFocusLost(evt);
            }
        });
        statusProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusProfileActionPerformed(evt);
            }
        });

        editAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_edit_delivery_terms_32px.png"))); // NOI18N
        editAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editAnggotaMouseClicked(evt);
            }
        });

        deleteTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_trash_29px_2.png"))); // NOI18N
        deleteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTableMouseClicked(evt);
            }
        });

        statusName.setBorder(null);
        statusName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statusNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statusNameFocusLost(evt);
            }
        });
        statusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusNameActionPerformed(evt);
            }
        });

        viewData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_view_29px_4.png"))); // NOI18N
        viewData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDataMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout tableTanggalLahirLayout = new javax.swing.GroupLayout(tableTanggalLahir);
        tableTanggalLahir.setLayout(tableTanggalLahirLayout);
        tableTanggalLahirLayout.setHorizontalGroup(
            tableTanggalLahirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableTanggalLahirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteTable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tableTanggalLahirLayout.setVerticalGroup(
            tableTanggalLahirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableTanggalLahirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(tableTanggalLahirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewData)
                    .addGroup(tableTanggalLahirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableTanggalLahirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(deleteTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel3.add(tableTanggalLahir);
        tableTanggalLahir.setBounds(20, 50, 340, 30);

        judul4.setBackground(new java.awt.Color(102, 102, 102));
        judul4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        judul4.setForeground(new java.awt.Color(102, 102, 102));
        judul4.setText("Data Anggota");
        jPanel3.add(judul4);
        judul4.setBounds(21, 19, 190, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void statusProfileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusProfileFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_statusProfileFocusGained

    private void statusProfileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusProfileFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_statusProfileFocusLost

    private void statusProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusProfileActionPerformed

    private void deleteTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTableMouseClicked
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/p_visual", "root", "");
            st = con.createStatement();

            String sqlSearch = ("SELECT * FROM login WHERE nokk = '"+txtusername.getText()+"' AND password = '"+String.valueOf(txtpassword.getPassword())+"'");
            java.sql.ResultSet rs = st.executeQuery(sqlSearch);
            Boolean strreq = rs.next();

            String id = rs.getString(1);
           int ok = JOptionPane.showConfirmDialog(null, "Hapus?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
           if (ok == 0) {
            String sqldata = ("delete from datuser where login_id='" + id + "'");
            PreparedStatement stat = con.prepareStatement(sqldata);
            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            kosong();
            tampil();
           }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Data kosong");
        }
        kosong();
        tampil();
    }//GEN-LAST:event_deleteTableMouseClicked

    private void statusNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_statusNameFocusGained

    private void statusNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_statusNameFocusLost

    private void statusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusNameActionPerformed

    private void editAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAnggotaMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new EditDataAnggota());
        pn_utama.repaint();
        pn_utama.revalidate();
        tampil();
    }//GEN-LAST:event_editAnggotaMouseClicked

    private void viewDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDataMouseEntered

    private void viewDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataMouseClicked
         pn_utama.removeAll();
        pn_utama.add(new InfoDataAnggota());
        pn_utama.repaint();
        pn_utama.revalidate();
        tampil();
    }//GEN-LAST:event_viewDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteTable;
    private javax.swing.JLabel editAnggota;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel judul4;
    public static final javax.swing.JTextField statusName = new javax.swing.JTextField();
    public static final javax.swing.JTextField statusProfile = new javax.swing.JTextField();
    private Function.PanelRound tableTanggalLahir;
    private javax.swing.JLabel viewData;
    // End of variables declaration//GEN-END:variables
}
