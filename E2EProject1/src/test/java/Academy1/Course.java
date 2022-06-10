package Academy1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.base;
public class Course extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void courseDetails() throws IOException {
		
		Login lo = new Login();
		
		lo.Login();
		Coursedetails co = new Coursedetails(driver);
		co.courseTab().click();
		
		if(co.searchCourse().isDisplayed()) {
			co.searchCourse().sendKeys("Selenium");
		}
		co.searchButton().click();
		int courseCount = co.courses().size();
		for(int i=0;i<courseCount;i++) {
			System.out.println(co.courses().get(i).getText());
			
		}
		
		
		}
	
	@AfterTest
	public void closeBrowser() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
