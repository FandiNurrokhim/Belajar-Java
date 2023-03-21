package Praktikum_1;

public class Dosen {
    public int nidn;
    public String name;
    public String specialist;

    public Dosen(int nidn, String name, String specialist) {
        this.nidn = nidn;
        this.name = name;
        this.specialist = specialist;
    }

    public int getNidn() {
        return nidn;
    }

    public String getName() {
        return name;
    }

    public String getSpecialist() {
        return specialist;
    }

    static void showData(Dosen[] dosen) {
        System.out.println("-----------------------------------");
        System.out.println("NIDN    NAMA            SPESIALIS");
        System.out.println("-----------------------------------");
        // Loop untuk menampilkan data
        for (int i = 0; i < 2; i++) {
            // Format untuk tampilan panjang digit
            System.out.printf("%-7d%-17s%-20s%n",
                    dosen[i].getNidn(),
                    dosen[i].getName(),
                    dosen[i].getSpecialist());
        }
        System.out.println("-----------------------------------");
    }

}