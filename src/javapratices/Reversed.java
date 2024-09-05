package javapratices;
import java.util.*;

public class Reversed {

	public static void main(String[] args) {

		// Reverse a number 
		int n = 12345678;
		int reverse=0;
		int digit = 0;

	
	while (n>0) {
		digit=n%10;
		reverse = reverse*10+digit;
		n/=10;
		
	
		
		
	}
	System.out.println("digit : "+ reverse);
		
	}

}



