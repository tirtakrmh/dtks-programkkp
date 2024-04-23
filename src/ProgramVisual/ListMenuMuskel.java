package ProgramVisual;

import component.ButtonMenuMuskel;
import database.KoneksiDatabase;
import entity.MuskelEntity;
import java.sql.*;
import database.MuskelDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ListMenuMuskel extends javax.swing.JPanel {
    private final Connection connection = new KoneksiDatabase().connect();
    private final List<MuskelEntity> listMuskel = new ArrayList<>();
    
    public ListMenuMuskel() {
        initComponents();
        createListBtnMuskel();
        Locale locale = new Locale("id", "ID");
        Locale.setDefault(locale);
        repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelMuskel = new javax.swing.JPanel();

        background.setBackground(new java.awt.Color(227, 245, 245));

        panelTitle.setOpaque(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText("LIST MUSKEL 2023");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_report_file_30px_4.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMuskel.setOpaque(false);
        panelMuskel.setLayout(new java.awt.GridLayout(10, 1, 0, 4));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMuskel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMuskel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try{
            Connection connection = new KoneksiDatabase().connect();
            String namaFile = "src/report/report_muskel.jasper";
            HashMap parameter = new HashMap();
            File report_file = new File(namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameter, connection);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Gagal print Data" + err, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelMuskel;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables

    private void createListBtnMuskel(){
        try {
            retriveDataMusekl();
        } catch (SQLException ex) {
            Logger.getLogger(ListMenuMuskel.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (listMuskel != null) {
            for (MuskelEntity muskelEntity : listMuskel) {
                ButtonMenuMuskel btnMuskel = new ButtonMenuMuskel(muskelEntity);
                btnMuskel.setVisible(true);
                panelMuskel.add(btnMuskel);
            }
        }
    }
    
    private void retriveDataMusekl() throws SQLException{
        Statement stat = null;
        String sql = "SELECT * FROM "+MuskelDatabase.TABLE_NAME;
        try {
           stat = connection.createStatement();
           ResultSet result = stat.executeQuery(sql);
            while (result.next()) {                
                int id = result.getInt(MuskelDatabase.ID);
                String nama = result.getString(MuskelDatabase.NAMA);
                Date tglMulai = result.getDate(MuskelDatabase.TANGGAL_MULAI);
                Date tglAkhir = result.getDate(MuskelDatabase.TANGGAL_AKHIR);
                String dana = result.getString(MuskelDatabase.DANA);
                MuskelEntity muskel = new MuskelEntity(id, nama, tglMulai, tglAkhir, dana);
                listMuskel.add(muskel);
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
