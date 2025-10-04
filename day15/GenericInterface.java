package day15;

interface Display<T> {
    void show(T data);
}
class IntergerDisplay implements Display<Integer> {
    public void show(Integer data) {
        System.out.println("Integer value: " + data);
    }
}
class StringDisplay implements Display<String> {
    public void show(String data) {
        System.out.println("String value: " + data);
    }
}
public class GenericInterface {
    public static void main(String[] args) {
        Display<Integer> intObj = new IntergerDisplay();
        intObj.show(100);

        Display<String> strObj = new StringDisplay();
        strObj.show("Generic Example");
    }
}
