import javax.xml.stream.StreamFilter;

class Animal {
    void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        Animal animal2 = new Cat();
        animal2.sound();
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }

}

