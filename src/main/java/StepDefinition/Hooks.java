package StepDefinition;

import Resource.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass
	//public class Hooks extends BrowserStack
{
	
	@Before
	public void beforeScenario(Scenario s) throws Throwable
	{
		initializeDriver();

		//setUp("chrome", "70.0", "MAC");
		//setUp("firefox", "70.0", "WINDOWS");
		//setUp("chrome", "75.0", "WINDOWS");

	}
	
	@After
	public void afterScenario() throws Throwable
	{
		//driver.close();
		driver.quit();
	}


}
