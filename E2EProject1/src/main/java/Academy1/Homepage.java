package Academy1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public WebDriver driver;
	
By Practice = By.xpath("//a[@href='https://courses.rahulshettyacademy.com/sign_in']");
By yourName = By.id("name");
By yourmail = By.name("email");
By checkBox = By.xpath("//input[@type='checkbox']");
By Submit   = By.id("form-submit");
By Code  	=By.id("code");
By submitCode = By.id("code-form-submit");
		


	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public  WebElement practice() {
		return  driver.findElement(Practice);
		 
	}
	
	public WebElement yourName() {
	return 	driver.findElement(yourName);
	}
	
	public WebElement yourMail() {
		return 	driver.findElement(yourmail);
		}

	
	public WebElement checkBox() {
		return 	driver.findElement(checkBox);
		}
	
	public boolean checkBoxSelected() {
		return 	driver.findElement(checkBox).isSelected();
		}
	
	public WebElement submit() {
		return driver.findElement(Submit);
		}
	public WebElement code() {
		return driver.findElement(Code);
	}
	
	public WebElement submitCode() {
		return driver.findElement(submitCode);
	}
	
	


}
