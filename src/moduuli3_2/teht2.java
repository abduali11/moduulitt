package moduuli3_2;
/*Create a more complex inheritance hierarchy for vehicles by introducing abstract classes. Modify the exercise to have
an abstract class AbstractVehicle that implements the Vehicle interface, and then have the Car, Motorcycle, and
Bus classes extend AbstractVehicle. Implement additional methods and attributes in the abstract class.
*/

public class teht2 {
    public static void main(String[] args) {
        vehicle1 car = new car1(180,70);
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " MPG");
        car.start();
        car.stop();
        car.getinfo();
        ((AbstractVehicle)car).displaynopeus();



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
        System.out.println(" ");
        electricCar car1 = new electricCar(200,35);
        System.out.println("Electric Car Fuel Efficiency:" + car1.calculateFuelEfficiency() + "kWh per kilometer");
        car1.start();
        car1.stop();
        car1.charge();
        car1.getinfo();
        System.out.println("");
        electricmotorcycle motor1 = new electricmotorcycle(300, 40);
        System.out.println("Electric Motorcycle Fuel Efficiency: " + motor1.calculateFuelEfficiency() + " kWh per kilometer");
        motor1.start();
        motor1.stop();
        motor1.charge();
        motor1.getinfo();


    }
}

interface vehicle1{
    void start();
    void stop();
    void getinfo();
    double calculateFuelEfficiency();


}



interface electricvehicle{
    void charge();

}





abstract class AbstractVehicle implements vehicle1, electricvehicle{
     protected double nopeus;
     protected double fuel;
    public AbstractVehicle(double nopeus, double fuel){
        this.nopeus = nopeus;
        this.fuel  = fuel;
    }


    public void displaynopeus(){
        System.out.println("nopeus on " + nopeus);
    }

    @Override
    public double calculateFuelEfficiency(){
        System.out.println("You have 30km worth of gasoline left");
        return fuel;
    }

}



class electricmotorcycle extends AbstractVehicle{

    public electricmotorcycle(double nopeus, double fuel){
        super(nopeus, fuel);

    }

    @Override
    public void start() {
        System.out.println("The vehicle is starting");
    }

    @Override
    public void stop() {
        System.out.println("The vehicle is stopping");

    }

    @Override
    public void charge() {
        System.out.println("Charging is possible ");
    }

    @Override
    public void getinfo() {
        System.out.println("information: ");
        System.out.println("type: electric motorcycle");
        System.out.println("Color: black ");
    }

    @Override
    public double calculateFuelEfficiency(){
        System.out.println("You have 30km worth of electric left");
        return fuel;
    }


}



class electricCar extends AbstractVehicle{

    public electricCar(double nopeus, double fuel){
        super(nopeus, fuel);
    }

    @Override
    public void start() {
        System.out.println("The vehicle is starting");
    }

    @Override
    public void stop() {
        System.out.println("The vehicle is stopping");

    }

    @Override
    public void charge() {
        System.out.println("Charging is possible ");
    }

    @Override
    public void getinfo() {
        System.out.println("car information: ");
        System.out.println("type: electricCar");
        System.out.println("Color: purple ");
    }

    @Override
    public double calculateFuelEfficiency(){
        System.out.println("You have 30km worth of electric left");
        return fuel;
    }
}



class car1 extends AbstractVehicle{

    public car1(double nopeus, double fuel){
        super(nopeus, fuel);
    }




    @Override
    public void start(){
        System.out.println("car is starting");
    }

    @Override
    public void stop(){
        System.out.println("car is stopping");
    }

    @Override
    public void charge() {
        System.out.println("Not possible to charge");
    }

    @Override
    public double calculateFuelEfficiency(){
        System.out.println("You have 30km worth of gasoline left");
        return fuel;
    }
    @Override
    public void getinfo(){
        System.out.println("car information: ");
        System.out.println("type: Car");
        System.out.println("fuel: petrol");
        System.out.println("Color: Red ");
    }
}

class motorcycle1 extends AbstractVehicle{

    public motorcycle1(double nopeus, double fuel){
        super(nopeus, fuel);
    }
    @Override
    public void start(){
        System.out.println("motorcycle is strating");
    }
    @Override
    public void stop(){
        System.out.println("motorcycle is stopping");
    }

    @Override
    public void charge() {
        System.out.println("Not possible to charge");
    }

    @Override
    public double calculateFuelEfficiency(){
        System.out.println("You have 30km worth of gasoline left");
        return fuel;
    }

    @Override
    public void getinfo(){
        System.out.println("motorcycle information");
        System.out.println("type: motorcycle");
        System.out.println("fuel: gasoline");
        System.out.println("Color: black ");
    }
}

class bus1 extends AbstractVehicle{

    public bus1(double nopeus, double fuel){
        super(nopeus, fuel);
    }
    @Override
    public void start(){
        System.out.println("Bus is starting");
    }

    @Override
    public void stop(){
        System.out.println(" Bus is stopping");
    }

    @Override
    public void charge() {
        System.out.println("not possible to charge");
    }

    @Override
    public double calculateFuelEfficiency(){
        System.out.println("You have 30km worth of gasoline left");
        return fuel;
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