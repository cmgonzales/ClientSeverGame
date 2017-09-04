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
        
        String response = "";
        
        String arr[] = {"museum", "hospital", "no"};
        
        System.out.println("Name a place you visit where you arent allowed to touch anything.");
        
        input = userInput.readLine();
        
        out.println(input);
        
        response = in.readLine();
        
        if (response.equals(arr[0])){
        
        	System.out.println("Survey says " + 10);
        
        }else{
           
        	System.out.println("wrong");
        
	}
        System.out.println("Name a Public Place Where You're Likely to Catch a Cold or Flu Bug.");
        
        input = userInput.readLine();
        
        out.println(input);
        
        response = in.readLine();
        
        if (response.equals(arr[1])){
        
        	System.out.println("Survey says  " + 10);
        
        }else{
           
        	System.out.println("wrong");
}
        System.out.println("Name a word that most people yell at their dogs.");
        
        input = userInput.readLine();
        
        out.println(input);
        
        response = in.readLine();
        
        if (response.equals(arr[2])){
        
        	System.out.println("Survey says  " + 10);
        
        }else{
           
        	System.out.println("wrong");
	}
}
}

	
	

