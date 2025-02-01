import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        sc.close();
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.err.println(num + " Is Even");
        }
        else{
            System.err.println(num + " Is Odd");
        }
    }    
}
