import java.util.Scanner;

public class Garments {
    String GCode, GType, GFabric;
    int GSize;
    float GPrice;
    Scanner sc = new Scanner(System.in);

    Garments() {
        GCode = "Not Allowed";
        GType = "Not Allowed";
        GFabric = "Not Allowed";
        GSize = 0;
        GPrice = 0;
    }
    public void assign() {
        if (GFabric.toLowerCase().equals("cotton")) {
            if (GType.toLowerCase().equals("trouser"))
                GPrice = 1300;
            else if (GType.toLowerCase().equals("shirt"))
                GPrice = 1100;
        }
        else {
            if (GType.toLowerCase().equals("trouser"))
                GPrice = (float)(1300 - (1300 * 0.1));
            else if (GType.toLowerCase().equals("shirt"))
                GPrice = (float)(1100 - (1100 * 0.1));
        }
    }
    public void input() {
        System.out.print("Enter Garment Code: ");
        GCode = sc.nextLine();
        System.out.print("Enter Garment Fabric: ");
        GFabric = sc.nextLine();
        System.out.print("Enter Garment Type: ");
        GType = sc.nextLine();
        System.out.print("Enter Garment Size: ");
        GSize = sc.nextInt();
    }

    public static void main(String[] args) {
        Garments g = new Garments();
        g.input();
        g.assign();
        System.out.println("Garment Price is " + g.GPrice);
    }
}
