package ProgramVisual;

import static ProgramVisual.MenuPetugas.pn_utama;
import database.KaryawanDatabase;
import database.KoneksiDatabase;
import database.MuskelDatabase;
import database.PendaftarDatabase;
import database.UserDatabase;
import database.ValidasiMuskelDatabase;
import entity.MuskelEntity;
import helper.EditMuskelPendaftar;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.sql.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import table.TableCustom;

public class TableDataMuskel extends javax.swing.JPanel {
    private Connection connection;
    private MuskelEntity muskel;
    private  EditMuskelPendaftar edit = null;
    private DefaultTableModel model;
    private final Object[] HEADER_MODEL_TABEL = {
        "No", "NAMA LENGKAP", "NIK", "NO KK", "JENIS KELAMIN", "RT DOMISILI", 
        "RW DOMISILI", "KABUPATEN DOMISILI", "KECAMATAN DOMISILI", "KELURAHAN DOMISILI", "KETERANGAN", "ALASAN", "Dikerjakan Oleh"};

    public TableDataMuskel(MuskelEntity muskel) {
        initComponents();
        Locale locale = new Locale("id", "ID");
        Locale.setDefault(locale);
        this.muskel = muskel;
        if (this.muskel != null) {
            lblTitle.setText("DATA: "+muskel.getNama());
        }
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        dataTableMuskel();
        
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
        tableMuskel.getColumnModel().getColumn(0).setCellRenderer(renderer);
        tableMuskel.getColumnModel().getColumn(1).setCellRenderer(renderer);
       
        header();
        renderer();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelfilter = new Function.PanelRound();
        txtFilter = new javax.swing.JTextField();
        panelSearch = new Function.PanelRound();
        btnSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cbPilihan = new combobox.Combo_Box();
        cbSort = new combobox.Combo_Box();
        panelAction = new javax.swing.JPanel();
        btnEdit = new Function.PanelRound();
        lblEdit = new javax.swing.JLabel();
        btnDelete = new Function.PanelRound();
        lblDelete = new javax.swing.JLabel();
        btnBack = new Function.PanelRound();
        lblBack = new javax.swing.JLabel();
        tableScrollButton1 = new table.TableScrollButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMuskel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        background3.setBackground(new java.awt.Color(227, 245, 245));
        background3.setPreferredSize(new java.awt.Dimension(710, 659));

        panelTitle.setOpaque(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText("TABLE DATA MUSKEL");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelfilter.setBackground(new java.awt.Color(255, 255, 255));
        panelfilter.setPreferredSize(new java.awt.Dimension(340, 36));
        panelfilter.setRoundBottomLeft(20);
        panelfilter.setRoundBottomRight(20);
        panelfilter.setRoundTopLeft(20);
        panelfilter.setRoundTopRight(20);

        txtFilter.setEditable(false);
        txtFilter.setBackground(new java.awt.Color(0,0,0,0)
        );
        txtFilter.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtFilter.setForeground(new java.awt.Color(18, 111, 111));
        txtFilter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFilter.setText("Filter By");
        txtFilter.setBorder(null);

        javax.swing.GroupLayout panelfilterLayout = new javax.swing.GroupLayout(panelfilter);
        panelfilter.setLayout(panelfilterLayout);
        panelfilterLayout.setHorizontalGroup(
            panelfilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfilterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelfilterLayout.setVerticalGroup(
            panelfilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfilterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFilter)
                .addContainerGap())
        );

        panelSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSearch.setPreferredSize(new java.awt.Dimension(340, 36));
        panelSearch.setRoundBottomLeft(20);
        panelSearch.setRoundBottomRight(20);
        panelSearch.setRoundTopLeft(20);
        panelSearch.setRoundTopRight(20);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/magnifying-glass.png"))); // NOI18N
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        txtSearch.setBackground(new java.awt.Color(0,0,0,0)
        );
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(18, 111, 111));
        txtSearch.setText("Search");
        txtSearch.setBorder(null);
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch)
                .addContainerGap())
        );

        cbPilihan.setForeground(new java.awt.Color(18, 111, 111));
        cbPilihan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NIK", "PETUGAS", "KELURAHAN" }));
        cbPilihan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbSort.setForeground(new java.awt.Color(18, 111, 111));
        cbSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ASC", "DESC", " " }));
        cbSort.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

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
                .addComponent(lblEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
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
                .addComponent(lblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(panelActionLayout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelActionLayout.setVerticalGroup(
            panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        tableMuskel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableMuskel.setRowHeight(25);
        tableMuskel.getTableHeader().setReorderingAllowed(false);
        tableMuskel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMuskelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMuskel);

        tableScrollButton1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_report_file_30px_4.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout background3Layout = new javax.swing.GroupLayout(background3);
        background3.setLayout(background3Layout);
        background3Layout.setHorizontalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background3Layout.createSequentialGroup()
                        .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(tableScrollButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(background3Layout.createSequentialGroup()
                        .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, background3Layout.createSequentialGroup()
                                .addComponent(panelfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        background3Layout.setVerticalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background3Layout.createSequentialGroup()
                        .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)))
                .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background3Layout.createSequentialGroup()
                        .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(panelAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tableScrollButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            dataTableMuskel();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        String nik = txtSearch.getText();
        if(nik.equals("")){
            txtSearch.setText("Search");
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        String nik = txtSearch.getText();
        if(nik.equals("Search")){
            txtSearch.setText("");
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        dataTableMuskel();
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
        tableMuskel.getColumnModel().getColumn(0).setCellRenderer(renderer);
        tableMuskel.getColumnModel().getColumn(1).setCellRenderer(renderer);
        
        header();
        renderer();
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setBackground(colorHover(btnEdit.getBackground()));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setBackground(colorHover(btnEdit.getBackground()));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(colorHoverDelete(btnDelete.getBackground()));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(colorHoverDelete(btnDelete.getBackground()));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
         int isDelete = JOptionPane.showConfirmDialog(this, 
                    "Data Dengan Nik : "+edit.getNik()+" \nAkan DIHAPUS!", "Anda Yakin Ingin MengHapus nya ?", 
                    JOptionPane.YES_NO_CANCEL_OPTION);
         if (isDelete == 0) {
            String sql = "DELETE FROM validasi_muskel WHERE validasi_muskel.nik_pendaftar = ? AND validasi_muskel.id_muskel = ? ";
            PreparedStatement statement = null;
            try {
                connection = new KoneksiDatabase().connect();
                statement = connection.prepareStatement(sql);
                statement.setString(1, edit.getNik());
                statement.setInt(2, muskel.getId());
                int rs = statement.executeUpdate();
                if (rs != 0) {
                    JOptionPane.showMessageDialog(this, "Berhasil Menghapus Data!");
                    dataTableMuskel();
                }
            } catch (SQLException e) {
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(TableDataMuskel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(TableDataMuskel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void tableMuskelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMuskelMouseClicked
       int baris = tableMuskel.getSelectedRow();
        String nama = model.getValueAt(baris, 1).toString();
        String nik = model.getValueAt(baris, 2).toString();
        String noKk = model.getValueAt(baris, 3).toString();
        String kelurahanDom = model.getValueAt(baris, 9).toString();
        
       edit = new EditMuskelPendaftar(nama, nik, noKk, kelurahanDom, muskel);
    }//GEN-LAST:event_tableMuskelMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        if (edit != null) {
            FormMuskel formMuskel = new FormMuskel(muskel);
            formMuskel.getTxtSearchNIK().setText(edit.getNik());
            formMuskel.getTxtNik().setText(edit.getNik());
            formMuskel.getTxtNama().setText(edit.getNama());
            formMuskel.getTxtNoKK().setText(edit.getNoKk());
            formMuskel.getTxtKelurahanDom().setText(edit.getKelurahanDom());

            pn_utama.removeAll();
            pn_utama.add(formMuskel);
            pn_utama.repaint();
            pn_utama.revalidate();
        }else {
            JOptionPane.showMessageDialog(this, "Pilih Dahulu Data yang Ingin Di Edit!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditMouseClicked

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try{
            Connection con = new KoneksiDatabase().connect();
            String namaFile = "src/report/report_pendaftar.jasper";
            HashMap parameter = new HashMap();
            File report_file = new File(namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameter, con);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Gagal print Data" + err, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private Function.PanelRound btnBack;
    private Function.PanelRound btnDelete;
    private Function.PanelRound btnEdit;
    private javax.swing.JLabel btnSearch;
    private combobox.Combo_Box cbPilihan;
    private combobox.Combo_Box cbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelAction;
    private Function.PanelRound panelSearch;
    private javax.swing.JPanel panelTitle;
    private Function.PanelRound panelfilter;
    private javax.swing.JTable tableMuskel;
    private table.TableScrollButton tableScrollButton1;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void dataTableMuskel(){
        model = new DefaultTableModel(null, HEADER_MODEL_TABEL);
        tableMuskel.setModel(model);
        connection = new KoneksiDatabase().connect();
        Statement statemen = null;
        
        String pilihanSort = cbSort.getSelectedItem().toString();
        String pilihan = cbPilihan.getSelectedItem().toString();
        String tambahanQuery = "";
        String sortQuery = "";
        String search = "";

        if (!txtSearch.getText().equals("Search") && !txtSearch.getText().isEmpty() && !txtSearch.getText().equals("*")) {
            search = txtSearch.getText();
        }

        switch (pilihan) {
            case "NIK":
                tambahanQuery = " AND p." + PendaftarDatabase.NIK + " LIKE '%" + search + "%'";
                sortQuery = " ORDER BY p." + PendaftarDatabase.NIK;
                break;
            case "PETUGAS":
                tambahanQuery = " AND k." + KaryawanDatabase.NAMA + " LIKE '%" + search + "%'";
                sortQuery = " ORDER BY k." + KaryawanDatabase.NAMA;
                break;
            case "KELURAHAN":
                tambahanQuery = " AND p." + PendaftarDatabase.KELURAHAN_DOMISILI + " LIKE '%" + search + "%'";
                sortQuery = " ORDER BY p." + PendaftarDatabase.KELURAHAN_DOMISILI;
                break;
            default:
                sortQuery = " ORDER BY p." + PendaftarDatabase.NAMA_LENGKAP;
                break;
        }

        if (pilihanSort.equalsIgnoreCase("asc")) {
            sortQuery += " ASC";
        } else if (pilihanSort.equalsIgnoreCase("desc")) {
            sortQuery += " DESC";
        }

        String sql = "SELECT p." + PendaftarDatabase.NAMA_LENGKAP + ", p." + PendaftarDatabase.NIK + ", u." + UserDatabase.NO_KK + ", p." + PendaftarDatabase.JENIS_KELAMIN + ", "
                + "p." + PendaftarDatabase.RT_DOMISILI + ", p." + PendaftarDatabase.RW_DOMISILI + ", p." + PendaftarDatabase.KABUPATEN + ", p." + PendaftarDatabase.KECAMATAN_DOMISILI + ", "
                + "p." + PendaftarDatabase.KELURAHAN_DOMISILI + ", vm." + ValidasiMuskelDatabase.KETERANGAN + ", vm." + ValidasiMuskelDatabase.ALASAN + ", k." + KaryawanDatabase.NAMA + " "
                + "FROM " + ValidasiMuskelDatabase.TABLE_NAME + " vm, " + PendaftarDatabase.TABLE_NAME + " p, " + UserDatabase.TABLE_NAME + " u, " + KaryawanDatabase.TABLE_NAME + " k, " + MuskelDatabase.TABLE_NAME + " m "
                + "WHERE vm." + ValidasiMuskelDatabase.ID_MUSKEL + " = m." + MuskelDatabase.ID + " AND vm." + ValidasiMuskelDatabase.NO_PEGAWAI + " = "
                + "k." + KaryawanDatabase.NO_PEGAWAI + " AND vm." + ValidasiMuskelDatabase.NIK_PENDAFTAR + " = p." + PendaftarDatabase.NIK + " AND p." + PendaftarDatabase.ID_USER + " = u." + UserDatabase.ID
                + " AND vm." + ValidasiMuskelDatabase.ID_MUSKEL + " = " + muskel.getId()
                + tambahanQuery
                + sortQuery;

        try {
            statemen = connection.createStatement();
            ResultSet resultSet = statemen.executeQuery(sql);
            int no = 1;
            while (resultSet.next()) {
                String coll1 = ""+no;
                String coll2 = resultSet.getString(PendaftarDatabase.NAMA_LENGKAP);
                String coll3 = resultSet.getString(PendaftarDatabase.NIK);
                String coll4 = resultSet.getString(UserDatabase.NO_KK);
                String coll5 = resultSet.getString(PendaftarDatabase.JENIS_KELAMIN);
                String coll6 = resultSet.getString(PendaftarDatabase.RT_DOMISILI);
                String coll7 = resultSet.getString(PendaftarDatabase.RW_DOMISILI);
                String coll8 = resultSet.getString(PendaftarDatabase.KABUPATEN);
                String coll9 = resultSet.getString(PendaftarDatabase.KECAMATAN_DOMISILI);
                String coll10 = resultSet.getString(PendaftarDatabase.KELURAHAN_DOMISILI);
                String coll11 = resultSet.getString(ValidasiMuskelDatabase.KETERANGAN);
                String coll12 = resultSet.getString(ValidasiMuskelDatabase.ALASAN);
                String coll13 = resultSet.getString(KaryawanDatabase.NAMA);
                String[] data = {coll1, coll2, coll3, coll4, coll5, coll6, coll7, coll8, coll9, coll10, coll11, coll12, coll13};
                model.addRow(data);
                no++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "GAGAL MEMBUAT DATA TABLE : "+e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
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
