package ProgramVisual;

import static ProgramVisual.Login.txtpassword;
import static ProgramVisual.Login.txtusername;
import static ProgramVisual.MenuPendaftar.pn_utama;
import entity.PendaftarEntity;
import helper.Waktu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class InfoDataAnggota extends javax.swing.JPanel {
    private Connection conn = null;
    private Statement statment = null;

    public InfoDataAnggota() {
        initComponents();
    }
    
     public InfoDataAnggota(PendaftarEntity pendaftar) {
        initComponents();
         dataAnggota(pendaftar);
    }
    
    private void dataAnggota(PendaftarEntity pendaftar){
        if (pendaftar != null) {
            statusKeluarga.setText(pendaftar.getStatusKeluarga());
            statusKeluarga.setEditable(false);
            nik.setText(pendaftar.getNik());
            nik.setEditable(false);
            namaLengkap.setText(pendaftar.getNamaLengkap());
            namaLengkap.setEditable(false);
            tgllahir.setText(Waktu.dateParseToString(pendaftar.getTanggalLahir()));
            tgllahir.setEditable(false);
            statusKawin.setText(pendaftar.getStatusKawin());
            statusKawin.setEditable(false);
            namaIbuKandung.setText(pendaftar.getNamaIbu());
            namaIbuKandung.setEditable(false);
            jenisKelamin.setText(pendaftar.getJenisKelamin());
            jenisKelamin.setEditable(false);
            statusBekerja.setText(pendaftar.getStatusKerja());
            statusBekerja.setEditable(false);
            alamat.setText(pendaftar.getAlamat());
            alamat.setEditable(false);
            rt.setText(String.valueOf(pendaftar.getRt()));
            rt.setEditable(false);
            rw.setText(String.valueOf(pendaftar.getRw()));
            rw.setEditable(false);
            provinsi.setText(pendaftar.getProvinsi());
            provinsi.setEditable(false);
            kabupaten.setText(pendaftar.getKabupaten());
            kabupaten.setEditable(false);
            kecamatan.setText(pendaftar.getKecamatan());
            kecamatan.setEditable(false);
            kelurahan.setText(pendaftar.getKelurahan());
            kelurahan.setEditable(false);
            agama.setText(pendaftar.getAgama());
            agama.setEditable(false);
            statusSekolah.setText(pendaftar.getPendidikan());
            statusSekolah.setEditable(false);
            golongandarah.setText(pendaftar.getGolDar());
            golongandarah.setEditable(false);
            statusdalamkeluarga.setText(pendaftar.getStatusHubungan());
            statusdalamkeluarga.setEditable(false);
            kewarganegaraan.setText(pendaftar.getKewarganegaraan());
            kewarganegaraan.setEditable(false);
            namaayah.setText(pendaftar.getNamaAyah());
            namaayah.setEditable(false);
            nomorhp.setText(pendaftar.getNoHp());
            nomorhp.setEditable(false);
            syndrom.setText(pendaftar.getDisabilitas());
            syndrom.setEditable(false);
            rtdomisili.setText(String.valueOf(pendaftar.getRtDomisili()));
            rtdomisili.setEditable(false);
            rwdomisili.setText(String.valueOf(pendaftar.getRwDomisili()));
            rwdomisili.setEditable(false);
            provinsidomisili.setText(pendaftar.getProvinsiDomisili());
            provinsidomisili.setEditable(false);
            kecamatandomisili.setText(pendaftar.getKecamatanDomisili());
            kecamatandomisili.setEditable(false);
            kelurahandomisili.setText(pendaftar.getKelurahanDomisili());
            kelurahandomisili.setEditable(false);
            memilikimobil.setText(pendaftar.getMobil());
            memilikimobil.setEditable(false);
            lahandiatas1m.setText(pendaftar.getNjop());
            lahandiatas1m.setEditable(false);
            kemasangalon.setText(pendaftar.getSumberAir());
            kemasangalon.setEditable(false);
            ratapenghasilan.setText(String.valueOf(pendaftar.getPenghasilan()));
            ratapenghasilan.setEditable(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelRound1 = new Function.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        judul1 = new javax.swing.JLabel();
        tableStatusKeluarga = new Function.PanelRound();
        tableNamaLengkap = new Function.PanelRound();
        tableTanggalLahir = new Function.PanelRound();
        tableStatusKawin = new Function.PanelRound();
        tableNamaIbuKandung = new Function.PanelRound();
        tableGender = new Function.PanelRound();
        tableKerja = new Function.PanelRound();
        tableNIK = new Function.PanelRound();
        tableAlamatKTP = new Function.PanelRound();
        tableRT = new Function.PanelRound();
        tableRW = new Function.PanelRound();
        tableProvinsi = new Function.PanelRound();
        tableKabupaten = new Function.PanelRound();
        tableKecamatan = new Function.PanelRound();
        tableKelurahan = new Function.PanelRound();
        tableAgama = new Function.PanelRound();
        tableSekolah = new Function.PanelRound();
        tableGolonganDarah = new Function.PanelRound();
        tableAnak = new Function.PanelRound();
        tableKewarganegaraan = new Function.PanelRound();
        tableNamaAyah = new Function.PanelRound();
        tableNomorHP = new Function.PanelRound();
        tableSyndrom = new Function.PanelRound();
        judul2 = new javax.swing.JLabel();
        tableNIK1 = new Function.PanelRound();
        tableNIK2 = new Function.PanelRound();
        tableNIK3 = new Function.PanelRound();
        tableNIK4 = new Function.PanelRound();
        tableNIK5 = new Function.PanelRound();
        tableNIK6 = new Function.PanelRound();
        tableNIK7 = new Function.PanelRound();
        tableNIK8 = new Function.PanelRound();
        tableNIK9 = new Function.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(227, 245, 245));
        setPreferredSize(new java.awt.Dimension(750, 692));

        jScrollPane1.setBackground(new java.awt.Color(227, 245, 245));

        panelRound1.setBackground(new java.awt.Color(227, 245, 245));

        jPanel1.setBackground(new java.awt.Color(227, 245, 245));

        judul1.setBackground(new java.awt.Color(102, 102, 102));
        judul1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        judul1.setForeground(new java.awt.Color(102, 102, 102));
        judul1.setText("Informasi Pendaftar");

        tableStatusKeluarga.setBackground(new java.awt.Color(204, 204, 204));
        tableStatusKeluarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableStatusKeluarga.setRoundBottomLeft(20);
        tableStatusKeluarga.setRoundBottomRight(20);
        tableStatusKeluarga.setRoundTopLeft(20);
        tableStatusKeluarga.setRoundTopRight(20);

        statusKeluarga.setBackground(new java.awt.Color(204, 204, 204));
        statusKeluarga.setBorder(null);
        statusKeluarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statusKeluargaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statusKeluargaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableStatusKeluargaLayout = new javax.swing.GroupLayout(tableStatusKeluarga);
        tableStatusKeluarga.setLayout(tableStatusKeluargaLayout);
        tableStatusKeluargaLayout.setHorizontalGroup(
            tableStatusKeluargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableStatusKeluargaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableStatusKeluargaLayout.setVerticalGroup(
            tableStatusKeluargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableStatusKeluargaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statusKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNamaLengkap.setBackground(new java.awt.Color(204, 204, 204));
        tableNamaLengkap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNamaLengkap.setRoundBottomLeft(20);
        tableNamaLengkap.setRoundBottomRight(20);
        tableNamaLengkap.setRoundTopLeft(20);
        tableNamaLengkap.setRoundTopRight(20);

        namaLengkap.setBackground(new java.awt.Color(204, 204, 204));
        namaLengkap.setBorder(null);
        namaLengkap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaLengkapFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaLengkapFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNamaLengkapLayout = new javax.swing.GroupLayout(tableNamaLengkap);
        tableNamaLengkap.setLayout(tableNamaLengkapLayout);
        tableNamaLengkapLayout.setHorizontalGroup(
            tableNamaLengkapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNamaLengkapLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(namaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableNamaLengkapLayout.setVerticalGroup(
            tableNamaLengkapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNamaLengkapLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(namaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        tableTanggalLahir.setBackground(new java.awt.Color(204, 204, 204));
        tableTanggalLahir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableTanggalLahir.setRoundBottomLeft(20);
        tableTanggalLahir.setRoundBottomRight(20);
        tableTanggalLahir.setRoundTopLeft(20);
        tableTanggalLahir.setRoundTopRight(20);

        tgllahir.setBackground(new java.awt.Color(204, 204, 204));
        tgllahir.setBorder(null);
        tgllahir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tgllahirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tgllahirFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableTanggalLahirLayout = new javax.swing.GroupLayout(tableTanggalLahir);
        tableTanggalLahir.setLayout(tableTanggalLahirLayout);
        tableTanggalLahirLayout.setHorizontalGroup(
            tableTanggalLahirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableTanggalLahirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableTanggalLahirLayout.setVerticalGroup(
            tableTanggalLahirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableTanggalLahirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableStatusKawin.setBackground(new java.awt.Color(204, 204, 204));
        tableStatusKawin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableStatusKawin.setRoundBottomLeft(20);
        tableStatusKawin.setRoundBottomRight(20);
        tableStatusKawin.setRoundTopLeft(20);
        tableStatusKawin.setRoundTopRight(20);

        statusKawin.setBackground(new java.awt.Color(204, 204, 204));
        statusKawin.setBorder(null);
        statusKawin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statusKawinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statusKawinFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableStatusKawinLayout = new javax.swing.GroupLayout(tableStatusKawin);
        tableStatusKawin.setLayout(tableStatusKawinLayout);
        tableStatusKawinLayout.setHorizontalGroup(
            tableStatusKawinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableStatusKawinLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusKawin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableStatusKawinLayout.setVerticalGroup(
            tableStatusKawinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableStatusKawinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statusKawin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNamaIbuKandung.setBackground(new java.awt.Color(204, 204, 204));
        tableNamaIbuKandung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNamaIbuKandung.setRoundBottomLeft(20);
        tableNamaIbuKandung.setRoundBottomRight(20);
        tableNamaIbuKandung.setRoundTopLeft(20);
        tableNamaIbuKandung.setRoundTopRight(20);

        namaIbuKandung.setBackground(new java.awt.Color(204, 204, 204));
        namaIbuKandung.setBorder(null);
        namaIbuKandung.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaIbuKandungFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaIbuKandungFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNamaIbuKandungLayout = new javax.swing.GroupLayout(tableNamaIbuKandung);
        tableNamaIbuKandung.setLayout(tableNamaIbuKandungLayout);
        tableNamaIbuKandungLayout.setHorizontalGroup(
            tableNamaIbuKandungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNamaIbuKandungLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(namaIbuKandung, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableNamaIbuKandungLayout.setVerticalGroup(
            tableNamaIbuKandungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNamaIbuKandungLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(namaIbuKandung, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableGender.setBackground(new java.awt.Color(204, 204, 204));
        tableGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableGender.setRoundBottomLeft(20);
        tableGender.setRoundBottomRight(20);
        tableGender.setRoundTopLeft(20);
        tableGender.setRoundTopRight(20);

        jenisKelamin.setBackground(new java.awt.Color(204, 204, 204));
        jenisKelamin.setBorder(null);
        jenisKelamin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jenisKelaminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jenisKelaminFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableGenderLayout = new javax.swing.GroupLayout(tableGender);
        tableGender.setLayout(tableGenderLayout);
        tableGenderLayout.setHorizontalGroup(
            tableGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableGenderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableGenderLayout.setVerticalGroup(
            tableGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableGenderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableKerja.setBackground(new java.awt.Color(204, 204, 204));
        tableKerja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableKerja.setRoundBottomLeft(20);
        tableKerja.setRoundBottomRight(20);
        tableKerja.setRoundTopLeft(20);
        tableKerja.setRoundTopRight(20);

        statusBekerja.setBackground(new java.awt.Color(204, 204, 204));
        statusBekerja.setBorder(null);
        statusBekerja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statusBekerjaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statusBekerjaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableKerjaLayout = new javax.swing.GroupLayout(tableKerja);
        tableKerja.setLayout(tableKerjaLayout);
        tableKerjaLayout.setHorizontalGroup(
            tableKerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableKerjaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusBekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableKerjaLayout.setVerticalGroup(
            tableKerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableKerjaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statusBekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK.setRoundBottomLeft(20);
        tableNIK.setRoundBottomRight(20);
        tableNIK.setRoundTopLeft(20);
        tableNIK.setRoundTopRight(20);

        nik.setBackground(new java.awt.Color(204, 204, 204));
        nik.setBorder(null);
        nik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nikFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIKLayout = new javax.swing.GroupLayout(tableNIK);
        tableNIK.setLayout(tableNIKLayout);
        tableNIKLayout.setHorizontalGroup(
            tableNIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIKLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIKLayout.setVerticalGroup(
            tableNIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIKLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableAlamatKTP.setBackground(new java.awt.Color(204, 204, 204));
        tableAlamatKTP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableAlamatKTP.setRoundBottomLeft(20);
        tableAlamatKTP.setRoundBottomRight(20);
        tableAlamatKTP.setRoundTopLeft(20);
        tableAlamatKTP.setRoundTopRight(20);

        alamat.setBackground(new java.awt.Color(204, 204, 204));
        alamat.setBorder(null);
        alamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                alamatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                alamatFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableAlamatKTPLayout = new javax.swing.GroupLayout(tableAlamatKTP);
        tableAlamatKTP.setLayout(tableAlamatKTPLayout);
        tableAlamatKTPLayout.setHorizontalGroup(
            tableAlamatKTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableAlamatKTPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableAlamatKTPLayout.setVerticalGroup(
            tableAlamatKTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableAlamatKTPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableRT.setBackground(new java.awt.Color(204, 204, 204));
        tableRT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableRT.setRoundBottomLeft(20);
        tableRT.setRoundBottomRight(20);
        tableRT.setRoundTopLeft(20);
        tableRT.setRoundTopRight(20);

        rt.setBackground(new java.awt.Color(204, 204, 204));
        rt.setBorder(null);
        rt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableRTLayout = new javax.swing.GroupLayout(tableRT);
        tableRT.setLayout(tableRTLayout);
        tableRTLayout.setHorizontalGroup(
            tableRTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableRTLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableRTLayout.setVerticalGroup(
            tableRTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableRTLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableRW.setBackground(new java.awt.Color(204, 204, 204));
        tableRW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableRW.setRoundBottomLeft(20);
        tableRW.setRoundBottomRight(20);
        tableRW.setRoundTopLeft(20);
        tableRW.setRoundTopRight(20);

        rw.setBackground(new java.awt.Color(204, 204, 204));
        rw.setBorder(null);
        rw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rwFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rwFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableRWLayout = new javax.swing.GroupLayout(tableRW);
        tableRW.setLayout(tableRWLayout);
        tableRWLayout.setHorizontalGroup(
            tableRWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableRWLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rw, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableRWLayout.setVerticalGroup(
            tableRWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableRWLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        tableProvinsi.setBackground(new java.awt.Color(204, 204, 204));
        tableProvinsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableProvinsi.setRoundBottomLeft(20);
        tableProvinsi.setRoundBottomRight(20);
        tableProvinsi.setRoundTopLeft(20);
        tableProvinsi.setRoundTopRight(20);

        provinsi.setBackground(new java.awt.Color(204, 204, 204));
        provinsi.setBorder(null);
        provinsi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                provinsiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                provinsiFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableProvinsiLayout = new javax.swing.GroupLayout(tableProvinsi);
        tableProvinsi.setLayout(tableProvinsiLayout);
        tableProvinsiLayout.setHorizontalGroup(
            tableProvinsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableProvinsiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableProvinsiLayout.setVerticalGroup(
            tableProvinsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableProvinsiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableKabupaten.setBackground(new java.awt.Color(204, 204, 204));
        tableKabupaten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableKabupaten.setRoundBottomLeft(20);
        tableKabupaten.setRoundBottomRight(20);
        tableKabupaten.setRoundTopLeft(20);
        tableKabupaten.setRoundTopRight(20);

        kabupaten.setBackground(new java.awt.Color(204, 204, 204));
        kabupaten.setBorder(null);
        kabupaten.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kabupatenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kabupatenFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableKabupatenLayout = new javax.swing.GroupLayout(tableKabupaten);
        tableKabupaten.setLayout(tableKabupatenLayout);
        tableKabupatenLayout.setHorizontalGroup(
            tableKabupatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableKabupatenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableKabupatenLayout.setVerticalGroup(
            tableKabupatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableKabupatenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableKecamatan.setBackground(new java.awt.Color(204, 204, 204));
        tableKecamatan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableKecamatan.setRoundBottomLeft(20);
        tableKecamatan.setRoundBottomRight(20);
        tableKecamatan.setRoundTopLeft(20);
        tableKecamatan.setRoundTopRight(20);

        kecamatan.setBackground(new java.awt.Color(204, 204, 204));
        kecamatan.setBorder(null);
        kecamatan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kecamatanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kecamatanFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableKecamatanLayout = new javax.swing.GroupLayout(tableKecamatan);
        tableKecamatan.setLayout(tableKecamatanLayout);
        tableKecamatanLayout.setHorizontalGroup(
            tableKecamatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableKecamatanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableKecamatanLayout.setVerticalGroup(
            tableKecamatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableKecamatanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableKelurahan.setBackground(new java.awt.Color(204, 204, 204));
        tableKelurahan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableKelurahan.setRoundBottomLeft(20);
        tableKelurahan.setRoundBottomRight(20);
        tableKelurahan.setRoundTopLeft(20);
        tableKelurahan.setRoundTopRight(20);

        kelurahan.setBackground(new java.awt.Color(204, 204, 204));
        kelurahan.setBorder(null);
        kelurahan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kelurahanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kelurahanFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableKelurahanLayout = new javax.swing.GroupLayout(tableKelurahan);
        tableKelurahan.setLayout(tableKelurahanLayout);
        tableKelurahanLayout.setHorizontalGroup(
            tableKelurahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableKelurahanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(kelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableKelurahanLayout.setVerticalGroup(
            tableKelurahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableKelurahanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableAgama.setBackground(new java.awt.Color(204, 204, 204));
        tableAgama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableAgama.setRoundBottomLeft(20);
        tableAgama.setRoundBottomRight(20);
        tableAgama.setRoundTopLeft(20);
        tableAgama.setRoundTopRight(20);

        agama.setBackground(new java.awt.Color(204, 204, 204));
        agama.setBorder(null);
        agama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agamaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableAgamaLayout = new javax.swing.GroupLayout(tableAgama);
        tableAgama.setLayout(tableAgamaLayout);
        tableAgamaLayout.setHorizontalGroup(
            tableAgamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableAgamaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableAgamaLayout.setVerticalGroup(
            tableAgamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableAgamaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableSekolah.setBackground(new java.awt.Color(204, 204, 204));
        tableSekolah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableSekolah.setRoundBottomLeft(20);
        tableSekolah.setRoundBottomRight(20);
        tableSekolah.setRoundTopLeft(20);
        tableSekolah.setRoundTopRight(20);

        statusSekolah.setBackground(new java.awt.Color(204, 204, 204));
        statusSekolah.setBorder(null);
        statusSekolah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statusSekolahFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statusSekolahFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableSekolahLayout = new javax.swing.GroupLayout(tableSekolah);
        tableSekolah.setLayout(tableSekolahLayout);
        tableSekolahLayout.setHorizontalGroup(
            tableSekolahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableSekolahLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableSekolahLayout.setVerticalGroup(
            tableSekolahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableSekolahLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statusSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableGolonganDarah.setBackground(new java.awt.Color(204, 204, 204));
        tableGolonganDarah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableGolonganDarah.setRoundBottomLeft(20);
        tableGolonganDarah.setRoundBottomRight(20);
        tableGolonganDarah.setRoundTopLeft(20);
        tableGolonganDarah.setRoundTopRight(20);

        golongandarah.setBackground(new java.awt.Color(204, 204, 204));
        golongandarah.setBorder(null);
        golongandarah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                golongandarahFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                golongandarahFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableGolonganDarahLayout = new javax.swing.GroupLayout(tableGolonganDarah);
        tableGolonganDarah.setLayout(tableGolonganDarahLayout);
        tableGolonganDarahLayout.setHorizontalGroup(
            tableGolonganDarahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableGolonganDarahLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(golongandarah, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableGolonganDarahLayout.setVerticalGroup(
            tableGolonganDarahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableGolonganDarahLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(golongandarah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableAnak.setBackground(new java.awt.Color(204, 204, 204));
        tableAnak.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableAnak.setRoundBottomLeft(20);
        tableAnak.setRoundBottomRight(20);
        tableAnak.setRoundTopLeft(20);
        tableAnak.setRoundTopRight(20);

        statusdalamkeluarga.setBackground(new java.awt.Color(204, 204, 204));
        statusdalamkeluarga.setBorder(null);
        statusdalamkeluarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statusdalamkeluargaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statusdalamkeluargaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableAnakLayout = new javax.swing.GroupLayout(tableAnak);
        tableAnak.setLayout(tableAnakLayout);
        tableAnakLayout.setHorizontalGroup(
            tableAnakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableAnakLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusdalamkeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableAnakLayout.setVerticalGroup(
            tableAnakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableAnakLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statusdalamkeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        tableKewarganegaraan.setBackground(new java.awt.Color(204, 204, 204));
        tableKewarganegaraan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableKewarganegaraan.setRoundBottomLeft(20);
        tableKewarganegaraan.setRoundBottomRight(20);
        tableKewarganegaraan.setRoundTopLeft(20);
        tableKewarganegaraan.setRoundTopRight(20);

        kewarganegaraan.setBackground(new java.awt.Color(204, 204, 204));
        kewarganegaraan.setBorder(null);
        kewarganegaraan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kewarganegaraanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kewarganegaraanFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableKewarganegaraanLayout = new javax.swing.GroupLayout(tableKewarganegaraan);
        tableKewarganegaraan.setLayout(tableKewarganegaraanLayout);
        tableKewarganegaraanLayout.setHorizontalGroup(
            tableKewarganegaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableKewarganegaraanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(kewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableKewarganegaraanLayout.setVerticalGroup(
            tableKewarganegaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableKewarganegaraanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNamaAyah.setBackground(new java.awt.Color(204, 204, 204));
        tableNamaAyah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNamaAyah.setRoundBottomLeft(20);
        tableNamaAyah.setRoundBottomRight(20);
        tableNamaAyah.setRoundTopLeft(20);
        tableNamaAyah.setRoundTopRight(20);

        namaayah.setBackground(new java.awt.Color(204, 204, 204));
        namaayah.setBorder(null);
        namaayah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaayahFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaayahFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNamaAyahLayout = new javax.swing.GroupLayout(tableNamaAyah);
        tableNamaAyah.setLayout(tableNamaAyahLayout);
        tableNamaAyahLayout.setHorizontalGroup(
            tableNamaAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNamaAyahLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(namaayah, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableNamaAyahLayout.setVerticalGroup(
            tableNamaAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNamaAyahLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(namaayah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNomorHP.setBackground(new java.awt.Color(204, 204, 204));
        tableNomorHP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNomorHP.setRoundBottomLeft(20);
        tableNomorHP.setRoundBottomRight(20);
        tableNomorHP.setRoundTopLeft(20);
        tableNomorHP.setRoundTopRight(20);

        nomorhp.setBackground(new java.awt.Color(204, 204, 204));
        nomorhp.setBorder(null);
        nomorhp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomorhpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomorhpFocusLost(evt);
            }
        });
        nomorhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorhpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tableNomorHPLayout = new javax.swing.GroupLayout(tableNomorHP);
        tableNomorHP.setLayout(tableNomorHPLayout);
        tableNomorHPLayout.setHorizontalGroup(
            tableNomorHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNomorHPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nomorhp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableNomorHPLayout.setVerticalGroup(
            tableNomorHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNomorHPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nomorhp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableSyndrom.setBackground(new java.awt.Color(204, 204, 204));
        tableSyndrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableSyndrom.setRoundBottomLeft(20);
        tableSyndrom.setRoundBottomRight(20);
        tableSyndrom.setRoundTopLeft(20);
        tableSyndrom.setRoundTopRight(20);

        syndrom.setBackground(new java.awt.Color(204, 204, 204));
        syndrom.setBorder(null);
        syndrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                syndromFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                syndromFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableSyndromLayout = new javax.swing.GroupLayout(tableSyndrom);
        tableSyndrom.setLayout(tableSyndromLayout);
        tableSyndromLayout.setHorizontalGroup(
            tableSyndromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableSyndromLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(syndrom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        tableSyndromLayout.setVerticalGroup(
            tableSyndromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableSyndromLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(syndrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        judul2.setBackground(new java.awt.Color(102, 102, 102));
        judul2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        judul2.setForeground(new java.awt.Color(102, 102, 102));
        judul2.setText("Informasi Alamat Domisili");

        tableNIK1.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK1.setRoundBottomLeft(20);
        tableNIK1.setRoundBottomRight(20);
        tableNIK1.setRoundTopLeft(20);
        tableNIK1.setRoundTopRight(20);

        rtdomisili.setBackground(new java.awt.Color(204, 204, 204));
        rtdomisili.setBorder(null);
        rtdomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rtdomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rtdomisiliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK1Layout = new javax.swing.GroupLayout(tableNIK1);
        tableNIK1.setLayout(tableNIK1Layout);
        tableNIK1Layout.setHorizontalGroup(
            tableNIK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rtdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK1Layout.setVerticalGroup(
            tableNIK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rtdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK2.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK2.setRoundBottomLeft(20);
        tableNIK2.setRoundBottomRight(20);
        tableNIK2.setRoundTopLeft(20);
        tableNIK2.setRoundTopRight(20);

        rwdomisili.setBackground(new java.awt.Color(204, 204, 204));
        rwdomisili.setBorder(null);
        rwdomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rwdomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rwdomisiliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK2Layout = new javax.swing.GroupLayout(tableNIK2);
        tableNIK2.setLayout(tableNIK2Layout);
        tableNIK2Layout.setHorizontalGroup(
            tableNIK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rwdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK2Layout.setVerticalGroup(
            tableNIK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rwdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK3.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK3.setRoundBottomLeft(20);
        tableNIK3.setRoundBottomRight(20);
        tableNIK3.setRoundTopLeft(20);
        tableNIK3.setRoundTopRight(20);

        provinsidomisili.setBackground(new java.awt.Color(204, 204, 204));
        provinsidomisili.setBorder(null);
        provinsidomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                provinsidomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                provinsidomisiliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK3Layout = new javax.swing.GroupLayout(tableNIK3);
        tableNIK3.setLayout(tableNIK3Layout);
        tableNIK3Layout.setHorizontalGroup(
            tableNIK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(provinsidomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK3Layout.setVerticalGroup(
            tableNIK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(provinsidomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK4.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK4.setRoundBottomLeft(20);
        tableNIK4.setRoundBottomRight(20);
        tableNIK4.setRoundTopLeft(20);
        tableNIK4.setRoundTopRight(20);

        kecamatandomisili.setBackground(new java.awt.Color(204, 204, 204));
        kecamatandomisili.setBorder(null);
        kecamatandomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kecamatandomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kecamatandomisiliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK4Layout = new javax.swing.GroupLayout(tableNIK4);
        tableNIK4.setLayout(tableNIK4Layout);
        tableNIK4Layout.setHorizontalGroup(
            tableNIK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kecamatandomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK4Layout.setVerticalGroup(
            tableNIK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kecamatandomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK5.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK5.setRoundBottomLeft(20);
        tableNIK5.setRoundBottomRight(20);
        tableNIK5.setRoundTopLeft(20);
        tableNIK5.setRoundTopRight(20);

        kelurahandomisili.setBackground(new java.awt.Color(204, 204, 204));
        kelurahandomisili.setBorder(null);
        kelurahandomisili.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kelurahandomisiliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kelurahandomisiliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK5Layout = new javax.swing.GroupLayout(tableNIK5);
        tableNIK5.setLayout(tableNIK5Layout);
        tableNIK5Layout.setHorizontalGroup(
            tableNIK5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kelurahandomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK5Layout.setVerticalGroup(
            tableNIK5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kelurahandomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK6.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK6.setRoundBottomLeft(20);
        tableNIK6.setRoundBottomRight(20);
        tableNIK6.setRoundTopLeft(20);
        tableNIK6.setRoundTopRight(20);

        memilikimobil.setBackground(new java.awt.Color(204, 204, 204));
        memilikimobil.setBorder(null);
        memilikimobil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                memilikimobilFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                memilikimobilFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK6Layout = new javax.swing.GroupLayout(tableNIK6);
        tableNIK6.setLayout(tableNIK6Layout);
        tableNIK6Layout.setHorizontalGroup(
            tableNIK6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(memilikimobil, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK6Layout.setVerticalGroup(
            tableNIK6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(memilikimobil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK7.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK7.setRoundBottomLeft(20);
        tableNIK7.setRoundBottomRight(20);
        tableNIK7.setRoundTopLeft(20);
        tableNIK7.setRoundTopRight(20);

        lahandiatas1m.setBackground(new java.awt.Color(204, 204, 204));
        lahandiatas1m.setBorder(null);
        lahandiatas1m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lahandiatas1mFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lahandiatas1mFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK7Layout = new javax.swing.GroupLayout(tableNIK7);
        tableNIK7.setLayout(tableNIK7Layout);
        tableNIK7Layout.setHorizontalGroup(
            tableNIK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lahandiatas1m, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK7Layout.setVerticalGroup(
            tableNIK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lahandiatas1m, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK8.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK8.setRoundBottomLeft(20);
        tableNIK8.setRoundBottomRight(20);
        tableNIK8.setRoundTopLeft(20);
        tableNIK8.setRoundTopRight(20);

        kemasangalon.setBackground(new java.awt.Color(204, 204, 204));
        kemasangalon.setBorder(null);
        kemasangalon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kemasangalonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kemasangalonFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK8Layout = new javax.swing.GroupLayout(tableNIK8);
        tableNIK8.setLayout(tableNIK8Layout);
        tableNIK8Layout.setHorizontalGroup(
            tableNIK8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(kemasangalon, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK8Layout.setVerticalGroup(
            tableNIK8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kemasangalon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableNIK9.setBackground(new java.awt.Color(204, 204, 204));
        tableNIK9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tableNIK9.setRoundBottomLeft(20);
        tableNIK9.setRoundBottomRight(20);
        tableNIK9.setRoundTopLeft(20);
        tableNIK9.setRoundTopRight(20);

        ratapenghasilan.setBackground(new java.awt.Color(204, 204, 204));
        ratapenghasilan.setBorder(null);
        ratapenghasilan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ratapenghasilanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ratapenghasilanFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tableNIK9Layout = new javax.swing.GroupLayout(tableNIK9);
        tableNIK9.setLayout(tableNIK9Layout);
        tableNIK9Layout.setHorizontalGroup(
            tableNIK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableNIK9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ratapenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tableNIK9Layout.setVerticalGroup(
            tableNIK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableNIK9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ratapenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setText("*Kepala Keluarga");

        jLabel2.setText("*Alamat KTP");

        jLabel3.setText("*Status Sekolah");

        jLabel4.setText("*NIK");

        jLabel5.setText("*RT");

        jLabel6.setText("*Golongan Darah");

        jLabel7.setText("*Nama Lengkap");

        jLabel8.setText("*RW");

        jLabel9.setText("*Anak Ke");

        jLabel10.setText("*RT Domisili");

        jLabel11.setText("*Tanggal Lahir");

        jLabel12.setText("*Provinsi");

        jLabel13.setText("*Negara");

        jLabel14.setText("*Status Pernikahan");

        jLabel15.setText("*Kabupaten");

        jLabel16.setText("*Nama Ayah");

        jLabel17.setText("*Nama Ibu Kandung");

        jLabel18.setText("*Kecamatan");

        jLabel19.setText("*Nomor HP");

        jLabel20.setText("*Penyakit Yang Dimiliki");

        jLabel21.setText("*Kelurahan");

        jLabel22.setText("*Jenis Kelamin");

        jLabel23.setText("*Status Bekerja");

        jLabel24.setText("*Agama");

        jLabel25.setText("*Kelurahan Domisili");

        jLabel26.setText("*Rata Penghasilan");

        jLabel27.setText("*RW Domisili");

        jLabel28.setText("*Rumah Memiliki Mobil");

        jLabel29.setText("*Provinsi Domisili");

        jLabel30.setText("*Memiliki Tanah Dengan NJOP Diatas 1M");

        jLabel31.setText("*Air Minum Adalah Air Kemasan Bermerk?");

        jLabel32.setText("*Kecamatan Domisili");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(tableProvinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tableKewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableStatusKawin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(tableKabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tableNamaAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableNamaIbuKandung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(tableKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tableNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableSyndrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableKerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(judul2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableNIK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(tableNIK5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(tableNIK9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableNIK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(tableNIK6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableNIK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(tableNIK7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableNIK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(tableNIK8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(tableRW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tableAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(tableRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tableGolonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tableStatusKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(tableAlamatKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tableSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(judul1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 728, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGap(1, 1, 1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tableAlamatKTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tableStatusKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableGolonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableRW, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableAnak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableProvinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableKewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableStatusKawin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableKabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableNamaAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableNamaIbuKandung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(0, 0, 0)
                                    .addComponent(tableKelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addGap(0, 0, 0)
                                            .addComponent(tableGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(0, 0, 0)
                                            .addComponent(tableSyndrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel23)
                                    .addGap(0, 0, 0)
                                    .addComponent(tableKerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(0, 0, 0)
                                    .addComponent(tableAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(judul2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel25)
                                .addComponent(jLabel26))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableNIK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableNIK5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableNIK9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel28))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableNIK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableNIK6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableNIK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableNIK7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel32)
                                .addComponent(jLabel31))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tableNIK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableNIK8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(tableSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(panelRound1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nikFocusGained

    }//GEN-LAST:event_nikFocusGained

    private void nikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nikFocusLost

    }//GEN-LAST:event_nikFocusLost

    private void statusKeluargaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusKeluargaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_statusKeluargaFocusGained

    private void statusKeluargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusKeluargaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_statusKeluargaFocusLost

    private void namaLengkapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaLengkapFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_namaLengkapFocusGained

    private void namaLengkapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaLengkapFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_namaLengkapFocusLost

    private void tgllahirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tgllahirFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tgllahirFocusGained

    private void tgllahirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tgllahirFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tgllahirFocusLost

    private void statusKawinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusKawinFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_statusKawinFocusGained

    private void statusKawinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusKawinFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_statusKawinFocusLost

    private void namaIbuKandungFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaIbuKandungFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_namaIbuKandungFocusGained

    private void namaIbuKandungFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaIbuKandungFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_namaIbuKandungFocusLost

    private void jenisKelaminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jenisKelaminFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisKelaminFocusGained

    private void jenisKelaminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jenisKelaminFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisKelaminFocusLost

    private void statusBekerjaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusBekerjaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_statusBekerjaFocusGained

    private void statusBekerjaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusBekerjaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_statusBekerjaFocusLost

    private void alamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alamatFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatFocusGained

    private void alamatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alamatFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatFocusLost

    private void rtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_rtFocusGained

    private void rtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_rtFocusLost

    private void rwFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rwFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_rwFocusGained

    private void rwFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rwFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_rwFocusLost

    private void provinsiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinsiFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsiFocusGained

    private void provinsiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinsiFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsiFocusLost

    private void kabupatenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kabupatenFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_kabupatenFocusGained

    private void kabupatenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kabupatenFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_kabupatenFocusLost

    private void kecamatanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kecamatanFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_kecamatanFocusGained

    private void kecamatanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kecamatanFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_kecamatanFocusLost

    private void kelurahanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelurahanFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_kelurahanFocusGained

    private void kelurahanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelurahanFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_kelurahanFocusLost

    private void agamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agamaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_agamaFocusGained

    private void agamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agamaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_agamaFocusLost

    private void statusSekolahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusSekolahFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_statusSekolahFocusGained

    private void statusSekolahFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusSekolahFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_statusSekolahFocusLost

    private void golongandarahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_golongandarahFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_golongandarahFocusGained

    private void golongandarahFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_golongandarahFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_golongandarahFocusLost

    private void statusdalamkeluargaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusdalamkeluargaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_statusdalamkeluargaFocusGained

    private void statusdalamkeluargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusdalamkeluargaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_statusdalamkeluargaFocusLost

    private void kewarganegaraanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kewarganegaraanFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_kewarganegaraanFocusGained

    private void kewarganegaraanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kewarganegaraanFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_kewarganegaraanFocusLost

    private void namaayahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaayahFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_namaayahFocusGained

    private void namaayahFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaayahFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_namaayahFocusLost

    private void nomorhpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomorhpFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorhpFocusGained

    private void nomorhpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomorhpFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorhpFocusLost

    private void syndromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_syndromFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_syndromFocusGained

    private void syndromFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_syndromFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_syndromFocusLost

    private void rtdomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rtdomisiliFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_rtdomisiliFocusGained

    private void rtdomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rtdomisiliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_rtdomisiliFocusLost

    private void rwdomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rwdomisiliFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_rwdomisiliFocusGained

    private void rwdomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rwdomisiliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_rwdomisiliFocusLost

    private void provinsidomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinsidomisiliFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsidomisiliFocusGained

    private void provinsidomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_provinsidomisiliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsidomisiliFocusLost

    private void kecamatandomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kecamatandomisiliFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_kecamatandomisiliFocusGained

    private void kecamatandomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kecamatandomisiliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_kecamatandomisiliFocusLost

    private void kelurahandomisiliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelurahandomisiliFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_kelurahandomisiliFocusGained

    private void kelurahandomisiliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelurahandomisiliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_kelurahandomisiliFocusLost

    private void memilikimobilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memilikimobilFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_memilikimobilFocusGained

    private void memilikimobilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memilikimobilFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_memilikimobilFocusLost

    private void lahandiatas1mFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lahandiatas1mFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lahandiatas1mFocusGained

    private void lahandiatas1mFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lahandiatas1mFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_lahandiatas1mFocusLost

    private void kemasangalonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kemasangalonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_kemasangalonFocusGained

    private void kemasangalonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kemasangalonFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_kemasangalonFocusLost

    private void ratapenghasilanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ratapenghasilanFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ratapenghasilanFocusGained

    private void ratapenghasilanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ratapenghasilanFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ratapenghasilanFocusLost

    private void nomorhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorhpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorhpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JTextField agama = new javax.swing.JTextField();
    public static final javax.swing.JTextField alamat = new javax.swing.JTextField();
    public static final javax.swing.JTextField golongandarah = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTextField jenisKelamin = new javax.swing.JTextField();
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    public static final javax.swing.JTextField kabupaten = new javax.swing.JTextField();
    public static final javax.swing.JTextField kecamatan = new javax.swing.JTextField();
    public static final javax.swing.JTextField kecamatandomisili = new javax.swing.JTextField();
    public static final javax.swing.JTextField kelurahan = new javax.swing.JTextField();
    public static final javax.swing.JTextField kelurahandomisili = new javax.swing.JTextField();
    public static final javax.swing.JTextField kemasangalon = new javax.swing.JTextField();
    public static final javax.swing.JTextField kewarganegaraan = new javax.swing.JTextField();
    public static final javax.swing.JTextField lahandiatas1m = new javax.swing.JTextField();
    public static final javax.swing.JTextField memilikimobil = new javax.swing.JTextField();
    public static final javax.swing.JTextField namaIbuKandung = new javax.swing.JTextField();
    public static final javax.swing.JTextField namaLengkap = new javax.swing.JTextField();
    public static final javax.swing.JTextField namaayah = new javax.swing.JTextField();
    public static final javax.swing.JTextField nik = new javax.swing.JTextField();
    public static final javax.swing.JTextField nomorhp = new javax.swing.JTextField();
    private Function.PanelRound panelRound1;
    public static final javax.swing.JTextField provinsi = new javax.swing.JTextField();
    public static final javax.swing.JTextField provinsidomisili = new javax.swing.JTextField();
    public static final javax.swing.JTextField ratapenghasilan = new javax.swing.JTextField();
    public static final javax.swing.JTextField rt = new javax.swing.JTextField();
    public static final javax.swing.JTextField rtdomisili = new javax.swing.JTextField();
    public static final javax.swing.JTextField rw = new javax.swing.JTextField();
    public static final javax.swing.JTextField rwdomisili = new javax.swing.JTextField();
    public static final javax.swing.JTextField statusBekerja = new javax.swing.JTextField();
    public static final javax.swing.JTextField statusKawin = new javax.swing.JTextField();
    public static final javax.swing.JTextField statusKeluarga = new javax.swing.JTextField();
    public static final javax.swing.JTextField statusSekolah = new javax.swing.JTextField();
    public static final javax.swing.JTextField statusdalamkeluarga = new javax.swing.JTextField();
    public static final javax.swing.JTextField syndrom = new javax.swing.JTextField();
    private Function.PanelRound tableAgama;
    private Function.PanelRound tableAlamatKTP;
    private Function.PanelRound tableAnak;
    private Function.PanelRound tableGender;
    private Function.PanelRound tableGolonganDarah;
    private Function.PanelRound tableKabupaten;
    private Function.PanelRound tableKecamatan;
    private Function.PanelRound tableKelurahan;
    private Function.PanelRound tableKerja;
    private Function.PanelRound tableKewarganegaraan;
    private Function.PanelRound tableNIK;
    private Function.PanelRound tableNIK1;
    private Function.PanelRound tableNIK2;
    private Function.PanelRound tableNIK3;
    private Function.PanelRound tableNIK4;
    private Function.PanelRound tableNIK5;
    private Function.PanelRound tableNIK6;
    private Function.PanelRound tableNIK7;
    private Function.PanelRound tableNIK8;
    private Function.PanelRound tableNIK9;
    private Function.PanelRound tableNamaAyah;
    private Function.PanelRound tableNamaIbuKandung;
    private Function.PanelRound tableNamaLengkap;
    private Function.PanelRound tableNomorHP;
    private Function.PanelRound tableProvinsi;
    private Function.PanelRound tableRT;
    private Function.PanelRound tableRW;
    private Function.PanelRound tableSekolah;
    private Function.PanelRound tableStatusKawin;
    private Function.PanelRound tableStatusKeluarga;
    private Function.PanelRound tableSyndrom;
    private Function.PanelRound tableTanggalLahir;
    public static final javax.swing.JTextField tgllahir = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
