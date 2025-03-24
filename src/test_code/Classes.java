package test_code;

public class Classes {
    public int age;
    public int id;
    public String country;
    public String name;

    public static void main(String[] args) {
        Classes person1 = new Classes("Armenia", 48, 22, "Harut");
        Classes person2 = new Classes("Russia", 81, 34, "Alex");
        Classes person3 = new Classes("Germany", 00, 136, "Hitler");
        person1.personInfo();
        person2.personInfo();
        person3.personInfo();
    }

    public Classes(String country, int id, int age, String name) {
        this.age = age;
        this.id = id;
        this.country = country;
        this.name = name;
    }

    public void personInfo() {
        System.out.println("country:" + country + " ID:" + id + " Age:" + age + " Name:" + name);
    }


}
