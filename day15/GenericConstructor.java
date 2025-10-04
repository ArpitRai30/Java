package day15;

class Person {
    public <T> Person(T data) {
        System.out.println("Generic Constructor called with: " + data);
    }
}
public class GenericConstructor {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person(25);
        Person p3 = new Person(5.9);
    }
}