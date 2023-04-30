package Praktikum_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {
    static Connection conn;
    static Statement stmt;
    static String database = "praktikum_pbo";
    static String port = "3306";
    static String url = "jdbc:mysql://localhost:" + port + "/" + database;
    static String user = "root";
    static String pass = "";

    public static Connection cekKoneksi() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi gagal " + e.getMessage());
        }
        return conn;
    }

    public static Connection getConn() {
        return conn;
    }

    public static Statement getStmt() {
        return stmt;
    }

}
