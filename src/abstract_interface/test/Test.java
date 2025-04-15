package abstract_interface.test;

/**
 * 4. Write a program to create an interface named test.
 * In this interface the member function is square.
 * Implement this interface in arithmetic class.
 * Create one new class called ToTestInt in this class using the object of the arithmetic class.
 * @author Aveth
 */
public interface Test {
    int square(int x);
}

class Arithmetic implements Test{
  @Override
    public int square(int x){
      System.out.println();
      return x * x;
  }
}
class ToTestInt{
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Square is " + arithmetic.square(4));
    }
}

