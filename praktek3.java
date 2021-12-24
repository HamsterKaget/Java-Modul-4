// Import Java class yang dibuthkan
import javax.swing.*;

import java.io.*;

public class praktek3 {
    
    public static void main(String[] args) {
        
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        
        String nimString = JOptionPane.showInputDialog(null, "masukan Nim kamu");
        int nim = Integer.parseInt(nimString);

        int  kondisinim = nim % 2;

        switch ( kondisinim ) {
            case 0: 
            System.out.println("* Masukan Input Angka *");
            String angkaString;
            try {
                angkaString = scan.readLine();
                int angka = Integer.parseInt(angkaString);

                if ( angka % 2 != 0 ) {
                    System.out.println("Angka termasuk bilangan ganjil");
                } else if ( angka % 2 == 0 ) {
                    System.out.println("Angka termasuk bilangaan genap");
                } else {
                    System.out.println("Bilangan Error !");
                }
            } catch (IOException e) {
                System.out.println("Error !");
            } 
            break;
            case 1:
            String angkaString2 = JOptionPane.showInputDialog(null, "Masukan Input Angka");
            int angka = Integer.parseInt(angkaString2);

                if ( angka % 2 != 0 ) {
                    JOptionPane.showMessageDialog(null, "Angka termasuk bilangan ganjil");
                } else if ( angka % 2 == 0 ) {
                    JOptionPane.showMessageDialog(null, "Angka termasuk bilangaan genap");
                } else {
                    JOptionPane.showMessageDialog(null, "Bilangan Error !");
                }
        }
    }
}
