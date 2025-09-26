class Bank {
    public void getRateOfInterest() {

    }
}
class SBI extends Bank {
    @Override
    public void getRateOfInterest() {
        int interestRate = 8;
        System.out.println("Rate of interest in SBI is "+interestRate+" %");
    }
}
class ICICI extends Bank {
    @Override
    public void getRateOfInterest() {
        int interestRate = 7;
        System.out.println("Rate of interest in ICICI is "+interestRate+" %");
    }
}
class AXIS extends Bank {
    @Override
    public void getRateOfInterest() {
        int interestRate = 6;
        System.out.println("Rate of interest in AXIS is "+interestRate+" %");
    }
}

public class Interest {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.getRateOfInterest();
        ICICI i = new ICICI();
        i.getRateOfInterest();
        AXIS a = new AXIS();
        a.getRateOfInterest();
    }
}