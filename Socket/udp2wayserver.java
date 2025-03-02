package Socket;
import java.io.*;
import java.net.*;
public class udp2wayserver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(1234);
        byte[] buffer = new byte[1024];

        System.out.println("Server is running...");

        while (true) {
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            socket.receive(dp);

            String msg = new String(dp.getData());
            System.out.println("Client: " + msg);

            if(msg.equalsIgnoreCase("exit")){
                break;
            }

            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(input);

            String serverMsg = bf.readLine();

            byte[] response = serverMsg.getBytes();
            DatagramPacket newPacket = new DatagramPacket(response, response.length, dp.getAddress(), dp.getPort());
            socket.send(newPacket);

            if(serverMsg.equalsIgnoreCase("exit")){
                break;
            }

        }


    }
}
