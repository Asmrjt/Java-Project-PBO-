import java.util.Scanner;

public class balok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang, lebar, dan tinggi
        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        // Menghitung luas permukaan dan volume
        double luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        double volume = panjang * lebar * tinggi;

        // Menampilkan hasil
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
        System.out.println("Volume Balok: " + volume);

        scanner.close();
    }
}
