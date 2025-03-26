package calculator;

public class Calc {

    protected void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    protected void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    protected void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    protected void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("Division: " + (a / b));
        }
    }

    protected void modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulus by zero is not allowed.");
        } else {
            System.out.println("Modulus: " + (a % b));
        }
    }
}
