package optional_specifiers;

public class Person {
    private int age;
    private int id;
    private String name;

    public void compareTo(Person o) {
        if (this.age > o.age){
            System.out.println("too low");
        } else if (this.age < o.age) {
            System.out.println("too high");
        }else System.out.println("none");
    }

    Person(String name,int age,int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
       Person person = new Person("Hogi" , 88,01);
       Person person1 = new Person("jok" , 45,07);
       person1.compareTo(person);
       person.compareTo(person1);
    }
}








