package javaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

import org.apache.commons.collections4.Get;

public class LastWordCount {
	
	public static void main(String[] args)
	{
		String s= "Hello World is mine blueee 90909";
	// String s2 =  Arrays.toString(s);
	//System.out.println(s2);
	String[] s3 = s.split("\\s", 2);
	
	
	List <String> ls = new ArrayList<String>();
	
	for(String k : s3)
	{
		ls.add(k);
		
	}
	
	String p = ls.get(ls.size()-1);
		
	System.out.println(p);
	System.out.println(p.length());
	
	}
	

}
