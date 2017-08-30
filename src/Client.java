import java.net.Socket;


public class Client {

	public static void main(String[] args) throws Exception {
		Socket s = new Socket("localhost", 5800);
	}
	
}

