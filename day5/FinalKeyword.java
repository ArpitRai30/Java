
public class FinalKeyword {
    public static void main(String[] args) {
        Fin f = new Fin();
        f.method();
    }
}
final class Fin {
    final int a = 2;
    public final void method() {
//        a = 20;
        System.out.println("Method "+a);
    }
}
// class Fin2 extends Fin {
//     public void method2() {

//     }
// }