public class Pattern4 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 4; i++) {
            for ( i = 1; i <= 4; i++) {
                if (i % 2 == 1) { 
                    for (j = i; j <= 4; j++) {
                        System.out.print(j + " ");
                    }
                } else { 
                    for (j = 4; j >= i; j--) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}