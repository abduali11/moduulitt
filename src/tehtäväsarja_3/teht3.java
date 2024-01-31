package tehtäväsarja_3;

public class teht3 {

    public static void main(String[] args) {
        Kello kello = Kello.getInstance();
        kello.setAika(10);
        System.out.println("Aika on nyt: " + kello.getAika());


        Kello toinenViite = Kello.getInstance();
        System.out.println("Aika on edelleen: " + toinenViite.getAika());

        toinenViite.setAika(15);
        System.out.println("Aika on muuttunut: " + kello.getAika());
    }
}


 class Kello {

    private static Kello instance = null;
    private int aika;

    private Kello() {
        aika = 0;
    }


    public static Kello getInstance() {
        if (instance == null) {
            instance = new Kello();
        }
        return instance;
    }

    public void setAika(int uusiAika) {
        aika = uusiAika;
    }

    public int getAika() {
        return aika;
    }
}
