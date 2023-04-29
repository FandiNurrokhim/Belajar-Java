package Praktikum_7;

import java.sql.*;

public class Mahasiswa {

    public String nim, nama, jenis_kelamin, jurusan;

    Mahasiswa(String param_nim, String param_nama, String param_jenis_kelamin, String param_jurusan) {
        this.nim = param_nim;
        this.nama = param_nama;
        this.jenis_kelamin = param_jenis_kelamin;
        this.jurusan = param_jurusan;
    }

    public static void tampil_data() {
        try {
            Connection conn = Koneksi.cekKoneksi();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM mahasiswa";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("----------- Tampil Data Mahasiswa ---------------------");
            while (rs.next()) {
                System.out.println("NIM           : " + rs.getString("nim"));
                System.out.println("Nama          : " + rs.getString("nama"));
                System.out.println("Jenis_kelamin : " + rs.getString("jenis_kelamin"));
                System.out.println("Jurusan       : " + rs.getString("jurusan"));
                System.out.println("--------------------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menampilkan data: " + e.getMessage());
        }
    }

    public static void tambah_data(Mahasiswa mhs) {
        try {
            Connection conn = Koneksi.cekKoneksi();
            String query = "INSERT INTO mahasiswa (nim, nama, jenis_kelamin, jurusan) VALUES ('" + mhs.nim + "', '"
                    + mhs.nama + "', '" + mhs.jenis_kelamin + "', '" + mhs.jurusan + "')";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Data berhasil ditambahkan ke database");
        } catch (Exception e) {
            System.out.println("Data gagal ditambahkan ke database: " + e.getMessage());
        }
    }

    public static void editData(String nim, Mahasiswa mhs) {
        try {
            Connection conn = Koneksi.cekKoneksi();
            String query = "UPDATE mahasiswa SET nama = '" + mhs.nama + "', jenis_kelamin = '" + mhs.jenis_kelamin
                    + "', jurusan = '" + mhs.jurusan + "' WHERE nim = '" + nim + "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Data berhasil diupdate di database");
        } catch (Exception e) {
            System.out.println("Data gagal diupdate di database: " + e.getMessage());
        }
    }

    public static void hapusData(String nim) {
        try {
            Connection conn = Koneksi.cekKoneksi();
            String query = "DELETE FROM mahasiswa WHERE nim = '" + nim + "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Data berhasil dihapus dari database");
        } catch (Exception e) {
            System.out.println("Data gagal dihapus dari database: " + e.getMessage());
        }
    }

}
