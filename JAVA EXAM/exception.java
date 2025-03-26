import java.io.*;
import java.util.*;
public class exception {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int a, b, div;

       System.out.print("Enter a: ");
       a = sc.nextInt();
       System.out.print("Enter b: ");
       b = sc.nextInt();

       div = division(a, b);
       System.out.println("The Quotient is: " + div);
    }

    static int division(int a, int b) throws ArithmeticException{
        return a /b;
    }
}
