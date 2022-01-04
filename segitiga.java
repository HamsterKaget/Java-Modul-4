import javax.swing.*;
import java.util.Scanner;

public class segitiga {
    
    // Code by @Radja Aulia Al Ramdani => github.com/HamsterKaget
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner( System.in );

        String angka = JOptionPane.showInputDialog("Masukan angka yang anda inginkan : ");

        int n = Integer.parseInt(angka);
        for( int i = 1; i <= n; i++) {
            System.out.println();

            for( int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            
        }

        System.out.println();


    }
}
