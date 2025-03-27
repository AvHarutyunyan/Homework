package test_code;

import java.lang.*;
public class Intializers {
    private String name = "KOKO"; //3
    {
        System.out.println("Baylus dzez"); //4
    }

    public static void main(String[] args) { //2
        Intializers intializers  = new Intializers("Tiny");
        System.out.println(intializers.name); //6
    }
    static { //1
        System.out.println("Hello");
    }
    Intializers(String name){ //5
        this.name = "Fluffy";
        System.out.println("Constructor");
    }


}
