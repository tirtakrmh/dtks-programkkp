package ProgramVisual;

import component.ButtonAnggotaKeluarga;
import component.ButtonMenuMuskel;
import database.KoneksiDatabase;
import entity.MuskelEntity;
import java.sql.*;
import database.MuskelDatabase;
import database.PendaftarDatabase;
import entity.PendaftarEntity;
import helper.Waktu;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ListAnggotaKeluarga extends javax.swing.JPanel {
    private final Connection connection = new KoneksiDatabase().connect();
    private final List<PendaftarEntity> listPendaftar = new ArrayList<>();
    
    public ListAnggotaKeluarga() {
        initComponents();
        createListBtnAnggotaKeluarga();
        repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelAnggotaKeluarga = new javax.swing.JPanel();

        background.setBackground(new java.awt.Color(227, 245, 245));

        panelTitle.setOpaque(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText("Anggota Keluarga");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelAnggotaKeluarga.setOpaque(false);
        panelAnggotaKeluarga.setLayout(new java.awt.GridLayout(10, 1, 0, 4));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAnggotaKeluarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAnggotaKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(486, 486, 486))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelAnggotaKeluarga;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables

    private void createListBtnAnggotaKeluarga(){
        try {
            retriveDataAnggotaKeluarga();
        } catch (SQLException ex) {
            Logger.getLogger(ListAnggotaKeluarga.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (listPendaftar != null) {
            for (PendaftarEntity pendaftarEntity : listPendaftar) {
                ButtonAnggotaKeluarga btnAnggotaKeluarga = new ButtonAnggotaKeluarga(pendaftarEntity);
                btnAnggotaKeluarga.setVisible(true);
                panelAnggotaKeluarga.add(btnAnggotaKeluarga);
            }
        }
    }
    
    private void retriveDataAnggotaKeluarga() throws SQLException{
        Statement stat = null;
        String sql = "SELECT p.* FROM pendaftar p, user u "
                + "WHERE u.id = p.id_user AND u.id = " + MenuPendaftar.user.getId() + " ORDER BY p.status_keluarga DESC, p.tanggal_lahir ASC;";
        try {
           stat = connection.createStatement();
           ResultSet result = stat.executeQuery(sql);
            while (result.next()) {                
                    
                    String nikV = result.getString(PendaftarDatabase.NIK);
                    String namaLengkapV = result.getString(PendaftarDatabase.NAMA_LENGKAP);
                    String stsKeluargaV = result.getString(PendaftarDatabase.STATUS_KELUARGA);
                    java.util.Date tanggalLahirV = Waktu.stringToDate(result.getString(PendaftarDatabase.TANGGAL_LAHIR));
                    String stsKawinV = result.getString(PendaftarDatabase.STATUS_KAWIN);
                    String namaIbuV = result.getString(PendaftarDatabase.NAMA_IBU);
                    String jnsKelaminV = result.getString(PendaftarDatabase.JENIS_KELAMIN);
                    String kerjaV = result.getString(PendaftarDatabase.STATUS_KERJA);
                    String almtV = result.getString(PendaftarDatabase.ALAMAT);
                    int rtV = result.getInt(PendaftarDatabase.RT);
                    int rwV = result.getInt(PendaftarDatabase.RW);
                    String provinsiV = result.getString(PendaftarDatabase.PROVINSI);
                    String kabupatenV = result.getString(PendaftarDatabase.KABUPATEN);
                    String kecamatanV = result.getString(PendaftarDatabase.KECAMATAN);
                    String kelurahanV = result.getString(PendaftarDatabase.KELURAHAN);
                    String agamaV = result.getString(PendaftarDatabase.AGAMA);
                    String pendidikanV = result.getString(PendaftarDatabase.PENDIDIKAN);
                    String golDarV = result.getString(PendaftarDatabase.GOL_DAR);
                    String stsHubunganV = result.getString(PendaftarDatabase.STATUS_HUBUNGAN);
                    String kewarganegaraanV = result.getString(PendaftarDatabase.KEWARGANEGARAAN);
                    String namaAyahV = result.getString(PendaftarDatabase.NAMA_AYAH);
                    String noHPV = result.getString(PendaftarDatabase.NO_HP);
                    String stsDisabilitasV = result.getString(PendaftarDatabase.DISABILITAS);
                    int rtDomisiliV = result.getInt(PendaftarDatabase.RT_DOMISILI);
                    int rwDomisiliV = result.getInt(PendaftarDatabase.RW_DOMISILI);
                    String provinsiDomisiliV = result.getString(PendaftarDatabase.PROVINSI_DOMISILI);
                    String kecamatanDomisiliV = result.getString(PendaftarDatabase.KECAMATAN_DOMISILI);
                    String kelurahanDomisiliV= result.getString(PendaftarDatabase.KELURAHAN_DOMISILI);
                    String stsMobilV = result.getString(PendaftarDatabase.MOBIL);
                    String njopV = result.getString(PendaftarDatabase.NJOP);
                    String stsSumberAir = result.getString(PendaftarDatabase.SUMBER_AIR);
                    int rataPenghasilanV = result.getInt(PendaftarDatabase.PENGHASILAN);
                    int idUserV = result.getInt(PendaftarDatabase.ID_USER);
                    PendaftarEntity pendaftar = new PendaftarEntity(nikV, namaLengkapV, 
                        stsKeluargaV, tanggalLahirV, stsKawinV, namaIbuV, jnsKelaminV, kerjaV, almtV, 
                        rtV, rwV, provinsiV, kabupatenV, kecamatanV, kelurahanV, agamaV, pendidikanV, 
                        golDarV, stsHubunganV, kewarganegaraanV, namaAyahV, noHPV, stsDisabilitasV, 
                        rtDomisiliV, rwDomisiliV, provinsiDomisiliV, kecamatanDomisiliV, kelurahanDomisiliV, stsMobilV, njopV, 
                        stsSumberAir, rataPenghasilanV, idUserV);
                    listPendaftar.add(pendaftar);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR : "+e.getMessage(), "Retrive Muskel", JOptionPane.ERROR_MESSAGE);
        }finally{
            if (stat != null) {
                stat.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
