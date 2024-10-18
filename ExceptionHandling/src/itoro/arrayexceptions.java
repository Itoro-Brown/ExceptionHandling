package itoro;

public class arrayexceptions {

	public static void main(String[] args) {
	
		
		
		try {
			int[] a = new int[3];
			
			a[0] = 4;
			a[1] = 8;
			a[2] = 6;
			a[3] = 5; // ArrayIndexOutOfBoundsException happens here since the array only takes 3 items 
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("A ArrayIndexOutOfBoundsException error just occured here...");
		}
		
		System.out.println ("After error....");
	}

}
