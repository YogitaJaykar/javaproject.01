package javapratices;

public class StringClassMethod1 {

	public static void main(String[] args) {
		String s = "*What is your name?*";
		//Return a string resulting from replacing all occurrences of old char in this 
		//string with new char
		System.out.println(s.replace('y', 'Y'));
		System.out.println(s.replace('n', 'N'));
		
	    System.out.println(s.replace("*", ""));
	    
	    System.out.println(s.replace("at", "##"));
	    System.out.println(s.replace("na", "&&&!"));
	    
	    //Test if this string starts with specified prefix
	    System.out.println(s.startsWith("what"));
	    
	    //Test if this string starts with specified sufix
	    System.out.println(s.endsWith("me"));
	    
	   //Replace each substring of this string that matches the given regular 
	    //expression with the given replacement
	    String ss = "RU*hrfTYU$%!56749kl$!%vTY?";
	    
	    //Remove only special characters
	    System.out.println(ss.replaceAll("[&*!%]", ""));
	    System.out.println(ss.replaceAll("[RU$TY?]", ""));
	    
	    //Retain only numbers(remove all things and keep numbers only)
	    System.out.println(ss.replaceAll("[^0-9]", ""));
	    System.out.println(ss.replaceAll("[^0-5]", ""));
	    System.out.println(ss.replaceAll("[^5-9]", ""));
	    
	    //Retain only small and capital letters
	    System.out.println(ss.replaceAll("[^a-zA-Z]" , ""));
	    
	    String s1 = "Have a nice day";
	    //Retain start with specified prefix
	    System.out.println(s1.startsWith("Have"));
	    System.out.println(s1.startsWith("ni"));
	    
	    //Retain ends with specified suffix
	    System.out.println(s1.endsWith("ay"));
	    System.out.println(s1.endsWith("na"));
	    
	    //Return a string that is a substring of this string
	    System.out.println(s1.substring(10));
	    System.out.println(s1.substring(5));
	    
	    System.out.println(s1.substring(2, 10));
	    System.out.println(s1.substring(5, 12));
	    
	    //Return a string whose value is this string, with any leading and trailing 
	    //whitespace remove
	    
	    String s2 = " hello ";
	    System.out.println(s2);
	    System.out.println(s2.trim());
	    
	    //Replaces the first substring of this string that matches the given regular 
	    //expression with the given replacement
	    System.out.println(s2.replaceFirst("[he]", ""));
	    
	    //Returns the string representation of the char argument
	    String s3 = String.valueOf(" Hello ");
	    System.out.println(s3.length());
	    
	     //Retain all the string in Uppper case
	    System.out.println(s2.toUpperCase());
	    
	    //Retain all the string in lower case
	    System.out.println(s2.toLowerCase());
	    
	    //Return the string representation of the char argument
	    String sss = String.valueOf("Technology");
	    System.out.println(sss.length());
	    
	   }
	    
	    
	  }


