package javaChallenge;

public class reverseString {
	

	public static void main(String[] args) {
		String s1 = "Testing";
//	StringBuilder input1 = new StringBuilder(s1);
//	StringBuilder reverse = input1.reverse();
//	System.out.println(reverse);
//	
		
		char[] charArray = s1.toCharArray();
		//System.out.println(charArray);
		
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
			
		}
	}
	
	

	
	
	

}
