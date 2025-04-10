class BankAccount{
	
	public void calculateInterest(double principle, double rate) {
		System.out.println("Interest for Savings: " + (principle * rate)/100 + "%");
	}
	
	public void calculateInterest(double p, double r, double t) {
		System.out.println("Interest for Fixed Deposit: " + (p*r*t)/100 + "%");
	}
	
	public void calculateInterest() {
		System.out.println("Interest: 0%");
	}
}
public class bankOverload {
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		
		acc.calculateInterest(25000, 1000);
		acc.calculateInterest(10000, 5000, 10);
		acc.calculateInterest();
	}
}
