import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many grams? ");
        int grams = Integer.parseInt(scanner.nextLine());
        double gramsPerLuoti = 13.28;
        int luotiPerNaula = 32;
        int naulaPerLeiviska = 20;
        double luodit = grams / gramsPerLuoti;

        int leiviska = (int)luodit / (luotiPerNaula * naulaPerLeiviska);
        int remainingLuotiForNaula = (int)luodit % (luotiPerNaula * naulaPerLeiviska);
        int naula = remainingLuotiForNaula / luotiPerNaula;

        double luoti = luodit - (leiviska * naulaPerLeiviska * luotiPerNaula + naula * luotiPerNaula);

        System.out.println(grams + " grams is " + leiviska + " leiviskä, " + naula + " naula, and " + String.format("%.2f", luoti) + " luoti.");
    }
}
