package javapratices;

public class ExceptionHandling1 {

	public static void main(String[] args) {
	//Unchecked exception for Arithmetic xception
		int a=10;
		int b;
		try {
			b=a/0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Unchecked exception for Arithmatic by using try and catch");
	}

}
