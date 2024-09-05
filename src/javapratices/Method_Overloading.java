package javapratices;

public class Method_Overloading {

	public static void main(String[] args) {
		Method_Overloading st = new Method_Overloading();
		
		st.Student();
		System.out.println();
		st.Student(01);
		System.out.println();
		boolean ss = st.Student(11, "Ram");
		System.out.println(ss);
		
	}

 public void Student () {
	 System.out.println("Without parameter");
	 
 }
 public void Student (int seatno) {
	 System.out.println("Method with one parameter");
	 System.out.println("Seat no is : " + seatno );
 }
	public boolean Student (int seatno, String StuName)	 {
		System.out.println("Method with two parameter");
		System.out.println("Seat no is : " + seatno );
		System.out.println("Student name is : " + StuName );
		return true;
	}
		
	}


