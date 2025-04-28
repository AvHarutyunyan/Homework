import oop.car.Car;

public class Carss {
    public String model;
    public String brand;
    public int year;

    Carss(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Carss carss1 = new Carss("Toyota", "Camry 45", 2011);
        carss1.carsInformation();
        System.out.println();
        Carss carss2 = new ElectricCar("Tesla", "S paid" , 2018 , 100);
        carss2.carsInformation();

    }

    public void carsInformation() {
        System.out.println("Model is: " + model + "\n Brand is: " + brand + "\n Year is: " + year);
    }

}

class ElectricCar extends Carss {
    public int batteryCapacity;

    ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;

    }

    @Override
    public void carsInformation() {
        super.carsInformation();
        System.out.println("BattareyCapasity is: " + batteryCapacity + " kwh");
    }
}
