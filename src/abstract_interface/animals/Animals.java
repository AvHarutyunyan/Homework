package abstract_interface.animals;

import abstract_interface.namedA.A;

/**
 * Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
 * Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark",
 * both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.
 * @author Avet
 */
public abstract class Animals {
    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals {
    void cats() {
        System.out.println("Cats Meow!");
    }

    void dogs() {
        System.out.println("Dogs not available in Cats class.");
    }
}

class Dogs extends Animals {
    void dogs() {
        System.out.println("Dogs Bark!");
    }

    void cats() {
        System.out.println("Cats not available in Dogs class.");
    }

    public static void main(String[] args) {
        Animals animals1 = new Dogs();
        animals1.dogs();

        Animals animals2 = new Cats();
        animals2.cats();
    }
}
