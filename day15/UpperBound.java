package day15;

class Boxes<T extends Number> {
    private T value;
    public Boxes(T value) {
        this.value = value;
    }
    public void display() {
        System.out.println("Value: " + value);
    }
}
public class UpperBound {
    public static void main(String[] args) {
        Boxes<Integer> b1 = new Boxes<>(100);   //Integer is a subclass of number
        Boxes<Double> b2 = new Boxes<>(12.5);   //Double is a subclass of number
        //Box<String> b3 = new Boxes<>("Hello");    //Error: String is not allowed
        
        b1.display();
        b2.display();
    }
}
