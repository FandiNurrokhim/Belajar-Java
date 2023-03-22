package Praktikum_2_Cara1;

public class Persegi {
    Double sisi, panjang, lebar;

    // keliling
    public Double kelilingPersegi(Double sisi) {
        // Tampilkan berapa sisi persegi sebelum di kalkulasi
        System.out.println("Sisi Persegi = " + sisi);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "4 x " + sisi + "\n");

        return 4 * sisi;
    }

    // luas
    public Double luasPersegi(Double panjang, Double lebar) {
        // Tampilkan berapa panjang dan lebar dari persegi panjang sebelum di kalkulasi
        System.out.println("Panjang = " + panjang + "\n Lebar  = " + lebar);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + panjang + " x " + lebar);

        return panjang * lebar;
    }

}
