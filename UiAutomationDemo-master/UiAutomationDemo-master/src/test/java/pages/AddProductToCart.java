package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

public class AddProductToCart {
	WebDriver driver;

	public AddProductToCart(WebDriver driver) {
		this.driver = driver;
	}

	By enterUsername = By.id("user-name");
	By enterPassword = By.name("password");
	By clickBtn = By.xpath("//input[@type='submit']");
	By addProduct1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By addProduct2 = By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']");
	By cart = By.xpath("//a[@class=\"shopping_cart_link\"]");

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

	public void clickBtn1() throws Exception {
		Thread.sleep(4000);
		driver.findElement(addProduct1).click();
		Thread.sleep(4000);
	}

	public void clickBtn2() throws Exception {

		driver.findElement(addProduct2).click();
		Thread.sleep(4000);
	}

	public void clickCart() throws Exception {
		Thread.sleep(4000);
		driver.findElement(cart).click();
		Thread.sleep(4000);
	}

	public void validateHomePage() {
		String strUrl = driver.getCurrentUrl();
		String expected = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(expected, strUrl);
	}

}
