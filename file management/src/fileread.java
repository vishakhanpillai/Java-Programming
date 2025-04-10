import java.io.*;
import java.util.Scanner;
public class fileread {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		try {
			
		
			PrintWriter write = new PrintWriter(new FileWriter("D:\\Rajagiri\\JAVA EXAM\\file management\\src\\sample.txt", true));
			BufferedReader read = new BufferedReader(new FileReader("D:\\Rajagiri\\JAVA EXAM\\file management\\src\\sample.txt"));
			
			String line, l2;
			
			System.out.println("File Contents: ");
			while((line = read.readLine()) != null) {
				System.out.println(line);
			}
			
			read.close();
			
			System.out.println("Enter what you want to write to the file: ");
			String input = sc.nextLine();
			
			write.println(input);
			write.flush();
			
			
			BufferedReader read2 = new BufferedReader(new FileReader("D:\\Rajagiri\\JAVA EXAM\\file management\\src\\sample.txt"));
			System.out.println("File Contents: ");
			while((l2 = read2.readLine()) != null) {
				System.out.println(l2);
			}
			read2.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
