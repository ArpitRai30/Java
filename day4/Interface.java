interface MountainParts {
    String TERRAIN = "off-road";

    String getSuspension();
    void setSuspension(String newValue);

    String getType();
    void setType(String newValue);
}

class MountainBike implements MountainParts {
    private String suspension;
    private String type;

    MountainBike(String suspension, String type) {
        this.suspension = suspension;
        this.type = type;
    }

    @Override 
    public String getSuspension() {
        return suspension;
    }

    @Override 
    public void setSuspension(String newValue) {
        this.suspension = newValue;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String newValue) {
        this.type = newValue;
    }

    void display() {
        System.out.println("Terrain: "+TERRAIN);
        System.out.println("Suspension: "+ suspension);
        System.out.println("Type: "+type);
    }
}

public class Interface {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike("Dual", "Downhill");
        bike.display();

        bike.setSuspension("Front");
        bike.setType("Cross Country");

        System.out.println("After Updating Values");
        bike.display();
    }
}