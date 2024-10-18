package itoro;

public class demo {
	public static void main (String[] args) {
		
		// Exception error example program, this error is observed when the program is running.
		
		System.out.println("Before Exception error");
		System.out.println("Before Exception error");
		try {
			int a = 10/0; // ArithematicExceptions can be handled using the tryCatch block for mathematical errors
		} catch (ArithmeticException e) {
			
			System.out.println("Arithematic Exception Error occured here........");
		};
		
		System.out.println("After Exception error");
		System.out.println("After Exception error");
		
	}

}
