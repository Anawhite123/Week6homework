

//Write a Java program to print the sum (addition), multiply, subtract, divide and
//        remainder of two numbers.
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output:
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5




public class Fourteen {
    public static void main(String[] args) {
        kelly(125, 24);
    }


    public static void kelly  (int a, int b){
        System.out.println(+a+ " + "  +b+  " = " +(a+b) );
        System.out.println(+a+ "-" +b+ " = " +(a-b));
        System.out.println(+a+ "*" +b+ "= "  +(a*b));
        System.out.println(+a+ "/" +b+ "= "  +(a/b));
        System.out.println("125" + " mod " +"24" +" = " +(a%b));// mod means %
    };
}
