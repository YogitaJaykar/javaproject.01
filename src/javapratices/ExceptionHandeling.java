package javapratices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class ExceptHandling {
	void show() throws FileNotFoundException {
		File f = new File("c://user//Lenovo//Document//JavaPractices//xyz.txt");
		FileReader fr = new FileReader(f);
	}
}

public class ExceptionHandeling {

	public static void main(String[] args) {
		//Checked Exception for FileNotFound By try and catch
		ExceptHandling e = new ExceptHandling();
		try {
			e.show();
		} catch (FileNotFoundException ec) {
			System.out.println(ec.getMessage());
		}
		
		System.out.println("Checked exception by using try and catch ");

	} 

}
