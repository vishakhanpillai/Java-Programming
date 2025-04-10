package StudentManagement;

public class Student {
	public String name;
	public String roll, grade;
	
	public Student(String name, String roll, String grade) {
		this.name = name;
		this.roll = roll;
		this.grade = grade;
	}
	
	public void display() {
		
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.println("Grade: " + grade);
	}
}
