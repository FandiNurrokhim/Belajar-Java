package Praktikum_6;

public abstract class Mahasiswa {
    public String nim;
    public String nama;
    public String jurusan;

    public abstract void ambilKrs(int sks);

    public abstract void cetakKrs();

    // SETTER GETTER
    // NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    // Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Jurusan
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

}
