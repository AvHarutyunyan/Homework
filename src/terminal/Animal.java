package terminal;

public class Animal {
    Animal(){
        System.out.println("Animal barks!");
    }
}
class Dog extends Animal{
    Dog(){
     //  super();
        System.out.println("Dog barks!");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
    }
}
