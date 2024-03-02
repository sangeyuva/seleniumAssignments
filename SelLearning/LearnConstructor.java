package SelLearning;

public class LearnConstructor {
	int x, y;
	
	LearnConstructor()
		{
		this(300,200);
				System.out.println("hello a");
		}  
	LearnConstructor(int x, int y){  
		 
		System.out.println(x);  
		this.x =y;
		this.y=x;
		}  
		
		 
		public static void main(String args[]){  
			LearnConstructor a=new LearnConstructor();  
			System.out.println(a.x+" "+a.y);
		}}  


