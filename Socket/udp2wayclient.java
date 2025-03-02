package Socket;
import java.io.*;
import java.net.*;
public class udp2wayclient {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Client: ");
                String str = input.readLine();
                byte[] msg = str.getBytes();
                DatagramPacket dp = new DatagramPacket(msg, msg.length, ip, 1234);
                socket.send(dp);

                if(str.equalsIgnoreCase("exit")){
                    break;
                }

                byte[] buffer = new byte[256];
                DatagramPacket toServer = new DatagramPacket(buffer, buffer.length);
                socket.receive(toServer);

                String serverMsg = new String(toServer.getData());

                System.out.println("Server: " + serverMsg);

                if(serverMsg.equalsIgnoreCase("exit")){
                    break;
                }
            }
            socket.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
