import java.util.Scanner;
public class factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num, i, fact = 1;
		
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		sc.close();
		
		for( i = 1; i <= num; i++){
			fact = fact * i;
		}
		System.out.println("The Factorial of " + num + " is " + fact);
	}
}