package MyPackage;

public class Message {
    int a;
    private int b;
    protected int c;
    public Message() {
        a=10;
        b=20;
        c=30;
    }
    public void display() {
        System.out.println("Hello NIET");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
    }

    public void display2() {
        System.out.println("Display 2 method from MyPackage Message");
    }
}

