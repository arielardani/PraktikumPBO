package Pertemuan2;

public class TestRuangKelas {
    public static void main(String[] args) {
        RuangKelas kelas1 = new RuangKelas();
        kelas1.kodeRuang = "A101";
        kelas1.namaGedung = "Ruang Kuliah A";
        kelas1.kapasitas = 30;
        kelas1.jumlahMahasiswa = 25;
        kelas1.tampilInfoRuang();
    }
}