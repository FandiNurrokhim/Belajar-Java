package Praktikum_3;

public class Manusia {
    public String nama, alamat; // deklarasi variabel

    public Manusia(String nama, String alamat) { // constructor saat buat object manusia
        this.nama = nama;
        this.alamat = alamat;
    }

    public String tampilNama() { // digunakan untuk menampilkan nama tiap tiap object
        return nama;
    }

    public String tampilAlamat() { // digunakan untuk menampilkan alamat tiap tiap object
        return alamat;
    }
}

class Mahasiswa extends Manusia {
    String nim, jurusan;

    public Mahasiswa(String nama, String alamat, String nim, String jurusan) {
        super(nama, alamat); // menggunakan super untuk mengakses nama dan alamat di manusia
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void ambilSks(int sks) { // buat variabel sks
        int sks_max = 24; // set maksimal sks 24
        if (sks > 24) {
            System.err.println("Sks Maksimal " + sks_max);
        } else {
            System.err.println("Sks yang diambil oleh " + tampilNama() + " sebanyak " + sks + " SKS"); // tampilkan
                                                                                                       // object yang
                                                                                                       // mengambil sks
        }
    }
}

class Dosen extends Manusia {
    String NIDN, spesialis;

    public Dosen(String nama, String alamat, String NIDN, String spesialis) { // constructor saat buat object Dosen
        super(nama, alamat); // menggunakan super untuk mengakses nama dan alamat di manusia
        this.NIDN = NIDN;
        this.spesialis = spesialis;
    }

    public void detailDosen() {
        System.out.println(tampilNama() + " Adalah dosen dengan spesialis " +
                spesialis);
    }
}
