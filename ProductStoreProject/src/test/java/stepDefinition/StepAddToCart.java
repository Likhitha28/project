package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import pageObjectModel.AddToCartPage;
import pageObjectModel.LoginPage;

public class StepAddToCart 
{
	public WebDriver driver;
	public AddToCartPage addcart;
	
	@Given("^The user launches the Chrome browser of demoblaze application$")
	public void the_user_launches_the_Chrome_browser_of_demoblaze_application()  
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Likhitha\\Downloads\\ProductStoreProject\\src\\main\\Driver\\chromedriver_v80.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		addcart = new AddToCartPage();
		addcart = PageFactory.initElements(driver, AddToCartPage.class);
	}

	@When("^Select the product$")
	public void select_the_product() throws InterruptedException 
	{
		addcart.product();		
	}

	@When("^Click on Add to cart$")
	public void click_on_Add_to_cart() throws InterruptedException 
	{
		addcart.ToCart();		
	}

	@Then("^Accept the Alert message and close the Browser$")
	public void accept_the_Alert_message_and_close_the_Browser() throws InterruptedException 
	{
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
		driver.close();
		
	}


}
