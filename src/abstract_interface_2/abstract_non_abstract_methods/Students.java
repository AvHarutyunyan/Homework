package abstract_interface_2.abstract_non_abstract_methods;

public class Students {
        public static void main(String[] args) {
            Marks marks1 = new StudentA(30, 20, 90);
            Marks marks2 = new StudentB(70, 20, 50, 90);

            System.out.println(marks1.getPercentage());
            System.out.println(marks2.getPercentage());
        }
    }

    abstract class Marks {
        abstract double getPercentage();
    }

    class StudentA extends Marks {
        int m1, m2, m3;

        StudentA(int m1, int m2, int m3) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
         @Override
        double getPercentage() {
            return (m1 + m2 + m3) / 3.0;
        }
    }

    class StudentB extends Marks {
        int m1, m2, m3, m4;

        StudentB(int m1, int m2, int m3, int m4) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            this.m4 = m4;
        }
        @Override
        double getPercentage() {
            return (m1 + m2 + m4 + m4) / 4.0d;
         }
}
