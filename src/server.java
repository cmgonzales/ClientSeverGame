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
			
			while(true){
			
			String answer[] = {"museum", "hospital", "no"}; 
			
			String ans = in.readLine();
			
		    for(int i = 0; i < answer.length; i++){
		    	
		    	if(ans.equals(answer[i])){
			
			       out.println(answer[i]);
	
			
			}
		    }
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
