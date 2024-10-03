
package nuelScanner;
import java.util.Scanner;
public class beratideal {
    public static void main(String[] args) {
         Scanner scn = new Scanner (System.in);
         double tinggi, beratideal;
         String nama;
         System.out.println("Program Berat Ideal");
         System.out.print("Nama Anda = ");
         nama = scn.nextLine ();
         System.out.print("Tinggi Anda (Cm) = " );
         tinggi = scn.nextDouble();
         beratideal = tinggi - 100;
         System.out.println("Berat ideal " +nama+ " adalah = "+beratideal+ "Kg");
    }  
}
