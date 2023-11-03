package week3.day1;

public class overLoading {
	
	public void reportSteo(String message, String status)
	{
		System.out.println(message);
		System.out.println(status);
	}

	
	public void reportSteo(String message, String status, boolean snap)
	{
		System.out.println(message);
		System.out.println(status);
		if(snap = true )
		{
			System.out.println("Take Screenshot");
		}
		
		else
		{
			System.out.println("Skip Screenshot");
		}
	}
	
	public static void main(String[] args) {
		overLoading hh = new overLoading();
		hh.reportSteo("This is good", "Passed");
		hh.reportSteo("This can be better", "failed", true);
	}
}
