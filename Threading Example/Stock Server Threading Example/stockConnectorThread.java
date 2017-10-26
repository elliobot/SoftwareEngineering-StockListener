import java.net.*;
import java.io.*;
import java.io.PrintWriter;

public class stockConnectorThread implements Runnable {
	public static void main(String[] args){
	
	}
	public void run(){
		
		int port = 5000;
		String IP = "10.5.34.165";
		try {
			System.out.println("Connecting to " + IP + " on port " + port);
			
			Socket clientSocket = new Socket(IP, port);
			
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