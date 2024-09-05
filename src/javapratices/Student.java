package javapratices;

public class Student {
	
	int stuID;
	String stuName;
	float marks;
	int age;
	
public static void main(String[] args) {
		//parameterized constructor
	
	Student Ram = new Student(01,"Ram", 90, 16);
	 Ram.studentinfo();
	 Ram.studentmarks();
	 
	 Student Shyam = new Student(02,"Shyam", 75, 15);
	 Shyam.studentinfo();
	 Shyam.studentmarks();;
	 
	 Student Seeta = new Student(03,"Seeta", 65, 20);
	 Seeta.studentinfo();
	 Seeta.studentmarks();
	}
 public Student(int stuID1, String stuName1, float marks1, int age1) {
	 stuID = stuID1;
	 stuName = stuName1;
	 marks = marks1;
	 age = age1;
	 
 }
 public void studentinfo() {
	 System.out.println(stuID+"" + stuName+"" + age);
 }
 public void studentmarks() {
 System.out.println(marks);
}
}
