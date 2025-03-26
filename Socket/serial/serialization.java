package serial;
import java.io.*;
import java.net.*;

class Student implements Serializable{
    transient String name;
    int rollno;

    public Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}
public class serialization {
    public static void main(String[] args)  {
        
        Student st = new Student("Ethan", 1);

        try {
            FileOutputStream fout = new FileOutputStream("system.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fout);

            obj.writeObject(st);
            obj.close();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        System.out.println(st.name + " " + st.rollno);

        try{
            FileInputStream fin = new FileInputStream("system.txt");
            ObjectInputStream obj2 = new ObjectInputStream(fin);
            
            Student s2 = (Student) obj2.readObject();

            System.out.println(s2.name + " " + s2.rollno);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
