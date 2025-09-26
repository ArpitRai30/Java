import java.util.*;

class Stud {
    String name;
    int age;

    Stud(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class LambdaIterator {
    public static void main(String[] args) {
        List<Stud> students = Arrays.asList(
            new Stud("Ram", 20),
            new Stud("Shyam", 22),
            new Stud("Ravan", 19)
        );

        students.forEach(s -> System.out.println(s.name + " - " + s.age));
    }
}
