package Socket;
import java.io.*;
import java.net.*;
public class udp2wayclient {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            int port = 2222;

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Client: ");
                String msg = input.readLine();
                byte[] toServer = msg.getBytes();
                DatagramPacket dp = new DatagramPacket(toServer, toServer.length, ip, port);
                socket.send(dp);

                if(msg.equalsIgnoreCase("exit")){
                    break;
                }

                byte[] fromServer = new byte[1024];
                DatagramPacket dPacket = new DatagramPacket(fromServer, fromServer.length);
                String serverMsg = new String(dPacket.getData());

                
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
