import java.util.*;

public class Program2 implements Runnable
{
	Random rnd = new Random();
	
	public void run()
	{
		for(int i=0; i < 30; i++)
		{
			System.out.println("I am Program 2: " + rnd.nextInt(40));
		}
	}
}