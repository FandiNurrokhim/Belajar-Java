package Praktikum_2;

public class Main {
    public static void main(String[] args) {
        // buat object terlebih dahulu
        Keliling apapunKeliling = new Keliling();
        Luas apapunLuas = new Luas();

        // Keliling
        System.out.println("Hasilnya adalah = " + apapunKeliling.kelilingPersegiPanjang(4.0, 5.5));
        // Lingkaran
        System.out.println("Hasilnya adalah = " + apapunKeliling.kelilingLingkaran(3.5));
        // Persegi
        System.out.println("Hasilnya adalah = " + apapunKeliling.kelilingPersegi(4.0));

        // Luas
        System.out.println("Hasilnya adalah = " + apapunLuas.luasSegitiga(2.9, 9.9));
        // Lingkaran
        System.out.println("Hasilnya adalah = " + apapunLuas.luasLingkaran(4.45));
        // Persegi
        System.out.println("Hasilnya adalah = " + apapunLuas.luasPersegi(9.5, 5.3));
    }
}
