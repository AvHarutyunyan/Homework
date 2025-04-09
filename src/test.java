public class test {
    static String h = "High School";
    String name = "Anush";

    public  test(String name){
        this.name = name;
    }

    void  display(){
        System.out.println("Sovorum en " + name + h);
    }
    public static void main(String[] args) {
        test hs = new test("Vazgen");
        test j = new test("Kayot");
        hs.display();
        j.display();
        hs = new test("sok");
        hs.display();
    }
}
