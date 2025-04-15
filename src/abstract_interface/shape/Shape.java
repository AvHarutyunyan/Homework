package abstract_interface.shape;

/**
 * Write a program to create a class named Shape which has two abstract
 * methods: draw() and erase(). In this class we have three subclasses Circle,
 * Triangle and Square.
 * Each of them has an override version of methods. Create these using polymorphism concepts.
 * @author Aveth
 */
public abstract class Shape {
    abstract void draw();

    abstract void erase();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("draw Circle");
    }

    @Override
    void erase() {
        System.out.println("erase Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("draw Tringle");
    }

    @Override
    void erase() {
        System.out.println("erase Tringle");
    }

}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("draw Square");
    }

    @Override
    void erase() {
        System.out.println("erase Square");
    }

    public static void main(String[] args) {
        Shape shape1 = new Square();
        shape1.draw();
        shape1.erase();

        Shape shape2 = new Triangle();
        shape2.draw();
        shape2.erase();

        Shape shape3 = new Circle();
        shape3.draw();
        shape3.erase();
    }
}
