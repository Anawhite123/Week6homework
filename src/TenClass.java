

//Write a Java program that takes a number as input and prints its multiplication
//        table up to 10.
//        Test Data: Input a number: 8.
//        Expected Output:
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        8 x 10 = 80



public class TenClass {

    public static void main(String[] args) {
        TenClass z = new TenClass();
        z.table(8,1);
        z.table(8,2);
        z.table(8,3);
        z.table(8,4);
        z.table(8,5);
        z.table(8,6);
        z.table(8,7);
        z.table(8,8);
        z.table(8,9);
        z.table(8,10);
    }

    public  void table(int a, int b){
        System.out.println(a+ "*" +b+ "="+ a*b);

    }






}
