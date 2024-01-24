package moduuli1_4;
import java.util.Scanner;
import java.util.Random;

public class teht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" How many names do you want to generate? ");
        int nimet = scanner.nextInt();

        String[] first_names = { "kalle", "Pekka","Juha", "Otto" };
        String[] last_names = {"Tuokonen", "Nieminen ", "Kosonen", " Riekki"};

        for (int i = 0; i < nimet; i++){

            System.out.println((i + 1) + ". " +
                    first_names[random.nextInt(first_names.length)] + " " + last_names[random.nextInt(last_names.length)]);
        }



        }
    }



