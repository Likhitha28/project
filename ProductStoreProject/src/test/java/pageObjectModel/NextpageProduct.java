package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextpageProduct
{

	@FindBy(xpath="//*[@id=\'next2\']")
	public WebElement nextbutton;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a")
	public WebElement macbook;
	
	public void NextButton()
	{
		nextbutton.click();
	}
	
	public void ProductMac() throws InterruptedException
	{
		Thread.sleep(2000);
		macbook.click();
		
	}
}
