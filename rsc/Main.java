import shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Kalkulator Bangun Ruang 3D ===");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Bola");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double p = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = input.nextDouble();

                    Balok balok = new Balok(p, l, t);
                    System.out.println("Volume Balok       : " + balok.getVolume());
                    System.out.println("Luas Permukaan     : " + balok.getSurfaceArea());
                    break;

                case 2:
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();

                    Kubus kubus = new Kubus(sisi);
                    System.out.println("Volume Kubus       : " + kubus.getVolume());
                    System.out.println("Luas Permukaan     : " + kubus.getSurfaceArea());
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari: ");
                    double r = input.nextDouble();

                    Bola bola = new Bola(r);
                    System.out.println("Volume Bola        : " + bola.getVolume());
                    System.out.println("Luas Permukaan     : " + bola.getSurfaceArea());
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}
