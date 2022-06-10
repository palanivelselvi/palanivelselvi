package Academy1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;

public class Login extends base{
	
public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void Login() throws IOException {
			
	Homepage hp = new Homepage(driver);
	//Landingpage lp = new Landingpage();
	//lp.login();
	hp.practice().click();	
	hp.yourName().sendKeys("Palanivelselvi");
	hp.yourMail().sendKeys("palanivelselvi18@gmail.com");
	hp.checkBox().click();
	if(hp.checkBoxSelected()) {
		hp.submit().click();
		//hp.code().sendKeys("");
		//hp.submitCode().click();

}
	
	}
	
	
	
	
}
