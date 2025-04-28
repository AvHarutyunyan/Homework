package terminal;

public class GlobalPerson {
    private String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GlobalPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name is: " + name + "\n age is: " + age);
    }
}

class Student extends GlobalPerson {

    public char grade;

    Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name is: " + getName() + "\n age is: " + getAge() + "\n Grade is: " + grade);
    }

    public static void main(String[] args) {
        GlobalPerson globalPerson = new Student("Jack", 19, 'A');
        GlobalPerson globalPerson1 = new GlobalPerson("John", 23);

        globalPerson1.setAge(19);
        globalPerson1.displayInfo();

        globalPerson.setAge(23);
        globalPerson.displayInfo();
    }
}
