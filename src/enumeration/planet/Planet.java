package enumeration.planet;

/**
 * Exercise 2 (Planet)
 * Create an enum called Planet with  fields.
 *
 * mass (double),  radius (double)
 *
 * Add a constructor.
 *
 * public enum Planet {
 *    EARTH(5.97e24, 6371),
 *    MARS(6.42e23, 3389);
 *    // fields, constructor, and methods
 * }
 * @author Avet
 */
public enum Planet {
    EARTH(5.97e24, 6371),
    MARS(6.42e23, 3389);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        System.out.println("Earth's mass is " + Planet.EARTH.getMass());
    }
}
