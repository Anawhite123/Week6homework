//  4.1 Declare two instance and two static variables.
// 4.2 Declare one instance method.
//  4.3 Declare one static method.
// 4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
// 4.5 Declare the Main method.
// 4.6 Call both instance and static methods into the Main method and run the programme.
//



public class Four {

    int e = 98; //instance variable
    int f = 66; //instance variable
    static int g  = 89;// static variable
    static String h = "happyfamily";//static variable

   public void a1() { //instance method

       System.out.println(e);
       System.out.println(f);
       System.out.println(g);
       System.out.println(h);
   }

   public static void a2(){ //static method

      Four obj  = new Four();
       System.out.println(obj.e);
       System.out.println(obj.f);
       System.out.println(g);
       System.out.println(h);
   }

    public static void main(String[] args) {//main method
        Four k  = new Four();
        k.a1();//instance method require object creation in main method
       a2();//static method called directly


    }

}
