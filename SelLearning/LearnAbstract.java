package SelLearning;


	abstract class LearnAbstraction //abstract class  
	{  
	//abstract method declaration  
	abstract void display(); 
	void changeGear(){System.out.println("gear changed");}  
	}  
	
//	public class LearnAbstract extends LearnAbstraction  
//	{  
//	//method impelmentation  
//	void display()  
//	{  
//	System.out.println("Abstract method?");  
//	}  
//	public static void main(String args[])  
//	{  
//	//creating object of abstract class  
//		LearnAbstraction obj = new LearnAbstract();  
//	//invoking abstract method  
//	obj.display();  
//	}  
//	}  
//
	public  class LearnAbstract extends LearnAbstraction{

	@Override
	void display() {
		System.out.println("Learning Abstract methods");
		
	} 
	
	public static void main(String args[])
	{
		LearnAbstraction obj = new 	LearnAbstract();
		obj.display();
		obj.changeGear();
	}
	}
		
	

