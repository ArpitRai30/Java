interface OuterInterface {
    interface InnerInterface {
        void display();
    }
}

public class InterfaceInInterface implements OuterInterface.InnerInterface {
    @Override
    public void display() {
       System.out.println("This is an interface inside interface.");
    }

    public static void main(String[] args) {
        OuterInterface.InnerInterface i = new InterfaceInInterface();
        i.display();
    }
}
