package Socket;
import java.io.*;
import java.net.*;
public class serverOneway {
    public static void main(String[] args) throws IOException{

        ServerSocket ss = new ServerSocket(9999);
        Socket socket = ss.accept();

        System.out.println("Client is connected");

        InputStreamReader input = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(input);
        
        System.out.println(br.readLine());

        ss.close();
    }
}
