package oop.car;

/**
 * 4․ Create a class of Car class which has the following
 * fields:
 * passengerCount //   it could not be less than 2
 * engineType // expected values  one letter (‘a-z , A-Z’)
 * methods: getter & setter of passengerCount & engineType fields
 *  Create a subclass of Truck class. The Truck class has the following
 * fields:
 * capacity  // default value should be 0
 * methods:  getter & setter of capacity field
 * Use super(...) method in the constructor for initializing the fields of the superclass.
 * @author aveth
 */
public class Car {
    public static void main(String[] args) {
        Truck truck = new Truck(3, 'D', 500);
        System.out.println("Passenger Count: " + truck.getPassengerCount());
        System.out.println("Engine Type: " + truck.getEngineType());
        System.out.println("Capacity: " + truck.getCapacity());
    }
    private int passengerCount ;
    private char engineType ;

    Car(int passengerCount , char engineType){
       setPassengerCount(passengerCount);
        setEngineType(engineType);
    }
    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount >= 2) {
            this.passengerCount = passengerCount;
        } else {
            throw new IllegalArgumentException("Passenger count cannot be less than 2.");
        }
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char  engineType) {
        if (Character.isLetter(engineType)) {
            this.engineType = engineType;
        } else {
            throw new IllegalArgumentException("Engine type must be a single letter (a-z, A-Z).");
        }
    }
}
class Truck extends Car {
    private int capacity = 0;
    public Truck(int passengerCount, char engineType, int capacity) {
        super(passengerCount, engineType);
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

 class StringBuilders {
    public static StringBuilder work(StringBuilder a, StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1, s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
