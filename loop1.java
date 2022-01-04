public class loop1 {

    // Code by @Radja Aulia => github.com/HamsterKaget
    public static void main(String[] args) {
        

        int i = 1;

        // Loop menggunakan While 
        while ( i <= 10 ) {
            System.out.println(i);
            i++;
        }

        // Loop menggunakan do - while
        do {
            System.out.println(i);
            i++;
        } while ( i <= 10);

        // Loop menggunakan for 
        for (int angka = 1; angka <= 10; angka++) {
            System.out.println(angka);
        }
    }
}