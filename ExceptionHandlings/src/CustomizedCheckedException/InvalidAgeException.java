package CustomizedCheckedException;

//creating the checked exception ,will force programmer to handle it
class InvalidAgeException extends Exception
{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
 } 
