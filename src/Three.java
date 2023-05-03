//3.1 Declare one instance and one static variable.
//        3.2 Declare one instance method.
//        3.3 Declare one static method.
//        3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
//        3.5 Declare the Main method.
//        3.6 Call both instance and static methods into the Main method and run the programme.
//

public class Three {
    int y = 88;//instance variable
    static String z = "myhome";//static variable
    public void a1() { //instance method
        System.out.println(y);
        System.out.println(z);
    }
    public static void b2(){
        Three obj = new Three();
        System.out.println(obj.y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        Three r = new Three();
        r.a1();
        b2();
    }
}
