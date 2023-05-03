
//18. Write a Java Program using below steps.
//        18.1 Declare your council name as static variables.
//        18.2 Declare your house number as instance variables.
//        18.3 Declare one instance method name borough() and call Static variable
//        18.4 Declare static method name address() and call instance variable
//        18.5 Call both user defined methods into main method.




public class Eighteen {
    static String a = "Oxford";
    int k = 111;
    public void q () {//instant method
        System.out.println(a);
        Eighteen r = new Eighteen();
    }
public static void y (){//static method
        Eighteen l = new Eighteen();
    System.out.println(l.k);



}

    public static void main(String[] args) {
        Eighteen l = new Eighteen();//object
        Eighteen r = new Eighteen(); //object
        r.q();//direct use without sout method
        l.y();





    }
}
