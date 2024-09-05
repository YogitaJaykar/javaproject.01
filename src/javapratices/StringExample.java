package javapratices;

public class StringExample {
	
public static void main(String[] args) {
		// Count of element in 2D Array

		int arr[][] = {{10,20,30},{40,30,60},{30,80,90}};
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++)
			if(arr[i][j] == 30) {
				
				 count++;
			}
			System.out.println("Count of Element 30 is: " + count);
		
		
			
	
		}
			
		
	}

	}
