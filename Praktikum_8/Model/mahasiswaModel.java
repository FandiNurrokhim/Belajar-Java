package Praktikum_8.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.a.SqlDateValueEncoder;

import Praktikum_8.Koneksi;

import static Praktikum_8.Koneksi.cekKoneksi; // import kelas Koneksi

public class mahasiswaModel {

    private String nim, nama, jenis_kelamin, jurusan;

    public mahasiswaModel() {
        cekKoneksi();
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getJenisKelamin() {
        return jenis_kelamin;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public static ResultSet all() {
        try {

            Koneksi.cekKoneksi();
            String sql = "SELECT * FROM mahasiswa";

            Statement stmt = Koneksi.getStmt();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (Exception e) {
            System.out.println("Error tampil data: " + e.getMessage());
        }
        return null;
    }

    public static ResultSet find(String pilihNim) {
        try {

            Koneksi.cekKoneksi();
            String sql = "SELECT * FROM mahasiswa where nim = '%s'";
            sql = String.format(sql, pilihNim);

            Statement stmt = Koneksi.getStmt();
            ResultSet rs = stmt.executeQuery(sql);

            if (!rs.next()) {
                System.out.println("Data tidak ditemukan");
                return null;
            } else {
                return rs;
            }
        } catch (Exception e) {
            System.out.println("Error tampil data: " + e.getMessage());
            return null;
        }
    }

    public static void store(mahasiswaModel object) {
        try {
            Koneksi.cekKoneksi();

            String sql = "INSERT INTO mahasiswa (nim, nama, jenis_kelamin, jurusan) VALUES ('%s', '%s', '%s', '%s')";
            sql = String.format(sql, object.nim, object.nama, object.getJenisKelamin(), object.getJurusan());

            // EKSEKUSI QUERY
            Statement stmt = Koneksi.getStmt();
            stmt.executeUpdate(sql);

            System.out.println("Data berhasil ditambahkan");

        } catch (Exception e) {
            System.out.println("Error tampil data: " + e.getMessage());
        }
    }

    public static void update(String pilihNim, mahasiswaModel object) {
        try {
            Koneksi.cekKoneksi();
            String sql = "UPDATE mahasiswa SET nim = '%s', nama = '%s', jenis_kelamin = '%s', jurusan = '%s' WHERE nim = '%s'";

            sql = String.format(sql, object.getNim(), object.getNama(), object.getJenisKelamin(), object.getJurusan(),
                    pilihNim);

            Statement stmt = Koneksi.getStmt();

            int updatedRows = stmt.executeUpdate(sql);
            if (updatedRows > 0) {
                System.out.println("Sukses update data");
            } else {
                System.out.println("Data tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println("Error update data: " + e.getMessage());
        }
    }

    public static void delete(String pilihNim) {
        try {

            Connection conn = Koneksi.cekKoneksi();
            String sql = "DELETE FROM mahasiswa WHERE nim = '%s' ";
            sql = String.format(sql, pilihNim);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Data berhasil dihapus dari database");
        } catch (Exception e) {
            System.out.println("Data gagal dihapus dari database: " + e.getMessage());
        }
    }

}
