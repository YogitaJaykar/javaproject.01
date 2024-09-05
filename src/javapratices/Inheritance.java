package javapratices;

public class Inheritance {

	public static void main(String[] args) {
		commercialBank p = new commercialBank();
		p.transaction();
		System.out.println(p.bankHolderName);
		System.out.println(p.branchName);
		System.out.println(p.bankholderName);
		System.out.println(p.branchName);
		System.out.println(p.CASArate);
		System.out.println(p.cash);
		System.out.println(p.cashierName);
	    p.transaction();
		p.loan();
		
		foreignBank f = new foreignBank();
		System.out.println(f.accountType);
		System.out.println(f.bankHolderName);
		System.out.println(f.branchName);
		System.out.println(f.cash);
		System.out.println(f.interest);
		System.out.println(f.paymentType);
		
		
	}

}
class foreignBank {
	String bankHolderName = "Om";
	String branchName = "Jalgaon";
	int cash = 20000;
	float interest = 7.3f;
	String paymentType = "Cash";
	String accountType = "Saving";
	
	
	
	//behavior
	public void transaction() {
		System.out.println("Bank transaction is in processing");
		}
	public void loan() {
		System.out.println("Loan is taken by company");
		
		}
	
	}
class privateBank extends foreignBank {
		
		float interest = 8.9f;
		float CASArate = 37.3f;
		String bankholderName = "Ram";
		String branchName = "Mumbai";
		
		
	}
class commercialBank extends privateBank {
	float interest = 9.9f;
	float CASArate = 47.3f;
	String bankholderName = "Shyam";
	String branchName = "Nashik";
	String cashierName = "Mr.Patil";
	int cash = 10000;
	
	
}
	
	

