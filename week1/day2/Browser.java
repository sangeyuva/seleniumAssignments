package week1.day2;

public class Browser {
	String browserName = "Edge";

	public String launchBrowser(String browserName) {
		
		System.out.println("\"Browser launched successfully\"");
		return browserName;
		
	

	}
	
	public void loadUrl() {
		System.out.println("\"Application url loaded successfully\"");

	}
	
	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.launchBrowser("Edge");
				obj.loadUrl();
		
		
	}
}
