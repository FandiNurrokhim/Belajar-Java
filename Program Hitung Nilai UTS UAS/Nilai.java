public class Nilai {
    private int uts;
    private int uas;
    private double rerata;
    private char nilaiHuruf;

    public Nilai(int uts, int uas) {
        this.uts = uts;
        this.uas = uas;
        this.rerata = (uts + uas) / 2.0;
        this.nilaiHuruf = hitungNilaiHuruf(this.rerata);
    }

    private char hitungNilaiHuruf(double rataRata) {
        if (rataRata >= 90) {
            return 'A';
        } else if (rataRata >= 80) {
            return 'B';
        } else if (rataRata >= 70) {
            return 'C';
        } else if (rataRata >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public int getUts() {
        return uts;
    }

    public int getUas() {
        return uas;
    }

    public double getRerata() {
        return rerata;
    }

    public char getNilaiHuruf() {
        return nilaiHuruf;
    }
}
