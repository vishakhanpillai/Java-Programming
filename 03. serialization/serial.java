import java.io.*;

class Student implements Serializable{
    transient int roll;
    String name;

    public Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}
public class serial {
    public static void main(String[] args) {

        Student st = new Student(1, "Rahul");

        //Serialization
        try{
            FileOutputStream fout = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(st);
            out.close();
            fout.close();
            System.out.println("Serialized: " + st.name + " " + st.roll);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        //Deserialization
        try {
            FileInputStream fin = new FileInputStream("output.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s2 = (Student) in.readObject();
            in.close();
            fin.close();
            System.out.println("Deserialized: " + s2.name + " " + s2.roll);

        } catch (Exception e) {
            e.getStackTrace();
        }

        
    }
    
}