package week1.day2;

public class Dummy {
	public static void main(String[] args) {
		int number = 1
				;
		boolean isPrime = true;
		for(int i=2;i<=number-1;i++)
		{
			if(number%i == 0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
			System.out.println(number + " is prime");
		else
			System.out.println(number + " is not prime");
	}
	}