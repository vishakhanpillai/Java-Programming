import java.net.*;
public class url {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.rajagiri.edu");

        System.out.println(url.getHost() + url.getPort() + url.getPath() + url.getProtocol());

    }
}
