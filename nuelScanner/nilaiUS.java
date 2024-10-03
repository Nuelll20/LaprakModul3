
package nuelScanner;
import java.util.Scanner;
public class nilaiUS {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double us1, us2, uas,nilaiakhir;
        System.out.print("Nilai ujian sisipan 1 = ");
        us1 = scn.nextDouble();
        System.out.print("Nilai ujian sisipan 2 = ");
        us2 = scn.nextDouble();
        System.out.print("Nilai ujian akhir semester = ");
        uas = scn.nextDouble();
        nilaiakhir = (0.3 * us1) + (0.3 * us2) + (0.49 * uas);
        System.out.println("Nilai akhir adalah = "+nilaiakhir);
        
    }
    
}
