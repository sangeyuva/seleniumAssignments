package week3.day2;

import java.util.Arrays;

public class secondLargestNumArray {
	
	public static void main(String[] args) {
		
		int a[]={3, 2, 11, 4, 6, 7};
		
		Arrays.sort(a); //{ 2,3,4,6,7,11}
		
		int kk = a.length;
		
	
		
		System.out.println("Second Largest Element " +a[a.length-2]);
	}

}
