
package nuelScanner;
import java.util.Scanner;
public class sekolah {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int tugas1, tugas2, tugas3, nilairtrt;
        System.out.println("Sekolah Sukamaju");
        System.out.print("Tugas 1 = ");
        tugas1 = scn.nextInt();
        System.out.print("Tugas 2 = ");
        tugas2 = scn.nextInt();
        System.out.print("Tugas 3 = ");
        tugas3 = scn.nextInt();
        nilairtrt = (tugas1 + tugas2 + tugas3) /3;
        System.out.println("___________");
        System.out.println("Nilai rata-rata = "+nilairtrt);
        
    }
}
