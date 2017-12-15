package tryCatchBlocks;

public class Abc 
{
  public static void main(String[] args) 
  {
	System.out.println("Program started");
	int i;
	int[] arr1 = new int[5];
	try
	{
		System.out.println("Running try block");
		arr1[22] = 23;
		return;
	}
	
	
	catch(Exception e)
	{ 
		System.out.println("in catch ");
		System.out.println("getMessage returns : "+e.getMessage());
		
		e.printStackTrace();
	}
	
	finally
	{
		System.out.println("in finally");
	}
	
 }
}