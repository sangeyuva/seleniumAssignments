package week1.day1;



import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;


public class BaseJira {
	
	public static String issue_id;
	public static String key;
	@BeforeMethod
	public void setup()
	{

		RestAssured.baseURI = "https://sangeetha-ganesan.atlassian.net";
		
		RestAssured.authentication = RestAssured.preemptive().basic("sangeyuva@gmail.com", "ATATT3xFfGF0AmK8g4TWHSp0uppsxryyVlM7if6qk9Pxa9pKQhxnVWGiCEGOjp_DekXz_aq_-nGhBIxZX0-Rd620XV6fop9eO8Q2T_YZTQ4CFP1umYv4f3Wm9Fwled5P5UMDMXj7rGZsj-Z5jb00e40RPNid7YCKd03eoGszqjBlXtpwmUGmUso=3023FCCC");
			
				
				
				
	}

}
