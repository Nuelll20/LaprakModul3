
package nuelScanner;
import java.util.Scanner;
public class barangDiscount {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double hgbarang, jmbarang, hgsebelumds, discount, hgsetelahdiscount;
        System.out.println("Toko Baju Sukamaju");
        System.out.print("Harga barang = ");
        hgbarang = scn.nextDouble();
        System.out.print("Jumlah barang = ");
        jmbarang = scn.nextDouble();
        hgsebelumds = hgbarang * jmbarang;
        discount = hgsebelumds * 0.2;
        hgsetelahdiscount = hgsebelumds - discount;
        System.out.println("__________");
        System.out.println("Harga barang sebelum discount = "+hgsebelumds);
        System.out.println("Discount = "+discount);
        System.out.println("Harga setelah discount = "+hgsetelahdiscount);
        
    }
    
}
