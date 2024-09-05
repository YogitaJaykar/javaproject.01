package javapratices;

public class ArrayProgram1 {

	public static void main(String[] args) {
		int a[] = {10, 36, 47, 6, 460,26, 730};
		//Ascending Order of numbers
		for(int i =0; i< a.length; i++) {
			for (int j = i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("print Numbers in ascending order:"); 
		for (int k=0; k< a.length; k++) {
			System.out.println(a[k] + "\t");
		}
		System.out.println(); 
		System.out.println("---------------------------------------------------------");
		//Descending Order of Numbers
		for (int i = 0; i < a.length; i++) {
		for (int j=i+1; j < a.length; j++) {
			if (a[i] < a[j]) {
				int temp;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
		
	}
		System.out.println("print Numbers in descending order:");
		for (int k =0; k < a.length; k++) {
			System.out.println(a[k] + "\t");
		}
			
			System.out.println();
			System.out.println("-------------------------------------------------");
			//Array length
			System.out.println("Length of array=" + a.length);
			System.out.println("-------------------------------------------------");
			
			//Largest Number & Smallest Number
			System.out.println("Largest number of array =" + a[0]);
			System.out.println("Smallest number of array =" + a[a.length-1]);
			
			System.out.println("------------------------------------------------");
			
			//Third Largest & Smallest Number
			System.out.println("Third largest number =" +a[2]);
			System.out.println("Third smallest number =" + a[a.length-3]);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
