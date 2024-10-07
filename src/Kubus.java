import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        // Menghitung luas permukaan dan volume
        double luasPermukaan = 6 * sisi * sisi;
        double volume = sisi * sisi * sisi;

        // Menampilkan hasil
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        System.out.println("Volume Kubus: " + volume);

        // Menutup scanner
        scanner.close();
    }
}
