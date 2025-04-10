import java.io.*;
import java.util.Scanner;
public class filecmd {
	public static void main(String[] args) throws Exception{
		
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
}
