package Socket;
import java.io.*;
import java.net.*;
public class udpclient {
    public static void main(String[] args) throws IOException {
        
        DatagramSocket socket = new DatagramSocket();

        String str = "Hello";

        byte[] b = str.getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b, b.length, ip, 1234);

        socket.send(dp);

        socket.close();
    }
}
