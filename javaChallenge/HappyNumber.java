package javaChallenge;

public class HappyNumber {

	public static int checkHappyNumber(int n) {

		int total = 0;
		int rem = 0;
		int n1 = n;
		
		while(n>0)
		{
			 rem = n%10; //9
			int temp = n/10;//1
		total= total+ (rem*rem);
		
		}
		return total;
	}
		
		

//		for (int i = n1; i != 1; i = n1) {
//
//			for (int j = i; j != 0; j = i / 10) {
//
//				int rem = j % 10;
//				total = total + (rem * rem);
//
//			}

//			System.out.println(total); //82
//
//			n1 = total;
		//while(n1!=1)	
//		n1= checkHappyNumber(n1);
////if(total==1)
////{
////	System.out.println(n + "Is Happy Number");
////}
////elseif(total)
////	}

	public static void main(String[] args) {
		HappyNumber obj = new HappyNumber();
		obj.checkHappyNumber(19);

	}
}

//1. return total , create method for ifelse
