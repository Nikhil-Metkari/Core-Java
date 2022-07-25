package p5;


// Write a Java Program to demonstrate an explicit wait condition check.


class Demo extends Thread{
	
	int total = 0;
	public void run()
	{
	   synchronized(this)
	   {
		for(int i=0;i<10;i++)
		{
			total +=10;
		}
		notify();
	   }
	}
}
public class explicit_wait_condition_check_43 
{
	public static void main (String args[]) throws InterruptedException
	{
		
	Demo e = new Demo();
	System.out.println("Welcome in threading...................  ");
	e.start();
	synchronized(e)
	{
	e.wait();
	System.out.println("Given value is : "+e.total);
	}
	
	}
	
}
