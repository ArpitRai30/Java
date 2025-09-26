import java.util.Scanner;
class Shape {
    public void area() {
        float area = 0;
    }
}
class Circle extends Shape {
    float radius;
    public Circle(float r) {
        radius = r;
    }
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area = "+area);
    }
}
class Rectangle extends Shape {
    float length, breadth;
    public Rectangle(float l, float b) {
        length = l;
        breadth = b;
    }
    public void area() {
        float area = length * breadth;
        System.out.println("Area = "+area);
    }
}
public class CalculateArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape:");
        String shape = sc.nextLine();
        if (shape.toLowerCase().equals("circle")) {
            System.out.print("Enter radius:");
            float radius = sc.nextFloat();
            Circle c = new Circle(radius);
            c.area();
        }
        if (shape.toLowerCase().equals("rectangle")) {
            System.out.print("Enter length and breadth:");
            float length = sc.nextFloat();
            float breadth = sc.nextFloat();
            Rectangle r = new Rectangle(length, breadth);
            r.area();
        }
    }
}
