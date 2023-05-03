//5. Write a program for a calculator with addition, subtraction, multiplication, and division
//methods all with parameters and use string concatenation methods. (Note: Two static  and Two instance methods.)

public class Five {

   static int a  = 2, b = 3, c = 15, d = 5;//static variables

public static void addition_subtraction (){ //static method
    System.out.println("addition is " +(a+b) );
    System.out.println("subtraction is " +(a-b) );}

    public void multiplication_division()
{
        Five obj = new Five();//object
    System.out.println("multiplication is " +(c*d) );
    System.out.println("division  is " +(c/d) );
    }

    public static void main(String[] args) {//instance method
    Five t = new Five();
    t.multiplication_division();
    addition_subtraction();

    }




}



