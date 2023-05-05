public class Returntype {


    public int abc (){
        int a = 20;
        int b = 30;
        int result = a+b;
        return result;
    }

    public static void main(String[] args) {
        Returntype v = new Returntype();
        int result = v.abc();
        System.out.println(result);
    }


}
