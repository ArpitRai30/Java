import java.util.Scanner;
public class CountOfTwoNumbers {
    public boolean compareCountOf(int[] arr, int arg1, int arg2) {
        int count1=0;
        int count2=0;

        for (int num : arr) {
            if (num == arg1) 
                count1++;
            if (num == arg2)
                count2++;
        }

        return count1 > count2;
    }

    public static void main(String[] args) {
        CountOfTwoNumbers count = new CountOfTwoNumbers();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i=0; i<n; i++) 
            a[i] = sc.nextInt();
        
        System.out.print("Enter numbers to count: ");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        System.out.println("Is count of c1 > c2? " + count.compareCountOf(a, c1, c2));
        System.out.println("Is count of c2 > c2? " + count.compareCountOf(a, c2, c1));
    }
}
