package test_code;


import java.lang.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class Intializers {
    private String name = "KOKO"; //3
    {
        System.out.println("Baylus dzez"); //4
    }

    public static void main(String[] args) { //2
        Intializers intializers = new Intializers("Tiny");
        System.out.println(intializers.name); //6
        ArrayList<Integer> f = new ArrayList<>();
        f.add(4);
        f.add(2);
        f.add(9);
        Collections.sort(f);
        System.out.println(f);

        int e = 7;
        System.out.println(e * (5-1));
    }
    static { //1
        System.out.println("Hello");
    }

    Intializers(String name){ //5
        this.name = "Fluffy";
        System.out.println("Constructor");
    }
}
