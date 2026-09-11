package Pertemuan2;

public class TestTransaksi {
    public static void main(String[] args) {
        TransaksiPeminjamanBuku transaksi1 = new TransaksiPeminjamanBuku();
        transaksi1.idTransaksi = "TRX001";
        transaksi1.namaPeminjam = "Budi";
        transaksi1.judulBuku = "Dasar Pemrograman Berbasis Objek";
        transaksi1.jumlahHariKeterlambatan = 0;
        transaksi1.tampilInfoTransaksi();
        TransaksiPeminjamanBuku transaksi2 = new TransaksiPeminjamanBuku();
        transaksi2.idTransaksi = "TRX002";
        transaksi2.namaPeminjam = "Budi";
        transaksi2.judulBuku = "Lara Ati";
        transaksi2.jumlahHariKeterlambatan = 3;
        transaksi2.tampilInfoTransaksi();
        TransaksiPeminjamanBuku transaksi3= new TransaksiPeminjamanBuku();
        transaksi3.idTransaksi = "TRX003";
        transaksi3.namaPeminjam = "Budi";
        transaksi3.judulBuku = "About Me";
        transaksi3.jumlahHariKeterlambatan = 10;
        transaksi3.tampilInfoTransaksi();

    }
}
