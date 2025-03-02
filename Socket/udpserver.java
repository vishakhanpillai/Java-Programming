package Socket;
import java.io.*;
import java.net.*;
public class udpserver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(1234);
        byte[] b = new byte[256];

        DatagramPacket dp = new DatagramPacket(b, b.length);
        socket.receive(dp);

        String msg = new String(dp.getData());

        System.out.println(msg);

        socket.close();
    }
}
