package New;


	class counter
	{
		int count=0;
		  void increment()
	{
		count++;
	}
	}
	public class SyncEx extends Thread  {
	public static void main(String[] args)
	{
	counter c=new counter();
	Thread t1= new Thread(() ->
	{
	for(int i=0; i <1000; i++) c.increment();
	});
	 
	Thread t2= new Thread(() ->
	{
	for(int i=0; i <1000; i++) c.increment();
	});		
	t1.start();
	t2.start();
	 
	 try {
         t1.join();
         t2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }
	System.out.println(c.count);
	}
	 
	}


