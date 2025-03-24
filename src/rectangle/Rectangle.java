package rectangle;
import java.rmi.MarshalException;
/**
 * Create a rectangle (height 5, width 14) and calculate the area of the rectangle.
 * @author aveth
 */
public class Rectangle {
   public int length;
   public int width;

    /**
     * print area of rectangle
     */
    public int areaOfRectangle(){
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 14;
        rectangle.width = 5;
        int result = rectangle.areaOfRectangle();
        System.out.println(result);
    }
}


