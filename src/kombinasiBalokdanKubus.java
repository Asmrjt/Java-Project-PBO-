import java.util.Scanner;

public class kombinasiBalokdanKubus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pilihan bangun ruang
        System.out.println("Pilih bangun ruang:");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1: // Perhitungan Balok
                System.out.print("Masukkan panjang balok: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebar = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = scanner.nextDouble();

                double volumeBalok = panjang * lebar * tinggiBalok;
                double luasPermukaanBalok = 2 * (panjang * lebar + panjang * tinggiBalok + lebar * tinggiBalok);

                System.out.printf("Volume Balok: %.2f\n", volumeBalok);
                System.out.printf("Luas Permukaan Balok: %.2f\n", luasPermukaanBalok);
                break;

            case 2: // Perhitungan Kubus
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = scanner.nextDouble();

                double volumeKubus = Math.pow(sisi, 3);
                double luasPermukaanKubus = 6 * Math.pow(sisi, 2);

                System.out.printf("Volume Kubus: %.2f\n", volumeKubus);
                System.out.printf("Luas Permukaan Kubus: %.2f\n", luasPermukaanKubus);
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
                break;

        }
        // menutup scanner
        scanner.close();
    }
}