package city;

/**
 * Define City class: instance fields (char code, int population).
 * Create objects in the main method for the cities yerevan, moscow, new york, paris with the corresponding code
 * @author aveth
 */
public class City {
    public int population;
    public char code;

    /**
     *  Print all Cityes
     */
    public void cityMethod(){
        System.out.println("City code is " + code + " Population is " + population);
    }

    public static void main(String[] args) {
        City yerevan = new City();
        yerevan.code = 'y';
        yerevan.population = 1_100_000;
        yerevan.cityMethod();

        City moscow = new City();
        moscow.code = 'm';
        moscow.population = 1_273_400;
        moscow.cityMethod();

        City newYork = new City();
        newYork.code = 'n';
        newYork.population = 7_936_530;
        newYork.cityMethod();

        City paris = new City();
        paris.code = 'p';
        paris.population = 1_1347_000;
        paris.cityMethod();

    }


}



