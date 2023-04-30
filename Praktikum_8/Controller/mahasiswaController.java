package Praktikum_8.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import Praktikum_8.Koneksi;
import Praktikum_8.Model.mahasiswaModel;
import Praktikum_8.View.mahasiswaView;

public class mahasiswaController {

    private final mahasiswaModel model;
    private final mahasiswaView view;
    private String pilih_nim;

    public mahasiswaController(mahasiswaModel model, mahasiswaView view) {
        this.model = model;
        this.view = view;
    }

    public void index() {
        try {
            ResultSet rs = mahasiswaModel.all();
            while (rs.next()) {
                Object[] obj = new Object[4];
                obj[0] = rs.getString("Nim");
                obj[1] = rs.getString("Nama");
                obj[2] = rs.getString("Jenis_Kelamin");
                obj[3] = rs.getString("Jurusan");
                view.table_model.addRow(obj);
            }
        } catch (SQLException e) {
            System.out.println("Error saat menampilkan data " + e.getMessage());
        }
    }

    public void store() {
        model.setNim(view.paramNim);
        model.setNama(view.paramNama);
        model.setJenisKelamin(view.paramJenisKelamin);
        model.setJurusan(view.paramJurusan);
        mahasiswaModel.store(model);
    }

    public void update() {
        pilih_nim = view.paramPilihNim;
        ResultSet rs = mahasiswaModel.find(pilih_nim);

        try {
            if (!rs.next()) {
                System.out.println("Data tidak ditemukan");
                return;
            }
            model.setNim(view.paramNim);
            model.setNama(view.paramNama);
            model.setJenisKelamin(view.paramJenisKelamin);
            model.setJurusan(view.paramJurusan);
            mahasiswaModel.update(pilih_nim, model);
        } catch (SQLException e) {
            System.out.println("Error saat update data: " + e.getMessage());
        }
    }

    public void delete() {
        pilih_nim = view.paramPilihNim;
        mahasiswaModel.find(pilih_nim);
        mahasiswaModel.delete(pilih_nim);
    }
}
