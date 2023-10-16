package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser mew = new Browser();
		String c = mew.launchBrowser("Edge");
	
		System.out.println("The returned browser name :" +c);
		mew.loadUrl();
		
		
	}

}
