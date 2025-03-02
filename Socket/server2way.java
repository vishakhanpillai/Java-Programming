package Socket;
import java.util.*;
import java.io.*;
import java.net.*;
public class server2way {
    public static void main(String[] args) throws IOException{
       ServerSocket ss = new ServerSocket(1234);

       System.out.println("Waiting for connection......");

       Socket socket = ss.accept();

       System.out.println("Connection Established.");

       InputStreamReader input = new InputStreamReader(socket.getInputStream());
       BufferedReader br = new BufferedReader(input);
       PrintWriter pr = new PrintWriter(socket.getOutputStream());

       Scanner sc = new Scanner(System.in);

       String msgFromClient, msgFromServer;

       while (true) {
            msgFromClient = br.readLine();
            System.out.println("Client: " + msgFromClient);
            if(msgFromClient.equalsIgnoreCase("exit")){
                break;
            }

            System.out.print("Server: ");
            msgFromServer = sc.nextLine();
            pr.println(msgFromServer);
            pr.flush();

            if(msgFromServer.equalsIgnoreCase("exit")){
                break;
            }
       }
       
       ss.close();
       sc.close();
    }
}
