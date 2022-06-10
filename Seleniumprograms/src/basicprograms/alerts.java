package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		//driver.findElement(By.cssSelector("div[class='row pl-4 pr-4 p-relative'] div div div div button")).click();
		//driver.findElement(By.xpath("//div[@aria-selected='true']")).click();
	//	WebElement adult = driver.findElement(By.xpath("//div[@class='mb-4']/select"));
	//	Select adultval = new Select(adult);
		//adultval.selectByValue("3");
		driver.quit();
		/*WebElement child = driver.findElement(By.xpath("//h4[contains(text(),'Children')]/following-sibling::select"));
		Select childval = new Select(child);
		childval.selectByIndex(2);
		WebElement infant = driver.findElement(By.xpath("//p[contains(text(),'Below 2 yrs')]/parent::div/select"));
		Select inval = new Select(infant);
		inval.selectByVisibleText("1");
		driver.findElement(By.tagName("strong")).click();
		WebElement classoftravel = driver.findElement(By.xpath("//option[@value='Premium Economy']/parent::select"));
		Select travel = new Select(classoftravel);
		travel.selectByVisibleText("Business");
		driver.findElement(By.cssSelector("input[placeholder='Airline name']")).sendKeys("indi");
		WebElement airline = driver.findElement(By.xpath("//p[contains(text(),'IndiGo (6E)')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", airline);
		WebElement search = driver.findElement(By.xpath("//div[@class='col flex flex-middle']/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", search);
		System.out.println(driver.findElement(By.className("col-24")).getText());*/
		driver.close();		

	}

}
