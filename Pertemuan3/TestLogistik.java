package Pertemuan3;
import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Kurangi Muatan");
            System.out.println("3. Hentikan Program");
            System.out.print("Masukkan pilihan: ");
            int key = sc.nextInt();
            switch(key){
                case 1 :
                    System.out.print("Tambah Muatan(kg):");
                    double tambahMuat = sc.nextDouble();
                    kontainerAlfa.tambahMuatan(tambahMuat);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;
                    case 2 :
                        System.out.print("Kurangi Muatan(kg):");
                        double kurangMuat = sc.nextDouble();
                        kontainerAlfa.turunkanMuatan(kurangMuat);
                        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;
                    case 3:
                        sc.close();
                    return ;
                default:
                    System.out.print("input salah");
                    break;
            }
            System.out.println("====================================");
        }

        // System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        // System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        // kontainerAlfa.tambahMuatan(6000);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        // kontainerAlfa.tambahMuatan(4000);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMembongkar muat/menurunkan barang seberat 3000 kg...");
        // kontainerAlfa.turunkanMuatan(3000);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
        // kontainerAlfa.turunkanMuatan(1500);
        // System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
    }
}