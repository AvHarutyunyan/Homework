package abstract_interface_2.test;

/**
 * 4.Write a program to create an interface named test.
 * In this interface the member function is square. Implement this interface in arithmetic class.
 * Create one new class called ToTestInt in this class using the object of the arithmetic class
 *
 * @author Avet
 */
public interface Test {
    int function(int square);
}
class Arithmetic implements Test{
  public int function(int square){
        System.out.println("Square is: " + square * square);
        return 0;
    }

    public static void main(String[] args) {
        Test test = new Arithmetic();
        test.function(5);
    }
}
