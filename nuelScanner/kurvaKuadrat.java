
package nuelScanner;
import java.util.Scanner;
public class kurvaKuadrat {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double a, b, c, d, x, y;
        System.out.print("Masukkan titik a = ");
        a = scn.nextDouble();
        System.out.print("Masukkan titik b = ");
        b = scn.nextDouble();
        System.out.print("Masukkan titik c = ");
        c = scn.nextDouble();
        x = (-(b)/(2*a));
        d = (b*b)-(4*a*c);
        y = (d/(-4*a));
        System.out.println("Hasil kordinat titik puncak parabola = "+x+ ", "+y);
    }
    
}
