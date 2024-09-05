package javapratices;

public class ArithmaticException extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=100;
		int q=20;
		int r;
		
		r= p/q;
		try {
			q=0;
			throw new ArithmaticException();
			
		}catch (Exception e) {
			System.out.println("Arithmatic exception arises");
			System.out.println(e.getMessage());
		}
	}

}
