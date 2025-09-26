package day3;

class Base {
    int x, y;
    public Base(int n, int m) {
        x=n;
        y=m;
    }
    public Base(Base b) {
        x=b.x;
        y=b.y;
    }
    public void show() {
        System.out.println("Constructor "+x+" "+y);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Base b1 = new Base(5,10);
        b1.show();
        Base b2 = new Base(b1);
        b2.show();
    }
}
