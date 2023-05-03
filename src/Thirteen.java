
//13. Write a Java program to print the area and perimeter of a rectangle.
//        Test Data:
//
//        Width = 5.5 Height = 8.5
//
//        Expected Output:
//
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20





public class Thirteen {

    public static void main(String[] args) {
        g(5.6,8.5);
    }
    public static void g(double s,double t){ //use of concat method with parameter
        System.out.println("Area is "  +s+ " * "  +t+ " = "  +(s*t));
        System.out.println("perimeter is "+2+" * "+ "("+s+")+("+t+")" + " = " + 2*(s+t) );
    }




}
