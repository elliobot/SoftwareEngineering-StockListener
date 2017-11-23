import java.util.*;


public class stockThreadApp
{
	public static void main (String[] args)
	{
		stockConnectorThread prog1 = new stockConnectorThread();
		ThreadSTSServer prog2 = new ThreadSTSServer();
		
		Thread t1 = new Thread(prog1);
		Thread t2 = new Thread(prog2);
		
		t1.start();
		t2.start();
	
	
	}
}
