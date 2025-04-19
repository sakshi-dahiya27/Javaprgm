public class First {
    public static void main(String[] args) {
        int a = 5, b = 7, c,d;

        // Bitwise AND
        System.out.println("Bitwise AND of a and b is: " + (a & b));  
        // 0101 & 0111 = 0101 -> 5

        // Bitwise OR
        System.out.println("Bitwise OR of a and b is: " + (a | b));  
        // 0101 | 0111 = 0111 -> 7

        // Bitwise XOR
        c = ((~a) ^ (b));
        d = ((~a) ^ (~b));
        System.out.println("Bitwise XOR of ~a and b is: " + c);
        System.out.println("Bitwise XOR of ~a and ~b is: " + d); 

        // Display value of c
        System.out.println("\nValue of c is: " + c);
        System.out.println("Value of d is: " + d);
    }
}
