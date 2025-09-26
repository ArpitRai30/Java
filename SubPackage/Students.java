package SubPackage;
import MyPackage.Message;

public class Students extends Message {
    @Override 
    public void display() {
        System.out.println("Hello Students");
    }
}
