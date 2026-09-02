package Tugas;

public class Demo {
    public static void main(String[] args) {

        TasLaptop tasLaptop = new TasLaptop(
            1.5, 2, 3,
            "Hitam", "Lenovo",
            true, 15
        );

        TasSekolah tasSekolah = new TasSekolah(
            1.0, 3, 4,
            "Hitam", "Alto",
            "Polyester", "Biasa"
        );

        TWS tws = new TWS(
            80, 50,
            "In-Ear", 2,
            "Fantech", "Putih"
        );

        Mouse mouse = new Mouse(
            "Gaming", 800, 6,
            "Lenovo", true
        );

        tasLaptop.cetakInformasi();
        tasLaptop.tambahBarang(2);
        tasLaptop.kurangiBarang(4);
        tasLaptop.kosongkan();

        System.out.println();

        tasSekolah.cetakInformasi();
        tasSekolah.tambahBarang(4);
        tasSekolah.kurangiBarang(2);
        tasSekolah.kosongkan();

        System.out.println();

        tws.cetakInformasi();
        tws.chargeBaterai(2);
        tws.naikanVolume(20);
        tws.turunkanVolume(10);
        tws.naikanAncLevel();

        System.out.println();

        mouse.cetakInformasi();
        mouse.naikanDPI();
        mouse.turunkanDPI();
        mouse.gantiRGB();
    }
}