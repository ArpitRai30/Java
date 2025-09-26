import java.util.Scanner;

public class BinarySearch {

    public int[] sort(int a[]) {
        for (int i=0; i<a.length-1; i++)
            for (int j=i+1; j<a.length; j++) 
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        return a;
    }

    public int binarySearch(int[] a, int n) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == n) {
                return mid+1;
            }
            else if (n > a[mid]) 
                start = mid+1;
            else 
                end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i=0; i<n; i++) 
            a[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int e = sc.nextInt();

        int[] sorted = bs.sort(a);
        System.out.print("Sorted array: ");
        for (int i=0; i<n; i++) 
            System.out.print(sorted[i] + " ");
        System.out.println();

        int pos = bs.binarySearch(sorted, e);
        if (pos == -1) 
            System.out.println("Element not found!");
        else
            System.out.println("Element found at " + pos);
    }
}
