package abstract_interface_2.animal;

/**
 * 9.Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
 * Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark",
 * both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.
 * @author Avet
 */
public abstract class Animal {
    public abstract void dogs();
    public abstract void cats();
}
class Cat extends Animal {
    @Override
    public void dogs(){

    }
    @Override
    public void cats(){
        System.out.println("Cats meow");
    }
}
class Dog extends Animal{
    public void dogs(){
        System.out.println("Dogs bark");
    }
    public void cats(){

    }

    public static void main(String[] args) {
        Animal animal1 = new Cat();
        animal1.cats();

        Animal animal2 = new Dog();
        animal2.dogs();
    }
}
