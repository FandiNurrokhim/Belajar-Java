import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukan banyak data yang ingin diinput : ");
        int n = input.nextInt();

        Mahasiswa[] mhs = new Mahasiswa[n];
        Nilai[] nil = new Nilai[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan NIM: ");
            String nim = input.next();
            input.nextLine();
            System.out.print("Masukkan NAMA: ");
            String nama = input.nextLine();
            System.out.print("Nilai UTS: ");
            int uts = input.nextInt();
            System.out.print("Nilai UAS: ");
            int uas = input.nextInt();
            System.out.println("\n");

            mhs[i] = new Mahasiswa(nim, nama);
            nil[i] = new Nilai(uts, uas);
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("NO  NIM            NAMA                 UTS     UAS     RATA-RATA     NILAI HURUF");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            // Format untuk tampilan panjang digit
            System.out.printf("%-4d%-15s%-20s%-8d%-8d%-10.1f%-6c%n",
                    i + 1, mhs[i].getNim(), mhs[i].getNama(), nil[i].getUts(), nil[i].getUas(),
                    nil[i].getRerata(), nil[i].getNilaiHuruf());
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
}
