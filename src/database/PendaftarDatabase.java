package database;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PendaftarDatabase {
    public static final String TABLE_NAME = "pendaftar";
    public static final String NIK = "nik";
    public static final String NAMA_LENGKAP = "nama_lengkap";
    public static final String STATUS_KELUARGA = "status_keluarga";
    public static final String TANGGAL_LAHIR = "tanggal_lahir";
    public static final String STATUS_KAWIN = "status_kawin";
    public static final String NAMA_IBU = "nama_ibu";
    public static final String JENIS_KELAMIN = "jenis_kelamin";
    public static final String STATUS_KERJA = "status_kerja";
    public static final String ALAMAT = "alamat";
    public static final String RT = "rt";
    public static final String RW = "rw";
    public static final String PROVINSI = "provinsi";
    public static final String KABUPATEN = "kabupaten";
    public static final String KECAMATAN = "kecamatan";
    public static final String KELURAHAN = "kelurahan";
    public static final String AGAMA = "agama";
    public static final String PENDIDIKAN = "pendidikan";
    public static final String GOL_DAR = "gol_dar";
    public static final String STATUS_HUBUNGAN = "status_hubungan";
    public static final String KEWARGANEGARAAN = "kewarganegaraan";
    public static final String NAMA_AYAH = "nama_ayah";
    public static final String NO_HP = "no_hp";
    public static final String DISABILITAS = "disabilitas";
    public static final String RT_DOMISILI = "rt_domisili";
    public static final String RW_DOMISILI = "rw_domisili";
    public static final String PROVINSI_DOMISILI = "provinsi_domisili";
    public static final String KECAMATAN_DOMISILI = "kecamatan_domisili";
    public static final String KELURAHAN_DOMISILI = "kelurahan_domisili";
    public static final String MOBIL = "mobil";
    public static final String NJOP = "njop";
    public static final String SUMBER_AIR = "sumber_air";
    public static final String PENGHASILAN = "penghasilan";
    public static final String ID_USER = "id_user";
    
    public static void createTable(){
        Connection connection = new KoneksiDatabase().connect();
        Statement statement = null;
        try {
            statement = connection.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    NIK+" VARCHAR(30) NOT NULL, "
                    +NAMA_LENGKAP+" VARCHAR(40) NOT NULL , "
                    +STATUS_KELUARGA+" VARCHAR(20) NOT NULL , "
                    +TANGGAL_LAHIR+" DATE NOT NULL , "
                    +STATUS_KAWIN+" VARCHAR(20) NOT NULL , "
                    +NAMA_IBU+" VARCHAR(40) NOT NULL , "
                    +JENIS_KELAMIN+" VARCHAR(20) NOT NULL , "
                    +STATUS_KERJA+" VARCHAR(20) NOT NULL , "
                    +ALAMAT+" VARCHAR(255) , "
                    +RT+" INT NOT NULL , "
                    +RW+" INT NOT NULL , "
                    +PROVINSI+" VARCHAR(100) NOT NULL , "
                    +KABUPATEN+" VARCHAR(100) NOT NULL , "
                    +KECAMATAN+" VARCHAR(100) NOT NULL , "
                    +KELURAHAN+" VARCHAR(100) NOT NULL , "
                    +AGAMA+" VARCHAR(30) NOT NULL , "
                    +PENDIDIKAN+" VARCHAR(100) NOT NULL , "
                    +GOL_DAR+" VARCHAR(10) NOT NULL , "
                    +STATUS_HUBUNGAN+" VARCHAR(20) NOT NULL , "
                    +KEWARGANEGARAAN+" VARCHAR(100) NOT NULL , "
                    +NAMA_AYAH+" VARCHAR(40) NOT NULL , "
                    +NO_HP+" VARCHAR(15)  , "
                    +DISABILITAS+" VARCHAR(200) NOT NULL , "
                     +RT_DOMISILI+" INT NOT NULL , "
                    +RW_DOMISILI+" INT NOT NULL , "
                    +PROVINSI_DOMISILI+" VARCHAR(100) NOT NULL , "
                    +KECAMATAN_DOMISILI+" VARCHAR(100) NOT NULL , "
                    +KELURAHAN_DOMISILI+" VARCHAR(100) NOT NULL , "
                    +MOBIL+" VARCHAR(10) NOT NULL , "
                    +NJOP+" VARCHAR(10) NOT NULL , "
                    +SUMBER_AIR+" VARCHAR(10) NOT NULL , "
                    +PENGHASILAN+" INT NOT NULL , "
                    +ID_USER+" INT NOT NULL , "
                    +" FOREIGN KEY ("+ID_USER+") REFERENCES "+UserDatabase.TABLE_NAME+"("+UserDatabase.ID+") ON DELETE CASCADE, "
                    + "PRIMARY KEY ("+NIK+")) ENGINE = InnoDB";


            String dropQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;

            statement.executeUpdate(dropQuery);

            statement.executeUpdate(query);

            System.out.println("Tabel berhasil dibuat!");

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat membuat tabel! :"+e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    
    public static void createFakeData() throws InterruptedException{
        Connection connection = new KoneksiDatabase().connect();
        PreparedStatement statement = null;
        String[][] fakeData = {
            {"12345678901231", "pendaftarFake1", "Kepala Keluarga",   "01-01-1990", "Kawin",            "ibuFake1",    "Laki-Laki",       "Pedagang",                 "AlamatFake1", "001", "001", "DKI JAKARTA", "Jakarta Timur",    "KecamatanFake1", "KelurahanFake1", "Islam",      "SLTA / SEDERAJAT",        "A",   "Suami", "Warga Negara Indonesia", "ayahFake1", "0811111111", "Tidak Disabilitas", "001", "001", "DKI JAKARTA", "KecamatanFake1", "KelurahanFake1", "Ya",     "Tidak", "Ya",     "5000000", "1"},
            {"12345678901232", "pendaftarFake2", "Anggota Keluarga", "02-02-1991", "Belum Kawin", "ibuFake2",    "Perempuan",   "Wiraswasta",               "AlamatFake2", "002", "002", "DKI JAKARTA", "Jakarta Selatan", "KecamatanFake2", "KelurahanFake2", "Kristen",   "SLTP/SEDERAJAT",          "B",   "Istri",     "Warga Negara Indonesia", "ayahFake2", "0822222222", "Tidak Disabilitas", "002", "002", "DKI JAKARTA", "KecamatanFake2", "KelurahanFake2", "Tidak", "Tidak", "Tidak", "6000000", "2"},
            {"12345678901233", "pendaftarFake3", "Kepala Keluarga",   "03-03-1992", "Kawin",            "ibuFake3",    "Laki-Laki",       "Pewagai Negeri Sipil", "AlamatFake3", "003", "003", "DKI JAKARTA", "Jakarta Barat",     "KecamatanFake3", "KelurahanFake3", "Katolik",   "STRATA II",                        "O",  "Suami", "Warga Negara Indonesia", "ayahFake3", "0833333333", "Tidak Disabilitas", "003", "003", "DKI JAKARTA", "KecamatanFake3", "KelurahanFake3", "Tidak", "Tidak", "Tidak", "7000000", "3"},
            {"12345678901234", "pendaftarFake4", "Anggota Keluarga", "04-04-1993", "Belum Kawin", "ibuFake4",    "Perempuan",    "Guru",                        "AlamatFake4", "004", "004", "DKI JAKARTA", "Jakarta Utara",     "KecamatanFake4", "KelurahanFake4", "Hindu",     "DIPLOMA IV/ STRATA I",   "AB", "Anak",  "Warga Negara Indonesia", "ayahFake4", "0844444444", "Tidak Disabilitas", "004", "004", "DKI JAKARTA", "KecamatanFake4", "KelurahanFake4", "Ya",      "Tidak", "Ya",     "8000000", "4"}
        };
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            statement = connection.prepareStatement("INSERT INTO "+TABLE_NAME+" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            for (int i = 0; i < fakeData.length; i++) {
                Thread.sleep((i+2)*100);
                java.util.Date parsedDate = dateFormat.parse(fakeData[i][3]);
                java.sql.Date tanggalLahir = new java.sql.Date(parsedDate.getTime());
                statement.setDate(4, tanggalLahir);
                statement.setString(1, fakeData[i][0]);
                statement.setString(2, fakeData[i][1]);
                statement.setString(3, fakeData[i][2]);
                statement.setDate(4,tanggalLahir);
                statement.setString(5, fakeData[i][4]);
                statement.setString(6, fakeData[i][5]);
                statement.setString(7, fakeData[i][6]);
                statement.setString(8, fakeData[i][7]);
                statement.setString(9, fakeData[i][8]);
                statement.setString(10, fakeData[i][9]);
                statement.setString(11, fakeData[i][10]);
                statement.setString(12, fakeData[i][11]);
                statement.setString(13, fakeData[i][12]);
                statement.setString(14, fakeData[i][13]);
                statement.setString(15, fakeData[i][14]);
                statement.setString(16, fakeData[i][15]);
                statement.setString(17, fakeData[i][16]);
                statement.setString(18, fakeData[i][17]);
                statement.setString(19, fakeData[i][18]);
                statement.setString(20, fakeData[i][19]);
                statement.setString(21, fakeData[i][20]);
                statement.setString(22, fakeData[i][21]);
                statement.setString(23, fakeData[i][22]);
                statement.setString(24, fakeData[i][23]);
                statement.setString(25, fakeData[i][24]);
                statement.setString(26, fakeData[i][25]);
                statement.setString(27, fakeData[i][26]);
                statement.setString(28, fakeData[i][27]);
                statement.setString(29, fakeData[i][28]);
                statement.setString(30, fakeData[i][29]);
                statement.setString(31, fakeData[i][30]);
                statement.setString(32, fakeData[i][31]);
                statement.setString(33, fakeData[i][32]);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Gagal Membuat Fake Data : "+e.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(PendaftarDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
             if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
