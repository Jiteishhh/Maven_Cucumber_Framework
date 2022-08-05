package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinition", monochrome = true, 
		plugin = {"pretty", "html:target/cucumber/html-reports.html", "json:target/cucumber/json-reports.json", "junit:target/cucumber/xml-reports.xml"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
