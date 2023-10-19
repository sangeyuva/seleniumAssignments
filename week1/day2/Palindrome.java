package week1.day2;

public class Palindrome {
	
	int input;
	int output;
	//int inputLength;
	//int a;
	int reverse_num;
	int reminder;
	
	 public void palindromeCalc(int input)
	 {
		
		 //String str = Integer.toString(input);
		/// inputLength = str.length();
		for (int i=input;  i!=0; i=i/10) {
			
		 //12345 --> 12345/10 = 1234 reverse num = input * 10 + reminder
			 reminder = i % 10;
			 reverse_num= reverse_num * 10 + reminder;
			 output = reverse_num;
			
			
		}
		 //a = Integer.parseInt(str);
		// System.out.println(a);
		// output = Integer.reverse(a);
		// System.out.println(output );
	//System.out.println("Reversed Number : " +reverse_num);
	//System.out.println(output);
	
	
		
 if(input==0)
	{
		System.out.println(input+ " is not palindromeeee");
	}
		else if(input<0)
		{
			System.out.println(input+ " is not palindromey");
		}
		else if(output==input)
	{
		System.out.println(input+ " is Palindrome");
	
	}
		else
		{
			System.out.println(input+ " is not palindrome");
		}
	 }



public static  void main(String[] args) {
	Palindrome obj = new Palindrome();
obj.palindromeCalc(7007);
}
}