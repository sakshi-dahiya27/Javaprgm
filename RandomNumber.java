import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int count = 100;
        
        for (int i = 0; i < count; i++) {
            int num = rand.nextInt(1000) + 1;
            sum += num;
        }
        
        double average = (double) sum / count;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}