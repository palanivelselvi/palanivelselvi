package basicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://qaclickacademy.com/practice.php");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement> row = driver.findElements(By.cssSelector("table[id='product']:nth-child(2) tr"));
		int rowCount = row.size();
		System.out.println(rowCount);
		List<WebElement> column = driver.findElements(By.cssSelector("table[id='product']:nth-child(2) tr th"));
		int colcount = column.size();
		System.out.println(colcount);
		for(int i=0;i<rowCount;i++) {
			if(i==2) {
				System.out.println(row.get(i).getText());
				break;
			}
		}
	
		
	}

}
