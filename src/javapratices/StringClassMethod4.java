package javapratices;

public class StringClassMethod4 {

	public static void main(String[] args) {
	
		String str = " YogiTa JaykAr" ;
		StringBuffer newS = new StringBuffer(str);
		for (int i=0; i<str.length(); i++) {
			// Convert to lower case character
			if (Character.isLowerCase(str.charAt(i))) {
				newS.setCharAt(i, Character.toUpperCase(str.charAt(i)));
				
			}
			// Covert to upper case character
			else if (Character.isUpperCase(str.charAt(i))) {
				newS.setCharAt(i, Character.toLowerCase(str.charAt(i)));
				
				
			}
		}
		
		System.out.println("String Output : " + newS);
		
		System.out.println("----------------------------------------------");
		
		String s = "welcome to goa";
		String s1[] =s.split("\\s");
		for (String i:s1) {
			System.out.println(i);
		}
		System.out.println(s.replace('W', 'w'));
		
		
		}


		}
		
		
	

		
				
			
			
			
			
			
		
		


