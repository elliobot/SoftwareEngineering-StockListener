import java.net.*;
import java.io.*;
import java.io.PrintWriter;

public class stockConnector {
	public static void main(String[] args){
		/*
		Information for future developers
		
		out = hardcoded system name for the output to the command line, can be accessed with a printwriter called "out"
		
		*/
		int port = 5000;
		try {
			System.out.println("Connecting to " + "127.0.0.1" + " on port " + port);
			
			Socket clientSocket = new Socket("127.0.0.1", port);
			
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				
			  
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));			
			new stockListener(in, out);				
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));		
		
			
			String userInput;
			while ((userInput = stdIn.readLine()) != null) { //while there is data on the command line
				out.println(userInput); //the user input
			}
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}