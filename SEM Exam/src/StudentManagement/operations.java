package StudentManagement;

import java.util.ArrayList;

public class operations {
	
	public ArrayList<Student> student = new ArrayList<Student>();
	public void addStudent(Student s) {
		
		student.add(s);
		System.out.println("Student added successfully");
	}
	
	public void deleteStudent(Student s) {
		
		student.remove(s);
		System.out.println("Student removed");
	}
	
	public void display() {
		if(student.isEmpty()) {
			System.out.println("Empty Student List");
		}
		else {
			
			for(Student s : student) {
				s.display();
			}
		}
	}
}


