package enumeration.currency;

/**
 * Exercise 5 (Currency)
 * Create an enum Currency with values like USD, EUR, JPY.
 * Each should have a symbol and country. Override toString() to return "USD - United States Dollar".
 * @author Avet
 */
 enum Currency  {

    USD{
        @Override
        public String toString(){
            return "USD-United States Dollar: Symbole is $";
        }

    },
    EUR{
        @Override
        public String toString() {
            return "Euro: Symbole is € ";
        }
    },
    JPY{
        @Override
        public String toString() {
            return "Japanese Yen: Symbole is  ¥";
        }
    };

    public abstract String toString();

    public static void main(String[] args) {
        System.out.println(USD.toString());
        System.out.println(EUR.toString());
        System.out.println(JPY.toString());
    }
}

