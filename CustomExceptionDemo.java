import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void checkNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Number cannot be negative: " + num);
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        try {
            checkNumber(num);
        } 
        catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Execution completed.");
        }
        scanner.close();
    }
}
