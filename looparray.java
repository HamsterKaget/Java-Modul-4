public class looparray {
    
    // Code by @Radja Aulia => github.com/HamsterKaget
    public static void main(String[] args) {

        // Mendeklarasikan Array names 
        String names[] = {"Joko", "Bhekti", "Hendi", "Prasekti"};

        // Looping Agar Semua Nama di array names bisa di cetak
        for( int i = 0; i < names.length; i++ ) {
            // Membuat Perintah Jika names tidak sama dengan "Bhekti" maka print nama[index]
            if( !names[i].equals("Bhekti")) {
                System.out.println(names[i]);
            }
        }

        System.out.println("\n");

        // Perulangan pertama berenti saat menemukan posisi "Bhekti" ( Looping berenti pada nama "Bhekti")
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            if( !names[i].equals("Bhekti")) {
                break;
            }
        }

        System.out.println("\n");

        // Perulangan kedua lanjut saat menumakan posisi "Bhekti" ( men - skip nama "Bhekti" dalam Looping)
        for(int i = 0; i < names.length; i++) {
            if( names[i].equals("Bhekti")) {
                continue;
            } else {
                System.out.println(names[i]);
            }
        }

    }
}
