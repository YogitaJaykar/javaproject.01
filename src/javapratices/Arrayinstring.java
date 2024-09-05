
package javapratices;

public class Arrayinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[]= {"ab","bc","cd","de","ef"};
		
		System.out.println(a[0] +"\t");
		System.out.println(a[1] +"\t");
		System.out.println(a[2] +"\t");
		System.out.println(a[3] +"\t");
		System.out.println(a[4] +"\t");
		
		System.out.println();
		System.out.println("###############################################");
		
		System.out.println("length of single dimensional array is=" +a.length);
		
		System.out.println("###############################################");
		System.out.println("print single dimensional array value using for loop");
		int i;
		for(i=0; i<=a.length-1; i++) {
			System.out.println(a[i]+ "\t");
			
			System.out.println("############################################");
		}
		
		
	}

}
