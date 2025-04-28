package terminal;

public class Doing {
    public String food;

    public static void main(String[] args) {
        Person person1 = new Person("Garik", 33, 45.7);
        Person person2 = new Person("Harut", 45);

        person1.setAge(44);
        person1.setId(23);

        System.out.print("Name is: " + person1.name + " \n Age is: " + person1.getAge() + "\n Weight is: " + person1.weight + "\n ID is: " + person1.getId() + "\n");
        System.out.println();

        person2.Eat();
        person2.Drink("CJ");
    }

    public static class Person {

        public String name;
        private int age;
        public double weight;
        private int id;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
            if (age > 0 && age < 150) {
                System.out.println(age);
            }
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        Person(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
            weight = 30.7;
        }

        void Eat() {
            System.out.println("the " + this.name + " Eating");
        }

        void Drink(String name) {
            System.out.println("the " + name + " Drinking");
        }

    }
}

