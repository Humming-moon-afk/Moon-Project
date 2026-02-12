import java.io;
import java.net.*;

public class PiWebServer {
    public static void main(String [] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server lädt an Port 8080.....");

        while(true) {
            Socket gast = server.accept();
            System.out.println("Ein neuer Gast ist da");

            InputStream leitung = gast.getInputStream();
            
            int ersteZahl = leitung.read();
            System.out.println("Die erste Zahl von Gast ist: ..... " + ersteZahl);
        }
    }
}