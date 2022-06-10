package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/offers-list/content?screen=dynamic&pk=themeViews%3DAudio-Combat-Sale-OMU%3AApp%2CAudio-Combat-Sale-OMU%3ADT-New%7EwidgetType%3DdealCard%7EcontentType%3Dneo&wid=2.dealCard.OMU&otracker=hp_bannerads_2_2.bannerAdCard.BANNERADS_APPP_M1CN4H9FR508']")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/offers-list/content?screen=dynamic&pk=themeViews%3DAudio-Combat-Sale-OMU%3AApp%2CAudio-Combat-Sale-OMU%3ADT-New%7EwidgetType%3DdealCard%7EcontentType%3Dneo&wid=2.dealCard.OMU&otracker=hp_bannerads_2_2.bannerAdCard.BANNERADS_APPP_M1CN4H9FR508']")));
		driver.findElement(By.xpath("//a[@href='/offers-list/content?screen=dynamic&pk=themeViews%3DAudio-Combat-Sale-OMU%3AApp%2CAudio-Combat-Sale-OMU%3ADT-New%7EwidgetType%3DdealCard%7EcontentType%3Dneo&wid=2.dealCard.OMU&otracker=hp_bannerads_2_2.bannerAdCard.BANNERADS_APPP_M1CN4H9FR508']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@style='width: 9331px; transform: translateX(-2666px);']")).click();
		

	}

}
