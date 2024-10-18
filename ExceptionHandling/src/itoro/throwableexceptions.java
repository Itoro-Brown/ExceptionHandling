package itoro;

public class throwableexceptions {

	public static void main(String[] args) {
		
		System.out.println("Before error");
		
		try {
			
			int b = 5/0;
			
		} catch (Throwable t) {
			
			System.out.println(t);
		}
		
		System.out.println("After error..");
	}

}
