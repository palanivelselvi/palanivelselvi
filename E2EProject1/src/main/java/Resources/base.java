package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class base {
	 public static WebDriver driver;
	 public static Properties  prop = new Properties();
	 
	 
	public WebDriver initializeBrowser() throws IOException {		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\E2EProject1\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IE\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		else if(browserName.equals("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Program Files\\MicrosoftEdge\\edgedriver_win64\\msedgedriver.exe");
			 driver = new EdgeDriver();
			
		}
		
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	
	}
	

}
