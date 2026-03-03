import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

         System.out.println("---Konversi Suhu---");
         System.out.print("Masukkan Suhu dalam Celcius: ");
         double Celcius=input.nextDouble();
         double fahrenheit = (9.0 / 5.0 *Celcius)+ 32 ;
         double reamur = 4.0 / 5.0 * Celcius;
         double kelvin = Celcius + 273.15;

         System.out.println("\n---Hasil Konfersi---");
         System.out.printf("Suhu Celcius    : %.2f°C\n", Celcius);
         System.out.printf("Suhu Fahrenheit : %.2f°F\n", fahrenheit);
         System.out.printf("Suhu Reamur     : %.2f°R\n", reamur);
         System.out.printf("Suhu Kelvin     : %.2f K\n", kelvin);

         input.close();
    }
}