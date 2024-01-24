package Tehtäväsarja1;

import java.util.LinkedList;

public class Asiakas4 {
    private static int viimeisinId = 0;
    private int id;
    private long aloitusAika;
    private long palvelunPaattymisAika;

    public Asiakas4() {
        this.id = ++viimeisinId;
        this.aloitusAika = System.nanoTime();
    }

    public void setPalvelunPaattymisAika() {
        this.palvelunPaattymisAika = System.nanoTime();
    }

    public long getPalvelunKesto() {
        return palvelunPaattymisAika - aloitusAika;
    }

    public int getId() {
        return id;
    }
}

class Palvelupiste1 {
    private LinkedList<Asiakas4> jono = new LinkedList<>();
    private long kokonaisPalveluaika = 0;
    private int palvellutAsiakkaat = 0;

    public void lisaaJonoon(Asiakas4 a) {
        jono.add(a);
    }

    public Asiakas4 poistaJonosta() {
        return jono.poll();
    }

    public void palvele() {
        do {
            try {
                Asiakas4 palveltuAsiakas = jono.peek();
                if (palveltuAsiakas == null) {
                    break;
                }
                long palveluaika = (long)(Math.random() * 3500);
                Thread.sleep(palveluaika);

                poistaJonosta();
                palveltuAsiakas.setPalvelunPaattymisAika();
                long kesto = palveltuAsiakas.getPalvelunKesto();
                kokonaisPalveluaika += kesto;
                palvellutAsiakkaat++;

                System.out.println("Tehtäväsarja1.Asiakas " + palveltuAsiakas.getId() + " palveltu. Palvelu kesti: "
                        + kesto + " nano sekunttia");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!jono.isEmpty());

        if (palvellutAsiakkaat > 0) {
            long keskiarvo = kokonaisPalveluaika / palvellutAsiakkaat;
            System.out.println("Asiakkaiden palveluiden keskiarvo: " + keskiarvo + " nano sekunttia");
        }
        System.out.println(" Asiakkaat on palveltu.");
    }
}

class PalvelupisteTesti1 {
    public static void main(String[] args) {
        Palvelupiste1 palvelupiste = new Palvelupiste1();

        for (int i = 0; i < 3; i++) {
            Asiakas4 uusiAsiakas = new Asiakas4();
            palvelupiste.lisaaJonoon(uusiAsiakas);
            System.out.println("Tehtäväsarja1.Asiakas " + uusiAsiakas.getId() + " lisätty jonoon.");
        }

        palvelupiste.palvele();
    }
}
