package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.StepDefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import PagePanel.LoginUserPagePanel;
import Resource.*;

public class LoginUserStep extends BaseClass {
	LoginUserPagePanel loginUserPagePanel = new LoginUserPagePanel();
	Hooks hooks = new Hooks();
	

	public static Logger log = LogManager.getLogger(StepDefinition.class);
	
	@Given("^Login to Concerete App as User with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_to_Concerete_App_as_User_with_and(String username, String password) throws Throwable
	{
		loginUserPagePanel.enterUserName(username);
		Thread.sleep(3000);
		loginUserPagePanel.enterPassword(password);
		Thread.sleep(3000);
		loginUserPagePanel.clickLoginBtn();
		Thread.sleep(3000);
		System.out.println("User logged in Successfully");
	}

	@When("^User navigate to Dashboard$")
	public void user_navigate_to_Dashboard() throws Throwable 
	{
		System.out.println("Navigating on Dashboard");
		Thread.sleep(3000);
		loginUserPagePanel.validateLogo();
		System.out.println("Validated Dashboard");
		log.info("Dashboard is verified - Log4j msg");
	}

	@Then("^Click on settings button$")
	public void click_on_settings_button() throws Throwable 
	{
		System.out.println("Clicking on Setting");
		Thread.sleep(3000);
		loginUserPagePanel.clickOnSettingBtn();
		System.out.println("Clicked on Setting");
		
	}

	@Then("^Click on Logout$")
	public void click_on_Logout() throws Throwable 
	{
		System.out.println("Clicking on logout");
		Thread.sleep(3000);
		loginUserPagePanel.logout();
		System.out.println("Clicked on logout");
	}

	@Then("^Verify the Logout with \"([^\"]*)\"$")
	public void verify_the_Logout(String expectedMsg) throws Throwable 
	{
		System.out.println("Validating logout msg");
		Thread.sleep(3000);
		loginUserPagePanel.validateLogout(expectedMsg);
		System.out.println("Validated logout msg");
	}

	@Then("^Verify the Failed Login with \"([^\"]*)\"$")
	public void verify_the_Failed_Login_with(String expMsg) throws Throwable {
      loginUserPagePanel.validateFailedLogin(expMsg);
	}

}

	
