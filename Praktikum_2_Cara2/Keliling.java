package Praktikum_2_Cara2;

public class Keliling {

    public Double alas, tinggi, panjang, lebar, sisi, diameter; // deklarasi variabel

    // METHOD
    public Double kelilingPersegiPanjang(Double panjang, Double lebar) {
        // Tampilkan berapa panjang dan lebar sebelum di kalkulasi
        System.out.println("Panjang = " + panjang + "\nLebar   = " + lebar);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "2 x (" + panjang + " + " + lebar + ")");

        return 2 * (panjang + lebar);
    }

    public Double kelilingLingkaran(Double diameter) {
        // Tampilkan berapa diameter sebelum di kalkulasi
        System.out.println("Diameter = " + diameter);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "phi yaitu 3,14 atau bisa juga 22/7 x 2 x" + diameter);

        return 3.14 * 2 * diameter;
    }

    public Double kelilingPersegi(Double sisi) {
        // Tampilkan berapa sisi persegi sebelum di kalkulasi
        System.out.println("Sisi Persegi = " + sisi);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "4 x " + sisi + "\n");

        return 4 * sisi;
    }
}

// buat luas menjadi class extend dari class Keliling agar dapat mengakses tipe
// datanya
class Luas extends Keliling {

    public Double luasSegitiga(Double alas, Double tinggi) {
        // Tampilkan berapa alas dan tinggi dari segitiga sebelum di kalkulasi
        System.out.println("Alas = " + alas + "\nTinggi = " + tinggi);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "1/2 x " + alas + " x " + tinggi);

        return 1 / 2 * alas * tinggi;
    }

    public Double luasLingkaran(Double diameter) {
        // Tampilkan berapa diameter dari lingkaran sebelum di kalkulasi
        System.out.println("Diameter = " + diameter);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + "phi bisa 3,14 atau 22/7 x " + diameter + " x " + diameter);

        return 3.14 * diameter * diameter;
    }

    public Double luasPersegi(Double panjang, Double lebar) {
        // Tampilkan berapa panjang dan lebar dari persegi panjang sebelum di kalkulasi
        System.out.println("Panjang = " + panjang + "\n Lebar  = " + lebar);
        // Tampilkan bagaimana rumus bekerja
        System.out.println("Rumusnya adalah \n" + panjang + " x " + lebar);

        return panjang * lebar;
    }

}
