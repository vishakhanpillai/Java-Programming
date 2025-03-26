import calculator.Calc;

public class myClass extends Calc{
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        myClass cal = new myClass();

        

        cal.add(a, b);
        cal.subtract(a, b);
        cal.multiply(a, b);
        cal.divide(a, b);
        cal.modulus(a, b);

        
    }
}