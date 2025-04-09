package terminal;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class Doing {
    public String food;

    public static void main(String[] args) {
        Person person1 = new Person("Garik", 33, 45.7);
        Person person2 = new Person("Harut", 45);
        person1.setAge(44);
        person1.setId(23);
        System.out.print(person1.name + " " + person1.getAge() + " " + person1.weight + " " + person1.getId() + "\n");
        System.out.println(person2.name);
        person2.Eat();
        person2.Drink("CJ");
    }
}

