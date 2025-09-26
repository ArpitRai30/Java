import java.util.Scanner;
public class InsertionSortExample {
    static int[] insertionSort(int[] a) {
        for(int i=0; i<a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j>=0 && a[j]>key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        a = insertionSort(a);

        System.out.print("Sorted Array: ");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
