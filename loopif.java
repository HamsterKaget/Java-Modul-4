public class loopif {
    
    public static void main(String[] args) {
        
        for ( int i = 1; i <= 10; i++) {
            if ( i == 3 ) {
                continue;
            } else if ( i == 7) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
