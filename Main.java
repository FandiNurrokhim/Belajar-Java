import java.util.Scanner;

public class Main {

    // static double Fungsi(double a, double b) {
    // if (a > b) {
    // return a;
    // } else {
    // return b;
    // }
    // }

    // static void Fungsi2() {
    // System.out.println("Coba banggg");
    // }

    public static void main(String args[]) {
        // Digunakan untuk inputan
        Scanner input = new Scanner(System.in);

        System.out.print("Nama  : ");
        String nama = input.nextLine();
        System.out.print("Nim   : ");
        String nim = input.next();
        System.out.print("Kelas : ");
        String kelas = input.next();

        System.out.print("\n\nMasukan Bilangan 1 = ");
        double bil1 = input.nextDouble();

        System.out.print("Masukan Bilangan 2 = ");
        double bil2 = input.nextDouble();

        System.out.println("================================\n" + "Nama :" + nama + "\n" + "Nim : " + nim + "\n"
                + "Kelas : " + kelas);
        System.out.println("\n\nBilangan yang lebih besar adalah = " + Math.max(bil1, bil2));
        System.out.println("\nBilangan yang lebih Kecil adalah = " + Math.min(bil1, bil2));
        System.out.println("\nBilangan Random = " + (int) (Math.random() * 99));
    }
}
