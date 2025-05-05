/**
 * 1․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.
 *
 * 2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.
 * 3․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից
 *     Կամ փոքր  20 ից և մեծ 15 ից ․
 * 4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.
 * 5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
 * Օրինակ։ 974 -> true, 846 -> false
 *
 * 6․ Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։
 * 7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
 * 8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։ (նահանջ է համարվում այն տարին որը բաժանվում է 4,
 * բայց բացառություն է արվում այն տարիների համար, որոնք 100-ի բաժանվող են։ Այդ տարիները նահանջ են միայն, եթե նաև բաժանվում են 400-ի։)
 */
 class TesttStatmetns {
     TesttStatmetns(String h){
         System.out.println("barev");
     }


    public static void evenOrNot(int x){
        if (x % 2 == 0)
            System.out.println("even number");
       else System.out.println("Odd Number");
    }

    public void negativeNumber(int number){
        if (number > 0)
            System.out.println("Good");
        else System.out.println("Negative");
    }

    public void division(int  number){
        if (number < 8 && number > 5 || number < 20 &&  number > 15)
            System.out.println("The number: " + number);
    }

//    public static void main(String[] args) {
//        TesttStatmetns testtStatmetns = new TesttStatmetns("h");
//        testtStatmetns.evenOrNot(8);
//        testtStatmetns.negativeNumber(-1);
//        testtStatmetns.division(7);
//    }
}
class Chokop extends TesttStatmetns{
     long fild = 23l;
     Chokop(){
         super("l");
     }



    public static void main(String[] args) {
        Chokop chokop = new Chokop();
        System.out.println(chokop);
    }
}

