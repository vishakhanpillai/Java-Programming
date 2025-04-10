package library;

public class Book {
	String title;
	public Book() {
		System.out.println("Unknown");
	}
	
	public Book(String title) {
		
		this.title = title;
	}
	
	public void display() {
		System.out.println("Book Name: " + title);
	}
}
