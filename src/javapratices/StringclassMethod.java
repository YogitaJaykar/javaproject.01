package javapratices;

public class StringclassMethod {

	public static void main(String[] args) {
		String s = "Hello everyone good morning";
		
		//Returns the char value at specified index
		
		char c = s.charAt(15);
		System.out.println(c);
		System.out.println(s.charAt(18));
		
		//Concatenates the specified string to the end of string
		String ss = s.concat(" How are you?");
		System.out.println(ss);
		
		//Return trei if and only if this string contains specified sequences pf char values
		System.out.println(s.contains("everyone"));
		System.out.println(s.contains("evening"));
		
		//Test if this string ends with specified suffix
		String sss = s.concat(" Thank you");
		System.out.println(s.endsWith("ing"));
		System.out.println(s.endsWith(" goodmorning"));
		
		System.out.println("-----------------------------------------------------------");
		System.out.println(s);
		System.out.println(s.concat("Thanks"));
		System.out.println(s);
		
		System.out.println(ss);
		System.out.println(s.concat(" Thank you"));
		System.out.println(ss);
		
		System.out.println(sss);
		System.out.println(s.concat(" Welcome"));
		System.out.println(sss);
		
		

	}

}
