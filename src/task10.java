import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (true){
        int score = 0;

          for (int i = 0; i < 10; i++ ){
              int num1 = rand.nextInt(10) + 1;
              int num2 = rand.nextInt(10) + 1;
              System.out.println(" What is " + num1 + " * " + num2);
                int answer = scanner.nextInt();

          if ( answer == num1 * num2){
              System.out.println(" correct ");
               score ++;}
            else {
              System.out.println(" wrong ");
          }
              if (score == 10) {
                  System.out.println(" You got all 10 correct.");
                  break;
              } else {
                  System.out.println("Your score: " + score + "/10. ");
              }

          }
        }
    }
}



