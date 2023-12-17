class Car implements SafetyLights{
    String model;
    int mileAge;
    double speed;

    public Car(String model){
        this.model = model;
    }

    public void start(){
        System.out.println(model + " is running");
    }

    public void accelerate(){
        System.out.println("Accelerating");
        speed++;
    }

    public boolean checkSeatBelts(){
        System.out.println("Seatbelts are working fine");
        return true;
    }

    public void lockSeatBelts(){
        System.out.println("Seatbelts locked");
    }

    public void checkLights(){
        System.out.println("Lights checked");
    }
    public void toggleLights(){
        System.out.println("Lights toggled");
    }

}

public class CarMain {
    public static void main(String [] args){
        Car carro = new Car("Duster Plymouth 1974");
        carro.start();
        carro.accelerate();
        carro.checkSeatBelts();
        carro.lockSeatBelts();


        Safety c = new Car("Dodge Challenger 2005");
        c.checkSeatBelts();
        c.lockSeatBelts();

        SafetyLights lights = new Car("Duster Datsun 91");
        lights.checkLights();
        lights.toggleLights();

    }
}
