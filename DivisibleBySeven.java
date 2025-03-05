import java.util.Scanner;

public class DivisibleBySeven {
    public static int countDivisibleBySeven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 7 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Count of numbers divisible by 7: " + countDivisibleBySeven(arr));
        
    }
}
