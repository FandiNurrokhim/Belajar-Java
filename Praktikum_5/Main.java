package Praktikum_5;

public class Main {
    public static void main(String[] args) {
        var tes = new BangunRuang();
        tes.deskripsiBangun();

        tes = new Segitiga(2.0, 2.0, 2.0);
        tes.deskripsiBangun();

        tes = new PersegiPanjang(4.0, 3.0);
        tes.deskripsiBangun();

        tes = new Lingkaran(1.0);
        tes.deskripsiBangun();
    }
}
