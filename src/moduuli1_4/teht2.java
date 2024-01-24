package moduuli1_4;
import java.util.Scanner;

public class teht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Summaus = Integer.MIN_VALUE;
        int AlkuIndeksi = 0;
        int loppuindeksi = 0;

        System.out.print("Anna kokonaislukujen määrä: ");
        int a = scanner.nextInt();
        int[] integers = new int[a];

        System.out.println("Syötä " + a + " kokonaislukua:");
        for (int i = 0; i < a; i++) {
            integers[i] = scanner.nextInt();
        }

        for (int i = 0; i < a; i++) {
            int currentSum = 0;
            for (int j = i; j < a; j++) {
                currentSum += integers[j];

                if (currentSum > Summaus) {
                    Summaus = currentSum;
                    AlkuIndeksi = i;
                    loppuindeksi = j;
                }
            }
        }
        System.out.println("Suurin summa: " + Summaus);
        System.out.println("Kokonaisluvut: " + (AlkuIndeksi + 1) + "-" + (loppuindeksi + 1));

        scanner.close();
    }
}