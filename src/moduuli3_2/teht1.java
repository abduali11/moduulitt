package moduuli3_2;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class teht1 {
    public static void main(String[] args) {
        vehicle car = new car10();
        car.start();
        car.stop();
        car.getinfo();
        System.out.println(" ");
        vehicle motorcycle = new motorcycle();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getinfo();
        System.out.println(" ");
        vehicle bus = new bus();
        bus.start();
        bus.stop();
        bus.getinfo();

    }
}

interface vehicle{
     void start();
     void stop();
     void getinfo();

}


class car10 implements vehicle{
     @Override
     public void start(){
         System.out.println("car is starting");
     }
     @Override
    public void stop(){
         System.out.println("car is stopping");
     }

     @Override
    public void getinfo(){
         System.out.println("car information: ");
         System.out.println("type: Car");
         System.out.println("fuel: petrol");
         System.out.println("Color: Red ");
     }
}

class motorcycle implements vehicle{
    @Override
    public void start(){
        System.out.println("motorcycle is strating");
    }
    @Override
    public void stop(){
        System.out.println("motorcycle is stopping");
    }
    @Override
    public void getinfo(){
        System.out.println("motorcycle information");
        System.out.println("type: motorcycle");
        System.out.println("fuel: gasoline");
        System.out.println("Color: black ");
    }
}

class bus implements vehicle{
    @Override
    public void start(){
        System.out.println("Bus is starting");
    }

    @Override
    public void stop(){
        System.out.println(" Bus is stopping");
    }

    @Override
    public void getinfo(){
        System.out.println("Bus information: ");
        System.out.println("type: Bus");
        System.out.println("fuel: petrol");
        System.out.println("Color: Violet ");
        System.out.println("Capacity: 40 passenger");
    }
}