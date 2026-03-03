import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Kalkulator Kebutuhan Cat Ruangan---");
        System.out.print("Masukkan Panjang ruangan (m): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan Lebar ruangan (m)  : ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan Tinggi ruangan (m) : ");
        double tinggi = input.nextDouble();

        double luasDinding = (2 * panjang * tinggi) + (2 * lebar * tinggi);
        double kebutuhanLiter = luasDinding / 10;
        double totalKaleng = Math.ceil(kebutuhanLiter);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total Luas Dinding    : " + luasDinding + " m2");
        System.out.println("Kebutuhan Cat Persis  : " + kebutuhanLiter + " Liter");
        System.out.println("Jumlah Cat yang Harus Dibeli: " + (int)totalKaleng + " Liter");

        input.close();
    }
}