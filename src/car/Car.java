package car;

/**
 * Define a Car class that has
 * * ● instance fields (model, modelNumber , color, currentSpeed (default value 0), isEngineStart (true or false))
 * @author aveth
 */
public class Car {
    String model;
    int modelNumber;
    String color;
    int currentSpeed = 0;
    boolean isEngineStart = false;

    public Car(String model, int modelNumber, String color) {
        this.model = model;
        this.modelNumber = modelNumber;
        this.color = color;
    }

    /**
     * startEngine() starts the engine
     */
    public void startEngine() {
        isEngineStart = true;
        System.out.println("Engine started for " + model + " " + modelNumber);
    }
    /**
     * methods (stopEngine() stops the engine
     */
    public void stopEngine() {
        isEngineStart = false;
        System.out.println("Engine stopped for " + model + " " + modelNumber);
    }

    /**
     * print car information
     */
    public void displayInfo() {
        System.out.println("Car Info: Model: " + model
                + ", Model Number: " + modelNumber
                + ", Color: " + color
                + ", Current Speed: " + currentSpeed
                + ", Engine Status: " + (isEngineStart ? "Started" : "Stopped"));
    }

    public static void main(String[] args) {

        Car mercedesC203 = new Car("C", 203, "Black");
        Car mercedesS505 = new Car("S", 505, "White");

        mercedesC203.startEngine();
        mercedesC203.displayInfo();
        mercedesC203.stopEngine();
        mercedesC203.displayInfo();

        System.out.println();

        mercedesS505.startEngine();
        mercedesS505.displayInfo();
        mercedesS505.stopEngine();
        mercedesS505.displayInfo();
    }
}

