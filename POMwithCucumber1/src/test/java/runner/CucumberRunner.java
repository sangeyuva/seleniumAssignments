package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/Features",
glue = "steps",monochrome = true,publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests

{

}
