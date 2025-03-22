package test_code;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int switchday;
        System.out.println((8 > 9) ? ((10 > 9) ? 10 : 5) : 2);
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
            scanner.close();
            /**
             *  2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
             *         Օրինակ՝ ( 257 -> 752)․
             */
            short[] s = new short[3];
            s[0] = 3;
            s[1] = 2;
            s[2] = 1;
            for (int i = s.length - 1; i >= 0; i--) {
                System.out.println(s[i]);
            }
            String sa= ",s ";
            double test = 0XE;
        }
    }
}