package Tugas;

public class Tas {

    double berat;
    int jumlahRuang;
    int jumlahKantong;
    String warna;
    String merk;
    int jumlahBarang = 0;

    public Tas(double berat, int jumlahRuang, int jumlahKantong,
               String warna, String merk) {

        this.berat = berat;
        this.jumlahRuang = jumlahRuang;
        this.jumlahKantong = jumlahKantong;
        this.warna = warna;
        this.merk = merk;
    }

    public void tambahBarang(int jumlah) {
        jumlahBarang += jumlah;

        System.out.println(jumlah + " barang ditambahkan.");
        System.out.println("Jumlah barang sekarang: " + jumlahBarang);
    }

    public void kurangiBarang(int jumlah) {
        jumlahBarang -= jumlah;

        if (jumlahBarang < 0) {
            jumlahBarang = 0;
        }
        System.out.println(jumlah + " barang dikurangi.");
        System.out.println("Jumlah barang sekarang: " + jumlahBarang);
    }

    public void kosongkan() {
        jumlahBarang = 0;
        System.out.println("Tas dikosongkan.");
    }

    public void cetakInformasi() {
        System.out.println("Berat          : " + berat + " kg");
        System.out.println("Jumlah Ruang   : " + jumlahRuang);
        System.out.println("Jumlah Kantong : " + jumlahKantong);
        System.out.println("Warna          : " + warna);
        System.out.println("Merk           : " + merk);
        System.out.println("Jumlah Barang  : " + jumlahBarang);
    }
}