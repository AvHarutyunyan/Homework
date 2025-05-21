package enumeration.traffic_light;

/**
 * Exercise 3 (TrafficLight)
 * Create an enum called TrafficLight with values: RED, YELLOW, GREEN.
 * Each should have a method getNextLight() returning the next state.
 * @author Avet
 */
public enum TrafficLight {

    RED{
        @Override
        public String getNextLight(){
            return "RED";
        }
    },

    YELLOW{
        @Override
        public String getNextLight(){
            return "YELLOW";
        }
    },

    GREEN{
        public String getNextLight(){
            return "GREEN";
        }
    };
   public abstract String getNextLight();

    public static void main(String[] args) {
        System.out.println(RED.getNextLight());
        System.out.println(YELLOW.getNextLight());
        System.out.println(GREEN.getNextLight());
    }
}
