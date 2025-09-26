import java.util.Scanner;

public class LinearSearch {
    public void linearSearch(int[] a, int n) {
        int flag=0;
        for (int i=0; i<a.length; i++) 
            if (a[i] == n) {
                System.out.println("Element found at "+ (i+1));
                flag = 1;
                break;
            }
        if (flag == 0) 
            System.out.println("Element not found!");
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i=0; i<n; i++) 
            a[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int e = sc.nextInt();

        ls.linearSearch(a, e);
    }
}