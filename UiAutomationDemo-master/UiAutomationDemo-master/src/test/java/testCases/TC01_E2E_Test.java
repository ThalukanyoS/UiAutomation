package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.AddProductToCart;

public class TC01_E2E_Test {

	static WebDriver driver;

	@BeforeTest
	public void setUp() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	@Test (priority = 2)
	public void loginTest() throws Exception {
		LoginPage page = new LoginPage(driver);
		page.enterUn();
		page.enterPw();
		page.clickBtn();
		
		page.validateHomePage();

	}
	
	@Test (priority = 1)
	public void addToCartTest() throws Exception {
		AddProductToCart cart = new AddProductToCart(driver);
		cart.enterUn();
		cart.enterPw();
		cart.clickBtn();
		cart.clickBtn1();
		cart.clickBtn2();
		cart.clickCart();
		cart.validateHomePage();

	}

	@Test
	public void tearDown() {
	//	driver.quit();

	}
}
