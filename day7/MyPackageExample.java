package day7;
import MyPackage.*;
public class MyPackageExample {
    public static void main(String[] args) {
        MyPackage.Message msg = new MyPackage.Message();
        MyPackage1.Message msg1 = new MyPackage1.Message();
        msg.display();    
        msg1.display();
        msg.display2();

//        System.out.println("a:" + msg.a);
//        System.out.println("b:" + msg.b);
//        System.out.println("c:" + msg.c);

        Addition a = new Addition();
        System.out.println(a.add(4,5));
    }
}
