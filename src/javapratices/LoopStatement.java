package javapratices;

public class LoopStatement {

	public static void main(String[] args) {
		
		// for loop
		
		for (int i =100; i >=1; i--) {
			System.out.println(i);
		}
		System.out.println("********************************************");
		
		// While loop
		
		int number = 1;
		while (number <=100) {
			System.out.println(number);
			number++;
		
			
		}
		
		System.out.println("*********************************************");
		
		// Do while loop
		
		int digit = 100;
		while (digit >=1) {
			System.out.println(digit);
			digit--;
		}
		
		System.out.println("*******************************************");
		
		// For loop print 1 to 20 tables
		
		for (int i =1; i <=20; i++) {
			System.out.println("Multiplication table for " + i);
			
			for (int j=1; j <=10; j++) {
				System.out.println(i +"x" + j + "=" + (i*j));
				
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
 
