package SelLearning;

public  class B implements A,Q{
	
	public  B() {
		{System.out.println("lullaby");} 
		
	}
	public void c(){System.out.println("I am c");}  
//	public void b(){System.out.println("I am b");}
//	public void a(){System.out.println("I am a");}
//	public void d(){System.out.println("I am d");}

	@Override
	public void a() {
		{System.out.println("I am a");} 
		
	}

	@Override
	public void b() {
		{System.out.println("I am b");} 
		
	}

	@Override
	public void d() {
		{System.out.println("I am d");} 
	}

	
}
