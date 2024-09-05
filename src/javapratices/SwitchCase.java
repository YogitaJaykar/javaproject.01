package javapratices;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int marks = 90;
  switch (marks) {
  case 35:
	  System.out.println("student is fail");
	  break;
  case 55:
	  System.out.println("student is pass");
	  break;
  case 65:
	  System.out.println("student is first class");
	  break;
  case 90:
	  System.out.println("student is distinction");
	  break;
	  
	  default:
		  System.out.println("student is absent");
		  break;
	  
  }
  
	}

}
