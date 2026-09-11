package Pertemuan2;

public class BagiKelompokTC {

    public static void main(String[] args) {
        System.out.println("awal program");

        int jumlahMahasiswa = 32;
        int jumlahKelompok = 4;
        int anggotaPerKelompok = 0;

        try {
            anggotaPerKelompok = jumlahMahasiswa / jumlahKelompok;
        } catch (ArithmeticException e) {
            System.out.println("jumlah kelompok tidak boleh nol");
        }

        System.out.println(anggotaPerKelompok);
        System.out.println("akhir program");
    }
}