package com.qa.stepDefinition;

import com.qa.pageObject.AuthenticationPage;
import com.qa.pageObject.CreateAccountPage;
import com.qa.pageObject.LandingPage;
import com.qa.pageObject.MyAccountPage;
import com.qa.resource.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class RegistrationStepDefinition extends Base {
    WebDriver driver;
    LandingPage lp;
    AuthenticationPage au;
    CreateAccountPage ca;
    MyAccountPage my;

    @Before
    public void setUp() {
        System.out.println("God is good");
    }

    @After
    public void tearDown(){
        driver.quit();

    }


    @Given("^user launches \"([^\"]*)\" browser$")
    public void user_launches_browser(String arg1) throws Throwable {
      driver = initializeDriver();
    }

    @Given("^user opens URL \"([^\"]*)\"$")
    public void user_opens_URL(String arg1) throws Throwable {
        driver.get(arg1);
    }

    @Given("^User clicks Sign in$")
    public void user_clicks_Sign_in() throws Throwable {
     lp = new LandingPage(driver);
     lp.clickLoginBtton();


    }

    @Given("^User is on Authentication page$")
    public void user_is_on_Authentication_page() throws Throwable {
        au = new AuthenticationPage(driver);
        au.pageValidation();


    }

    @When("^User enters valid email as \"([^\"]*)\"$")
    public void user_enters_valid_email_as(String arg1) throws Throwable {
        au = new AuthenticationPage(driver);
        au.setEmail();

    }

    @When("^Clicks create an account button$")
    public void clicks_create_an_account_button() throws Throwable {
        au = new AuthenticationPage(driver);
        au.clickCreateAccountButton();

    }

    @Then("^User should land on the registration page$")
    public void user_should_land_on_the_registration_page() throws Throwable {
        ca = new CreateAccountPage(driver);
        ca.validatePageTitle();

    }

    @When("^user inputs valid data$")
    public void user_inputs_valid_data() throws Throwable {
        ca = new CreateAccountPage(driver);
        ca.setValidCredentials();

    }

    @When("^user clicks register button$")
    public void user_clicks_register_button() throws Throwable {
        ca = new CreateAccountPage(driver);
        ca.clickRegisterButton();

    }

    @Then("^page heading should be \"([^\"]*)\"$")
    public void page_heading_should_be(String arg1) throws Throwable {
        my = new MyAccountPage(driver);
        my.getHeading();

    }

    @When("^user inputs invalid data$")
    public void user_inputs_invalid_data() throws Throwable {
        ca = new CreateAccountPage(driver);
        ca.setInValidCredentials();
    }
    @When("^user leaves field blank$")
    public void user_leaves_field_blank() throws Throwable {

    }

    @Then("^page URL be \"([^\"]*)\"$")
    public void page_URL_be(String arg1) throws Throwable {
        ca = new CreateAccountPage(driver);
        ca.verifyPageTitle();
    }


}
