package enumeration.geography;

/**
 * Exercise 6
 * Create an interface Drawable with a method draw().
 * Create an enum Shape that implements Drawable, with values CIRCLE, SQUARE, TRIANGLE.
 * @author Avet
 */
public interface Drawable {
    void draw();
}
 enum Shape implements Drawable{
    CIRCLE{
        @Override
        public void draw() {
            System.out.println("Draw Circle");
        }
    },
     SQUARE{
         @Override
         public void draw() {
             System.out.println("Draw Square");
         }
     },
     TRIANGLE{
         @Override
         public void draw() {
             System.out.println("Draw Triangle");
         }
     };

     public static void main(String[] args) {
         CIRCLE.draw();
         SQUARE.draw();
         TRIANGLE.draw();
     }
}
