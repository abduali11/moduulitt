import java.util.LinkedList;
public class Asiakas {
    static int viimeisinid = 0;
    int id;
    long aloitus_aika;
    long lopetus_aika;

    public Asiakas() {
        this.id = ++viimeisinid;
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

class AsiakasTesti {
    public static void main(String[] args) {
        Asiakas asiakas1 = new Asiakas();
        asiakas1.setAloitus_aika(10);
        asiakas1.setLopetus_aika(50);
        System.out.println("Asiakkaan id on " + asiakas1.getId());
        System.out.println("Asiakkaalla meni noin: " + asiakas1.kulutettuaika() + "min" );

        Asiakas asiakas2 = new Asiakas();
        asiakas2.setAloitus_aika(65);
        asiakas2.setLopetus_aika(100);
        System.out.println("Asiakas 2 ID: " + asiakas2.getId());
        System.out.println("Asiakas 2 meni noin: " + asiakas2.kulutettuaika() + "min" );
    }
}

