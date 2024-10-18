package itoro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptiontypes {

	public static void main(String[] args) {
		
		MethodA ();
	
	}
	
	
	public static void MethodA () {
		
		//unChecked exceptions are not checked by the while writing the program 
		File newphoto = new File("https://unsplash.com/photos/a-wave-in-the-ocean-gOHFF6v53qY");
		
		try {
			FileReader file1 = new FileReader(newphoto);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			System.out.println(e.getMessage()); // This prints only the message 
		}

	}

}
