package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicpathamazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(50000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/*	boolean currency = driver.findElement(By.xpath("//span[contains(text(),'No, thanks')]")).isDisplayed();
		if(currency==true)
		{
			driver.findElement(By.xpath("//span[contains(text(),'No, thanks')]")).click();
		}
		else
		{
			boolean address = driver.findElement(By.cssSelector("input[data-action-type='DISMISS']")).isDisplayed();
			if(address==true) {
				driver.findElement(By.cssSelector("input[data-action-type='DISMISS']")).click();
			}	
		}*/		
			
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61jovjd+f9L._SX3000_.jpg']")));
		System.out.println(driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61jovjd+f9L._SX3000_.jpg']")).getText());
	driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61jovjd+f9L._SX3000_.jpg']")).click();

	}

}
