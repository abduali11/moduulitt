package moduuli1_4;
import java.util.Scanner;

public class teht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna kokonaislukujen määrä: "  );
        int size = scanner.nextInt();
        int[] originalArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Syötä kokonaisluku " +  " " );
            originalArray[i] = scanner.nextInt();
        }
        int[] uniqueArray = removeDuplicates(originalArray);

        System.out.println("Taulukko ilman kaksoiskappaleita:" );
        for (int i = 0; i < uniqueArray.length; i++) {
            if (uniqueArray[i] != 0) {
                System.out.print(uniqueArray[i] + " ");
            }
        }
    }
    public static int[] removeDuplicates(int[] array) {
        int[] result = new int[array.length];
        int resultIndex = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < resultIndex; j++) {
                if (array[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[resultIndex++] = array[i];
            }
        }
        return result;
    }
}
