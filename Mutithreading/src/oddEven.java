class odd implements Runnable{
	int a, b;
	public odd(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void run() {
		
		for(int i = a; i <= b; i++ )
			if(i % 2 != 0) {
				System.out.println("Odd: " + i);
			}
	}
}

class even implements Runnable{
	int a, b;
	public even(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void run() {
		
		for(int i = a; i <= b; i++ )
			if(i % 2 == 0) {
				System.out.println("Even: " + i);
			}
	}
}


public class oddEven {
	public static void main(String[] args) {
		
		odd odd = new odd(1, 100);
		even even = new even(1, 100);
		
		Thread t1 = new Thread(odd);
		Thread t2 = new Thread(even);
		
		t1.start();
		t2.start();
	}
}
