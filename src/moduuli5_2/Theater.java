package moduuli5_2;

public class Theater {
    private int availableSeats;

    public Theater(int seats) {
        availableSeats = seats;
    }
    public synchronized void reserveseat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Seat reserved, " + availableSeats + " seats left");
        } else {
            System.out.println("No seats available");
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
