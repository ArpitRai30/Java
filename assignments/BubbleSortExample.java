import java.util.Scanner;

public class BubbleSortExample {
    static int[] bubbleSort(int[] a) {
        for (int i=0; i<a.length; i++) {
            boolean flag = false;
            for (int j=0; j<a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements in array: ");
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        a = bubbleSort(a);

        System.out.print("Sorted Array: ");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
