package component;

import ProgramVisual.FormMuskel;
import ProgramVisual.ListMenuMuskel;
import ProgramVisual.TableDataMuskel;
import static ProgramVisual.MenuPetugas.pn_utama;
import entity.KaryawanEntity;
import entity.MuskelEntity;
import javax.swing.JLabel;

public class ButtonMenuMuskel extends javax.swing.JPanel {
    private MuskelEntity muskel;

    public ButtonMenuMuskel(MuskelEntity muskel) {
        initComponents();
        if(muskel != null){
            this.muskel = muskel;
            txtNama.setText(muskel.getNama());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Function.PanelRound();
        txtNama = new javax.swing.JLabel();
        btnEdit = new javax.swing.JLabel();
        btnData = new javax.swing.JLabel();

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
        txtNama.setText("Nama Button Muskel");

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/edit.png"))); // NOI18N
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        btnData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/search.png"))); // NOI18N
        btnData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(btnData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnData, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btnDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new TableDataMuskel(muskel));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btnDataMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FormMuskel(muskel));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btnEditMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnData;
    private javax.swing.JLabel btnEdit;
    private Function.PanelRound panelRound1;
    private javax.swing.JLabel txtNama;
    // End of variables declaration//GEN-END:variables

    public JLabel getBtnData() {
        return btnData;
    }

    public JLabel getBtnEdit() {
        return btnEdit;
    }

    public JLabel getTxtNama() {
        return txtNama;
    }

}
