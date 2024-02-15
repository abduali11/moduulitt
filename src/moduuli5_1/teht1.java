package moduuli5_1;

public class teht1 {

    public static void main(String[] args) {
        int min = 1;
        int max = 15;
        numberprinter numberPrinterOdd = new numberprinter(min, max, false);
        numberprinter numberPrinterEven = new numberprinter(min, max, true);

        Thread odd = new Thread(numberPrinterOdd, "Odd");
        Thread even = new Thread(numberPrinterEven, "Even");

        odd.start();
        even.start();
    }
}

 class numberprinter implements Runnable {
    private static final Object lock = new Object();
    private final boolean isEven;
    private final int max;
    private static int currentNumber;

    public numberprinter(int min, int max, boolean isEven) {
        numberprinter.currentNumber = min;
        this.max = max;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        while (currentNumber <= max) {
            synchronized (lock) {
                if (isEven == (currentNumber % 2 == 0)) {
                    System.out.println((isEven ? "Even" : "Odd") + " Thread: " + currentNumber);
                    currentNumber++;
                    lock.notify();
                }

            }
        }
    }
}