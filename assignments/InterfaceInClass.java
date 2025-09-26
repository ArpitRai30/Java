class Outer {
    interface Inner {
        void show();
    }
}

public class InterfaceInClass implements Outer.Inner {
    @Override
    public void show() {
        System.out.println("This is an interface inside a class.");
    }
    
    public static void main(String[] args) {
        Outer.Inner obj = new InterfaceInClass();
        obj.show();
    }
}
