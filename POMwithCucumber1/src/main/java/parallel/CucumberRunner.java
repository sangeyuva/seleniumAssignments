package parallel;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import parallel.BaseClass;

@CucumberOptions(features = "src/test/java/Features/CreateLead.feature",
glue = "parallel",monochrome = true,publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests

{

}
