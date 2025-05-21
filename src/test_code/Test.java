package test_code;

import java.util.*;

/**
 * just mixed codes
 *
 * @author aveth
 */
public class Test {
    public static void main(String[] args) {

        Test test = new Test();



        Queue<Integer> integers = new Queue<Integer>() {
            @Override
            public Spliterator<Integer> spliterator() {
                return Queue.super.spliterator();
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return 0;
            }

            @Override
            public Integer poll() {
                return 0;
            }

            @Override
            public Integer element() {
                return 0;
            }

            @Override
            public Integer peek() {
                return 0;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

//        int [] x = new int[3];
//        x[0]= 1;
//        x[1] = 2;
//        x[2] = 3;
//
//        for (int i = x.length -1; i >= 0 ; i--) {
//            System.out.println(x[i]);
//        }


        Scanner scanner = new Scanner(System.in);
        int switchday;
//      System.out.println((8 > 9) ? ((10 > 9) ? 10 : 5) : 2);
        while (true) {
            System.out.print("Enter a number (1-7), or 0 to exit: ");
            switchday = scanner.nextInt();

            if (switchday == 0) {
                System.out.println("Exiting program...");
                break;
            }
            switch (switchday) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("❌ Not correct value! Try again.\n");
            }
            //scanner.close();
            /**
             *2 Write a method that prints the elements of the short[] s array in reverse order
             * For example: ( 257 -> 752)․
             */
            short[] s = new short[3];
            s[0] = 3;
            s[1] = 2;
            s[2] = 1;
            for (int i = s.length - 1; i >= 0; i--) {
                System.out.println(s[i]);
            }
            String sa = ",s ";
            double testValue = 0XE;
        }
    }

    /**
     * multiplication table
     *
     * @param a
     */
    public void a23(int a) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + a + " = " + i * a);
        }
    }
}

class Student{

}