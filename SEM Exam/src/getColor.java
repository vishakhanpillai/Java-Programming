class shape{
	protected String color;
	public shape(String color) {
		this.color = color;
	}
	
	public void getColor() {
		
		System.out.println("Color: " + color);
	}
}

class circle extends shape{
	
	private double radius;
	public circle(String color, double radius) {
			super(color);
			this.radius = radius;
	}
	
	public void calculateArea() {
		System.out.println("Area is: " + 3.14 * radius * radius);
	}
}


class rectangle extends shape{
	
	private double length, breadth;
	public rectangle(String color, double length, double breadth ) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculateArea() {
		System.out.println("Area is: " + length * breadth);
	}
}
public class getColor {
	public static void main(String[] args) {
		
		
		circle circle = new circle("Red", 2);
		rectangle rectangle = new rectangle("Blue", 2, 3);
		
		circle.getColor();
		circle.calculateArea();
		
		rectangle.getColor();
		rectangle.calculateArea();
	}
}
