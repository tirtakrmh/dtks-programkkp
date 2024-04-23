package database;

import java.sql.*;
public class UserDatabase {
    public static final String TABLE_NAME = "user";
    public static final String ID = "id";
    public static final String NO_KK = "no_kk";
    public static final String NAMA_LENGKAP = "nama_lengkap";
    public static final String EMAIL = "email";
    public static final String NO_HP = "no_hp";
    public static final String PASSWORD = "password";
    
    public static void createTable(){
        Connection connection = new KoneksiDatabase().connect();
        Statement statement = null;
        try {
            statement = connection.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    ID+" INT NOT NULL AUTO_INCREMENT, "
                    +NO_KK+" VARCHAR(30) NOT NULL , "
                    +NAMA_LENGKAP+" VARCHAR(40) NOT NULL , "
                    +EMAIL+" VARCHAR(100) , "
                    +NO_HP+" VARCHAR(15) , "
                    +PASSWORD+" VARCHAR(20) NOT NULL , "
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
    
    public static void createFakeData() throws InterruptedException{
        Connection connection = new KoneksiDatabase().connect();
         PreparedStatement statement = null;
        String[][] fakeData = {
            {"001", "12345678901231", "userFake1", "userFake1@mail.com", "6281211112221", "userFake1"},
            {"002", "12345678901232", "userFake2", "userFake2@mail.com", "6282211112222", "userFake2"},
            {"003", "12345678901233", "userFake3", "userFake3@mail.com", "6283211112223", "userFake3"},
            {"004", "12345678901234", "userFake4", "userFake4@mail.com", "6284211112224", "userFake4"},
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
