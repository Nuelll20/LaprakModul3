
package nuelScanner;
import java.util.Scanner;
public class volumeluasKerucut {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double volume, luas, jarijari, tinggi;
        double phi = 3.14;
        System.out.print("Masukkan jari-jari = ");
        jarijari = scn.nextDouble();
        System.out.print("Masukkan Tinggi = ");
        tinggi = scn.nextDouble();
        luas = (phi * jarijari * jarijari);
        volume = (0.33) * phi * jarijari * jarijari * tinggi;
        System.out.println("Volume kerucut adalah = "+volume);
        System.out.println("Luas kerucut adalah = "+luas);
        
    }
    
}
