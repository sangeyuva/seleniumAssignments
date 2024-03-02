package SelLearning;

import java.util.Iterator;
public class IsPrime {
	
		int num;
		boolean IsPrime = true;
		
		public void numb(int num) {
			for (int i = 2 ; i<=num-1; i++) { //i = 2 , 2/2 (i= num 
				
				 if(num%i==0)
				{
					IsPrime= false;
				break;
				}
			
			
			}
				if(IsPrime)
				{
					System.out.println(num + " is prime");
				}
				else
				{
					System.out.println(num +  "is not prime");
				}
				//if(num<=1) {
				//	System.out.println(num +  "is not prime");
				//			}
			}
					
			
		
		public static void main(String[] args) {
							IsPrime obj = new IsPrime();
			obj.numb(2);
			
			
		}

	}






