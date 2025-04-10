class Employee{
	
	String name;
	int salary;
	String place;
	
	public Employee(String name ,String place, int salary) {
		this.name = name;
		this.place = place;
		this.salary = salary;
	}
	
	public void showDetails() {
		
		System.out.println("Name: " + name);
		System.out.println("Place: " + place);
		System.out.println("Salary: " + salary);
	}
}


class Manager extends Employee{
	
	String dept;
	
	public Manager(String name, String place, int salary, String dept) {
		super(name, place, salary);
		this.dept = dept;
	}
	
	public void showDetails() {
		
		System.out.println("Name: " + name);
		System.out.println("Place: " + place);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + dept);
	}
}
public class employeeThingy {
	public static void main(String[] args) {
		
		Manager man = new Manager("Rahul", "Kochi", 500000, "Intelligence");
		
		man.showDetails();
		
		Employee emp = new Employee("Vijay", "Kozhikode", 70000);
		emp.showDetails();
	}
}
