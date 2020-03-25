package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage 
{	
	@FindBy(xpath="//*[@id=\'tbodyid\']/div[1]/div/div/h4/a")
	public WebElement samsungs6;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div[2]/div/a")
	public WebElement addToCart;
	
	
	public void product() throws InterruptedException
	{
		Thread.sleep(1000);
		samsungs6.click();
	}
	
	public void ToCart() throws InterruptedException
	{
		Thread.sleep(1000);
		addToCart.click();
	}
}
