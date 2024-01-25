package Tehtäväsarja2;

import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
 enum TapahtumanTyyppi1 {
    saapuminen,
    poistuminen
}
class Tapahtuma1 implements Comparable<Tapahtuma1> {
    private final double tapahtumaaika;
    private final TapahtumanTyyppi1 tapahtumanTyyppi;
    public Tapahtuma1(double tapahtumaaika, TapahtumanTyyppi1 tapahtumanTyyppi) {
        this.tapahtumaaika = tapahtumaaika;
        this.tapahtumanTyyppi = tapahtumanTyyppi;
    }
    public double getTapahtumaAika() {
        return tapahtumaaika;
    }
    public TapahtumanTyyppi1 getTapahtumanTyyppi() {
        return tapahtumanTyyppi;
    }
    public int compareTo(Tapahtuma1 toinen) {
        return Double.compare(this.tapahtumaaika, toinen.tapahtumaaika);
    }
}
class Tapahtumalista1 {
    private final PriorityQueue<Tapahtuma1> tapahtumat;
    public Tapahtumalista1() {
        this.tapahtumat = new PriorityQueue<>();
    }
    public void lisaaTapahtuma(Tapahtuma1 tapahtuma) {
        tapahtumat.add(tapahtuma);
    }
    public Tapahtuma1 seuraavaTapahtuma() {
        return tapahtumat.poll();
    }
    public ArrayList<Tapahtuma1> getTapahtumat() {
        return new ArrayList<>(tapahtumat);
    }
    public boolean Tyhja() {
        return tapahtumat.isEmpty();
    }
}
public class teht5 {
    public static void main(String[] args) {
        Tapahtumalista1 tapahtumalista = new Tapahtumalista1();
        tapahtumalista.lisaaTapahtuma(new Tapahtuma1(6.3, TapahtumanTyyppi1.saapuminen));
        tapahtumalista.lisaaTapahtuma(new Tapahtuma1(1.0, TapahtumanTyyppi1.poistuminen));
        tapahtumalista.lisaaTapahtuma(new Tapahtuma1(3.8, TapahtumanTyyppi1.saapuminen));
        Tapahtuma1 poistettuTapahtuma = tapahtumalista.seuraavaTapahtuma();
        System.out.println("Poistettu aika: " + poistettuTapahtuma.getTapahtumaAika() + " tapahtumatyyppi: " + poistettuTapahtuma.getTapahtumanTyyppi());
        ArrayList<Tapahtuma1> järjestetytTapahtumat = tapahtumalista.getTapahtumat();
        Collections.sort(järjestetytTapahtumat);
        for (Tapahtuma1 tapahtuma : järjestetytTapahtumat) {
            System.out.println("Tapahtuman aika: " + tapahtuma.getTapahtumaAika() + " tapahtumatyyppi: " + tapahtuma.getTapahtumanTyyppi());
        }
    }
}
