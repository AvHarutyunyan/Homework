package oop_2.car;

/**
 * ․ Create a class of Car class which has the following
 * <p>
 * fields:
 * passengerCount //   it could not be less than 2
 * engineType // expected values  one letter (‘a-z , A-Z’)
 * <p>
 * methods: getter & setter of passengerCount & engineType fields
 * <p>
 * Create a subclass of Truck class which  has the following
 * <p>
 * fields:
 * capacity  // default value should be 0
 * <p>
 * methods:  getter & setter of capacity field
 * <p>
 * Use super(...) method in the constructor for initializing the fields of the superclass.
 *
 * @author Avet
 */
public class Car {
    private char engineType;
    private int passengerCount;

//    Car(char engineType , int passengerCount){
//        this.engineType = engineType;
//        this.passengerCount = passengerCount;
//    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }


    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        this.engineType = engineType;
    }

    /**
     * this method checked passengerCount is bigger than 2  or Not!
     *
     * @param passengerCount
     */
    public int passengerCount(int passengerCount) {
        if (passengerCount > 2) {
            throw new IllegalArgumentException("That many people can't sit in the car");
        } else setPassengerCount(passengerCount);
        System.out.println("Passenger count is: " + getPassengerCount());

        return 0;
    }

    /**
     * Just engine type method
     * @param engineType
     * @return
     */
    public int engineTypes(char engineType) {
        setEngineType(engineType);
        System.out.println("Engine Type is: " + getEngineType());

        return 0;
    }

//    public static void main(String[] args) {
//       // Car car = new Car();
//        //car.passengerCountCheck(2);
//       // car.engineTypes('A');
//    }

}

class Truck extends Car {
    public int capacity;

//    Truck(int passengerCount , char engineType , int capacity){
//        super('a',4);
//        this.capacity = capacity;
//    }


    private int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * capacity of truck method
     * @param capacity
     */
    public void capacityOfTruck(int capacity) {
        setCapacity(capacity);
        System.out.println("Truck capacity is: " + getCapacity());
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.capacityOfTruck(4);
        truck.engineTypes('V');
        truck.passengerCount(4);
    }

}
