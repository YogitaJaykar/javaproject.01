package javapratices;

public class StringExample1 {

	public static void main(String[] args) {
		//Compare two strings lexicographically , ignoring case difference
		String s = "Very good morning to all of you";
		System.out.println(s.compareToIgnoreCase("very Good morning Ram"));
	
		//Compare this string to the specified object.
		System.out.println(s.equals("Very Good"));
		System.out.println(s.equals("Very good morning to all of you"));
		
		//Compare this string to the specified object.and ignore case
	    System.out.println(s.equalsIgnoreCase("very Good Morning"));
	    System.out.println(s.equalsIgnoreCase("very Good Morning to all of you"));
	    
	    //Compare this string to the by character content
	    System.out.println(s.contentEquals("Very good morning"));
	    System.out.println(s.contentEquals("Very good morning to all of you"));
	    
	    //Print the values
	    System.out.println(s.hashCode());
	    
	    //Returns the index within this string of the first occuranace of the specified character
	    System.out.println(s.indexOf('s'));
	    System.out.println(s.indexOf('n'));
	    System.out.println(s.indexOf('V'));
	    
	    System.out.println(s.indexOf('g', 5));
	    System.out.println(s.indexOf('t', 2));
	    System.out.println(s.indexOf('v', 10));
	    
	    System.out.println(s.lastIndexOf('y'));
	    System.out.println(s.lastIndexOf('o'));
	    
	    System.out.println(s.lastIndexOf("all"));
	    System.out.println(s.lastIndexOf("of"));
	    
	    String ss = "Welcome to Goa" ;
	    //Return the index within this string of the last occurance of the specified substring ,
         //searching backward starting at the specified index
	    System.out.println(ss.lastIndexOf('o', 5));
	    
	    //Return the length of this string
	    System.out.println(ss.length());
	    
	    //Returns true if, and only if, length() is 0
	    System.out.println(s.isEmpty());
	    System.out.println("".isEmpty());
	   
	    System.out.println(s.isBlank());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	}
