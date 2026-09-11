package Pertemuan2;

public class TestBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        // buku1.penerbit = "Andi Offset";
        buku1.tahunTerbit = 2021;
        Buku buku2 = new Buku();
        buku2.isbn = "978-979-29-6104-3";
        buku2.judul = "Basis Data Lanjut";
        buku2.penulis = "Ferdi Irawan";
        buku2.penerbit = "Mappa";
        buku2.tahunTerbit = 2018;
        Buku buku3 = new Buku();
        buku3.isbn = "978-979-29-6104-4";
        buku3.judul = "Lara Ati";
        buku3.penulis = "Bayu Skak";
        buku3.penerbit = "Yowis Ben";
        buku3.tahunTerbit = 2017;
        // buku1.tampilInfoBuku();
        // buku2.tampilInfoBuku();
        // buku3.tampilInfoBuku();
        try {
            buku1.tampilInfoBuku();
            buku2.tampilInfoBuku();
            buku3.tampilInfoBuku();
        } catch (Exception e) {
            System.out.println("terjadi kesalahan: " + e.getMessage());
        }
    }
}