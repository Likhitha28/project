package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage 
{

	@FindBy(xpath="//*[@id=\'navbarExample\']/ul/li[2]/a")
	public WebElement contacttab;
	
	@FindBy(xpath="//*[@id=\'recipient-email\']")
	public WebElement contactemail;
	
	@FindBy(xpath="//*[@id=\'recipient-name\']")
	public WebElement contactname;
	
	@FindBy(xpath="//*[@id=\'message-text\']")
	public WebElement contactmessage;
	
	@FindBy(xpath="//*[@id=\'exampleModal\']/div/div/div[3]/button[2]")
	public WebElement SendButton;
	
	
	public void ContactTab() throws InterruptedException
	{
		contacttab.click();
		Thread.sleep(1000);
	}
	
	public void ContactEmailAndName(String arg1,String arg2) throws InterruptedException
	{
		Thread.sleep(1000);
		contactemail.clear();
		contactemail.sendKeys(arg1);
		
		Thread.sleep(1000);
		contactname.clear();
		contactname.sendKeys(arg2);
		
	}
	
	public void ContactMessage(String arg1) throws InterruptedException
	{
		contactmessage.clear();
		contactmessage.sendKeys(arg1);
		Thread.sleep(1000);
		SendButton.click();
		
	}
	
}
