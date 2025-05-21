import java.io.*;
import java.util.Scanner;

public class Experiment10{
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("questions.txt"))) {
            Scanner sc = new Scanner(System.in);
            int score = 0;
            
            String question;
            while ((question = br.readLine()) != null) {
                String answer = br.readLine();
                System.out.println(question);
                System.out.print("Your Answer: ");
                String userAnswer = sc.nextLine();
                
                if (userAnswer.equals(answer.substring(3))) {
                    score++;
                }
            }
            
            System.out.println("Your Score: " + score);
        }
    }
}