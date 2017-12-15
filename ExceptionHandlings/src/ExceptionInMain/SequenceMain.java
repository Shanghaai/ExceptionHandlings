package ExceptionInMain;

public class SequenceMain {
	
public static void main(String[] args) {
	
	Sequence s1 = new Sequence();
	try {
		s1.printNumber(100, 200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}

}
