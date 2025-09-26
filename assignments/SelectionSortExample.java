import java.util.Scanner;

public class SelectionSortExample {
    static int[] selectionSort(int[] a) {
        for (int i=a.length-1; i>0; i--) {
            int maxIndex = i;
            for (int j=i-1; j>=0; j--) 
                if (a[j] > a[maxIndex]) 
                    maxIndex = j;
            if (maxIndex != i) {
                int temp = a[maxIndex];
                a[maxIndex] = a[i];
                a[i] = temp;
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
        
        a = selectionSort(a);

        System.out.print("Sorted Array: ");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
