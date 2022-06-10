package Academy.E2E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseclass {
	
	public WebDriver driver;
	
	public WebDriver browserInitializing() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\E2E\\src\\main\\java\\Academy\\E2E\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName=="chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName=="ie") {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\Documents\\selenium\\IEDriverServer_Win32_3.150.2\\iedriver.exe");
			 driver = new InternetExplorerDriver();
		}
		else if(browserName=="firefox") {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\selenium\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}

}
