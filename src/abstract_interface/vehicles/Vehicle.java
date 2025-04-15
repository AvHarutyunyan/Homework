package abstract_interface.vehicles;

/**
 * Write a program to model MBTA vehicles
 * • Three types of vehicles: Bus, Urban Rail,and Commuter Rail
 * • Three kinds of Right-of-Way: Dedicated,Shared, and Mixed (Hybrid)
 * @author aveth
 */
public abstract class Vehicle {
    String model;
    RightOfWay rightOfWay;

    Vehicle(String model, RightOfWay rightOfWay){
        this.model = model;
        this.rightOfWay = rightOfWay;
    }
   abstract void move();

    void displayInfo(){
        System.out.println("Vehicle model " + model );
        System.out.println("Right of way " + rightOfWay);
    }
}

class Bus extends Vehicle{
    Bus(String model, RightOfWay rightOfWay){
        super("Bus",rightOfWay);
    }
    @Override
    void move(){
        System.out.println(model + "Is moving on the road");
    }
}

class UrbanRail extends Vehicle{
    UrbanRail(String model , RightOfWay rightOfWay){
        super("UrbanRail" , rightOfWay);
    }
    @Override
    void move(){
        System.out.println(model + " is moving on tracks");
    }
}

class CommuterRail extends Vehicle{
    CommuterRail(String model,RightOfWay rightOfWay){
        super("CommuterRail" , rightOfWay);
    }
    @Override
    void move(){
        System.out.println(model + " is moving suburban tracks");
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Bus("City Bus" ,RightOfWay.Shared);
        Vehicle vehicle2 = new CommuterRail("Commuter Express " , RightOfWay.Mixed);
        Vehicle vehicle3 = new UrbanRail("Urban Express" , RightOfWay.Dedicated);

        vehicle1.displayInfo();
        vehicle1.move();
        System.out.println();

        vehicle2.displayInfo();
        vehicle2.move();
        System.out.println();

        vehicle3.displayInfo();
        vehicle3.move();
    }
}
