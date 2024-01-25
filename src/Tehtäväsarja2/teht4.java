package Tehtäväsarja2;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
class Tapahtuma implements Comparable<Tapahtuma> {
     final double tapahtumaaika;
    public Tapahtuma(double tapahtumaaika) {
        this.tapahtumaaika = tapahtumaaika;
    }
    public double getTapahtumaAika() {
        return tapahtumaaika;
    }
    public int compareTo(Tapahtuma toinen) {
        return Double.compare(this.tapahtumaaika, toinen.tapahtumaaika);
    }
}
class Tapahtumalista {
    private final PriorityQueue<Tapahtuma> tapahtumat;

    public Tapahtumalista() {
        this.tapahtumat = new PriorityQueue<>();
    }
    public void lisaaTapahtuma(Tapahtuma tapahtuma) {
        tapahtumat.add(tapahtuma);
    }
    public Tapahtuma seuraavaTapahtuma() {
        return tapahtumat.poll();
    }
    public ArrayList<Tapahtuma> getTapahtumat() {
        return new ArrayList<>(tapahtumat);
    }

    public boolean tyhja() {
        return tapahtumat.isEmpty();
    }
}
public class teht4 {
    public static void main(String[] args) {
        Tapahtumalista tapahtumalista = new Tapahtumalista();

        tapahtumalista.lisaaTapahtuma(new Tapahtuma(6.3));
        tapahtumalista.lisaaTapahtuma(new Tapahtuma(1.0));
        tapahtumalista.lisaaTapahtuma(new Tapahtuma(3.8));

        Tapahtuma poistettuTapahtuma = tapahtumalista.seuraavaTapahtuma();
        System.out.println("Poistettu aika: " + poistettuTapahtuma.getTapahtumaAika());

        ArrayList<Tapahtuma> järjestetytTapahtumat = tapahtumalista.getTapahtumat();
        Collections.sort(järjestetytTapahtumat);
        for (Tapahtuma tapahtuma : järjestetytTapahtumat) {
            System.out.println("Tapahtuman aika: " + tapahtuma.getTapahtumaAika());
        }
    }
}
