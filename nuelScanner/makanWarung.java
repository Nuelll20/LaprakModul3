
package nuelScanner;
import java.util.Scanner;
public class makanWarung {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int jlmakan , jllauk, jlminum, hgtotal, hnasi, hlauk, hminum;
        System.out.println("Rumah Makan Sukamaju");
        System.out.print("Jumlah makan: ");
        jlmakan = scn.nextInt();
        System.out.print("Jumlah lauk: ");
        jllauk = scn.nextInt();
        System.out.print("Jumlah minum:" );
        jlminum = scn.nextInt();
        System.out.println("_____________");
        hnasi = 8000;
        hlauk = 3000;
        hminum = 2000;
        hgtotal = (jlmakan * hnasi) + (jllauk * hlauk) + (jlminum * hminum); 
        System.out.print("Jumlah harga total adalah: "+hgtotal+ " Rupiah");
    }
 }

