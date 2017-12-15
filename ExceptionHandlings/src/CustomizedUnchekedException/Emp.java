package CustomizedUnchekedException;

public class Emp 

{
 public void checkAgee(int age) throws SAHILCustomException
 {
	 if(age>18)
		 System.out.println("you are a voter");
	 else 
		 System.out.println("you are a teenager");
 
}	
}