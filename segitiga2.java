import javax.swing.*; // Import Class yang dibutuhkan 

public class segitiga2 {

    // Code by @Radja Aulia => github.com/HamsterKaget
    public static void main(String[] args) {
        
        // Input 
        String angka = JOptionPane.showInputDialog("Masukan Angka Yang Kamu Inginkan");

        // Konversi String angka Ke Integer
        int n = Integer.parseInt(angka);

        // Looping Bersarang
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n;j++) {
                System.out.print(" * ");
                if ( i == j) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        // Segitiga ke 2
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n;j++) {
                System.out.print("* ");
                if ( (i + j) == n - 1 ) {
                    break;

                }
            }
            System.out.println();
        }

    }
}