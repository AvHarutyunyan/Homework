package test_code;

import java.util.ArrayList;

/**
 * regarding Array List
 */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayLists arrayLists = new ArrayLists();
        arrayLists.stringerList();
        arrayLists.oj();
        arrayLists.changes();
        arrayLists.removeNumber();
        arrayLists.maxMin();
        arrayLists.oppositeSide();
    }
    public void stringerList(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("David");
        strings.add("Anna");
        strings.add("John");
        strings.add("Emmy");
        strings.add("Lily");
      for (String x : strings){
            System.out.print(x + " ,");
        }
        System.out.println();
    }

    /**
     * Write a program that:
     * ✅ Creates an ArrayList<Integer>
     * ✅ Adds numbers [1, 2, 3, 4, 5]
     * ✅ Moves the first element (1) to the end of the list
     */
    public void oj(){
        ArrayList<Integer> mm = new ArrayList<>();
        mm.add(1);
        mm.add(2);
        mm.add(3);
        mm.add(4);
        mm.add(5);
        mm.remove(0);
        mm.add(1);
        System.out.println(mm);
    }

    /**
     * Write a program that:
     * ✅ Creates an ArrayList<String>
     * ✅ Adds 4 words
     * ✅ Replaces the 2nd (index 1) word with "Updated"
     * ✅ Prints the final list
     */
    public void changes(){
        ArrayList<String> cc = new ArrayList<>(4);
        cc.add("OOP");
        cc.add("JVM");
        cc.add("JDK");
        cc.add("JRE");
        cc.remove(1);
        cc.add(1,"Update");
        System.out.println(cc);
    }

    /**
     * Write a program that:
     * ✅ Creates an ArrayList<Integer>
     * ✅ Adds [5, 10, 15, 20, 25]
     * ✅ Checks if the number 15 is in the list
     * ✅ If it is, deletes it
     * ✅ Prints the final list
     */
    public void removeNumber(){
        ArrayList<Integer> jj = new ArrayList<>(4);
        jj.add(23);
        jj.add(43);
        jj.add(15);
        jj.add(88);
        for (int i = 0; i < jj.size() ; i++) {
            if (jj.get(i) == 15){
                jj.remove(i);
               // i--;
            }
        }
        System.out.println(jj);

    }
    /**
     * ✅ Creates an ArrayList<Integer>
     * ✅ Adds [34, 7, 89, 2, 56]
     * ✅ Finds the maximum (max) and minimum (min) values
     * ✅ Prints them
     */
    public void maxMin(){
        ArrayList<Integer> hh = new ArrayList<>(5);
        hh.add(34);
        hh.add(7);
        hh.add(89);
        hh.add(2);
        hh.add(56);
        int max  = hh.get(0);
        int min = hh.get(0);
        for (int i = 0; i <hh.size() ; i++) {
            if (hh.get(i) > max){
                max = hh.get(i);
            }
            if (hh.get(i) < min){
                min = hh.get(i);
            }
        }
        System.out.println("The biggest number is: " + max);
        System.out.println("The smallest number is: " + min);
        }
    /**
     * Write a program that:
     * ✅ Creates an ArrayList<Integer>
     * ✅ Adds [10, 20, 30, 40, 50]
     * ✅ Reverses the list
     * ✅ Prints the result
     */
    public void oppositeSide(){
     ArrayList<Integer> opposite = new ArrayList<>(5);
     opposite.add(10);
     opposite.add(20);
     opposite.add(30);
     opposite.add(40);
     opposite.add(50);
     int gg = 0;
        for (int i = opposite.size() - 1; i >= 0; i--) {
            gg = opposite.get(i);
            System.out.println(gg);
        }
    }
}
