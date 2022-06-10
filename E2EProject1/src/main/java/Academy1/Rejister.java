package Academy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rejister {
	
	public WebDriver driver;
	
	By Register = By.xpath("//div[@class='login-btn']/a[@class='theme-btn']");
	By Fullname = By.id("user_name");
	By email = By.id("user_email");
	By password = By.id("password");
	By Icon = By.cssSelector("svg[class='icon-e']");
	By checkBox = By.name("allow_marketing_emails");
	By Signup = By.xpath("//input[@type='submit']");
	
	

	public Rejister(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver =driver2;
	}

	public WebElement register() {
		return driver.findElement(Register);
	}
	
	public WebElement Fullname() {
		return driver.findElement(Fullname);
	}
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement icon() {
		return driver.findElement(Icon);
	}
	
	public WebElement checkBox() {
		return driver.findElement(checkBox);
	}
	
	public WebElement Signup() {
		return driver.findElement(Signup);
	}
}
