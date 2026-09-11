package Pertemuan2;

public class MataKuliah {
    public String kodeMatkul;
    public String namaMatkul;
    public int sks;
    public double nilaiAngka;

    public double hitungBobotNilai(){
        double bobotNilai=sks  * nilaiAngka;
        return bobotNilai;
    }
    public void tampilInfoMatkul() {

        System.out.println("Kode Mata Kuliah : " + kodeMatkul);
        System.out.println("Nama Mata Kuliah : " + namaMatkul);
        System.out.println("SKS              : " + sks);
        System.out.println("Nilai Angka      : " + nilaiAngka);
        System.out.println("Bobot Nilai      : " + hitungBobotNilai());
    }
}
