//  import Java class yang dibutuhkan 
import javax.swing.*;

public class praktek5 {
    
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog(null, "Masukan Angka yang Anda Ingnkan : ");
        int n = Integer.parseInt(angka);

        for ( int i= 1; i <= n; ++i) {
            for ( int j = 1; j <= i; ++j) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
