import java.util.*;


public class Program1 implements Runnable
{
	Random rnd = new Random();
	
	public void run()
	{
		for(int i=0; i < 20; i++)
		{
			System.out.println("I am Program 1: " + rnd.nextInt(100));
		}
	}
}



