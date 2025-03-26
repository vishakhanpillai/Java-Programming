import java.io.*;
public class files {
    public static void main(String[] args) throws IOException {
        
        FileReader fread = new FileReader("sample.txt");
        BufferedReader read = new BufferedReader(fread);

        String line;
        int lineCount = 0;

        while((line = read.readLine()) != null){
            System.out.println(line);
            lineCount++;
        }
        System.out.println("Line Count = " + lineCount);
        read.close();


        // FileWriter fwrite = new FileWriter("sample.txt", true);
        // BufferedWriter write = new BufferedWriter(fwrite);

        // write.newLine();
        // write.write("This is the next line");
        // write.close();
    }
}