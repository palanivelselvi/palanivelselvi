package Academy1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;

public class Register extends base{
	
	public WebDriver driver;
	
	
	public void initialize() throws IOException {
		
		driver = initializeBrowser();
		
	}

	
	
	@Test
	public void Register() throws IOException {
		
		Rejister r = new Rejister(driver);
		Landingpage lp = new Landingpage();
		r.register().click();
		r.Fullname().sendKeys("Palanivelselvi");;
		r.email().sendKeys("palanivelselvi18@gmail.com");
		r.password().sendKeys("Imaya@1205");
		r.icon().click();
		r.checkBox().click();
		if(r.checkBox().isSelected()) {
			r.Signup().click();
		}
		
		
		
	}
	
	
	
	
}
