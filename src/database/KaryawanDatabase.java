package database;

import java.sql.*;
import helper.Role;

public class KaryawanDatabase {
    public static final String TABLE_NAME = "karyawan";
    public static final String NO_PEGAWAI = "no_pegawai";
    public static final String NAMA = "nama";
    public static final String ROLE = "role";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String NO_HP = "no_hp";
    public static final String EMAIL = "email";
    public static final String TEMPAT_TUGAS = "tempat_tugas";
    public static final String ALAMAT = "alamat";

    public static void createTable() {
        Connection connection = new KoneksiDatabase().connect();
        Statement statement = null;
        try {
            statement = connection.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    NO_PEGAWAI + " INT NOT NULL, " +
                    NAMA + " VARCHAR(100) NOT NULL, " +
                    ROLE + " VARCHAR(20) NOT NULL, " +
                    USERNAME + " VARCHAR(50) NOT NULL, " +
                    PASSWORD + " VARCHAR(50) NOT NULL, " +
                    NO_HP + " VARCHAR(15) NOT NULL, " +
                    EMAIL + " VARCHAR(100) NOT NULL, " +
                    TEMPAT_TUGAS + " VARCHAR(255), " +
                    ALAMAT + " VARCHAR(255), " +
                    "PRIMARY KEY (" + NO_PEGAWAI + ")) ENGINE = InnoDB";

            String dropQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;

            statement.executeUpdate(dropQuery);

            statement.executeUpdate(query);

            System.out.println("Tabel berhasil dibuat!");

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat membuat tabel!" + e.getMessage());
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

    public static void createFakeData() throws InterruptedException {
        Connection connection = new KoneksiDatabase().connect();
        PreparedStatement statement = null;
        String[][] fakeData = {
                {"001", "fooFake1", Role.ADMIN.toString(), "admin1", "admin1", "123456789", "admin1@example.com", "Jakarta Timur", "Jl Contoh 1"},
                {"002", "fooFake2", Role.ADMIN.toString(), "admin2", "admin2", "987654321", "admin2@example.com", "Jakarta Selatan", "Jl Contoh 1"},
                {"003", "fooFake3", Role.PETUGAS.toString(), "petugas1", "petugas1", "111111111", "petugas1@example.com", "Jakarta Timur", "Jl Contoh 1"},
                {"004", "fooFake4", Role.PETUGAS.toString(), "petugas2", "petugas2", "999999999", "petugas2@example.com", "Jakarta Selatan", "Jl Contoh 1"},
        };
        try {
            statement = connection.prepareStatement("INSERT INTO " + TABLE_NAME + " values(?,?,?,?,?,?,?,?,?)");
            for (int i = 0; i < fakeData.length; i++) {
                Thread.sleep((i + 2) * 100);
                statement.setString(1, fakeData[i][0]);
                statement.setString(2, fakeData[i][1]);
                statement.setString(3, fakeData[i][2]);
                statement.setString(4, fakeData[i][3]);
                statement.setString(5, fakeData[i][4]);
                statement.setString(6, fakeData[i][5]);
                statement.setString(7, fakeData[i][6]);
                statement.setString(8, fakeData[i][7]);
                statement.setString(9, fakeData[i][8]);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Gagal Membuat Fake Data : " + e.getMessage());
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
