package week3.day1;

public class overriding extends overLoading{
	
	public void reportSteo()
	{
		System.out.println("Am done with assignment");
	}

	
	public static void main(String[] args) {
		overriding gg = new overriding();
		gg.reportSteo("Am passing", "passed");
		gg.reportSteo();
	}
}
