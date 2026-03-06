package New;

public class multipleCatchEx {
	
	public static void main(String[] args)
	{
	try {
		
		int a = 10 / 0;
		
		int arr[]= {1, 2, 3};
		
		System.out.println(arr[4]);
		
		
		
		}
		 catch(ArithmeticException e)
		{
		System.out.println(" Arithmetic Exception occurred");
		}
	 
		catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index out of exception");
	}
	catch (Exception e)
	{
			System.out.println("Generic Exception");
	}
	}

}
