package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public WebDriver driver;

public void LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
	
	@FindBy(xpath="//*[@id=\'login2\']")
	public WebElement loginpagebutton;

	@FindBy(xpath="//*[@id=\'loginusername\']")
	public WebElement usernametext;

	@FindBy(id="loginpassword")
	public WebElement passwordtext;

	@FindBy(xpath="//*[@id='logInModal']/div/div/div[3]/button[2]")
	public WebElement loginbutton;

	@FindBy(id="logout2")
	public WebElement logoutbutton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void LoginTab()
	{
		loginpagebutton.click();
	}

	public void UsernameAndPassword(String username,String password) throws InterruptedException 
	{
		Thread.sleep(1000);
		usernametext.clear();
		usernametext.sendKeys(username);
		
		Thread.sleep(1000);
		passwordtext.clear();
		passwordtext.sendKeys(password);
	}
	
	public void LoginButton()
	{
		loginbutton.click();
	}
	
	public void LogoutTab()
	{
		logoutbutton.click();
	
	}
}
