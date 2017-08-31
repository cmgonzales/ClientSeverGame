import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	
	
	
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(5800);
			System.out.println("Waiting on Clients");
			Socket soc = ss.accept();
			System.out.println("Connection Established");
			
			
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);	
			
			String ans = in.readLine();
			
			if(ans.equals("Museum")){
				
				out.println("Good Job");
			}else{
			
			for(int i = 0; i < 3; i++){
				
				out.println("try again");
			}
			}
	
			
			
					
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
