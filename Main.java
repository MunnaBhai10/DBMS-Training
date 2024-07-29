import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class Main{
    public static void main(String[] args)throws Exception {
        ServerSocket server = new ServerSocket(8000);
        System.out.println("started Listening");
        while (true) {
            Socket client = server.accept();
            Date now = new Date();
            String date = now.toString();
            String msg = "HTTP/1.1 200 OK\r\n\r\nTime = " + date;
            client.getOutputStream().write(msg.getBytes());
            
            client.close();
			System.out.println("Client closed!");
        }
        

    }
}