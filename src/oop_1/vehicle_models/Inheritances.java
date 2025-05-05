package oop_1.vehicle_models;

/**
 * 3. Create classes and use  inheritance(5  times)
 *    Example :   Bicycle ~ MotoBicycle,
 * @author aveth
 */
public class Inheritances {
public String model;
public String color;
public int horsepower;
public int maxSpeed;

    public void result() {
        System.out.println("Default Inheritances result");
    }

    public static void main(String[] args) {
        Inheritances inheritances1 = new Bysicle("Tesla E-Bike" , "White" , 30);
        Inheritances inheritances2 = new Car("750L","Blue",630,300);
        Inheritances inheritances3 = new Motorbike("Ninja H2R", "Black", 400, 300);
        Inheritances inheritances4 = new Bus("SAF-T-LINER C2 ","Yellow " , 200, 120);
        Inheritances inheritances5 = new BigCar("Hummer H2" , "Orange" , 393,180);

        inheritances1.result();
        inheritances2.result();
        inheritances3.result();
        inheritances4.result();
        inheritances5.result();
    }
}
class Bysicle extends Inheritances {
    Bysicle(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    /**
     * print whole information Byscicle
     */
    @Override
    public void result() {
        System.out.print("Bysycle result is: " + this.model + " " + this.color + " " + this.maxSpeed +"ms"+ "\n");
    }
}

class Car extends  Inheritances{
    Car(String model, String color, int horsepower, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;
    }
    /**
     * print whole Car information
     */
    @Override
    public void result(){
        System.out.print("Car result is: " +  this.model + " " + this.color + " " + this.maxSpeed+"ms " + this.horsepower + "hp" + "\n")  ;
    }
}
class  Motorbike extends Inheritances {
    Motorbike(String model, String color, int horsepower,int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;
    }

    /**
     * print whole information Motorbike
     */
    @Override
    public void result(){
        System.out.println("MotorBike result is: " + this.model + " " + this.color + " " + this.maxSpeed + "ms  "+ this.horsepower + "hp");
    }

}
class Bus extends  Inheritances{
    Bus(String model, String color, int horsepower, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;
    }
    /**
     * print whole Bus information
     */
    @Override
    public void result(){
        System.out.print("Bus result is: " +  this.model + this.color + this.maxSpeed+"ms " + this.horsepower+"hp" + "\n" )  ;
    }
}
class BigCar extends Inheritances {
    BigCar(String model, String color, int horsepower, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;
    }

    /**
     * print whole BigCar information
     */
    @Override
    public void result() {
        System.out.print("BigCar result is: " + this.model + " " + this.color + " " + this.maxSpeed + "ms " + this.horsepower + "hp");
    }
}