package Pertemuan2;
public class Laptop {
    public String kodeInventaris;
    public String merk;
    public int ramGB;
    public double hargaSewa=25000;

    public void tampilSpesifikasi() {
        System.out.println("Kode Inventaris : " + kodeInventaris);
        System.out.println("Merk            : " + merk);
        System.out.println("RAM             : " + ramGB + " GB");
    }

    //method dengan argumen dan nilai balik (return)
    public int upgradeRam(int tambahanGB) {
        ramGB = ramGB + tambahanGB;
        return ramGB;
    }
    public double hitungHargaSewa(int lamaSewa) {
        return hargaSewa * lamaSewa;
    }
}