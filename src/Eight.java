

//Write a program to insert any temperature value in degree Fahrenheit and convert to
//        degree Celsius ((F − 32) × 5/9 = 0°C).
//temp in instance method


public class Eight {
    public static void main(String[] args){
        Eight t = new Eight();
        t.winter(6);
    }
            public void winter (double F ){//instant method

    System.out.println((F - 32) * 5 / 9 + "°C");

    }
}
