package week3.day1;

public class edge extends inheritance {
	
	public void takeSnap()
	{
		System.out.println("Taken snap");
	}

	
	public void clearCookies()
	{
		System.out.println("Clear Cookies");
	}
	
public static void main(String[] args) {
	edge kk = new edge();
	kk.loadUrl();
	kk.navigateBack();
	kk.takeSnap();
	kk.clearCookies();
	kk.closeBrowser();
}
}
