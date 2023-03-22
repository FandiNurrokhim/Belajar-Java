package Praktikum_2_Cara1;

public class Lingkaran {
    Double jari_jari;

    Double kelilingLingkaran(Double jari_jari) {
        // Tampilkan berapa jari-jari sebelum di kalkulasi
        System.out.println("Jari-jari lingkaran = " + jari_jari);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "phi yaitu 3,14 atau bisa juga 22/7 x 2 x" + jari_jari);

        return 3.14 * 2 * jari_jari;
    }

    Double luasLingkaran(Double jari_jari) {
        // Tampilkan berapa jari-jari dari lingkaran sebelum di kalkulasi
        System.out.println("jari-jari lingkaran = " + jari_jari);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "phi bisa 3,14 atau 22/7 x " + jari_jari + " x " + jari_jari);

        return 3.14 * jari_jari * jari_jari;
    }
}
