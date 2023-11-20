package javaChallenge;

public class PhrasePanlindromTraverseLoop {

	public void reversePhrase(String s1) {
		String nstr = "";
		String ss = s1.replaceAll("[,:,\\s]", "");
		System.out.println(ss);

		for (int i = 0; i < ss.length(); i++) {
			char ch = ss.charAt(i);
			nstr = ch + nstr;

		}

		System.out.println(nstr);

		if (ss.equalsIgnoreCase(nstr)) {
			System.out.println("Its palindrome");
		}

		else {
			System.out.println("Not palindrome");
		}

	}

	public static void main(String[] args) {

		PhrasePanlindromTraverseLoop mm = new PhrasePanlindromTraverseLoop();
		mm.reversePhrase("");

	}

}
