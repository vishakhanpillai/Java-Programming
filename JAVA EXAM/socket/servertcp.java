package socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class servertcp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ServerSocket server = new ServerSocket(1234);
        Socket socket = server.accept();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter print = new PrintWriter(socket.getOutputStream(), true);

        String clientMsg, serverMsg;

        while (true) {
            
            clientMsg = buffer.readLine();
            System.out.println("Client: " + clientMsg);
            if(clientMsg.equalsIgnoreCase("Exit")){
                break;
            }

            System.out.print("Server: ");
            serverMsg = sc.nextLine();
            print.println(serverMsg);
            if(serverMsg.equalsIgnoreCase("exit")){
                break;
            }
            
        }
        socket.close();
        sc.close();

    }
}