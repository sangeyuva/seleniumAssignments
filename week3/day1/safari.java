package week3.day1;

public class safari extends inheritance {
	
	public void readerMode()
	{
		System.out.println("Readmode");
	}
	
	public void fullScreenMode()
	{
		System.out.println("Its full screen mode");
	}

	public static void main(String[] args) {
		safari ll = new safari();
		ll.closeBrowser();
		ll.loadUrl();
		ll.readerMode();
		ll.fullScreenMode();
	}
}
