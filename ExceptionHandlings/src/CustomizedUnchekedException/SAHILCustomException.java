package CustomizedUnchekedException;

class SAHILCustomException extends RuntimeException

{
	public SAHILCustomException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

class TestCustomException
{
	public void checkAge(int age) throws SAHILCustomException
	{
		if (age>18)
			System.out.println("welcome to the world of sex and the city");
		else
			System.out.println("toffee khao jakey");
	}
	
	public static void main(String[] args) {
		TestCustomException t = new TestCustomException();
		t.checkAge(30);
	}
}
