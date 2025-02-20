public class Pattern2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}