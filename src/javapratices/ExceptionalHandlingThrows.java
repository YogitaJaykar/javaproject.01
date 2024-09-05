package javapratices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionalHandlingThrows {

	public static void main(String[] args) {
		
		
		ExceptionThrows ec = new ExceptionThrows();
		try {
			ec.read();
		} catch (FileNotFoundException e) {
			System.out.println("exception caught=" + "\n" + e.getMessage() + "FileNotFoundException");
		}

	}

	
	}
class ExceptionThrows {
	void Divide() throws ArithmeticException{
		
	}
	void read() throws FileNotFoundException{
		File f = new File ("C:\\users\\Lenovo\\Document");
		FileReader fr = new FileReader(f);
	}
}

