package Tugas;

public class TWS {

    int persentaseBaterai;
    int tambahBateraiPerJam = 25;
    int volume;
    String jenis;
    int ancLevel;
    String merk;
    String warna;

    public TWS(int persentaseBaterai, int volume,
            String jenis, int ancLevel,
            String merk, String warna) {

        this.persentaseBaterai = persentaseBaterai;
        this.volume = volume;
        this.jenis = jenis;
        this.ancLevel = ancLevel;
        this.merk = merk;
        this.warna = warna;
    }

    public void chargeBaterai(int jam) {
        persentaseBaterai += jam * tambahBateraiPerJam;
        if (persentaseBaterai > 100) {
            persentaseBaterai = 100;
        }
    }

    public void naikanVolume(int nilai) {
        volume += nilai;
        System.out.println("Volume naik menjadi " + volume);
    }

    public void turunkanVolume(int nilai) {
        volume -= nilai;
        System.out.println("Volume turun menjadi " + volume);
    }

    public void naikanAncLevel() {
        ancLevel++;
        System.out.println("ANC Level naik menjadi " + ancLevel);
    }

    public void cetakInformasi() {
        System.out.println("=== TWS ===");
        System.out.println("Baterai : " + persentaseBaterai + "%");
        System.out.println("Volume  : " + volume);
        System.out.println("Jenis   : " + jenis);
        System.out.println("ANC     : " + ancLevel);
        System.out.println("Merk    : " + merk);
        System.out.println("Warna   : " + warna);
    }
}
