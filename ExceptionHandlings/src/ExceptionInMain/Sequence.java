package ExceptionInMain;

public class Sequence {
	
	public void printNumber(int start, int end) throws InterruptedException
	
	{
		System.out.println("printing number from "+start+" to "+end);
		for (int i =start;i<=end;i++)
		{
			System.out.println(i);
			Thread.sleep(100);
		}
	}
}
