package SelLearning;

public class M extends B{
	
	public M() {
		super();
		

		System.out.println("I am al");
	}

	public void b() {
		System.out.println("I am bl");
	}

	public void d() {
		System.out.println("I am dl");
		
	}

	

	public static void main(String[] args) {
		M obj = new M();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		
	}

	

	

}
