package Tugas;

public class TasLaptop extends Tas {

    boolean waterproof;
    int ukuranLaptop;

    public TasLaptop(double berat, int jumlahRuang, int jumlahKantong,
                     String warna, String merk,
                     boolean waterproof, int ukuranLaptop) {

        super(berat, jumlahRuang, jumlahKantong, warna, merk);

        this.waterproof = waterproof;
        this.ukuranLaptop = ukuranLaptop;
    }

    @Override
    public void tambahBarang(int jumlah) {
        jumlahBarang += jumlah;

        System.out.println(
            jumlah + " barang ditambahkan ke tas laptop."
        );

        System.out.println(
            "Jumlah barang sekarang: " + jumlahBarang
        );
    }

    @Override
    public void kurangiBarang(int jumlah) {
        jumlahBarang -= jumlah;

        if (jumlahBarang < 0) {
            jumlahBarang = 0;
        }

        System.out.println(
            jumlah + " barang dikeluarkan dari tas laptop."
        );

        System.out.println(
            "Jumlah barang sekarang: " + jumlahBarang
        );
    }

    @Override
    public void kosongkan() {
        jumlahBarang = 0;

        System.out.println(
            "Tas laptop telah dikosongkan."
        );
    }

    @Override
    public void cetakInformasi() {
        System.out.println("===== TAS LAPTOP =====");

        super.cetakInformasi();

        System.out.println(
            "Waterproof     : " + waterproof
        );

        System.out.println(
            "Ukuran Laptop  : " + ukuranLaptop + " inch"
        );
    }
}