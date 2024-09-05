

package javapratices;

public class ArrayExample {

	public static void main(String[] args) {
		// Count of Element 30 in 2D Array
		int arr[][] = { {10, 20, 30} , {30, 40, 50} , {60, 70, 30}};
		int cnt = 0;
		for (int i=0; i<=arr.length-1; i++) {
			for (int j=0; j<=arr.length-1; j++) {
				if(arr[i][j] == 30) {
					cnt++;
				}
			}
		}
		System.out.println("Count of Element 30 =" + cnt);
		System.out.println("---------------------------------------------");
		 
		//Sum of Diagonal Element
		int sum =0;
		for (int i=0; i<=arr.length-1; i++) {
			for (int j=0; j<=arr.length-1; j++) {
				if (i==j) {
					sum += arr[i][j];
					
					}
				
			}
		}
		System.out.println("Sum of diagonal =" + sum);
		
		System.out.println("--------------------------------------------");
		
		//Find occurance of character 'a' in String "Radha"
		
		String str = "Radha";
		char ch = 'a';
	    int occ = 0;
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
               occ++;
			}
			
			}
		System.out.println("Occurance of char 'a' in string = " + occ);
		System.out.println("---------------------------------------------");
		
		
		//Print reverse string of given "Radha"
		String s = "Radha";
		for (int i=0; i< s.length(); i++) {
			if (s.charAt(i) == 'a') {
				System.out.println(Character.toUpperCase(s.charAt(i)));
			} else {
				System.out.println(s.charAt(i));
				
			}
		}
		System.out.println("-------------------------------------------");
		
		//half string of given string
		String s1 = "Radha";
		for (int i=0; i<s1.length()/2; i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println();
		
		
		
		

				
			
				
	
		
	
			
			
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}
	

