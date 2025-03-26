package socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class clientcp {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        Scanner sc = new Scanner(System.in);

        BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter print = new PrintWriter(socket.getOutputStream(), true);

        String clientMsg, serverMsg;

        while (true) {
            
            System.out.print("Client: ");
            clientMsg = sc.nextLine();
            print.println(clientMsg);
            if(clientMsg.equalsIgnoreCase("exit")){
                break;
            }

            serverMsg = buffer.readLine();
            System.out.println("Server: " + serverMsg);
            if(serverMsg.equalsIgnoreCase("Exit")){
                break;
            }

        }
        sc.close();
        socket.close();
    }        
}
