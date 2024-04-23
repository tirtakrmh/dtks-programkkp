package database;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ValidasiMuskelDatabase {
    public static final String TABLE_NAME = "validasi_muskel";
    public static final String ID = "id";
    public static final String KETERANGAN = "keterangan";
    public static final String ALASAN = "alasan";
    public static final String NIK_PENDAFTAR = "nik_pendaftar";
    public static final String NO_PEGAWAI = "no_pegawai";
    public static final String ID_MUSKEL = "id_muskel";
    
    public static void createTable(){
        Connection connection = new KoneksiDatabase().connect();
        Statement statement = null;
        try {
            statement = connection.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    ID+" INT NOT NULL AUTO_INCREMENT, "
                    +KETERANGAN+" VARCHAR(30) NOT NULL , "
                    +ALASAN+" VARCHAR(255) NOT NULL , "
                    +NIK_PENDAFTAR+" VARCHAR(30) NOT NULL , "
                    +NO_PEGAWAI+" INT NOT NULL , "
                    +ID_MUSKEL+" INT NOT NULL , "
                    +" FOREIGN KEY ("+NIK_PENDAFTAR+") REFERENCES "+PendaftarDatabase.TABLE_NAME+"("+PendaftarDatabase.NIK+") ON DELETE CASCADE, "
                    +" FOREIGN KEY ("+NO_PEGAWAI+") REFERENCES "+KaryawanDatabase.TABLE_NAME+"("+KaryawanDatabase.NO_PEGAWAI+") ON DELETE CASCADE, "
                    +" FOREIGN KEY ("+ID_MUSKEL+") REFERENCES "+MuskelDatabase.TABLE_NAME+"("+MuskelDatabase.ID+") ON DELETE CASCADE, "
                    + "PRIMARY KEY ("+ID+")) ENGINE = InnoDB";

            String dropQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;

            statement.executeUpdate(dropQuery);

            statement.executeUpdate(query);

            System.out.println("Tabel berhasil dibuat!");

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat membuat tabel!"+e.getMessage());
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
    
    public static void createFakeData() throws InterruptedException, ParseException{
        Connection connection = new KoneksiDatabase().connect();
        PreparedStatement statement = null;
        String[][] fakeData = {
            {"1", "Tidak Layak", "Memiliki Mobil", "12345678901231", "3", "1"},
            {"2", "Layak", "", "12345678901232", "3", "1"},
            {"3", "Layak", "", "12345678901233", "4", "2"},
            {"4", "Tidak Layak", "Dinilai TIdak Miskin", "12345678901234", "4", "2"},
        };
        try {
            statement = connection.prepareStatement("INSERT INTO "+TABLE_NAME+" values(?,?,?,?,?,?)");
            for (int i = 0; i < fakeData.length; i++) {
                Thread.sleep((i+2)*100);
                statement.setString(1, fakeData[i][0]);
                statement.setString(2, fakeData[i][1]);
                statement.setString(3, fakeData[i][2]);
                statement.setString(4, fakeData[i][3]);
                statement.setString(5, fakeData[i][4]);
                statement.setString(6, fakeData[i][5]);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Gagal Membuat Fake Data : "+e.getMessage());
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
