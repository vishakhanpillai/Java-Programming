import java.util.Scanner;
import java.lang.Math;
public class armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        
		long num, sum = 0, rem, n, temp, digits = 0;
		
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		temp = n;
        num = temp;

		
		while (n != 0) {
            rem = n % 10;
            digits++;
            n = n / 10;
        }

        while (temp > 0) {
            rem = temp % 10;
            sum = sum + (long)Math.pow(rem, digits);
            temp = temp / 10;

        }
		
		if( sum == num ){
			System.out.println( num + " is an armstrong number ");
		}
		else{
			System.out.println( num + " is not an armstrong number ");
		}		
	}
}