package Praktikum_5;

public class BangunRuang {
    public void deskripsiBangun() {
        System.out.println("Semua bangun ruang memiliki luas dan keliling");
    }
}

// CLASS SEGITIGA
class Segitiga extends BangunRuang {
    Double alas;
    Double tinggi;
    Double tegak;

    public Segitiga(Double alas, Double tinggi, Double tegak) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.tegak = tegak;
    }

    public Double kelilingBangun() {
        return alas + tinggi + tegak;
    }

    public Double luasBangun() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public void deskripsiBangun() {
        System.out.println("Segitiga memiliki luas " + luasBangun() + " dan keliling " + kelilingBangun() + "\n");
    }
}

class PersegiPanjang extends BangunRuang {
    Double panjang;
    Double lebar;

    public PersegiPanjang(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Double kelilingBangun() {
        return 2 * (panjang + lebar);
    }

    public Double luasBangun() {
        return panjang * lebar;
    }

    @Override
    public void deskripsiBangun() {
        System.out.println("Bangun Ruang: Persegi Panjang memiliki luas " + luasBangun() + " dan keliling "
                + kelilingBangun() + "\n");
    }

}

class Lingkaran extends BangunRuang {
    Double jari_jari;

    public Lingkaran(Double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public Double luasBangun() {
        return Math.PI * jari_jari * jari_jari;
    }

    @Override
    public void deskripsiBangun() {
        System.out.println("Ini adalah bangun ruang lingkaran dengan luas " + luasBangun());
    }

}
