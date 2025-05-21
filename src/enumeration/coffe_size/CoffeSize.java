package enumeration.coffe_size;

/**
 * Exercise 7
 * Create an enum called "CoffeeSize" that contains values for
 * SMALL,
 * MEDIUM,
 * and LARGE coffee sizes. Write a program that prints the name and ordinal value of each size
 */
public enum CoffeSize {
    SMALL{
        @Override
        public String valueOfCoffe() {
            System.out.print("This is a small Coffe,\t");
            return "Value is: " + 2;
        }
    },

    MEDIUM{
        @Override
        public String valueOfCoffe() {
            System.out.print("This is a Medium Coffe,\t");
            return "Value is: " + 4;
        }
    },
    LARGE{
        @Override
        public String valueOfCoffe() {
            System.out.print("This is a Large Coffe,\t");
            return "Value is: " +  6;
        }
    };

    public abstract String valueOfCoffe();

    public static void main(String[] args) {
        System.out.println(SMALL.valueOfCoffe());
        System.out.println(MEDIUM.valueOfCoffe());
        System.out.println(LARGE.valueOfCoffe());
    }
}
