package moduuli5_2;

import java.math.BigInteger;

public class Customer extends Thread{
    private int customer;
    private int seats;
    private Theater theater;

    public Customer(int customer, int seats, Theater theater) {
        this.customer = customer;
        this.seats = seats;
        this.theater = theater;
    }

    public void run() {
        for (int i = 0; i < seats; i++) {
            theater.reserveseat();
        }
    }

}
