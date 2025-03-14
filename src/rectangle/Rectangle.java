package rectangle;
import java.rmi.MarshalException;
/**
 * Create a rectangle (height 5, width 14) and calculate the area of the rectangle.
 * @author aveth
 */
public class Rectangle {
    int length;
    int width;

    /**
     * print area of rectangle
     */
    public void areaOfRectangle(){
        System.out.println(length * width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 14;
        rectangle.width = 5;
        rectangle.areaOfRectangle();
    }
}


