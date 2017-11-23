import java.net.*;
import java.io.*;
import java.io.PrintWriter;

public class stockListener extends Thread {
	BufferedReader in;
	PrintWriter out;
	
	public stockListener(BufferedReader Ourin, PrintWriter Ourout){
		in = Ourin;
		out = Ourout;
		this.start();
	}
	
	public void run(){
		try {
			
			while (true) { //while there is data on the command line
				System.out.println("echo: " + in.readLine()); //data returned from the stock trading server
			}
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}