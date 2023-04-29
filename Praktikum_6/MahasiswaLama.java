package Praktikum_6;

public class MahasiswaLama extends Mahasiswa {

    public MahasiswaLama(String nama, String nim, String jurusan) {
        super.nama = nama;
        super.nim = nim;
        super.jurusan = jurusan;
    }

    @Override
    public void ambilKrs(int sks) {
        if (sks > 24) {
            System.out.println("Mahasiswa " + getNama() + " NIM: " + getNim() + " tidak boleh ambil lebih dari 20 SKS");
        }
    }

    @Override
    public void cetakKrs() {
        System.out.println("Mahasiswa " + getNama() + " telah mengambil KRS dengan maksimal 20 SKS");
    }
}
