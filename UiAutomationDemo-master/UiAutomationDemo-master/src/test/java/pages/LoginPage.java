package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	    this.driver = driver;
		
	}
	
	By enterUsername = By.id("user-name");
	By enterPassword = By.name("password");
	By clickBtn      = By.xpath("//input[@type='submit']");


	
	public void enterUn() {
		driver.findElement(enterUsername).sendKeys("standard_user");
		
	}
    
	public void enterPw() {
		driver.findElement(enterPassword).sendKeys("secret_sauce");
		
	}
	
	public void clickBtn() throws Exception {
		
		driver.findElement(clickBtn).click();
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		
	}
	
	public void validateHomePage() {
		String strUrl = driver.getCurrentUrl();
		String expected = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(expected, strUrl);
	}
}
