public class Super {
    int num;
    public Super() {
        num = 20;
    }
    public void display() {
        System.out.println("Parent class num "+num);
    }
}
class Derived extends Super {
    public Derived() {
        super.display();
    }
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}

