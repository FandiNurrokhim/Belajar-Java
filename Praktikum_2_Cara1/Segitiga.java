package Praktikum_2_Cara1;

public class Segitiga {
    Double alas, tinggi;

    Double luasSegitiga(Double alas, Double tinggi) {
        // Tampilkan berapa alas dan tinggi dari segitiga sebelum di kalkulasi
        System.out.println("Alas = " + alas + "\nTinggi = " + tinggi);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "1/2 x " + alas + " x " + tinggi);

        return 1 / 2 * alas * tinggi;
    }
}
