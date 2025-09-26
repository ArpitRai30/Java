package day9;

public class EqualsOperator {
    public static void  main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        int a=5, b=5;
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("Comparing using '=='");
        System.out.println("s1 == s2:" + (s1==s2));
        System.out.println("a == b:" + (a==b));
        System.out.println("str1 == str2:" + (str1==str2));

        System.out.println("s1.equals(s2):" + s1.equals(s2));
        //System.out.println(a.equals(b));
        System.out.println("str1.equals(str2):" + str1.equals(str2));
    }
}
