package Pertemuan2;

public class TransaksiPeminjamanBuku {
    public String idTransaksi;
    public String namaPeminjam;
    public String judulBuku;
    public int jumlahHariKeterlambatan;
    public double dendaPerHari = 1000.0;

    public double hitungDenda() {
        return jumlahHariKeterlambatan * dendaPerHari;
    }
    
    public void tampilInfoTransaksi() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Nama Peminjam: " + namaPeminjam);
        System.out.println("Judul Buku   : " + judulBuku);
        System.out.println("Jumlah Hari Keterlambatan: " + jumlahHariKeterlambatan);
        System.out.println("Denda Per Hari: Rp " + dendaPerHari);
        System.out.println("Total Denda  : Rp " + hitungDenda());
    }
}
