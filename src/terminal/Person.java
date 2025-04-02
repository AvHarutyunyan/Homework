package terminal;

public class Person {
    public String name;
    private   int age;
    public double weight;
    private int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age > 0 && age < 150){
            System.out.println(age);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Person(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
        weight = 30.7;
    }

    void Eat(){
        System.out.println("the " + this.name + " Eating");
    }
    void Drink(String name){
        System.out.println("the " + name + " Drinking");
    }



}
