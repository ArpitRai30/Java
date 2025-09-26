package sessional1;
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    String empId;
    Employee(String name, String empId) {
        super(name);
        this.empId = empId;
    }

    @Override
    void show() {
        super.show();
        System.out.println("ID: " + empId);
    }
}

public class ShowSuper {
    public static void main(String[] args) {
        Employee e = new Employee("Arpit", "0241cse");
        e.show();
    }
}
