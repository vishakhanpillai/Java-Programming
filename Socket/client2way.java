package Socket;
import java.io.*;
import java.net.*;
import java.util.*;
public class client2way {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Socket socket = new Socket("localhost", 1234);

        InputStreamReader input= new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(input);

        PrintWriter pr = new PrintWriter(socket.getOutputStream());

        String msgFromClient, msgFromServer;

        while(true){

            System.out.print("Client: ");
            msgFromClient = sc.nextLine();
            pr.println(msgFromClient);
            pr.flush();

            if(msgFromClient.equalsIgnoreCase("exit")){
                break;
            }

            msgFromServer = br.readLine();
            System.out.println("Server: " + msgFromServer);

            if(msgFromServer.equalsIgnoreCase("exit")){
                break;
            }
        }

        socket.close();
        sc.close();
    
    }
}
