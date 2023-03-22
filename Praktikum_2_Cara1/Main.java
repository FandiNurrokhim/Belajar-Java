package Praktikum_2_Cara1;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();

        // Segitiga
        System.out.println("Hasilnya adalah = " + segitiga.luasSegitiga(2.4, 3.6));

        // Persegi Panjang
        System.out.println("Hasilnya adalah = " + persegiPanjang.kelilingPersegiPanjang(4.0, 4.0));

        // Lingkaran
        System.out.println("Hasilnya adalah = " + lingkaran.kelilingLingkaran(4.0)); // keliling lingkaran
        System.out.println("Hasilnya adalah = " + lingkaran.luasLingkaran(5.4)); // luas lingkaran

        // Persegi
        System.out.println("Hasilnya adalah = " + persegi.kelilingPersegi(1.0)); // Keliling Persegi
        System.out.println("Hasilnya adalah = " + persegi.luasPersegi(1.0, 2.5)); // Luas Persegi
    }
}
