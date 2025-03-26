package Socket;
import java.net.*;
public class url {
    public static void main(String[] args) throws Exception{
        
        @SuppressWarnings("deprecation")
        URL url = new URL("https://www.rajagiri.edu");

        URLConnection urlcon = url.openConnection();
        System.out.println(urlcon.getDate());
    }
    
}