package Praktikum_4;

public class Manusia {
    public String nama, alamat; // deklarasi variabel
    private int umur;

    // Set nama, alamt, umur
    public void setAttribute(String nama, String alamat, int umur) { // buat method set atrribut agar dapat diakses oleh
                                                                     // child classnya
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    // Getter
    public int tampilUmur() {
        System.out.println("Manusia dengan nama : " + this.nama + " memiliki umur : " + this.umur);
        return umur;
    }

    public String tampilNama() { // digunakan untuk menampilkan nama tiap tiap object
        System.out.println("Manusia dengan nama : " + this.nama + "\n");
        return nama;
    }

    public String tampilAlamat() { // digunakan untuk menampilkan alamat tiap tiap object
        return alamat;
    }
}

class Mahasiswa extends Manusia {
    String nim, jurusan;

    public Mahasiswa(String nama, String alamat, String nim, String jurusan, int umur) {
        super.setAttribute(nama, alamat, umur); // menggunakan super untuk mengakses nama dan alamat di manusia
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void ambilSks(int sks) { // buat variabel sks
        if (tampilUmur() < 20 && sks > 20) {
            System.out.println("\nMaaf," + tampilNama() + " dengan umur " + tampilUmur()
                    + " tidak diizinkan mengambil SKS lebih dari 20");
        } else {
            Math.max(sks, 24);
            System.err.println(tampilNama() + " dengan umur : " + tampilUmur() + " boleh mengambil " + sks + " SKS"); // tampilkan
            // object yang
            // mengambil sks
        }
    }
}

class Dosen extends Manusia {
    String NIDN, spesialis;
    private String gender;

    public Dosen(String nama, String alamat, String NIDN, String spesialis, String gender, int umur) { // constructor
                                                                                                       // saat buat
        // object Dosen
        super.setAttribute(nama, alamat, umur); // menggunakan super.metdho setAttribut agar dapat mengakses umur yang
                                                // di private
        this.NIDN = NIDN;
        this.spesialis = spesialis;
        this.gender = gender;
    }

    public void detailDosen() {
        System.out
                .println(tampilNama() + " Adalah dosen " + gender + " dengan umur " + tampilUmur() + " dan spesialis " +
                        spesialis);
    }
}
