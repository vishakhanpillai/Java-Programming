import java.io.*;

import serial.serialization;

class Student implements Serializable{
    transient String name;
    int rollno;

    public Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}

public class deserial {
    public static void main(String[] args) {
        try{
            FileInputStream fout = new FileInputStream("system.txt");
            ObjectInputStream oin = new ObjectInputStream(fout);
            Student s = (Student)oin.readObject();

            System.out.println(s.name + s.rollno);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
