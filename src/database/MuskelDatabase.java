package database;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class MuskelDatabase {
    public static final String TABLE_NAME = "muskel";
    public static final String ID = "id";
    public static final String NAMA = "nama";
    public static final String TANGGAL_MULAI = "tanggal_mulai";
    public static final String TANGGAL_AKHIR = "tanggal_akhir";
    public static final String DANA = "dana";
    
    public static void createTable(){
        Connection connection = new KoneksiDatabase().connect();
        Statement statement = null;
        try {
            statement = connection.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    ID+" INT NOT NULL AUTO_INCREMENT, "
                    +NAMA+" VARCHAR(100) NOT NULL , "
                    +TANGGAL_MULAI+" DATE NOT NULL , "
                    +TANGGAL_AKHIR+" DATE , "
                    +DANA+" VARCHAR(20) , "
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
            {"1", "Muskel Pendaftaran Tahap 1 - 2023", "01-06-2023", "20-12-2023", "Belum Diketahui"},
            {"2", "Muskel Kelayakan DTKS November 2023", "01-06-2023", "28-11-2023",  "Belum Diketahui"},
            {"3", "Dummy Data 3",  "01-06-2023", null,  "Belum Diketahui"},
            {"4", "Dummy Data 4",  "01-06-2023", null, "Belum Diketahui"}
        };
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            statement = connection.prepareStatement("INSERT INTO "+TABLE_NAME+" values(?,?,?,?,?)");
            for (int i = 0; i < fakeData.length; i++) {
                Thread.sleep((i+2)*100);
                java.util.Date parsedDate = dateFormat.parse(fakeData[i][2]);
                java.sql.Date tglMulai = new java.sql.Date(parsedDate.getTime());
                java.sql.Date tglAkhir = null;
                if (fakeData[i][3] != null) {
                    parsedDate = dateFormat.parse(fakeData[i][3]);
                   tglAkhir = new java.sql.Date(parsedDate.getTime());
                }
                
                statement.setString(1, fakeData[i][0]);
                statement.setString(2, fakeData[i][1]);
                statement.setDate(3, tglMulai);
                statement.setDate(4, tglAkhir);
                statement.setString(5, fakeData[i][4]);
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
