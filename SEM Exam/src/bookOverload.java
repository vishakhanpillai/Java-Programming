class book{
	
	public book(String title, String author) {
		
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
	
	public book(String title, String author, double price) {
		
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
	public book(String title, String author, double price, String publisher) {
		
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		System.out.println("Publisher: " + publisher);
	}
}

public class bookOverload {
	public static void main(String[] args) {
		System.out.println("Book 1");
		book b1 = new book("Atomic Habits", "James Clear");
		
		System.out.println("\n\nBook2");
		book b2 = new book("The Alchemist", "Paulo Choelo", 499);
		
		System.out.println("\n\nBook3");
		book b3 = new book("The Kite Runner", "Khalid Hosseini", 599, "Penguin");
	}
}
