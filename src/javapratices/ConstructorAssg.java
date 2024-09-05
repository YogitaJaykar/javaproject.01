package javapratices;

public class ConstructorAssg {

	public static void main(String[] args) {
		worker W = new worker();
		System.out.println(W.name+" "+W.workerID+" "+W.salary);

	}
}
	class worker{
		//instance member variables
		String name;
		int workerID;
		int salary;
		
		//instance members functions
		public void work() {
			System.out.println("worker is working");
		}
		
		public void eat() {
			System.out.println("worker is eating");
		}
		
		public void rest() {
			System.out.println("worker is taking rest");
		
		}

}
