package mphasis.FirstCry.testSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features//myprofile.feature",
		glue = "mphasis.FirstCry.testSteps"
		)

public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
