package Tehtäväsarja1;

import java.util.LinkedList;
import java.util.Scanner;
public class Asiakas1 {
    static int viimeisinid = 0;
    int id;
    long aloitus_aika;
    long lopetus_aika;

    public Asiakas1() {
        this.id = ++viimeisinid;
        this.aloitus_aika = System.nanoTime();
    }

    public void poistaAsiakas() {
        this.lopetus_aika = System.nanoTime();
    }

    public int getId() {
        return id;
    }

    public long getAloitus_aika() {
        return aloitus_aika;
    }
    public void setAloitus_aika(long aloitus_aika) {
        this.aloitus_aika = aloitus_aika;
    }

    public long getLopetus_aika() {
        return lopetus_aika;
    }
    public void setLopetus_aika(long lopetus_aika) {
        this.lopetus_aika = lopetus_aika;
    }

    public long kulutettuaika() {
        return lopetus_aika - aloitus_aika;
    }
}

class AsiakasTesti1 {
    public static void main(String[] args) {
        LinkedList<Asiakas1> asiakasJonossa = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) lisää Tehtäväsarja1.Asiakas, (2) poista asiakas tai (3) lopeta");
            String toiminto = scanner.nextLine();
            if (toiminto.equals("1")) {
                Asiakas1 uusiasiakas = new Asiakas1();
                asiakasJonossa.add(uusiasiakas);
                System.out.println("Lisäsit uuden asiakkaan, ID: " + uusiasiakas.getId());
            } else if (toiminto.equals("2")) {
                if (!asiakasJonossa.isEmpty()) {
                    Asiakas1 poistettuasiakas = asiakasJonossa.remove();
                    long kulutettuAika = poistettuasiakas.kulutettuaika();
                    System.out.println("Tehtäväsarja1.Asiakas poistettu, ID: " + poistettuasiakas.getId());
                    System.out.println("Tehtäväsarja1.Asiakas oli jonossa: " + kulutettuAika + " nanosekuntia");
                } else {
                    System.out.println("Jono on tyhjä");
                }
            } else if (toiminto.equals("3")) {
                System.out.println("Ohjelma lopetettu.");
                break;
            }

        }


    }
    }

