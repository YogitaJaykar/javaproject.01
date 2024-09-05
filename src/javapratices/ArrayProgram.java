package javapratices;

public class ArrayProgram {

	public static void main(String[] args) {
		// Single dimensional array
		System.out.println("//Single dimensional array");
		int a[] = {101,102,103,104,105};
		
		System.out.println(a[0] +"\t");
		System.out.println(a[1] +"\t");
		System.out.println(a[2] +"\t");
		System.out.println(a[3] +"\t");
		System.out.println(a[4] +"\t");
		
		System.out.println();
		System.out.println("######################################################");
		
		System.out.println("length of single dimensioanl array is =" +a.length);
		
		System.out.println("#####################################################");
		 
		System.out.println("print single dimensional array value using for loop");
		
		int i;
		for(i=0; i<=a.length-1; i++) {
			System.out.println(a[i]+"\t");
			
		}
		System.out.println();
		System.out.println("####################################################");
		
		//multidimensional array
		
		System.out.println("multidimensional array");
		
		int x[][]= {{10,20,30,40}, {50,60,70,80}, {90,100,110,120}};
		
		System.out.println(x[1][0]+ "\t");
		System.out.println(x[2][1]+ "\t");
		System.out.println(x[1][2]+ "\t");
		System.out.println(x[0][2]+ "\t");
		
		System.out.println("###################################################");
		
		System.out.println("length of multidimensional array of row is="+x.length);
		System.out.println("length of multidimensional array of coulmn is="+x[0].length);
		
		System.out.println("###################################################");
		
		System.out.println("print multi dimensional array value using for loop");
		
		for(int j=0; j<x.length; j++) {
			for(int k=0; k< x[j].length; k++) {
				System.out.println(x[j][k]+"\t");
			}
			System.out.println();
		}
		
		
		}

}
