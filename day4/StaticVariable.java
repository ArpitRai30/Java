class Student {
    static String schoolName = "ABC School";    // static variable (shared by all objects)
    String studentName;                         // Non-static variable (each object gets its own copy)

    Student (String studentName) {
        this.studentName = studentName;
    }
    // static method (belongs to class)
    static void showSchool() {
        System.out.println("School: " + schoolName);
    }
    // non-static method (belongs to object)
    void showStudent() {
        System.out.println("Student: " + studentName);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Student.showSchool();

        Student s1 = new Student("Ravi");
        Student s2 = new Student ("Priya");

        s1.showStudent();
        s2.showStudent();
        
        Student.schoolName = "XYZ School";

        Student.showSchool();
    }
}