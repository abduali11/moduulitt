package moduuli5_2;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(7);
        Customer customer1 = new Customer(1, 3, theater);
        Customer customer2 = new Customer(2, 2, theater);
        Customer customer3 = new Customer(3, 2, theater);

        customer1.start();
        customer2.start();
        customer3.start();
    }

}
