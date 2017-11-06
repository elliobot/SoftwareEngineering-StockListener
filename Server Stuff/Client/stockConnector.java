import java.net.*;
import java.io.*;
import java.io.PrintWriter;

public class stockConnector {
	public static void main(String[] args){
		
		int port = 5000;
		try {
			System.out.println("Connecting to " + "127.0.0.1" + " on port " + port);
			
			Socket clientSocket = new Socket("127.0.0.1", port);
			
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
						
						
			  
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));			
						
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		
			
			String userInput;
			while ((userInput = stdIn.readLine()) != null) {
				out.println(userInput);
				System.out.println("echo: " + in.readLine());
			}
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}