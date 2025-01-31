import java.util.Scanner;
public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, i;

        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.err.println("Enter the array elemnts: ");
        for( i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.print("The sum of array elements is: " + sum);

    }
}
