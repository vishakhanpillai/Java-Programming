class Vehicle{
	String color;
	String speed;
	
	public Vehicle(String color, String speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void display() {
		System.out.println("Color: " + color);
		System.out.println("Speed: " + speed);
	}
	
}

class car extends Vehicle{
	
	String company;
	public car(String color, String speed, String company) {
		super(color, speed);
		this.company = company;
	}
	 
	void display() {
		super.display();
		System.out.println("Company: " + company);
	}
}


public class vehicleInherit {
public static void main(String[] args) {
	
	car car = new car("red", "200kmph", "Toyota");
	
	
	car.display();
}
}
