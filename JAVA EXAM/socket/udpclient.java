package socket;
import java.io.*;
import java.net.*;
import java.util.*;
public class udpclient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Client: ");
            String msgFromClient = input.readLine();
            byte[] toServer = msgFromClient.getBytes();
            DatagramPacket dp = new DatagramPacket(toServer, toServer.length,ip, 1234);
            socket.send(dp);

            if(msgFromClient.equalsIgnoreCase("Exit")){
                break;
            }

            byte[] buffer = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(buffer, buffer.length, dp.getAddress(), dp.getPort());
            socket.receive(dp2);
            String fromServer = new String(dp2.getData());
            System.out.println("Server: " + fromServer);

            if(msgFromClient.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}
