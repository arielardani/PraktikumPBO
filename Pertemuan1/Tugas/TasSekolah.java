package Tugas;

public class TasSekolah extends Tas {

    String bahan;
    String jenisTas;

    public TasSekolah(double berat, int jumlahRuang, int jumlahKantong,
                      String warna, String merk,
                      String bahan, String jenisTas) {

        super(berat, jumlahRuang, jumlahKantong, warna, merk);

        this.bahan = bahan;
        this.jenisTas = jenisTas;
    }

    @Override
    public void tambahBarang(int jumlah) {
        jumlahBarang += jumlah;

        System.out.println(
            jumlah + " barang ditambahkan ke tas sekolah."
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
            jumlah + " barang dikeluarkan dari tas sekolah."
        );

        System.out.println(
            "Jumlah barang sekarang: " + jumlahBarang
        );
    }

    @Override
    public void kosongkan() {
        jumlahBarang = 0;

        System.out.println(
            "Tas sekolah telah dikosongkan."
        );
    }

    @Override
    public void cetakInformasi() {
        System.out.println("===== TAS SEKOLAH =====");

        super.cetakInformasi();

        System.out.println(
            "Bahan          : " + bahan
        );

        System.out.println(
            "Jenis Tas      : " + jenisTas
        );
    }
}