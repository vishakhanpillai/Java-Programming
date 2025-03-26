package socket;
import java.io.*;
import java.net.*;
import java.util.*;
public class udpserver {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket(1234);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            
            byte[] buffer = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            socket.receive(dp);
            String msg = new String(dp.getData());
            System.out.println("Client: " + msg);

            if(msg.equalsIgnoreCase("exit")){
                break;
            }

            String toClient = input.readLine();
            byte[] toClientBuffer = toClient.getBytes();
            DatagramPacket dp2  = new DatagramPacket(toClientBuffer, toClientBuffer.length, dp.getAddress(), dp.getPort());
            socket.send(dp2);

            if(toClient.equalsIgnoreCase("exit")){
                break;
            }

        }

    }
}
