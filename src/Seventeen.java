
//17. Write a Java Program using below steps.
//        17.1 Declare your city as instance variables.
//        17.2 Declare your country as static variables.
//        17.3 Declare one instance method and call static variable in print statement
//        17.4 Declare static method and call instance variable in print Statement.
//        17.5 Call both user defined methods into main method.





public class Seventeen {

    String city = "Ahmedabad";
    static String country = "USA";


    public static void b1(){

        System.out.println(country);

    }
    public static void b2 () {
        Seventeen h = new Seventeen();
        System.out.println(h.city);


    }

    public static void main(String[] args) {
        Seventeen k = new Seventeen();
        b1();
        b2();

    }


    }

