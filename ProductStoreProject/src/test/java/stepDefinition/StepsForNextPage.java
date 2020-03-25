package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import pageObjectModel.NextpageProduct;

public class StepsForNextPage
{
	public WebDriver driver;
	public NextpageProduct NPP;
	
	@Given("^User launches the demo blaze application$")
	public void user_launches_the_demo_blaze_application() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Likhitha\\Downloads\\ProductStoreProject\\src\\main\\Driver\\chromedriver_v80.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		NPP = new NextpageProduct();
		NPP = PageFactory.initElements(driver, NextpageProduct.class);
	  
		
	}

	@Given("^Click on the next page$")
	public void click_on_the_next_page() 
	{
	    NPP.NextButton();
	}

	@Then("^Select the product in the next page of mac$")
	public void select_the_product_in_the_next_page_of_mac() throws InterruptedException 
	{
	   NPP.ProductMac();
	}

	@Then("^Check the product and Close the BrowserApplication$")
	public void check_the_product_and_Close_the_BrowserApplication() throws InterruptedException 
	{
		Thread.sleep(1000);
	    driver.close();
	}
}
