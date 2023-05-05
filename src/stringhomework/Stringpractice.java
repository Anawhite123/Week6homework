package stringhomework;

public class Stringpractice {
    private static int w;
    String a = "hello world";
     String b ="Hello World";

     String p ="he world";

     int k = 78;
     int r = 65;

    public static void main(String[] args) {
        Stringpractice h = new Stringpractice();
        String c = h.a;
        String d = h.b;
        String e = h.p;
        int l = h.k;
        int w =h.r;
        System.out.println(c.equalsIgnoreCase(d));
        System.out.println(c.replace("h","s"));
        System.out.println(c.replace("w","r"));
        System.out.println(e.replaceAll("he","root"));
        System.out.println(e.concat(d));
        System.out.println(d.contentEquals(c));
    }


}
