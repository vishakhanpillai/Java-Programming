import java.io.*;

class Student implements Serializable{
    String name;
    transient int age;
    int grade;

    Student(String name, int age, int grade){
        System.out.println("Constructor is called");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class serial {
    public static void main(String[] args) throws Exception {
        
        Student student = new Student("vishakhan", 21, 12);

        System.out.println("Before Serialization");
        student.display();

        FileOutputStream fout = new FileOutputStream("output.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(student);
        out.close();

        System.out.println("\n\nAfter Serialization");

        FileInputStream fin = new FileInputStream("output.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);

        Student s2 = (Student) oin.readObject();
        oin.close();
        System.out.println("Deserialization");
        s2.display();

    }
}
