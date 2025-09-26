package sessional1;
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class BabyDog extends Dog {
    public void weep() {
        System.out.println("Baby Dog is weeping.");
    }
}

public class AnimalVoice {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();
    }
}
