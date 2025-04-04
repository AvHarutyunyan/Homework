package strings;

public class MyString {

public Object text;

    MyString(Object text){
        this.text = text;
    }

    /**
     * print lenght of text
     */
    public void lenght(){
        System.out.println(text.toString().length());
    }

    /**
     * print  reserve lenght of text
     */
    public void reserve(){
        for (int i = text.toString().length() - 1 ; i >= 0 ; i--) {
            System.out.print(text.toString().charAt(i));
        }
        System.out.println();
    }

    /**
     * print text indexOf with char
     */
    public void indexOf(char ch){
        int x;
        System.out.println(text.toString().indexOf(ch));
    }

    public static void main(String[] args) {
        MyString m = new MyString("Hello");
        m.lenght();
        m.reserve();
        m.indexOf('h');
    }

}







