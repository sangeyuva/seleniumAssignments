package week1.day2;

public class FibonacciSeries {

	int range;
	int n1 = 1;
	int n2 = 1;
	int n3;
		
	
	public void fibonacci(int range)
	{
		System.out.println (n3);
		for (int i = 0 ; i <=range; i++) { //0 1 2
			n1 = n2; // 1  0 1 1
			n2 = n3; //0 1 1 2
				
				n3 = n1+ n2; //  1 1 2 3
				System.out.println(n3); // 1
			
			
		//	temp1_fibo = fibo;
			
			
			
		}
	}
	
	public static void main(String[] args) {
		FibonacciSeries obj = new FibonacciSeries();
		obj.fibonacci(5);
				
	}
}


