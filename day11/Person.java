package day11;
import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;    //Recommended for version count
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Name: "+ name + ", Age: " + age;
    }
}
