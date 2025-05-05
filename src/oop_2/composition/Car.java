package oop_2.composition;

public class Car {
    private Engine motor;

    Car(String motor) {
        this.motor = new Engine(motor);
    }


    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public static void main(String[] args) {
        Car car = new Car("2.0l");
        System.out.println(car.getMotor().getEngine());
    }

}

class Engine {
    public String engine;

    Engine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
