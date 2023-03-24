package Praktikum_4;

public class Main {
    public static void main(String[] args) {
        var manusia = new Manusia();

        manusia.setAttribute("bambang", "bandar", 20);
        manusia.tampilNama();
        manusia.tampilUmur();
        manusia.tampilAlamat();

        var mahasiswa1 = new Mahasiswa("nasakom", "magetan", "222", "sastra pertanian", 13);

        mahasiswa1.ambilSks(21);

        var dosen1 = new Dosen("Mukti", null, null, "Rekayasa Perangkat Lunak", "Laki-laki", 25);

        dosen1.detailDosen();
    }
}
