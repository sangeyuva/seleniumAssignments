package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectionUsingList {
	
	public static void main (String[] args) {
		int a[] = {3,4,5,6};
		int b[] = {3,6,8,9};
		int kk = 0;
		
		Integer a1[] = {3,4,5,6};
		
		Integer b1[] = {3,6,8,9};
		
		List<Integer> inList = new ArrayList<Integer>();
		List<Integer> inList2 = new ArrayList<Integer>();
		
		//To add arrays directly to List, Use Arrays.asList(variable name of an array)
		//List<Integer> inListtt = new ArrayList<Integer>(Arrays.asList(a1));
		//List<Integer> inListtt2 = new ArrayList<Integer>(Arrays.asList(b1));
		
		
		//To add arrays in to via for loop
//		for (int i = 0; i < a.length; i++) {
//			inList.add(a[i]);
//			
//		}
//			
//		for (int j = 0; j < b.length; j++) {
//			inList2.add(b[j]);
//			
//		}
		
		//To add arrays in to via for-each loop
		
		for(Integer ul1: a)
		{
			inList.add(ul1);
			
		}
		
		for(Integer ul2 : b)
		{
			inList2.add(ul2);
		}
		System.out.println("List 1 : " +inList);
		System.out.println("List 2 : " +inList2);
		
		
		
		//to Compare 1 value in array 1 , against all values in array 2 
		for (int i = 0; i < inList.size(); i++) {
			for (int j = 0; j < inList2.size(); j++) {
		
				if(inList.get(i)==inList2.get(j))
				{
					 kk = inList.get(i);
					
					 System.out.println("Intersected Values: "  +kk);
			}
				
		}
			
			
		}
		
		}
}
	
	
	//Additional notes  : Get() not available in set, so to print Set output, convert that in to List and print. 

	


