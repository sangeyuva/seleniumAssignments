package week3.day1;

public class chrome extends inheritance {
	
	public void openIncognito()
	{
		System.out.println("Opened in Incognito");
	}

	public void clearCache()
	{
		System.out.println("Cleared Cache");
	}
	
	public static void main(String[] args) {
		chrome jj = new chrome();
		jj.loadUrl();
		jj.launchBrowser("chrome");
		jj.navigateBack();
		jj.openIncognito();
		jj.clearCache();
		
		
		
	}
}
