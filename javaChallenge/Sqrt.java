package javaChallenge;

public class Sqrt {
	
	public static void SqrtNum(int x)
	{
		
		int i = 0;
		int res = 0;
		
		while(res<=x) {
			i++;
			res = i*i;
		}
		System.out.println(i-1);
	}
	
	public static void main(String[] args) {
		
		SqrtNum(15);
		
	}

}
