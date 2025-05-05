package oop_2.agregation;

import java.util.ArrayList;
import java.util.List;

public class Service {
    List<Car> cars;

    Service(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public static void main(String[] args) {
        List<Car> cars1 = new ArrayList<>();
        cars1.add(new Car("MODEL 3"));
        cars1.add(new Car("MODEL Y"));

        Service service = new Service(cars1);

        for (Car car : service.cars)
            System.out.println(car.getModels());
    }

}

class Car {
    public String model;

    Car(String model) {
        this.model = model;
    }

    public String getModels() {
        return model;
    }

    public void setModels(String models) {
        this.model = models;
    }


}
