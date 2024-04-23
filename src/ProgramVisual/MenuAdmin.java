package ProgramVisual;

import entity.KaryawanEntity;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuAdmin extends javax.swing.JFrame {
    int xx, xy;
    public static KaryawanEntity karyawan;
    
    public MenuAdmin() {
        initComponents();
        
        setTitle("Data Anggota");

        setResizable(false);
        setLocationRelativeTo(null);
        Image icon2 = Toolkit.getDefaultToolkit().getImage("jkt.png");  
        setIconImage(icon2);
        
        execute();
    }
    
    public MenuAdmin(KaryawanEntity karyawan) {
        initComponents();
        this.karyawan = karyawan;
        setTitle("Data Anggota");

        setResizable(false);
        setLocationRelativeTo(null);
        Image icon2 = Toolkit.getDefaultToolkit().getImage("jkt.png");  
        setIconImage(icon2);
        execute();
        if (karyawan != null) {
            lblNamaPetugas.setText(karyawan.getNama());
            lblRole.setText(karyawan.getRole());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_navbar = new Function.PanelRound();
        bg21 = new Function.bg2();
        jLabel4 = new javax.swing.JLabel();
        lblNamaPetugas = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        pn_sidebar = new Function.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menu = new Function.PanelRound();
        pn_content = new Function.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(227, 245, 245));

        pn_navbar.setBackground(new java.awt.Color(45, 105, 141));

        bg21.setBackground(new java.awt.Color(45, 105, 141));
        bg21.setMinimumSize(new java.awt.Dimension(50, 50));
        bg21.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout bg21Layout = new javax.swing.GroupLayout(bg21);
        bg21.setLayout(bg21Layout);
        bg21Layout.setHorizontalGroup(
            bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bg21Layout.setVerticalGroup(
            bg21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DTKS");

        lblNamaPetugas.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNamaPetugas.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaPetugas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNamaPetugas.setText("Nama Admin");

        lblRole.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("ROLE ADMIN");

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bg21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNamaPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bg21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_navbarLayout.createSequentialGroup()
                        .addComponent(lblNamaPetugas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRole)))
                .addContainerGap())
        );

        pn_sidebar.setBackground(new java.awt.Color(227, 245, 245));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(400, 400));

        jScrollPane1.setBackground(new java.awt.Color(227, 245, 245));
        jScrollPane1.setBorder(null);

        pn_menu.setBackground(new java.awt.Color(227, 245, 245));
        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_menu);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        pn_content.setBackground(new java.awt.Color(255, 255, 255));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_contentLayout.createSequentialGroup()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pn_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pn_navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pn_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(96, Short.MAX_VALUE))
                    .addComponent(pn_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx , y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_utama.add(new content_bg());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Function.bg2 bg21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNamaPetugas;
    private javax.swing.JLabel lblRole;
    private Function.PanelRound pn_content;
    private Function.PanelRound pn_menu;
    private Function.PanelRound pn_navbar;
    private Function.PanelRound pn_sidebar;
    public static final Function.PanelRound pn_utama = new Function.PanelRound();
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon iconList = new ImageIcon(getClass().getResource("/Gambar/icons8_list_32px.png"));
        ImageIcon iconInput = new ImageIcon(getClass().getResource("/Gambar/icons8_input_32px.png"));
        ImageIcon iconUser = new ImageIcon(getClass().getResource("/Gambar/icons8_user_32px_1.png"));
        ImageIcon iconSetting = new ImageIcon(getClass().getResource("/Gambar/icons8_gear_32px.png"));
        ImageIcon iconKey = new ImageIcon(getClass().getResource("/Gambar/icons8_key_32px.png"));
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/Gambar/icons8_logout_32px_1.png"));

        menuItem listAnggota = new menuItem(null, true, iconList, "Create Muskel", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new CreateMuskel());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });

        menuItem bikinAkun = new menuItem(null, true, iconUser, "Data Account", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new CreateKaryawan());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
                
        menuItem pengaturanAkun = new menuItem(null, true, iconUser, "Pengaturan Akun", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new PengaturanAkun(karyawan));
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        
        menuItem logoutAkun = new menuItem(null, true, iconLogout, "Keluar Akun", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new content_bg());
                pn_utama.repaint();
                pn_utama.revalidate();
                JOptionPane.showMessageDialog(null, "Berhasil Keluar Akun");
                dispose();
                new Login().setVisible(true);
            }
        });
                
        menuItem dataAnggota = new menuItem(iconUser, false, null, "Akses Admin", null, listAnggota, bikinAkun);
        menuItem pengaturan = new menuItem(iconSetting, false, null, "Pengaturan", null, pengaturanAkun, logoutAkun);

        addMenu(dataAnggota, pengaturan);

    }
    
    private void addMenu(menuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pn_menu.add(menu[i]);
            ArrayList<menuItem> subMenu = menu[i].getSubMenu();
            for (menuItem m : subMenu) {
                addMenu(m);
            }
        }
        pn_menu.revalidate();
    }
}
