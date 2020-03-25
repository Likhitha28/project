package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(	features="C:\\Users\\Likhitha\\Downloads\\ProductStoreProject\\src\\main\\java\\feature\\productstore.feature",
	glue ="para.stepdefinition",
	tags= {"@TC_01_Login,@TC_02_Add_Cart,@TC_03_contact,@TC_04_nextpage"},
	dryRun = true,
	monochrome = true,
	plugin = {"pretty","html:test-output"}		
	)

public class TestRunnerClass
{

}
