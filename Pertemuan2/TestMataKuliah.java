package Pertemuan2;

public class TestMataKuliah {
    public static void main(String[] args) {
        MataKuliah matkul1 = new MataKuliah();
        matkul1.kodeMatkul = "PBO101";
        matkul1.namaMatkul = "Pemrograman Berorientasi Objek";
        matkul1.sks = 3;
        matkul1.nilaiAngka = 4.0;
        matkul1.tampilInfoMatkul();
        MataKuliah matkul2 = new MataKuliah();
        matkul2.kodeMatkul = "WEB201"; 
        matkul2.namaMatkul = "Pemrograman Web";
        matkul2.sks = 2;
        matkul2.nilaiAngka = 3.5;
        matkul2.tampilInfoMatkul();
        MataKuliah matkul3 = new MataKuliah();
        matkul3.kodeMatkul = "DB301";
        matkul3.namaMatkul = "Basis Data";
        matkul3.sks = 4;
        matkul3.nilaiAngka = 3.0;
        matkul3.tampilInfoMatkul();
    }
}
