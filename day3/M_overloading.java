package day3;

class Addition {
    public int add(int a, int b) {
        return (a+b);
    }
    public String add(String s1, String s2) {
        return (s1+" "+s2);
    }    
}
public class M_overloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum of integers: "+obj.add(5,10));
        System.out.println("Concatenated strings:"+obj.add("Hello", "World"));
    }
}
