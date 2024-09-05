package javapratices;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		try {
			int c=50/0;
			
		} catch(Exception e) {
			System.out.println("Inside try block");
			
			
			} finally { 
				System.out.println("Finally block executed");
			}
		
		
		
		

	}

}
