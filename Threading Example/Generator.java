import java.util.*;


public class Generator
{
	public static void main (String[] args)
	{
		Program1 prog1 = new Program1();
		Program2 prog2 = new Program2();
		
		Thread t1 = new Thread(prog1);
		Thread t2 = new Thread(prog2);
		
		t1.start();
		t2.start();
	
	
	}
}
