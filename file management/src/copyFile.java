import java.io.*;
import java.util.Scanner;
public class copyFile {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Rajagiri\\JAVA EXAM\\file management\\src\\sample.txt");
		File file2 = new File("D:\\Rajagiri\\JAVA EXAM\\file management\\src\\copy.txt");
		Scanner read = new Scanner(file);
		
		PrintWriter write = new PrintWriter(new FileWriter(file2, true));
		
		String line;
		
		while(read.hasNextLine()) {
			line = read.nextLine();
			write.println(line);
			write.flush();
		}
		
		
	}
}
