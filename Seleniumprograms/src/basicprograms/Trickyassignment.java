package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Trickyassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		WebElement opt = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label"));
		String optval = opt.getText();
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText(optval);
		driver.findElement(By.name("enter-name")).sendKeys(optval);
		driver.findElement(By.id("alertbtn")).click();
		String altval = driver.switchTo().alert().getText();
		if(altval.contains(optval))
		{
			System.out.println("alert is successful");
		}
		else
		{
			System.out.println("alert is failure");
		}
		
		
		

	}

}
