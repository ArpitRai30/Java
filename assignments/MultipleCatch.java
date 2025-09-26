public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 30 / 0; // Causes ArithmeticException first
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e);
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        }
        System.out.println("Program continues...");
    }
}
