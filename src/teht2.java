package moduuli2_1;

    public class teht2 {

        public static void main(String[] args) {
            SportsCar mySportsCar = new SportsCar("ferrari f40", 80, 320);

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
    public float speed;
    public float gasolineLevel;
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

class SportsCar extends Car {
    private static final float accerlation = 20;
    private static final float decleration = 30;
    private static final float consumption = 5;

    public SportsCar(String typeName, float gasolinetankcapicity, float topspeed) {
        super(typeName, gasolinetankcapicity, topspeed);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0 && getSpeed() < topspeed) {
            setSpeed(getSpeed() + accerlation);
            setGasolineLevel(getGasolineLevel() - consumption);
        }
    }

    @Override
    void decelerate(int amount) {
        if (getGasolineLevel() > 0 && amount > 0) {
            setSpeed(Math.max(0, getSpeed() - amount * decleration));
            setGasolineLevel(getGasolineLevel() - (consumption / 2));
        }
    }


    private void setGasolineLevel(float level) {
        this.gasolineLevel = Math.max(0, level);
    }

    private void setSpeed(float speed) {
        this.speed = Math.min(speed, topspeed);
    }
}
