// package Assignments;

public class DataTypes {
        short s;
        int i;
        float f;
        long l;
        double d;
        char c;
        boolean b;

        void output() {
            System.out.println(s);
            System.out.println(i);
            System.out.println(f);
            System.out.println(l);
            System.out.println(d);
            System.out.println(c);
            System.out.println(b);
        }
    public static void main(String[] args) {
        DataTypes data = new DataTypes();
        data.output();
    }
}
