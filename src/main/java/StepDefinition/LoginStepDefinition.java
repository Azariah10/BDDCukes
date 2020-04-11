package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Resource.*;

import java.io.FileReader;
import java.io.IOException;

public class LoginStepDefinition extends BaseClass {
	WebDriver driver;

	public static Logger log = LogManager.getLogger(StepDefinition.class);

	@Before
	public void setUp() throws IOException {

	}

	@After
	public void tearDown() {
		//driver.quit();
	}

	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() throws Throwable {
		driver = initializeDriver();
		log.info("I am Back");
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@When("^user navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable {
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}

	@When("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(arg2);

	}

	@When("^User supplies invalid \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void user_supplies_invalid_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(arg2);
		Thread.sleep(2000);
	}

	@When("^Click on Login$")
	public void click_on_Login() throws Throwable {
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();

	}

	@Then("^User should be get this \"([^\"]*)\"$")
	public void user_should_be_get_this(String arg1) throws Throwable {

		if (driver.getTitle().equals("My account - My Store")) {
			System.out.print("Login Success");
			// driver.close();
		} else if (driver.getTitle().equals("Login - My Store")) {

			System.out.print("Expected");
			// driver.close();
		} else {
			Assert.assertTrue(false);

		}

	}

	@When("^user clicks on Logout button$")
	public void user_clicks_on_Logout_button() throws Throwable {
		driver.findElement(By.xpath("//a[@class='logout']")).click();

	}

	@Then("^user should be navigated to the Home Page$")
	public void user_should_be_navigated_to_the_Home_Page() throws Throwable {
		String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		Assert.assertEquals(driver.getCurrentUrl(), URL);
		System.out.print("I'm outta here");

	}

}
