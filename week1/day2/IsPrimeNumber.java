package week1.day2;

import java.util.Iterator;

public class IsPrimeNumber{
	int num;
	
	public void numb(int num) {
		for (int i = 2 ; i<=num; i++) { //i = 2 , 2/2 (i= num 
			if((num<=1))
			{
				System.out.println(num + " is not prime");
			}
			else if(num%i==0)
			{
				System.out.println(num + " is not prime");
			break;
			}
		
		else
		{
		System.out.println(num+" is prime");
		break;
		}
		}
			
		}
		
	
	public static void main(String[] args) {
						IsPrimeNumber obj = new IsPrimeNumber();
		obj.numb(7);
		
		
	}

}
