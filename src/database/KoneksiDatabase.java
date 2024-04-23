package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KoneksiDatabase {
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Koneksi"+ ex);
        }
        try {
            String url = "jdbc:mysql://localhost:3306/p_visual";
            String user = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url, user, password);

//            System.out.println("Database connected!");
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cannot connect the database !", "Connection Database", JOptionPane.ERROR_MESSAGE);
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
