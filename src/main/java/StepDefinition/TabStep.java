package StepDefinition;

import PagePanel.LoginUserPagePanel;
import PagePanel.TabPanel;
import Resource.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TabStep extends BaseClass {

    TabPanel tabs = new TabPanel();
    LoginUserPagePanel LoginPanel = new LoginUserPagePanel();

    Hooks hook = new Hooks();


    @Given("^User navigates to Dashboard$")
    public void user_navigates_to_Dashboard() throws Throwable {
        LoginPanel.validateLogo();

    }

    @When("^User Clicks on the tab buttons He should  be navigated to respective pages$")
    public void user_Clicks_on_the_tab_buttons_He_should_be_navigated_to_respective_pages() throws Throwable {
        tabs.clickTaskTab();
        tabs.verifyPresenceOfMyMenuTxt();
        Thread.sleep(1000);
        tabs.clickFilesTab();
        tabs.verifyPresenceOfFilesText();

    }



}
