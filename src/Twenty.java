
//20. Write a Java Program using below steps.
//        20.1 Declare your Spain as static variable.
//        20.2 Declare your United Kingdom as instance variable.
//        20.3 Declare instance method name homeCountry()and call static variable.
//        20.4 Declare static method name holidays() and call instance variable
//        20.5 Call both methods in main method.



public class Twenty {
    static String a = "Rushden";
    String b = "United Kingdom";

    public void homeCountry(){
        System.out.println(a);

    }
        public static void holidays (){
        Twenty r = new Twenty();
            System.out.println(r.b);


        }

    public static void main(String[] args) {
        holidays ();
        Twenty r = new Twenty();
        r.homeCountry();
    }
}
