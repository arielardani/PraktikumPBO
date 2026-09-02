package Tugas;

public class Mouse {

    String jenis;
    int dpi;
    int jumlahTombol;
    String merk;
    boolean rgb;

    public Mouse(String jenis, int dpi, int jumlahTombol,
                 String merk, boolean rgb) {

        this.jenis = jenis;
        this.dpi = dpi;
        this.jumlahTombol = jumlahTombol;
        this.merk = merk;
        this.rgb = rgb;
    }

    public void naikanDPI() {
        dpi += 100;
        System.out.println("DPI naik menjadi " + dpi);
    }

    public void turunkanDPI() {
        dpi -= 100;
        System.out.println("DPI turun menjadi " + dpi);
    }

    public void gantiRGB() {
        rgb = !rgb;
        System.out.println("RGB sekarang: " + (rgb ? "ON" : "OFF"));
    }

    public void cetakInformasi() {
        System.out.println("=== MOUSE ===");
        System.out.println("Jenis         : " + jenis);
        System.out.println("DPI           : " + dpi);
        System.out.println("Jumlah Tombol : " + jumlahTombol);
        System.out.println("Merk          : " + merk);
        System.out.println("RGB           : " + (rgb ? "ON" : "OFF"));
    }
}