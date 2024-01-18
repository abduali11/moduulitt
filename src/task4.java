import java.util.Scanner;

 class HelloUser {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Tempature in Farenheit? ");
        String temparature1 = reader.nextLine();
        double temparature = Double.parseDouble(temparature1);
        double celsius = (temparature - 32) * 5/9;

        System.out.printf("Temperature in Celsius is %.1f!", celsius);
    }
}