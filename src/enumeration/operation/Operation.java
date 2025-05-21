package enumeration.operation;

/**
 * Exercise 4 (Operation)
 * Create an enum Operation for a calculator: ADD, SUBTRACT, MULTIPLY, DIVIDE.
 * Each should implement an abstract method apply(a, b) returning the result.
 * @author Avet
 */
public enum Operation {
    ADD{
        @Override
        public double operation(double number1 , double number2) {
            return number1 + number2 ;
        }
    },

    SUBTRACT{
        @Override
        public double operation(double number1 , double number2) {
            return number1 - number2;
        }
    },
    MULTIPLY{
        @Override
        public double operation(double number1 , double number2) {
            return number1 * number2;
        }
    },
    DIVIDE{
        @Override
        public double operation(double number1 , double number2) {
            return number1 / number2;
        }
    };

    public abstract double operation(double number1 , double number2);

    public static void main(String[] args) {
        System.out.println(ADD.operation(4,4));
        System.out.println(SUBTRACT.operation(6,9));
        System.out.println(MULTIPLY.operation(8,2));
        System.out.println(DIVIDE.operation(18,9));
    }
}
