import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	
	
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(5800);
			System.out.println("Waiting on Clients");
			Socket s = ss.accept();
			System.out.println("Connection Established");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
