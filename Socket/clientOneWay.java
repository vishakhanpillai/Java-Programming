package Socket;
import java.util.*;
import java.io.*;
import java.net.*;

public class clientOneWay {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Socket socket = new Socket("localhost", 9999);

        PrintWriter pr = new PrintWriter(socket.getOutputStream());
        
        System.out.println("Enter the message you want to send to the server: ");
        String msg = sc.nextLine();

        pr.println(msg);
        pr.flush();

        socket.close();
        sc.close();

    }
}
