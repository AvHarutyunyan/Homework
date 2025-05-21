package collections;

import test_code.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Define ArrayList of numbers {1 , 5 ,58 , 0, 58, 75 …}
 * 1.	Copy list values  into another.
 * 2.	Reverse elements in a list.
 * 3.	Swap two elements in a list.
 * 4.	Iterate and print list elements.
 * 5.	Sort list elements.
 * 6.	Remove duplicates.
 * 7.	Find Common elements.
 * 8.	Find the Largest Number
 * 9.	Combine Two lists.
 * 10.	Find the Second-Largest Element
 */
public class CollectionsHomework {
    public static void main(String[] args) {
        copyList();
        reverseList();
        swapElements();
        iterateList();
        sortLitElements();
        removeDupilactes();
        findLargestNumber();
        combineLists();

        Linked linked = new Linked();
        linked.reverseLinkedList();
        java.util.LinkedList<String> strings = new java.util.LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("d");
        linked.findMiddle(strings);
        linked.removeDuplicates(strings);

    }

    public static void copyList() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(58);
        integers.add(0);
        integers.add(58);
        integers.add(75);

        ArrayList<Integer> copy = new ArrayList<>(integers);
        System.out.println(copy);
    }

    public static void reverseList() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(58);
        integers.add(0);
        integers.add(58);
        integers.add(75);

        for (int i = integers.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void swapElements() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(58);
        integers.add(0);
        integers.add(58);
        integers.add(75);

        integers.set(0, 5);
        integers.set(4, 7);

        System.out.println(integers + "\n");
    }

    public static void iterateList() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(58);
        integers.add(0);
        integers.add(58);
        integers.add(75);

        for (Integer integer : integers)
            System.out.println(integer + "\n");
    }

    public static void sortLitElements() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(58);
        integers.add(0);
        integers.add(58);
        integers.add(75);

        integers.sort(Integer::compareTo);
        System.out.println(integers);
    }

    public static void removeDupilactes() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(58);
        integers.add(0);
        integers.add(58);
        integers.add(75);

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer item : integers) {
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }

        System.out.println(uniqueList);
    }

    public static void findLargestNumber() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(58);
        integers.add(0);
        integers.add(58);
        integers.add(75);

        int max = Collections.max(integers);
        System.out.println(max);
    }

    public static void combineLists() {
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(5);
        integers1.add(58);
        integers1.add(0);
        integers1.add(58);
        integers1.add(75);

        ArrayList<Integer> integers2 = new ArrayList<>(integers1);
        integers2.add(1);
        integers2.add(5);
        integers2.add(58);
        integers2.add(0);
        integers2.add(58);
        integers2.add(75);

        System.out.println(integers2);
    }

}

/**
 * Define LinkedList of Strings
 * <p>
 * 11.	Reverse a LinkedList
 * 12.	Find the Middle Node
 * 13.	Palindrome Check   (e.g., 1 -> 2 -> 2 -> 1).
 * 14.	Remove Duplicates
 */
class Linked {
    private String names;

    public void reverseLinkedList() {
        java.util.LinkedList<String> strings = new java.util.LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }

    public void findMiddle(LinkedList<String> list) {
        int middleIndex = list.size() / 2;
        System.out.println(list.get(middleIndex));
    }

    public void removeDuplicates(LinkedList<String> list) {
        LinkedList<String> result = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            boolean found = false;

            for (int j = 0; j < result.size(); j++) {
                if (result.get(j).equals(current)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(current);
            }
        }

        System.out.println(result);
    }


}


