import java.util.Scanner;

class task5 {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

         System.out.println("Mikä on ekan sivun pituus?");
         String sivu1 = reader.nextLine();
         double eka_pituus = Double.parseDouble(sivu1);


         System.out.println("Mikä on toisen sivun pituus?");
         String sivu2 = reader.nextLine();
         double toka_pituus = Double.parseDouble(sivu2);

         double hypotenuusa = Math.sqrt(Math.pow(eka_pituus, 2) + Math.pow(toka_pituus, 2));
         System.out.println("Hypötenuusan pituus on " + hypotenuusa);



     }
}
