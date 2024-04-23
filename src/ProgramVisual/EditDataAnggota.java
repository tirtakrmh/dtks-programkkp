package ProgramVisual;
import database.KoneksiDatabase;
import database.PendaftarDatabase;
import java.sql.Connection;
import java.sql.Date;
import entity.PendaftarEntity;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EditDataAnggota extends javax.swing.JPanel {
    Connection con = null;
    Statement st = null;

    public EditDataAnggota() {
        initComponents();
    }
    
    public EditDataAnggota(PendaftarEntity pendaftar) {
        initComponents();
        dataAnggota(pendaftar);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelLogin = new Function.PanelRound();
        judul2 = new javax.swing.JLabel();
        panelNomorHP = new Function.PanelRound();
        nohp = new javax.swing.JTextField();
        panelCombo = new Function.PanelRound();
        setStatus = new Combobox.Combobox();
        panelNik = new Function.PanelRound();
        addNik = new javax.swing.JTextField();
        panelNama = new Function.PanelRound();
        addName = new javax.swing.JTextField();
        panelStatusKawin = new Function.PanelRound();
        statusKawin = new Combobox.Combobox();
        panelIbu = new Function.PanelRound();
        ibuKandung = new javax.swing.JTextField();
        panelJenis = new Function.PanelRound();
        jenisKelamin = new Combobox.Combobox();
        panelPekerjaan = new Function.PanelRound();
        kerja = new Combobox.Combobox();
        btnSubmit = new Function.RoundButton();
        panelAlamat = new Function.PanelRound();
        alamat = new javax.swing.JTextField();
        panelRT = new Function.PanelRound();
        rt = new javax.swing.JTextField();
        panelRW = new Function.PanelRound();
        rw = new javax.swing.JTextField();
        panelProvinsi = new Function.PanelRound();
        provinsi = new javax.swing.JTextField();
        panelKabupaten = new Function.PanelRound();
        kabupaten = new javax.swing.JTextField();
        panelKecamatan = new Function.PanelRound();
        kecamatan = new javax.swing.JTextField();
        panelkelurahan = new Function.PanelRound();
        kelurahan = new javax.swing.JTextField();
        panelAgama = new Function.PanelRound();
        agama = new Combobox.Combobox();
        panelPendidikan = new Function.PanelRound();
        pendidikan = new Combobox.Combobox();
        panelGolongan = new Function.PanelRound();
        golonganDarah = new Combobox.Combobox();
        panelStatusHubungan = new Function.PanelRound();
        statusHubungan = new Combobox.Combobox();
        panelKewarganegara = new Function.PanelRound();
        kewarganegaraan = new javax.swing.JTextField();
        panelNamaAyah = new Function.PanelRound();
        namaayah = new javax.swing.JTextField();
        panelJenisDisabilitas = new Function.PanelRound();
        jenisdisabilitas = new Combobox.Combobox();
        judul1 = new javax.swing.JLabel();
        panelRTDomisili = new Function.PanelRound();
        rtdomisili = new javax.swing.JTextField();
        panelRWDomisili = new Function.PanelRound();
        rwdomisili = new javax.swing.JTextField();
        panelProvinsiDomisili = new Function.PanelRound();
        provinsiDomisili = new javax.swing.JTextField();
        panelKecamatanDomisili = new Function.PanelRound();
        kecamatanDomisili = new javax.swing.JTextField();
        panelKelurahanDomisili = new Function.PanelRound();
        kelurahanDomisili = new javax.swing.JTextField();
        panelMemilikiMobil = new Function.PanelRound();
        memilikimobil = new Combobox.Combobox();
        panelRumahTangga = new Function.PanelRound();
        rumahtangga = new Combobox.Combobox();
        panelSumber = new Function.PanelRound();
        sumberAir = new Combobox.Combobox();
        panelRata = new Function.PanelRound();
        ratapenghasilan = new javax.swing.JTextField();
        dateTglLahir = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(227, 245, 245));

        jPanel1.setBackground(new java.awt.Color(227, 245, 245));

        panelLogin.setBackground(new java.awt.Color(227, 245, 245));
        panelLogin.setToolTipText("");
        panelLogin.setPreferredSize(new java.awt.Dimension(735, 657));
        panelLogin.setLayout(null);

        judul2.setBackground(new java.awt.Color(102, 102, 102));
        judul2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        judul2.setForeground(new java.awt.Color(102, 102, 102));
        judul2.setText("Informasi Alamat Domisili  [ Edit Data ]");
        panelLogin.add(judul2);
        judul2.setBounds(20, 370, 280, 20);

        panelNomorHP.setBackground(new java.awt.Color(255, 255, 255));
        panelNomorHP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelNomorHP.setRoundBottomLeft(20);
        panelNomorHP.setRoundBottomRight(20);
        panelNomorHP.setRoundTopLeft(20);
        panelNomorHP.setRoundTopRight(20);

        nohp.setText("Nomor HP");
        nohp.setBorder(null);
        nohp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nohpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nohpFocusLost(evt);
            }
        });
        nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNomorHPLayout = new javax.swing.GroupLayout(panelNomorHP);
        panelNomorHP.setLayout(panelNomorHPLayout);
        panelNomorHPLayout.setHorizontalGroup(
            panelNomorHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomorHPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelNomorHPLayout.setVerticalGroup(
            panelNomorHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNomorHPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelNomorHP);
        panelNomorHP.setBounds(490, 240, 200, 30);

        panelCombo.setBackground(new java.awt.Color(255, 255, 255));
        panelCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelCombo.setRoundBottomLeft(20);
        panelCombo.setRoundBottomRight(20);
        panelCombo.setRoundTopLeft(20);
        panelCombo.setRoundTopRight(20);

        setStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kepala Keluarga", "Anggota Keluarga" }));
        setStatus.setMinimumSize(new java.awt.Dimension(126, 30));
        setStatus.setPreferredSize(new java.awt.Dimension(126, 30));

        javax.swing.GroupLayout panelComboLayout = new javax.swing.GroupLayout(panelCombo);
        panelCombo.setLayout(panelComboLayout);
        panelComboLayout.setHorizontalGroup(
            panelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComboLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelComboLayout.setVerticalGroup(
            panelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelLogin.add(panelCombo);
        panelCombo.setBounds(20, 40, 200, 30);

        panelNik.setBackground(new java.awt.Color(255, 255, 255));
        panelNik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelNik.setRoundBottomLeft(20);
        panelNik.setRoundBottomRight(20);
        panelNik.setRoundTopLeft(20);
        panelNik.setRoundTopRight(20);

        addNik.setText("NIK");
        addNik.setBorder(null);
        addNik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addNikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addNikFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelNikLayout = new javax.swing.GroupLayout(panelNik);
        panelNik.setLayout(panelNikLayout);
        panelNikLayout.setHorizontalGroup(
            panelNikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNikLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addNik, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelNikLayout.setVerticalGroup(
            panelNikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNikLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addNik, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelNik);
        panelNik.setBounds(20, 80, 201, 30);

        panelNama.setBackground(new java.awt.Color(255, 255, 255));
        panelNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelNama.setRoundBottomLeft(20);
        panelNama.setRoundBottomRight(20);
        panelNama.setRoundTopLeft(20);
        panelNama.setRoundTopRight(20);

        addName.setText("NAMA LENGKAP");
        addName.setBorder(null);
        addName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addNameFocusLost(evt);
            }
        });
        addName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNamaLayout = new javax.swing.GroupLayout(panelNama);
        panelNama.setLayout(panelNamaLayout);
        panelNamaLayout.setHorizontalGroup(
            panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelNamaLayout.setVerticalGroup(
            panelNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelNama);
        panelNama.setBounds(20, 120, 200, 30);

        panelStatusKawin.setBackground(new java.awt.Color(255, 255, 255));
        panelStatusKawin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelStatusKawin.setRoundBottomLeft(20);
        panelStatusKawin.setRoundBottomRight(20);
        panelStatusKawin.setRoundTopLeft(20);
        panelStatusKawin.setRoundTopRight(20);

        statusKawin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kawin", "Belum Kawin" }));

        javax.swing.GroupLayout panelStatusKawinLayout = new javax.swing.GroupLayout(panelStatusKawin);
        panelStatusKawin.setLayout(panelStatusKawinLayout);
        panelStatusKawinLayout.setHorizontalGroup(
            panelStatusKawinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusKawinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusKawin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelStatusKawinLayout.setVerticalGroup(
            panelStatusKawinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusKawin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(panelStatusKawin);
        panelStatusKawin.setBounds(20, 200, 196, 30);

        panelIbu.setBackground(new java.awt.Color(255, 255, 255));
        panelIbu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelIbu.setRoundBottomLeft(20);
        panelIbu.setRoundBottomRight(20);
        panelIbu.setRoundTopLeft(20);
        panelIbu.setRoundTopRight(20);

        ibuKandung.setText("NAMA IBU KANDUNG");
        ibuKandung.setBorder(null);
        ibuKandung.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ibuKandungFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ibuKandungFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelIbuLayout = new javax.swing.GroupLayout(panelIbu);
        panelIbu.setLayout(panelIbuLayout);
        panelIbuLayout.setHorizontalGroup(
            panelIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIbuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ibuKandung, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelIbuLayout.setVerticalGroup(
            panelIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIbuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ibuKandung, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelIbu);
        panelIbu.setBounds(20, 240, 200, 30);

        panelJenis.setBackground(new java.awt.Color(255, 255, 255));
        panelJenis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelJenis.setRoundBottomLeft(20);
        panelJenis.setRoundBottomRight(20);
        panelJenis.setRoundTopLeft(20);
        panelJenis.setRoundTopRight(20);

        jenisKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-Laki", "Perempuan" }));

        javax.swing.GroupLayout panelJenisLayout = new javax.swing.GroupLayout(panelJenis);
        panelJenis.setLayout(panelJenisLayout);
        panelJenisLayout.setHorizontalGroup(
            panelJenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJenisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelJenisLayout.setVerticalGroup(
            panelJenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jenisKelamin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(panelJenis);
        panelJenis.setBounds(20, 280, 196, 30);

        panelPekerjaan.setBackground(new java.awt.Color(255, 255, 255));
        panelPekerjaan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelPekerjaan.setRoundBottomLeft(20);
        panelPekerjaan.setRoundBottomRight(20);
        panelPekerjaan.setRoundTopLeft(20);
        panelPekerjaan.setRoundTopRight(20);

        kerja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Belum/ Tidak Bekerja", "EMPUAN", "Pelajar/ Mahasiswa", "Pensiunan", "Pewagai Negeri Sipil", "Tentara Nasional Indonesia", "Kepolisisan RI", "Perdagangan", "Petani/ Pekebun", "Peternak", "Nelayan/ Perikanan", "Industri", "Konstruksi", "Transportasi", "Karyawan Swasta", "Karyawan BUMN", "Karyawan BUMD", "Karyawan Honorer", "Buruh Harian Lepas", "Buruh Tani/ Perkebunan", "Buruh Nelayan/ Perikanan", "Buruh Peternakan", "Pembantu Rumah Tangga", "Tukang Cukur", "Tukang Listrik", "Tukang Batu", "Tukang Kayu", "Tukang Sol Sepatu", "Tukang Las/ Pandai Besi", "Tukang Jahit", "Tukang Gigi", "Penata Rias", "Penata Busana", "Penata Rambut", "Mekanik", "Seniman", "Tabib", "Paraji", "Perancang Busana", "Penterjemah", "Imam Masjid", "Pendeta", "Pastor", "Wartawan", "Ustadz/ Mubaligh", "Juru Masak", "Promotor Acara", "Anggota DPR-RI", "Anggota DPD", "Anggota BPK", "Presiden", "Wakil Presiden", "Anggota Mahkamah Konstitusi", "Anggota Kabinet/ Kementerian", "Duta Besar", "Gubernur", "Wakil Gubernur", "Bupati", "Wakil Bupati", "Walikota", "Wakil Walikota", "Anggota DPRD Provinsi", "Anggota DPRD Kabupaten/ Kota", "Dosen", "Guru", "Pilot", "Pengacara", "Notaris", "Arsitek", "Akuntan", "Konsultan", "Dokter", "Bidan", "Perawat", "Apoteker", "Psikiater/ Psikolog", "Penyiar Televisi", "Penyiar Radio", "Pelaut", "Peneliti", "Sopir", "Pialang", "Paranormal", "Pedagang", "Perangkat Desa", "Kepala Desa", "Biarawati", "Wiraswasta", "" }));

        javax.swing.GroupLayout panelPekerjaanLayout = new javax.swing.GroupLayout(panelPekerjaan);
        panelPekerjaan.setLayout(panelPekerjaanLayout);
        panelPekerjaanLayout.setHorizontalGroup(
            panelPekerjaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPekerjaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kerja, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelPekerjaanLayout.setVerticalGroup(
            panelPekerjaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kerja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(panelPekerjaan);
        panelPekerjaan.setBounds(20, 320, 200, 30);

        btnSubmit.setBackground(new java.awt.Color(45, 105, 141));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorderColor(new java.awt.Color(45, 105, 141));
        btnSubmit.setColor(new java.awt.Color(45, 105, 141));
        btnSubmit.setColorClick(new java.awt.Color(45, 105, 141));
        btnSubmit.setColorOver(new java.awt.Color(45, 105, 141));
        btnSubmit.setRadius(10);
        btnSubmit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnSubmitMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSubmitMouseMoved(evt);
            }
        });
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSubmitMousePressed(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        btnSubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSubmitKeyPressed(evt);
            }
        });
        panelLogin.add(btnSubmit);
        btnSubmit.setBounds(330, 590, 80, 30);

        panelAlamat.setBackground(new java.awt.Color(255, 255, 255));
        panelAlamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelAlamat.setRoundBottomLeft(20);
        panelAlamat.setRoundBottomRight(20);
        panelAlamat.setRoundTopLeft(20);
        panelAlamat.setRoundTopRight(20);

        alamat.setText("Alamat KTP");
        alamat.setBorder(null);
        alamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                alamatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                alamatFocusLost(evt);
            }
        });
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAlamatLayout = new javax.swing.GroupLayout(panelAlamat);
        panelAlamat.setLayout(panelAlamatLayout);
        panelAlamatLayout.setHorizontalGroup(
            panelAlamatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlamatLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelAlamatLayout.setVerticalGroup(
            panelAlamatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlamatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelAlamat);
        panelAlamat.setBounds(260, 40, 200, 30);

        panelRT.setBackground(new java.awt.Color(255, 255, 255));
        panelRT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelRT.setRoundBottomLeft(20);
        panelRT.setRoundBottomRight(20);
        panelRT.setRoundTopLeft(20);
        panelRT.setRoundTopRight(20);

        rt.setText("RT");
        rt.setBorder(null);
        rt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRTLayout = new javax.swing.GroupLayout(panelRT);
        panelRT.setLayout(panelRTLayout);
        panelRTLayout.setHorizontalGroup(
            panelRTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRTLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelRTLayout.setVerticalGroup(
            panelRTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRTLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelRT);
        panelRT.setBounds(260, 80, 200, 30);

        panelRW.setBackground(new java.awt.Color(255, 255, 255));
        panelRW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelRW.setRoundBottomLeft(20);
        panelRW.setRoundBottomRight(20);
        panelRW.setRoundTopLeft(20);
        panelRW.setRoundTopRight(20);

        rw.setText("RW");
        rw.setBorder(null);
        rw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rwFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rwFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRWLayout = new javax.swing.GroupLayout(panelRW);
        panelRW.setLayout(panelRWLayout);
        panelRWLayout.setHorizontalGroup(
            panelRWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRWLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rw, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelRWLayout.setVerticalGroup(
            panelRWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRWLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelRW);
        panelRW.setBounds(260, 120, 200, 30);

        panelProvinsi.setBackground(new java.awt.Color(255, 255, 255));
        panelProvinsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelProvinsi.setRoundBottomLeft(20);
        panelProvinsi.setRoundBottomRight(20);
        panelProvinsi.setRoundTopLeft(20);
        panelProvinsi.setRoundTopRight(20);

        provinsi.setText("DKI JAKARTA");
        provinsi.setBorder(null);
        provinsi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                provinsiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                provinsiFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelProvinsiLayout = new javax.swing.GroupLayout(panelProvinsi);
        panelProvinsi.setLayout(panelProvinsiLayout);
        panelProvinsiLayout.setHorizontalGroup(
            panelProvinsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProvinsiLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelProvinsiLayout.setVerticalGroup(
            panelProvinsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProvinsiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelProvinsi);
        panelProvinsi.setBounds(260, 160, 200, 30);

        panelKabupaten.setBackground(new java.awt.Color(255, 255, 255));
        panelKabupaten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelKabupaten.setRoundBottomLeft(20);
        panelKabupaten.setRoundBottomRight(20);
        panelKabupaten.setRoundTopLeft(20);
        panelKabupaten.setRoundTopRight(20);

        kabupaten.setText("KABUPATEN");
        kabupaten.setBorder(null);
        kabupaten.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kabupatenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kabupatenFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelKabupatenLayout = new javax.swing.GroupLayout(panelKabupaten);
        panelKabupaten.setLayout(panelKabupatenLayout);
        panelKabupatenLayout.setHorizontalGroup(
            panelKabupatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKabupatenLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelKabupatenLayout.setVerticalGroup(
            panelKabupatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKabupatenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelKabupaten);
        panelKabupaten.setBounds(260, 200, 200, 30);

        panelKecamatan.setBackground(new java.awt.Color(255, 255, 255));
        panelKecamatan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelKecamatan.setRoundBottomLeft(20);
        panelKecamatan.setRoundBottomRight(20);
        panelKecamatan.setRoundTopLeft(20);
        panelKecamatan.setRoundTopRight(20);

        kecamatan.setText("KECAMATAN");
        kecamatan.setBorder(null);
        kecamatan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kecamatanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kecamatanFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelKecamatanLayout = new javax.swing.GroupLayout(panelKecamatan);
        panelKecamatan.setLayout(panelKecamatanLayout);
        panelKecamatanLayout.setHorizontalGroup(
            panelKecamatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKecamatanLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelKecamatanLayout.setVerticalGroup(
            panelKecamatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKecamatanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelKecamatan);
        panelKecamatan.setBounds(260, 240, 200, 30);

        panelkelurahan.setBackground(new java.awt.Color(255, 255, 255));
        panelkelurahan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelkelurahan.setRoundBottomLeft(20);
        panelkelurahan.setRoundBottomRight(20);
        panelkelurahan.setRoundTopLeft(20);
        panelkelurahan.setRoundTopRight(20);

        kelurahan.setText("KELURAHAN");
        kelurahan.setBorder(null);
        kelurahan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kelurahanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kelurahanFocusLost(evt);
            }
        });
        kelurahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelurahanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelkelurahanLayout = new javax.swing.GroupLayout(panelkelurahan);
        panelkelurahan.setLayout(panelkelurahanLayout);
        panelkelurahanLayout.setHorizontalGroup(
            panelkelurahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkelurahanLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelkelurahanLayout.setVerticalGroup(
            panelkelurahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelkelurahanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelkelurahan);
        panelkelurahan.setBounds(260, 280, 200, 30);

        panelAgama.setBackground(new java.awt.Color(255, 255, 255));
        panelAgama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelAgama.setRoundBottomLeft(20);
        panelAgama.setRoundBottomRight(20);
        panelAgama.setRoundTopLeft(20);
        panelAgama.setRoundTopRight(20);

        agama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Kristen ( Protestan )", "Hindu", "Buddha", "Katolik", "Konghucu" }));

        javax.swing.GroupLayout panelAgamaLayout = new javax.swing.GroupLayout(panelAgama);
        panelAgama.setLayout(panelAgamaLayout);
        panelAgamaLayout.setHorizontalGroup(
            panelAgamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelAgamaLayout.setVerticalGroup(
            panelAgamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(panelAgama);
        panelAgama.setBounds(260, 320, 200, 30);

        panelPendidikan.setBackground(new java.awt.Color(255, 255, 255));
        panelPendidikan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelPendidikan.setRoundBottomLeft(20);
        panelPendidikan.setRoundBottomRight(20);
        panelPendidikan.setRoundTopLeft(20);
        panelPendidikan.setRoundTopRight(20);

        pendidikan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIDAK / BELUM SEKOLAH", "BELUM TAMAT SD/SEDERAJAT", "TAMAT SD / SEDERAJAT", "SLTA / SEDERAJAT", "SLTP/SEDERAJAT", "DIPLOMA I / II", "AKADEMI/ DIPLOMA III/S. MUDA", "DIPLOMA IV/ STRATA I", "STRATA II", "STRATA III", "" }));

        javax.swing.GroupLayout panelPendidikanLayout = new javax.swing.GroupLayout(panelPendidikan);
        panelPendidikan.setLayout(panelPendidikanLayout);
        panelPendidikanLayout.setHorizontalGroup(
            panelPendidikanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPendidikanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelPendidikanLayout.setVerticalGroup(
            panelPendidikanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pendidikan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(panelPendidikan);
        panelPendidikan.setBounds(490, 40, 200, 30);

        panelGolongan.setBackground(new java.awt.Color(255, 255, 255));
        panelGolongan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelGolongan.setRoundBottomLeft(20);
        panelGolongan.setRoundBottomRight(20);
        panelGolongan.setRoundTopLeft(20);
        panelGolongan.setRoundTopRight(20);

        golonganDarah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Golongan Darah", "A", "AB", "B", "O", "" }));
        golonganDarah.setToolTipText("Gol Darah");

        javax.swing.GroupLayout panelGolonganLayout = new javax.swing.GroupLayout(panelGolongan);
        panelGolongan.setLayout(panelGolonganLayout);
        panelGolonganLayout.setHorizontalGroup(
            panelGolonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGolonganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(golonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelGolonganLayout.setVerticalGroup(
            panelGolonganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGolonganLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(golonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelGolongan);
        panelGolongan.setBounds(490, 80, 200, 30);

        panelStatusHubungan.setBackground(new java.awt.Color(255, 255, 255));
        panelStatusHubungan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelStatusHubungan.setRoundBottomLeft(20);
        panelStatusHubungan.setRoundBottomRight(20);
        panelStatusHubungan.setRoundTopLeft(20);
        panelStatusHubungan.setRoundTopRight(20);

        statusHubungan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anak", "Istri", "Suami" }));
        statusHubungan.setToolTipText("Gol Darah");

        javax.swing.GroupLayout panelStatusHubunganLayout = new javax.swing.GroupLayout(panelStatusHubungan);
        panelStatusHubungan.setLayout(panelStatusHubunganLayout);
        panelStatusHubunganLayout.setHorizontalGroup(
            panelStatusHubunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusHubunganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusHubungan, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelStatusHubunganLayout.setVerticalGroup(
            panelStatusHubunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatusHubunganLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statusHubungan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelStatusHubungan);
        panelStatusHubungan.setBounds(490, 120, 200, 30);

        panelKewarganegara.setBackground(new java.awt.Color(255, 255, 255));
        panelKewarganegara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelKewarganegara.setRoundBottomLeft(20);
        panelKewarganegara.setRoundBottomRight(20);
        panelKewarganegara.setRoundTopLeft(20);
        panelKewarganegara.setRoundTopRight(20);

        kewarganegaraan.setText("Kewarganegaraan");
        kewarganegaraan.setBorder(null);
        kewarganegaraan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kewarganegaraanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kewarganegaraanFocusLost(evt);
            }
        });
        kewarganegaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kewarganegaraanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKewarganegaraLayout = new javax.swing.GroupLayout(panelKewarganegara);
        panelKewarganegara.setLayout(panelKewarganegaraLayout);
        panelKewarganegaraLayout.setHorizontalGroup(
            panelKewarganegaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKewarganegaraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(kewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelKewarganegaraLayout.setVerticalGroup(
            panelKewarganegaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKewarganegaraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelKewarganegara);
        panelKewarganegara.setBounds(490, 160, 200, 30);

        panelNamaAyah.setBackground(new java.awt.Color(255, 255, 255));
        panelNamaAyah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelNamaAyah.setRoundBottomLeft(20);
        panelNamaAyah.setRoundBottomRight(20);
        panelNamaAyah.setRoundTopLeft(20);
        panelNamaAyah.setRoundTopRight(20);

        namaayah.setText("Nama Ayah");
        namaayah.setBorder(null);
        namaayah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaayahFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaayahFocusLost(evt);
            }
        });
        namaayah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaayahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNamaAyahLayout = new javax.swing.GroupLayout(panelNamaAyah);
        panelNamaAyah.setLayout(panelNamaAyahLayout);
        panelNamaAyahLayout.setHorizontalGroup(
            panelNamaAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaAyahLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(namaayah, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelNamaAyahLayout.setVerticalGroup(
            panelNamaAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaAyahLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(namaayah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelNamaAyah);
        panelNamaAyah.setBounds(490, 200, 200, 30);

        panelJenisDisabilitas.setBackground(new java.awt.Color(255, 255, 255));
        panelJenisDisabilitas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelJenisDisabilitas.setRoundBottomLeft(20);
        panelJenisDisabilitas.setRoundBottomRight(20);
        panelJenisDisabilitas.setRoundTopLeft(20);
        panelJenisDisabilitas.setRoundTopRight(20);

        jenisdisabilitas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tidak Disabilitas", "Tunanetra (Blind dan Low Vision)", "Tunarungu (Deaf dan Hearing loss)", "Tunagrahita (gangguan kecerdasan)", "Tunalaras ( Gangguan emosi dan perilaku)", "Autism-ADD-ADHD ( attention deficit hiperactivity disorder)", "Gifted and talent ( anak berbekat dan cerdas istimewa)", "Anak lambat belajar", "Anak gangguan komunikasi/wicara (speech disorder)", "Anak kesulitan belajar (learning disoder)", "Anak dengan gangguan jamak (tunaganda)" }));
        jenisdisabilitas.setToolTipText("Gol Darah");

        javax.swing.GroupLayout panelJenisDisabilitasLayout = new javax.swing.GroupLayout(panelJenisDisabilitas);
        panelJenisDisabilitas.setLayout(panelJenisDisabilitasLayout);
        panelJenisDisabilitasLayout.setHorizontalGroup(
            panelJenisDisabilitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJenisDisabilitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jenisdisabilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelJenisDisabilitasLayout.setVerticalGroup(
            panelJenisDisabilitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJenisDisabilitasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jenisdisabilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelJenisDisabilitas);
        panelJenisDisabilitas.setBounds(490, 280, 200, 30);

        judul1.setBackground(new java.awt.Color(102, 102, 102));
        judul1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        judul1.setForeground(new java.awt.Color(102, 102, 102));
        judul1.setText("Informasi Pendaftar [ Edit Data ]");
        panelLogin.add(judul1);
        judul1.setBounds(20, 14, 230, 20);

        panelRTDomisili.setBackground(new java.awt.Color(255, 255, 255));
        panelRTDomisili.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelRTDomisili.setRoundBottomLeft(20);
        panelRTDomisili.setRoundBottomRight(20);
        panelRTDomisili.setRoundTopLeft(20);
        panelRTDomisili.setRoundTopRight(20);

        rtdomisili.setText("RT Domisili");
        rtdomisili.setBorder(null);
        rtdomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rtdomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rtdomisiliFocusLost(evt);
            }
        });
        rtdomisili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtdomisiliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRTDomisiliLayout = new javax.swing.GroupLayout(panelRTDomisili);
        panelRTDomisili.setLayout(panelRTDomisiliLayout);
        panelRTDomisiliLayout.setHorizontalGroup(
            panelRTDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRTDomisiliLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rtdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelRTDomisiliLayout.setVerticalGroup(
            panelRTDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRTDomisiliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rtdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelRTDomisili);
        panelRTDomisili.setBounds(20, 400, 200, 30);

        panelRWDomisili.setBackground(new java.awt.Color(255, 255, 255));
        panelRWDomisili.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelRWDomisili.setRoundBottomLeft(20);
        panelRWDomisili.setRoundBottomRight(20);
        panelRWDomisili.setRoundTopLeft(20);
        panelRWDomisili.setRoundTopRight(20);

        rwdomisili.setText("RW Domisili");
        rwdomisili.setBorder(null);
        rwdomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rwdomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rwdomisiliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRWDomisiliLayout = new javax.swing.GroupLayout(panelRWDomisili);
        panelRWDomisili.setLayout(panelRWDomisiliLayout);
        panelRWDomisiliLayout.setHorizontalGroup(
            panelRWDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRWDomisiliLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rwdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelRWDomisiliLayout.setVerticalGroup(
            panelRWDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRWDomisiliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rwdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelRWDomisili);
        panelRWDomisili.setBounds(20, 440, 200, 30);

        panelProvinsiDomisili.setBackground(new java.awt.Color(255, 255, 255));
        panelProvinsiDomisili.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelProvinsiDomisili.setRoundBottomLeft(20);
        panelProvinsiDomisili.setRoundBottomRight(20);
        panelProvinsiDomisili.setRoundTopLeft(20);
        panelProvinsiDomisili.setRoundTopRight(20);

        provinsiDomisili.setText("DKI JAKARTA");
        provinsiDomisili.setBorder(null);
        provinsiDomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                provinsiDomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                provinsiDomisiliFocusLost(evt);
            }
        });
        provinsiDomisili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinsiDomisiliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProvinsiDomisiliLayout = new javax.swing.GroupLayout(panelProvinsiDomisili);
        panelProvinsiDomisili.setLayout(panelProvinsiDomisiliLayout);
        panelProvinsiDomisiliLayout.setHorizontalGroup(
            panelProvinsiDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProvinsiDomisiliLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(provinsiDomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelProvinsiDomisiliLayout.setVerticalGroup(
            panelProvinsiDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProvinsiDomisiliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(provinsiDomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelProvinsiDomisili);
        panelProvinsiDomisili.setBounds(20, 480, 200, 30);

        panelKecamatanDomisili.setBackground(new java.awt.Color(255, 255, 255));
        panelKecamatanDomisili.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelKecamatanDomisili.setRoundBottomLeft(20);
        panelKecamatanDomisili.setRoundBottomRight(20);
        panelKecamatanDomisili.setRoundTopLeft(20);
        panelKecamatanDomisili.setRoundTopRight(20);

        kecamatanDomisili.setText("Kecamatan Domisili");
        kecamatanDomisili.setBorder(null);
        kecamatanDomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kecamatanDomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kecamatanDomisiliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelKecamatanDomisiliLayout = new javax.swing.GroupLayout(panelKecamatanDomisili);
        panelKecamatanDomisili.setLayout(panelKecamatanDomisiliLayout);
        panelKecamatanDomisiliLayout.setHorizontalGroup(
            panelKecamatanDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKecamatanDomisiliLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kecamatanDomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelKecamatanDomisiliLayout.setVerticalGroup(
            panelKecamatanDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKecamatanDomisiliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kecamatanDomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelKecamatanDomisili);
        panelKecamatanDomisili.setBounds(20, 520, 200, 30);

        panelKelurahanDomisili.setBackground(new java.awt.Color(255, 255, 255));
        panelKelurahanDomisili.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelKelurahanDomisili.setRoundBottomLeft(20);
        panelKelurahanDomisili.setRoundBottomRight(20);
        panelKelurahanDomisili.setRoundTopLeft(20);
        panelKelurahanDomisili.setRoundTopRight(20);

        kelurahanDomisili.setText("Kelurahan Domisili");
        kelurahanDomisili.setBorder(null);
        kelurahanDomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kelurahanDomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kelurahanDomisiliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelKelurahanDomisiliLayout = new javax.swing.GroupLayout(panelKelurahanDomisili);
        panelKelurahanDomisili.setLayout(panelKelurahanDomisiliLayout);
        panelKelurahanDomisiliLayout.setHorizontalGroup(
            panelKelurahanDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKelurahanDomisiliLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kelurahanDomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelKelurahanDomisiliLayout.setVerticalGroup(
            panelKelurahanDomisiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKelurahanDomisiliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kelurahanDomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelKelurahanDomisili);
        panelKelurahanDomisili.setBounds(240, 400, 200, 30);

        panelMemilikiMobil.setBackground(new java.awt.Color(255, 255, 255));
        panelMemilikiMobil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelMemilikiMobil.setRoundBottomLeft(20);
        panelMemilikiMobil.setRoundBottomRight(20);
        panelMemilikiMobil.setRoundTopLeft(20);
        panelMemilikiMobil.setRoundTopRight(20);

        memilikimobil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rumah Memiliki Mobil", "Ya", "Tidak" }));

        javax.swing.GroupLayout panelMemilikiMobilLayout = new javax.swing.GroupLayout(panelMemilikiMobil);
        panelMemilikiMobil.setLayout(panelMemilikiMobilLayout);
        panelMemilikiMobilLayout.setHorizontalGroup(
            panelMemilikiMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemilikiMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memilikimobil, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMemilikiMobilLayout.setVerticalGroup(
            panelMemilikiMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memilikimobil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(panelMemilikiMobil);
        panelMemilikiMobil.setBounds(240, 440, 200, 30);

        panelRumahTangga.setBackground(new java.awt.Color(255, 255, 255));
        panelRumahTangga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelRumahTangga.setRoundBottomLeft(20);
        panelRumahTangga.setRoundBottomRight(20);
        panelRumahTangga.setRoundTopLeft(20);
        panelRumahTangga.setRoundTopRight(20);

        rumahtangga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APAKAH RUMAH TANGGA MEMILIKI TANAH/LAHAN (DENGAN NJOP DIATAS 1M) ?", "Ya", "Tidak" }));

        javax.swing.GroupLayout panelRumahTanggaLayout = new javax.swing.GroupLayout(panelRumahTangga);
        panelRumahTangga.setLayout(panelRumahTanggaLayout);
        panelRumahTanggaLayout.setHorizontalGroup(
            panelRumahTanggaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRumahTanggaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rumahtangga, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRumahTanggaLayout.setVerticalGroup(
            panelRumahTanggaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rumahtangga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(panelRumahTangga);
        panelRumahTangga.setBounds(240, 480, 200, 30);

        panelSumber.setBackground(new java.awt.Color(255, 255, 255));
        panelSumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelSumber.setRoundBottomLeft(20);
        panelSumber.setRoundBottomRight(20);
        panelSumber.setRoundTopLeft(20);
        panelSumber.setRoundTopRight(20);

        sumberAir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APAKAH SUMBER AIR UTAMA YANG DIGUNAKAN RUMAH TANGGA UNTUK MINUM ADALAH AIR KEMASAN GALON BERMERK (TIDAK TERMASUK AIR ISI ULANG) ?", "Ya", "Tidak" }));

        javax.swing.GroupLayout panelSumberLayout = new javax.swing.GroupLayout(panelSumber);
        panelSumber.setLayout(panelSumberLayout);
        panelSumberLayout.setHorizontalGroup(
            panelSumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSumberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sumberAir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSumberLayout.setVerticalGroup(
            panelSumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sumberAir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(panelSumber);
        panelSumber.setBounds(240, 520, 200, 30);

        panelRata.setBackground(new java.awt.Color(255, 255, 255));
        panelRata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        panelRata.setRoundBottomLeft(20);
        panelRata.setRoundBottomRight(20);
        panelRata.setRoundTopLeft(20);
        panelRata.setRoundTopRight(20);

        ratapenghasilan.setText("Rata Penghasilan");
        ratapenghasilan.setBorder(null);
        ratapenghasilan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ratapenghasilanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ratapenghasilanFocusLost(evt);
            }
        });
        ratapenghasilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratapenghasilanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRataLayout = new javax.swing.GroupLayout(panelRata);
        panelRata.setLayout(panelRataLayout);
        panelRataLayout.setHorizontalGroup(
            panelRataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ratapenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelRataLayout.setVerticalGroup(
            panelRataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ratapenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelLogin.add(panelRata);
        panelRata.setBounds(480, 400, 200, 30);
        panelLogin.add(dateTglLahir);
        dateTglLahir.setBounds(20, 160, 200, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nohpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nohpFocusGained
        String uname = nohp.getText();

        if(uname.equals("")||uname.equals("Nomor HP")){
            nohp.setText("");
        }
    }//GEN-LAST:event_nohpFocusGained

    private void nohpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nohpFocusLost
        String uname = nohp.getText();

        if(uname.equals("")||uname.equals("Nomor HP")){
            nohp.setText("Nomor HP");
        }
    }//GEN-LAST:event_nohpFocusLost

    private void nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohpActionPerformed

    private void addNikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addNikFocusGained
        String uname = addNik.getText();

        if(uname.equals("NIK")){
            addNik.setText("");
        }
    }//GEN-LAST:event_addNikFocusGained

    private void addNikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addNikFocusLost
        String uname = addNik.getText();

        if(uname.equals("")||uname.equals("NIK")){
            addNik.setText("NIK");
        }
    }//GEN-LAST:event_addNikFocusLost

    private void addNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addNameFocusGained
        String uname = addName.getText();

        if(uname.equals("NAMA LENGKAP")){
            addName.setText("");
        }
    }//GEN-LAST:event_addNameFocusGained

    private void addNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addNameFocusLost
        String uname = addName.getText();

        if(uname.equals("")||uname.equals("NAMA LENGKAP")){
            addName.setText("NAMA LENGKAP");
        }
    }//GEN-LAST:event_addNameFocusLost

    private void addNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNameActionPerformed

    private void ibuKandungFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ibuKandungFocusGained
        String uname = ibuKandung.getText();

        if(uname.equals("NAMA IBU KANDUNG")){
            ibuKandung.setText("");
        }
    }//GEN-LAST:event_ibuKandungFocusGained

    private void ibuKandungFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ibuKandungFocusLost
        String uname = ibuKandung.getText();

        if(uname.equals("")||uname.equals("NAMA IBU KANDUNG")){
            ibuKandung.setText("NAMA IBU KANDUNG");
        }
    }//GEN-LAST:event_ibuKandungFocusLost

    private void btnSubmitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseDragged

    }//GEN-LAST:event_btnSubmitMouseDragged

    private void btnSubmitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseMoved

    }//GEN-LAST:event_btnSubmitMouseMoved

    private void btnSubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMousePressed

    }//GEN-LAST:event_btnSubmitMousePressed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        updatePendaftar();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSubmitKeyPressed
        //        validasiLogin();
    }//GEN-LAST:event_btnSubmitKeyPressed

    private void alamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alamatFocusGained
        String uname = alamat.getText();

        if(uname.equals("Alamat KTP")){
            alamat.setText("");
        }
    }//GEN-LAST:event_alamatFocusGained

    private void alamatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alamatFocusLost
        String uname = alamat.getText();

        if(uname.equals("")||uname.equals("Alamat KTP")){
            alamat.setText("Alamat KTP");
        }
    }//GEN-LAST:event_alamatFocusLost

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void rtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rtFocusGained
        String uname = rt.getText();

        if(uname.equals("RT")){
            rt.setText("");
        }
    }//GEN-LAST:event_rtFocusGained

    private void rtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rtFocusLost
        String uname = rt.getText();

        if(uname.equals("")||uname.equals("RT")){
            rt.setText("RT");
        }
    }//GEN-LAST:event_rtFocusLost

    private void rwFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rwFocusGained
        String uname = rw.getText();

        if(uname.equals("RW")){
            rw.setText("");
        }
    }//GEN-LAST:event_rwFocusGained

    private void rwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rwFocusLost
        String uname = rw.getText();

        if(uname.equals("")||uname.equals("RW")){
            rw.setText("RW");
        }
    }//GEN-LAST:event_rwFocusLost

    private void provinsiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinsiFocusGained
        String uname = provinsi.getText();

        if(uname.equals("DKI JAKARTA")){
            provinsi.setText("");
        }
    }//GEN-LAST:event_provinsiFocusGained

    private void provinsiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinsiFocusLost
        String uname = provinsi.getText();

        if(uname.equals("")||uname.equals("DKI JAKARTA")){
            provinsi.setText("DKI JAKARTA");
        }
    }//GEN-LAST:event_provinsiFocusLost

    private void kabupatenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kabupatenFocusGained
        String uname = kabupaten.getText();

        if(uname.equals("")||uname.equals("KABUPATEN")){
            kabupaten.setText("");
        }
    }//GEN-LAST:event_kabupatenFocusGained

    private void kabupatenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kabupatenFocusLost
        String uname = kabupaten.getText();

        if(uname.equals("")||uname.equals("KABUPATEN")){
            kabupaten.setText("KABUPATEN");
        }
    }//GEN-LAST:event_kabupatenFocusLost

    private void kecamatanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kecamatanFocusGained
        String uname = kecamatan.getText();

        if(uname.equals("")||uname.equals("KECAMATAN")){
            kecamatan.setText("");
        }
    }//GEN-LAST:event_kecamatanFocusGained

    private void kecamatanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kecamatanFocusLost
        String uname = kecamatan.getText();

        if(uname.equals("")||uname.equals("KECAMATAN")){
            kecamatan.setText("KECAMATAN");
        }
    }//GEN-LAST:event_kecamatanFocusLost

    private void kelurahanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelurahanFocusGained
        String uname = kelurahan.getText();

        if(uname.equals("")||uname.equals("KELURAHAN")){
            kelurahan.setText("");
        }
    }//GEN-LAST:event_kelurahanFocusGained

    private void kelurahanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelurahanFocusLost
        String uname = kelurahan.getText();

        if(uname.equals("")||uname.equals("KELURAHAN")){
            kelurahan.setText("KELURAHAN");
        }
    }//GEN-LAST:event_kelurahanFocusLost

    private void kelurahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelurahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelurahanActionPerformed

    private void kewarganegaraanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kewarganegaraanFocusGained
        String uname = kewarganegaraan.getText();

        if(uname.equals("")||uname.equals("Kewarganegaraan")){
            kewarganegaraan.setText("");
        }
    }//GEN-LAST:event_kewarganegaraanFocusGained

    private void kewarganegaraanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kewarganegaraanFocusLost
        String uname = kewarganegaraan.getText();

        if(uname.equals("")||uname.equals("Kewarganegaraan")){
            kewarganegaraan.setText("Kewarganegaraan");
        }
    }//GEN-LAST:event_kewarganegaraanFocusLost

    private void kewarganegaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kewarganegaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kewarganegaraanActionPerformed

    private void namaayahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaayahFocusGained
        String uname = namaayah.getText();

        if(uname.equals("")||uname.equals("Nama Ayah")){
            namaayah.setText("");
        }
    }//GEN-LAST:event_namaayahFocusGained

    private void namaayahFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaayahFocusLost
        String uname = namaayah.getText();

        if(uname.equals("")||uname.equals("Nama Ayah")){
            namaayah.setText("Nama Ayah");
        }
    }//GEN-LAST:event_namaayahFocusLost

    private void namaayahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaayahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaayahActionPerformed

    private void rtdomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rtdomisiliFocusGained
        String uname = rtdomisili.getText();

        if(uname.equals("")||uname.equals("RT Domisili")){
            rtdomisili.setText("");
        }
    }//GEN-LAST:event_rtdomisiliFocusGained

    private void rtdomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rtdomisiliFocusLost
        String uname = rtdomisili.getText();

        if(uname.equals("")||uname.equals("RT Domisili")){
            rtdomisili.setText("RT Domisili");
        }
    }//GEN-LAST:event_rtdomisiliFocusLost

    private void rtdomisiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtdomisiliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rtdomisiliActionPerformed

    private void rwdomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rwdomisiliFocusGained
        String uname = rwdomisili.getText();

        if(uname.equals("")||uname.equals("RW Domisili")){
            rwdomisili.setText("");
        }
    }//GEN-LAST:event_rwdomisiliFocusGained

    private void rwdomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rwdomisiliFocusLost
        String uname = rwdomisili.getText();

        if(uname.equals("")||uname.equals("RW Domisili")){
            rwdomisili.setText("RW Domisili");
        }
    }//GEN-LAST:event_rwdomisiliFocusLost

    private void provinsiDomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinsiDomisiliFocusGained
        String uname = provinsiDomisili.getText();

        if(uname.equals("")||uname.equals("DKI JAKARTA")){
            provinsiDomisili.setText("");
        }
    }//GEN-LAST:event_provinsiDomisiliFocusGained

    private void provinsiDomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinsiDomisiliFocusLost
        String uname = provinsiDomisili.getText();

        if(uname.equals("")||uname.equals("Rata Penghasilan")){
            provinsiDomisili.setText("DKI JAKARTA");
        }
    }//GEN-LAST:event_provinsiDomisiliFocusLost

    private void provinsiDomisiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinsiDomisiliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsiDomisiliActionPerformed

    private void kecamatanDomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kecamatanDomisiliFocusGained
        String uname = kecamatanDomisili.getText();

        if(uname.equals("")||uname.equals("Kecamatan Domisili")){
            kecamatanDomisili.setText("");
        }
    }//GEN-LAST:event_kecamatanDomisiliFocusGained

    private void kecamatanDomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kecamatanDomisiliFocusLost
        String uname = kecamatanDomisili.getText();

        if(uname.equals("")||uname.equals("Kecamatan Domisili")){
            kecamatanDomisili.setText("Kecamatan Domisili");
        }
    }//GEN-LAST:event_kecamatanDomisiliFocusLost

    private void kelurahanDomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelurahanDomisiliFocusGained
        String uname = kelurahanDomisili.getText();

        if(uname.equals("")||uname.equals("Kelurahan Domisili")){
            kelurahanDomisili.setText("");
        }
    }//GEN-LAST:event_kelurahanDomisiliFocusGained

    private void kelurahanDomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelurahanDomisiliFocusLost
        String uname = kelurahanDomisili.getText();

        if(uname.equals("")||uname.equals("Kelurahan Domisili")){
            kelurahanDomisili.setText("Kelurahan Domisili");
        }
    }//GEN-LAST:event_kelurahanDomisiliFocusLost

    private void ratapenghasilanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ratapenghasilanFocusGained
        String uname = ratapenghasilan.getText();

        if(uname.equals("")||uname.equals("Rata Penghasilan")){
            ratapenghasilan.setText("");
        }
    }//GEN-LAST:event_ratapenghasilanFocusGained

    private void ratapenghasilanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ratapenghasilanFocusLost
        String uname = ratapenghasilan.getText();

        if(uname.equals("")||uname.equals("Rata Penghasilan")){
            ratapenghasilan.setText("Rata Penghasilan");
        }
    }//GEN-LAST:event_ratapenghasilanFocusLost

    private void ratapenghasilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratapenghasilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratapenghasilanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addName;
    private javax.swing.JTextField addNik;
    private Combobox.Combobox agama;
    private javax.swing.JTextField alamat;
    private Function.RoundButton btnSubmit;
    private com.toedter.calendar.JDateChooser dateTglLahir;
    private Combobox.Combobox golonganDarah;
    private javax.swing.JTextField ibuKandung;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Combobox.Combobox jenisKelamin;
    private Combobox.Combobox jenisdisabilitas;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JTextField kabupaten;
    private javax.swing.JTextField kecamatan;
    private javax.swing.JTextField kecamatanDomisili;
    private javax.swing.JTextField kelurahan;
    private javax.swing.JTextField kelurahanDomisili;
    private Combobox.Combobox kerja;
    private javax.swing.JTextField kewarganegaraan;
    private Combobox.Combobox memilikimobil;
    private javax.swing.JTextField namaayah;
    private javax.swing.JTextField nohp;
    private Function.PanelRound panelAgama;
    private Function.PanelRound panelAlamat;
    private Function.PanelRound panelCombo;
    private Function.PanelRound panelGolongan;
    private Function.PanelRound panelIbu;
    private Function.PanelRound panelJenis;
    private Function.PanelRound panelJenisDisabilitas;
    private Function.PanelRound panelKabupaten;
    private Function.PanelRound panelKecamatan;
    private Function.PanelRound panelKecamatanDomisili;
    private Function.PanelRound panelKelurahanDomisili;
    private Function.PanelRound panelKewarganegara;
    private Function.PanelRound panelLogin;
    private Function.PanelRound panelMemilikiMobil;
    private Function.PanelRound panelNama;
    private Function.PanelRound panelNamaAyah;
    private Function.PanelRound panelNik;
    private Function.PanelRound panelNomorHP;
    private Function.PanelRound panelPekerjaan;
    private Function.PanelRound panelPendidikan;
    private Function.PanelRound panelProvinsi;
    private Function.PanelRound panelProvinsiDomisili;
    private Function.PanelRound panelRT;
    private Function.PanelRound panelRTDomisili;
    private Function.PanelRound panelRW;
    private Function.PanelRound panelRWDomisili;
    private Function.PanelRound panelRata;
    private Function.PanelRound panelRumahTangga;
    private Function.PanelRound panelStatusHubungan;
    private Function.PanelRound panelStatusKawin;
    private Function.PanelRound panelSumber;
    private Function.PanelRound panelkelurahan;
    private Combobox.Combobox pendidikan;
    private javax.swing.JTextField provinsi;
    private javax.swing.JTextField provinsiDomisili;
    private javax.swing.JTextField ratapenghasilan;
    private javax.swing.JTextField rt;
    private javax.swing.JTextField rtdomisili;
    private Combobox.Combobox rumahtangga;
    private javax.swing.JTextField rw;
    private javax.swing.JTextField rwdomisili;
    private Combobox.Combobox setStatus;
    private Combobox.Combobox statusHubungan;
    private Combobox.Combobox statusKawin;
    private Combobox.Combobox sumberAir;
    // End of variables declaration//GEN-END:variables

    private void updatePendaftar(){
        String query = "UPDATE " + PendaftarDatabase.TABLE_NAME + " SET " +
        PendaftarDatabase.NIK + " = ?, " +
        PendaftarDatabase.NAMA_LENGKAP + " = ?, " +
        PendaftarDatabase.STATUS_KELUARGA + " = ?, " +
        PendaftarDatabase.TANGGAL_LAHIR + " = ?, " +
        PendaftarDatabase.STATUS_KAWIN + " = ?, " +
        PendaftarDatabase.NAMA_IBU + " = ?, " +
        PendaftarDatabase.JENIS_KELAMIN + " = ?, " +
        PendaftarDatabase.STATUS_KERJA + " = ?, " +
        PendaftarDatabase.ALAMAT + " = ?, " +
        PendaftarDatabase.RT + " = ?, " +
        PendaftarDatabase.RW + " = ?, " +
        PendaftarDatabase.PROVINSI + " = ?, " +
        PendaftarDatabase.KABUPATEN + " = ?, " +
        PendaftarDatabase.KECAMATAN + " = ?, " +
        PendaftarDatabase.KELURAHAN + " = ?, " +
        PendaftarDatabase.AGAMA + " = ?, " +
        PendaftarDatabase.PENDIDIKAN + " = ?, " +
        PendaftarDatabase.GOL_DAR + " = ?, " +
        PendaftarDatabase.STATUS_HUBUNGAN + " = ?, " +
        PendaftarDatabase.KEWARGANEGARAAN + " = ?, " +
        PendaftarDatabase.NAMA_AYAH + " = ?, " +
        PendaftarDatabase.NO_HP + " = ?, " +
        PendaftarDatabase.DISABILITAS + " = ?, " +
        PendaftarDatabase.RT_DOMISILI + " = ?, " +
        PendaftarDatabase.RW_DOMISILI + " = ?, " +
        PendaftarDatabase.PROVINSI_DOMISILI + " = ?, " +
        PendaftarDatabase.KECAMATAN_DOMISILI + " = ?, " +
        PendaftarDatabase.KELURAHAN_DOMISILI + " = ?, " +
        PendaftarDatabase.MOBIL + " = ?, " +
        PendaftarDatabase.NJOP + " = ?, " +
        PendaftarDatabase.SUMBER_AIR + " = ?, " +
        PendaftarDatabase.PENGHASILAN + " = ? " +
        "WHERE " + PendaftarDatabase.ID_USER + " = ?";
        
        String stsKeluargaV = setStatus.getSelectedItem().toString();
        String nikV = addNik.getText();
        String namaLengkapV = addName.getText();
        Date tanggalLahirV = new java.sql.Date(dateTglLahir.getDate().getTime());
        String stsKawinV = statusKawin.getSelectedItem().toString();
        String namaIbuV = ibuKandung.getText();
        String jnsKelaminV = jenisKelamin.getSelectedItem().toString();
        String kerjaV = kerja.getSelectedItem().toString();
        String almt = alamat.getText();
        String rtV = rt.getText();
        String rwV = rw.getText();
        String provinsiV = provinsi.getText();
        String kabupatenV = kabupaten.getText();
        String kecamatanV = kecamatan.getText();
        String kelurahanV = kelurahan.getText();
        String agamaV = agama.getSelectedItem().toString();
        String pendidikanV = pendidikan.getSelectedItem().toString();
        String golDarV = golonganDarah.getSelectedItem().toString();
        String stsHubunganV = statusHubungan.getSelectedItem().toString();
        String kewarganegaraanV = kewarganegaraan.getText();
        String namaAyahV = namaayah.getText();
        String noHPV = nohp.getText();
        String stsDisabilitasV = jenisdisabilitas.getSelectedItem().toString();
        String rtDomisiliV = rtdomisili.getText();
        String rwDomisiliV = rwdomisili.getText();
        String provinsiDomisiliV = provinsiDomisili.getText();
        String kecamatanDomisiliV = kecamatanDomisili.getText();
        String kelurahanDomisiliV= kelurahanDomisili.getText();
        String stsMobilV = memilikimobil.getSelectedItem().toString();
        String njopV = rumahtangga.getSelectedItem().toString();
        String stsSumberAir = sumberAir.getSelectedItem().toString();
        String rataPenghasilanV = ratapenghasilan.getText();
        
        if (stsKeluargaV != null && !stsKeluargaV.isEmpty() &&
            nikV != null && !nikV.isEmpty() &&
            namaLengkapV != null && !namaLengkapV.isEmpty() &&
            tanggalLahirV != null && 
            stsKawinV != null && !stsKawinV.isEmpty() &&
            namaIbuV != null && !namaIbuV.isEmpty() &&
            jnsKelaminV != null && !jnsKelaminV.isEmpty() &&
            kerjaV != null && !kerjaV.isEmpty() &&
            almt != null && !almt.isEmpty() &&
            rtV != null && !rtV.isEmpty() &&
            rwV != null && !rwV.isEmpty() &&
            provinsiV != null && !provinsiV.isEmpty() &&
            kabupatenV != null && !kabupatenV.isEmpty() &&
            kecamatanV != null && !kecamatanV.isEmpty() &&
            kelurahanV != null && !kelurahanV.isEmpty() &&
            agamaV != null && !agamaV.isEmpty() &&
            pendidikanV != null && !pendidikanV.isEmpty() &&
            golDarV != null && !golDarV.isEmpty() &&
            stsHubunganV != null && !stsHubunganV.isEmpty() &&
            kewarganegaraanV != null && !kewarganegaraanV.isEmpty() &&
            namaAyahV != null && !namaAyahV.isEmpty() &&
            noHPV != null && !noHPV.isEmpty() &&
            stsDisabilitasV != null && !stsDisabilitasV.isEmpty() &&
            rtDomisiliV != null && !rtDomisiliV.isEmpty() &&
            rwDomisiliV != null && !rwDomisiliV.isEmpty() &&
            provinsiDomisiliV != null && !provinsiDomisiliV.isEmpty() &&
            kecamatanDomisiliV != null && !kecamatanDomisiliV.isEmpty() &&
            kelurahanDomisiliV != null && !kelurahanDomisiliV.isEmpty() &&
            stsMobilV != null && !stsMobilV.isEmpty() &&
            njopV != null && !njopV.isEmpty() &&
            stsSumberAir != null && !stsSumberAir.isEmpty() &&
            rataPenghasilanV != null && !rataPenghasilanV.isEmpty()) {
                con = new KoneksiDatabase().connect();
                PreparedStatement preparedStatement = null;
                 try {
                    preparedStatement = con.prepareStatement(query);
                    preparedStatement.setString(1, nikV);
                    preparedStatement.setString(2, namaLengkapV);
                    preparedStatement.setString(3, stsKeluargaV);
                    preparedStatement.setDate(4, tanggalLahirV);
                    preparedStatement.setString(5, stsKawinV);
                    preparedStatement.setString(6, namaIbuV);
                    preparedStatement.setString(7, jnsKelaminV);
                    preparedStatement.setString(8, kerjaV);
                    preparedStatement.setString(9, almt);
                    preparedStatement.setInt(10, Integer.parseInt(rtV));
                    preparedStatement.setInt(11, Integer.parseInt(rwV));
                    preparedStatement.setString(12, provinsiV);
                    preparedStatement.setString(13, kabupatenV);
                    preparedStatement.setString(14, kecamatanV);
                    preparedStatement.setString(15, kelurahanV);
                    preparedStatement.setString(16, agamaV);
                    preparedStatement.setString(17, pendidikanV);
                    preparedStatement.setString(18, golDarV);
                    preparedStatement.setString(19, stsHubunganV);
                    preparedStatement.setString(20, kewarganegaraanV);
                    preparedStatement.setString(21, namaAyahV);
                    preparedStatement.setString(22, noHPV);
                    preparedStatement.setString(23, stsDisabilitasV);
                    preparedStatement.setInt(24, Integer.parseInt(rtDomisiliV));
                    preparedStatement.setInt(25, Integer.parseInt(rwDomisiliV));
                    preparedStatement.setString(26, provinsiDomisiliV);
                    preparedStatement.setString(27, kecamatanDomisiliV);
                    preparedStatement.setString(28, kelurahanDomisiliV);
                    preparedStatement.setString(29, stsMobilV);
                    preparedStatement.setString(30, njopV);
                    preparedStatement.setString(31, stsSumberAir);
                    preparedStatement.setInt(32, Integer.parseInt(rataPenghasilanV));
                    preparedStatement.setInt(33, MenuPendaftar.user.getId());

                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data Pendaftar dengan Nik :"+nikV+" berhasil DiUbah");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error update data into the table: "+ e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                } finally {
                    if (preparedStatement != null) {
                        try {
                            preparedStatement.close();
                        } catch (SQLException e) {
                            System.out.println("ERROR MENUTUP prepared statmant di method create pendaftar inputDataAnggota : "+e.getMessage());
                        }
                    }
                    if (con != null) {
                        try {
                            con.close();
                        } catch (SQLException e) {
                            System.out.println("ERROR MENUTUP connection di method create pendaftar inputDataAnggota : "+e.getMessage());
                        }
                    }
                }
            }
    }
    
    private void dataAnggota(PendaftarEntity pendaftar){
        if (pendaftar != null) {
            setStatus.setSelectedItem(pendaftar.getStatusKeluarga());
            addNik.setText(pendaftar.getNik());
            addName.setText(pendaftar.getNamaLengkap());
            dateTglLahir.setDate(pendaftar.getTanggalLahir());
            statusKawin.setSelectedItem(pendaftar.getStatusKawin());
            ibuKandung.setText(pendaftar.getNamaIbu());
            jenisKelamin.setSelectedItem(pendaftar.getJenisKelamin());
            kerja.setSelectedItem(pendaftar.getStatusKerja());
            alamat.setText(pendaftar.getAlamat());
            rt.setText(String.valueOf(pendaftar.getRt()));
            rw.setText(String.valueOf(pendaftar.getRw()));
            provinsi.setText(pendaftar.getProvinsi());
            kabupaten.setText(pendaftar.getKabupaten());
            kecamatan.setText(pendaftar.getKecamatan());
            kelurahan.setText(pendaftar.getKelurahan());
            agama.setSelectedItem(pendaftar.getAgama());
            pendidikan.setSelectedItem(pendaftar.getPendidikan());
            golonganDarah.setSelectedItem(pendaftar.getGolDar());
            statusHubungan.setSelectedItem(pendaftar.getStatusHubungan());
            kewarganegaraan.setText(pendaftar.getKewarganegaraan());
            namaayah.setText(pendaftar.getNamaAyah());
            nohp.setText(pendaftar.getNoHp());
            jenisdisabilitas.setSelectedItem(pendaftar.getDisabilitas());
            rtdomisili.setText(String.valueOf(pendaftar.getRtDomisili()));
            rwdomisili.setText(String.valueOf(pendaftar.getRwDomisili()));
            provinsiDomisili.setText(pendaftar.getProvinsiDomisili());
            kecamatanDomisili.setText(pendaftar.getKecamatanDomisili());
            kelurahanDomisili.setText(pendaftar.getKelurahanDomisili());
            memilikimobil.setSelectedItem(pendaftar.getMobil());
            rumahtangga.setSelectedItem(pendaftar.getNjop());
            sumberAir.setSelectedItem(pendaftar.getSumberAir());
            ratapenghasilan.setText(String.valueOf(pendaftar.getPenghasilan()));
        }
    }
    
}
