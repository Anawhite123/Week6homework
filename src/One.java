////1. Write a Java programme using the following steps.
//        1.1 Declare two instance variables.
//        1.2 Declare one instance method.
//        1.3 Call both instance variables into the instance method inside the print statement. 1.4 Declare the Main method.
//        1.5 Call the above instance method into the Main method and run the programme.
public class One {

    int a = 50;
    String b = "Kruti";

    public void m1() {//instance method
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {//static method
        One k = new One();//creating object
        k.m1();
    }

    }








