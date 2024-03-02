package javaChallenge;

public class PhrasePanlindromTraverseLoop {

	public void reversePhrase(String s1) {
		String reverse = "";
		String ss = s1.replaceAll("[,:,\\s]", "");
		System.out.println(ss);
//		int length = ss.length();
//		System.out.println(length);
		


		for (int i = ss.length()-1; i>=0 ; i--) {
			char ch = ss.charAt(i);
			reverse = reverse + ch;

		}

		System.out.println(reverse);

		if (ss.equalsIgnoreCase(reverse)) {
			System.out.println("Its palindrome");
		}

		else {
			System.out.println("Not palindrome");
		}

	}

	public static void main(String[] args) {

		PhrasePanlindromTraverseLoop mm = new PhrasePanlindromTraverseLoop();
		mm.reversePhrase("madam");

	}

}
