package Praktikum_7;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("111", "Ali", "Lanang og", "Stastra Elektro");

        Mahasiswa mhs1_edit = new Mahasiswa("111", "Aldooooo", "Lanang og", "Teknik Informatika");

        Mahasiswa.hapusData("222");

        Mahasiswa.tampil_data();
    }
}
