package stringhomework;
//Write a java program which remove extra space from both side “ I love
//        java ”
//        Expected output: “I love java”

public class StringTwo {
    public static void main(String[] args) {
        String m = "  I love  java  ";
        System.out.println(m.trim());// use of trim method for removing space
    }
}
