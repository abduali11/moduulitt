import java.util.LinkedList;
import java.util.Scanner;

public class Asiakas3 {
    private static int viimeisinId = 0;
    private int id;

    public Asiakas3() {
        this.id = ++viimeisinId;
    }

    public int getId() {
        return id;
    }
}

class Palvelupiste {
    LinkedList<Asiakas3> jono = new LinkedList<>();

    public void lisaajonoon(Asiakas3 a) {
        jono.add(a);
    }

    public Asiakas3 poistajonosta() {
        return jono.poll();
    }

    public void palvele() {
        do {
            try {
                Asiakas3 palveltuAsiakas = jono.peek();
                if (palveltuAsiakas == null) {
                    break;
                }
                long palveluaika = (long)(Math.random() * 3523);
                Thread.sleep(palveluaika);

                poistajonosta();
                System.out.println("Asiakas " + palveltuAsiakas.getId() + " palveltu. Palvelu kesti: "
                        + System.currentTimeMillis() + " nano sekunttia");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!jono.isEmpty());

        System.out.println("Kaikki asiakkaat on palveltu.");
    }
}
class PalvelupisteTesti {
    public static void main(String[] args) {
        Palvelupiste palvelupiste = new Palvelupiste();

        for (int i = 0; i < 5; i++) {
            Asiakas3 uusiAsiakas = new Asiakas3();
            palvelupiste.lisaajonoon(uusiAsiakas);
            System.out.println("Asiakas " + uusiAsiakas.getId() + " lisätty jonoon.");
        }

        palvelupiste.palvele();
    }
}
