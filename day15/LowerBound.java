package day15;
import java.util.*;

public class LowerBound {
    public static void addNumbers(List<? super Integer> l) {
        //you can safely add Intefer or its superclasses
        l.add(10);
        l.add(20);
        //l.add(12.5); NOT allowed (Double not a superclass of Integer)
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(intList);
        addNumbers(numList);
        addNumbers(objList);

        System.out.println("intList: " + intList);
        System.out.println("numList: " + numList);
        System.err.println("objList: " + objList);
    }
}
