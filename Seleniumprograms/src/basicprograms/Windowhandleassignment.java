package basicprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandleassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
	 Set window=	driver.getWindowHandles();
	 Iterator it = window.iterator();
	 String parentID = (String) it.next();
	 String childID = (String) it.next();
	 driver.switchTo().window(childID);
	System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
	driver.switchTo().window(parentID);
	System.out.println(driver.findElement(By.tagName("h3")).getText());
	

	}

}
