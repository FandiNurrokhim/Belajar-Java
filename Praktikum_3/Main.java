package Praktikum_3;

public class Main {
    public static void main(String[] args) {

        Mahasiswa bambang = new Mahasiswa("Bambang", "bandar", "222", "Sastra Informatika");
        bambang.ambilSks(4);

        Dosen Ahmad = new Dosen("Ahmad dhani", "", "123", "Rekayasa Perangkat Lunak");
        Ahmad.detailDosen();
    }
}
