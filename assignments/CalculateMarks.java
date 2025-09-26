//package Assignments;
import java.util.*;
public class CalculateMarks {
    String name;
    int m1, m2, m3;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Marks for 3 subjects:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    public float average(int m1, int m2, int m3) {
        float avg = (m1+m2+m3)/3.0f;
        return avg;
    }

    public int total(int m1, int m2, int m3) {
        int total = m1+m2+m3;
        return total;
    }

    public static void main(String[] args) {
        CalculateMarks C1 = new CalculateMarks();
        C1.input();
        float avg = C1.average(C1.m1,C1.m2,C1.m3);
        int total = C1.total(C1.m1,C1.m2,C1.m3);
        System.out.println("Total Marks:"+total);
        System.out.println("Average:"+avg);
    }
}
