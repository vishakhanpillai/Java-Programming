import java.io.*;
public class searchFile {

    public static void main(String[] args) {

       File directory = new File("D:\\Development\\Packages");

       String fileName = "sample.txt";

       File file = new File(directory, fileName);

       if(file.exists()){
        System.out.println("File Found " + file.getAbsolutePath() );
       }
       else{
        System.out.println("file not found in " + directory.getAbsolutePath());
       }
    }
}