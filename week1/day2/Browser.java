package week1.day2;

public class Browser {
	String browserName = "Edge";
	String browserVersion = "21.4.0";

	public String launchBrowser(String browserName) {
		
		System.out.println("\"Browser launched successfully\"");
		return browserName;
		
	

	}
	
	public void loadUrl() {
		System.out.println("\"Application url loaded successfully\"");

	}
	
	public void closeBrowser()
	{
		org.openqa.selenium.devtools.v116.browser.Browser.close();
		System.out.println("\"Browser Closed successfully\"");
	}
	
	public void navigateBack()
	{
		
		System.out.println("\"Navigated Sucessfully\"");
	}
	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.launchBrowser("Edge");
				obj.loadUrl();
		
		
	}
}
