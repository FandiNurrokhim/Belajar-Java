package Praktikum_2_Cara1;

public class PersegiPanjang {
    Double panjang, lebar;

    Double kelilingPersegiPanjang(Double panjang, Double lebar) {
        // Tampilkan berapa panjang dan lebar sebelum di kalkulasi
        System.out.println("Panjang = " + panjang + "\nLebar   = " + lebar);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "2 x (" + panjang + " + " + lebar + ")");

        return 2 * (panjang + lebar);
    }
}
