package moduuli2_1;

    public class teht2 {

        public static void main(String[] args) {
            Car myCar;

            myCar =  new Car("toyota corolla", 100, 60);
            myCar.fillTank();

            for(int i = 0; i < 6; i++) {
                myCar.accelerate();
            }

            while(myCar.getSpeed() > 0) {
                myCar.decelerate(15);
                System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            }
        }
    }

 class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;

     float gasolinetankcapicity;
     float topspeed;

    public Car(String typeName, float gasolinetankcapicity, float topspeed) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
        this.topspeed = topspeed;
        this.gasolinetankcapicity = gasolinetankcapicity;
        speed = topspeed;
    }
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }


}