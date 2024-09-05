package javapratices;
import java.util.Scanner ;

public class NumberSystemProgram {

	public static void main(String[] args) {

		// Squares

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 20; j++) {
				System.out.print(i * j + "\t");
			}

			System.out.println();

		}
		System.out.println("***************************************************");
		
		//prime number or not prime number
		
		int number = 567;
		boolean prime = true;

		for (int i = 2; i < number / 2; i++) {

			if (number % i == 0) {
				prime = false;
				break;
			}

		}

		if (prime) {
			System.out.println("Number is prime = " + number);
		} else {
			System.out.println("Number is not prime = " + number);
		}
		System.out.println("***************************************************");
		
		
		//Palindrome Number
		
		int n = 178;
		int reverse = 0;
		int temp = n;
		while(temp>0) {
			int remainder = temp%10;
			reverse = (reverse*10)+remainder;
			temp = temp/10;
			
		}
		{if (n== reverse)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");}
		
		System.out.println("**********************************************************");
	
		int num, rem, arm=0, org_num;
		
		System.out.println("Enter a number");
		Object sys;
		Scanner sc = new Scanner(sys.in);
		num = sc.nextInt();
		org_num = num;
		
		while(num>0) {
			rem = num%10;
			arm = arm + rem*rem*rem;
			num = num/10;
			
			} 
		if(org_num == arm)
			System.out.println("Armstrong Number");
	
	
	{
		System.out.println("Not a Armstrong Number");
	}
		
		
		
		
		
		
		
	}
	
}



