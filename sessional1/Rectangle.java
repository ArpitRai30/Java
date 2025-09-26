package sessional1;
public class Rectangle {
    float length, width;
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float calculateArea() {
        return length * width;
    }

    public float calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 5);
        System.out.println("Area: " + rec.calculateArea());
        System.out.println("Perimeter: " + rec.calculatePerimeter());
    }
}
