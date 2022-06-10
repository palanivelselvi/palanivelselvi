package Academy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Coursedetails {
	
	public WebDriver driver;
	
	By searchCourse = By.id("search-courses");
	By searchButton = By.id("search-course-button");
	By courses = By.xpath("//div[@class='course-listing-title']");
	By courseTab = By.xpath("//li[@class='current']/following-sibling::li[1]");
	
	//@FindBy(xpath="//a[@href='https://courses.rahulshettyacademy.com/courses']")
	//WebElement courseTab;
	
	public Coursedetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement searchCourse() {
		return driver.findElement(searchCourse);
	}
	
	public WebElement searchButton() {
		return driver.findElement(searchButton);
	}
	
	public List<WebElement> courses() {
		return driver.findElements(courses);
	}
	
	public WebElement courseTab() {
		return driver.findElement(courseTab);
	}
	
	
}


