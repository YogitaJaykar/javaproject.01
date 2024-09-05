package javapratices;

public class Method_Overriding {

	public static void main(String[] args) {
		
		Comp_Exam Ex = new Comp_Exam() ;
		Ex.formfilling();
		Ex.recruitment(200);
		Ex.cutoff(75.5f);
		Ex.NoofStu(100000);

	}

}
class NEET {
	String Biology;
	String Physics;
	String Chemistry;
	
	public void recruitment(int a) {
		System.out.println("Recruitment in NEET : " + a);
	}
	public void cutoff (float b) {
		System.out.println("Cutoff for NEET :" + b);
	}
	public void NoofStu(int c) {
		System.out.println("Number of student :" + c);
	}
	
}
class  Comp_Exam extends NEET {
	public void formfilling() {
		System.out.println("Good Preparation for Competative Exam is important....");
	}
	
}
