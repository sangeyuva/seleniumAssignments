package week3.day2;

import java.util.Arrays;

public class missingElementArray {
	public static void main(String[] args) {
		int a[]= {1, 4,3,2,8, 6, 7}; 
		Arrays.sort(a); // {1,2,3,4,6,7,8}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=i+1)
			{
				System.out.println(i+1);
				break;
				
			}
			
		}
	}

}
