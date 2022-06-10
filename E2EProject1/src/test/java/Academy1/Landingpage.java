package Academy1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;

public class Landingpage extends base {
	
	public WebDriver driver;
	
	
	public static Logger log =LogManager.getLogger(Landingpage.class.getName());
	
	@Test	
	public void initialize() throws IOException {
		driver=initializeBrowser();
		log.error("Browser is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Landing to homepage");
	}
		
	
	}


