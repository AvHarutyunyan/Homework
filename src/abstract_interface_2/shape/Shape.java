package abstract_interface_2.shape;

/**
 * 2.	Write a program to create a class named Shape which has two abstract
 * methods: draw() and erase(). In this class we have three subclasses Circle,
 * Triangle and Square. Each of them has an override version of methods.
 * Create these using polymorphism concepts.
 *
 * @author Avet
 */
public abstract class Shape {
    public abstract void draw();

    public abstract void erase();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
    @Override
    public void erase() {
        System.out.println("erase Circle\n");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw Triangle");
    }
    @Override
    public void erase() {
        System.out.println("erase Triangle\n");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("draw Square");
    }
    @Override
    public void erase() {
        System.out.println("erase Square");
    }

    public static void main(String[] args) {

        Shape shape1 = new Circle();
        shape1.draw();
        shape1.erase();

        Shape shape2 = new Triangle();
        shape2.draw();
        shape2.erase();

        Shape shape3 = new Square();
        shape3.draw();
        shape3.erase();
    }

}