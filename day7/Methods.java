package day7;
import MyPackage.Calc;

public class Methods {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.addition(5,20));
        System.out.println(c.subtraction(20, 10));
        System.out.println(c.multiplication(5, 25));
        System.out.println(c.division(40,7));
    }
}
