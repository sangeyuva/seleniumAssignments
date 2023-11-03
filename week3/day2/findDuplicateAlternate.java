package week3.day2;

import java.util.Arrays;
import java.util.Iterator;

public class findDuplicateAlternate {
	public static void main(String[] args) {
		int num[]= {2,5,7,7,5,9,2,3};
		
		 Arrays.sort(num);
		 for(int i = 0;i<num.length;i++)
		 {
			 int j=num[i];
			 System.out.println("Sorted array "  +j);
			// int[] scores = new int[num.length-1];
			// System.out.println(scores);
		 }
		
		for(int i = 0; i<num.length-1;i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]    +" is Duplicate");
		}
			
			}
			

}
}
