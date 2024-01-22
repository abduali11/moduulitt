import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("anna ensimmäinen numero (a)");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("anna toinen numero (b)");
        double number2 = Double.parseDouble(scanner.nextLine());

        System.out.println("anna kolmas numero (c)");
        double number3 = Double.parseDouble(scanner.nextLine());

        double kaava = number2 * number2 - 4.0 * number1 * number3;

        if (kaava > 0 ){

            double pos = (-number2 + Math.sqrt(kaava)) / (2*number1);
            double neg = (-number2 - Math.sqrt(kaava)) / (2*number1);
            System.out.println("roots are " + pos + " and " + neg);
        } else if (kaava == 0) {

            double pos = -number2 / 2*number1;
            System.out.println("the roots are " + pos);
        }
        else {

            System.out.println("the root is unavailable");

        }

    }
}



