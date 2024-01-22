import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int start = 0;
            int end = 0;

            do {
                System.out.println(" Enter a number");
                int start_num = scanner.nextInt();

                if (start_num > 0){
                    start = start_num;}
                else {
                    System.out.println("number is not positive");
                }
            } while (start <= 0);

            do {
                System.out.println(" Input another number ( Do not input number that is lower than the other one)");
                int end_num = scanner.nextInt();

                if (end_num > start){
                    end = end_num;}
                else {
                    System.out.println(" The number cant be lower than the first number");
                }

            }while (end <= start);
        System.out.println( "Your numbers were " + start + " and " +end);

        for (int i = start; i <= end; i++){
            if (Alkuluku(i)){
                System.out.println(i);
            }

        }

    }
     static boolean Alkuluku(int number){
        if (number <= 1){
            return false;
        }

      for (int i = 2; i <= Math.sqrt(number); i++){
      if (number % i == 0 ){
          return false;
      }
      }
     return true;
    }
}
