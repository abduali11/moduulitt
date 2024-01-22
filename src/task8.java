import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a binary number");
        String binaryString = scanner.nextLine();

        int demicalnumber = 0;
        int lenght = binaryString.length();

        for (int i = 0; i < lenght; i++){

            char bit = binaryString.charAt(i);
            int number = Character.getNumericValue(bit);

            demicalnumber += number * Math.pow(2, lenght - 1 - i);
        }
        System.out.println(demicalnumber);



    }
}
