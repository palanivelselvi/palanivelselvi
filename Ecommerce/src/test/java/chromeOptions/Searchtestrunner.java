package chromeOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features="src/test/java/features/Search.feature",
glue="stepDefinitions",
monochrome=true

)


public class Searchtestrunner extends AbstractTestNGCucumberTests {

	
}
