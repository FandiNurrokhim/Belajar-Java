package Praktikum_1;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Dosen[] dosen = new Dosen[3];

        for (int i = 0; i < 2; i++) {
            System.out.println("Masukan Data ke-" + i); // untuk mengetahui nomor data yang diinputkan

            System.out.print("Masukan nidn       : "); // Buat field inputan
            int nidn = input.nextInt(); // inputkan data menggunakan input.nextTipeData();

            input.nextLine(); // digunakan supaya bisa input nama
            System.out.print("Masukan name       : ");
            String name = input.nextLine(); // Gunakan nextLine() untuk tipe data string

            System.out.print("Masukan specialist : ");
            String specialist = input.nextLine(); // inputkan spesialis
            System.out.println("=============================\n");

            dosen[i] = new Dosen(nidn, name, specialist); // panggil object dosen dengan buat obejct new Dosen(parameter
                                                          // sesuai di file Dosen.java), masukan data inputan tadi
        }

        Dosen.showData(dosen);
    }
}
