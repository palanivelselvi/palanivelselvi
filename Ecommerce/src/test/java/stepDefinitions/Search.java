package stepDefinitions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Search {
	
	  WebDriver driver;
	 public String productName;
	 public String offerProduct;
	 WebDriverWait wait;
	 
	
	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Chromedriver/Chromedriver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
	   
	}
	@When("user searched with shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) {
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'ADD TO CART')]")));
		productName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();		
		System.out.println(productName);
	  
	}
	
	
	@Then("user searched for {string} shortname in offers page to check if product exist with same name")
	public void user_searched_for_shortname_in_offers_page_to_check_if_product_exist_with_same_name(String shortname) {
		driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		Set<String> window = driver.getWindowHandles();	
		Iterator<String> it = window.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.id("search-field")).sendKeys(shortname);
		 offerProduct = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td")).getText();
		 System.out.println(offerProduct);
	}
	
	@And("Validate productname matches with Landing page")
	public void validate_productname_matches_with_landing_page() {
		
		Assert.assertEquals(productName, offerProduct);
		
	   
	}

	
	
	


}
