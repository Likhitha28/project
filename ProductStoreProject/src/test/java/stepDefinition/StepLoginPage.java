package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.*;
import pageObjectModel.LoginPage;

public class StepLoginPage 
{
	public WebDriver driver;
	public LoginPage loginpage;
	
	
	@Given("^The user launch the Chrome application$")
	public void the_user_launch_the_Chrome_application() 
	{
		System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Likhitha\\Downloads\\ProductStoreProject\\src\\main\\Driver\\chromedriver_v80.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		loginpage = new LoginPage(driver);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		
	}

	@When("^Clicking on LoginTab to nagivate Login Page$")
	public void clicking_on_LoginTab_to_nagivate_Login_Page() 
	{
		loginpage.LoginTab();		
		
	}

	@Then("^The user login using \"([^\"]*)\" and \"([^\"]*)\" with vaild and invaild deatils$")
	public void the_user_login_using_and_with_vaild_and_invaild_deatils(String arg1, String arg2) throws InterruptedException  
	{
		
		Thread.sleep(1000);
		loginpage.UsernameAndPassword(arg1, arg2);
		
		
	}

	@Then("^Clicking on login button and close the browser$")
	public void clicking_on_login_button_and_close_the_browser() throws InterruptedException 
	{
		loginpage.LoginButton();
		Thread.sleep(15000);
		/*String ValiduserInvalidPassword= "Wrong password.";
		String InvalidUserInvalidPassword= "User does not exist.";
		String ValidUserBlankPassword="Please fill out Username and Password.";
	
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		

		if(alert.equals(ValiduserInvalidPassword))
		{
			alert.accept();
			Thread.sleep(2000);
			driver.close();	
		}
		else if(alert.equals(InvalidUserInvalidPassword))
		{
			alert.accept();
			Thread.sleep(2000);
			driver.close();	
		}
		else if(alert.equals(ValidUserBlankPassword))
		{
			alert.accept();
			Thread.sleep(2000);
			driver.close();	
		}
		else
		{*/
			driver.close();		
		
		
	}

}
