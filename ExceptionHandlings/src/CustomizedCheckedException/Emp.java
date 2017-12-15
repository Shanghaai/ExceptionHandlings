package CustomizedCheckedException;

public class Emp extends InvalidAgeExceptionMain
{
	public static void main(String[] args) {

			try {
				InvalidAgeExceptionMain.validate(32); // you need to handle else it will through unchecked exception
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}	
 }