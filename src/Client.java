import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {

	public static void main(String[] args) throws Exception {
		Socket soc = new Socket("localhost", 5800);
		
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));     

        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

        PrintWriter out = new PrintWriter(soc.getOutputStream(), true); 
      
 
        String input = "";
        
        System.out.println("Name a place you visit where you arent allowed to touch anything?");
        
        input = userInput.readLine();
        out.println(input);
        String response = in.readLine();
        if (response.equals("museum")){
        	System.out.println(10);
        }else{
            System.out.print("wrong");
        
	}
}
}

	
	

