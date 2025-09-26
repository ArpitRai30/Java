package day3;
import java.util.Scanner;
class Student {
    String name;
    public Student() {
        name = "";
    }
    public void inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        name = sc.nextLine();
        System.out.println("Name:"+name);
    }
}

class Marks extends Student {
    int marks;
    public Marks(int m1) {
        marks = m1;
    }
    public void inputMarks() {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Student Marks:");
        // marks = sc.nextInt();
        System.out.println("Marks:"+marks);
    }
}
class Sports extends Marks {
    int sports;
    public Sports(int s, int m1) {
        super(m1);
        sports = s;
    }
    public void inputSports() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student enrolled in sports "+sports);
    }
}
public class Inheritence1 {
    public static void main(String[] args) {
        Sports s = new Sports(15, 87);
        s.inputName();
        s.inputMarks();
        s.inputSports();
    }
}
