package javaChallenge;

import java.util.ArrayList;
import java.util.List;

public class PhrasePalindrome {
	
	public static void main(String[] args) {
		
	
 String	s = "A man, a plan, a canal: Panama";
 String ss = s.replaceAll("[,:,\\s]", "");
 System.out.println(ss);
 StringBuilder input1 = new StringBuilder(ss);
 StringBuilder reverse = input1.reverse();
 System.out.println(reverse);
 String mm = reverse.toString();
 
 
 
if(ss.equalsIgnoreCase(mm))
{
	System.out.println("It is palindrome");
}
 
else
{
	System.out.println("Not palindrome");
}
 
 
 
	}}
