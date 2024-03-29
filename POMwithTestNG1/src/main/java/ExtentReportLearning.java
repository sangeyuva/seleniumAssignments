import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportLearning {





	public static void main(String[] args) throws IOException {
		// Common for all the test cases -> part1
		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		// to keep the report history
	//	reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		// Step3: attach the data with physical file
		extent.attachReporter(reporter);
		
		
				
		// Step4: Create a test cases and assign test details -> Part2
											// testName 	//testDescription
		ExtentTest test = extent.createTest("VerifyLogin", "Login with valid credential");
		test.assignCategory("smoke");
		test.assignAuthor("Sangeetha G");		
		
																							//.. -> used to come out of reports	
		// Step5: Step level status -> Part3
		test.pass("Enter Uname",MediaEntityBuilder.createScreenCaptureFromPath(".././Screenshot/leaftaps.png").build()); //test step1
		test.pass("enter pwd");
		test.pass("Click Login button"); // test step3
		
		// step6: Mandatory step -> Part4
		extent.flush();

	}

}
