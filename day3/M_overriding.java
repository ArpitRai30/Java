package day3;

class Base1 {
    private int a;
    public int b; 
    protected int c;
    public Base1() {
        a=10;
        b=20;
        c=30;
    }
    public void show() {
        System.out.println("Base class method");
    }
}
class Derived extends Base1 {
    public void show() {
        super.show();
        System.out.println("Derived class method");
        //System.out.println("Private a="+a);
        System.out.println("Public b="+b);
        System.out.println("Protected c="+c);
    }
}
class External {
    public void show() {
        Base1 b2 = new Base1();
        //System.out.println("Private a="+b2.a);
        System.out.println("Public b="+b2.b);
        System.out.println("Protected c="+b2.c);
    }
}
public class M_overriding {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.show();
        External e = new External();
        e.show();
    }
}


