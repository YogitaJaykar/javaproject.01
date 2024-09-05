package javapratices;

public class NestedIf {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		   
		        int number = 30;

		        if (number > 0) {
		            System.out.println("The number is positive.");

		            if (number % 2 == 0) {
		                System.out.println("The number is even.");

		                if (number > 20) {
		                    System.out.println("The number is greater than 20.");
		                } else {
		                    System.out.println("The number is 20 or less.");
		                }
		            } else {
		                System.out.println("The number is odd.");
		            }
		        } else {
		            System.out.println("The number is non-positive.");
		        }
		    
		

	}

}


