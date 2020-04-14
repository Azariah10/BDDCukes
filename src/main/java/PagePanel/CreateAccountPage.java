package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAccountPage {

	public WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	public String validatePageTitle() {

		return driver.getTitle();
	}

	By radiobutton = By.xpath("//input[@id='id_gender2']");
	By name = By.xpath("//input[@id='customer_firstname']");
	By lastname = By.xpath("//input[@id='customer_lastname']");
	By email = By.xpath("//input[@id='customer_lastname']");
	By password = By.xpath("//input[@id='passwd']");
	By drpday = By.xpath("//select[@id='days']");
	By drpMonth = By.xpath("//select[@id='months']");
	By drpYear = By.xpath("//select[@id='years']");
	By company = By.xpath("//input[@id='company']");
	By addressa = By.xpath("//input[@id='address1']");
	By addressb = By.xpath("//input[@id='address2']");
	By city = By.xpath("//input[@id='city']");
	By zipcode = By.xpath("//input[@id='postcode']");
	By drpstate = By.xpath("//select[@id='id_state']");
	By country = By.xpath("//select[@id='id_country']");
	By other = By.xpath("//textarea[@id='other']");
	By homphone = By.xpath("//input[@id='phone']");
	By mobile = By.xpath("//input[@id='phone_mobile']");
	By alias = By.xpath("//input[@id='alias']");
	By register = By.xpath("//span[contains(text(),'Register')]");
	By error = By.xpath("//p[contains(text(),'There are 8 errors')]");




	public void setValidCredentials(){

		//WebElementUtils.waitForVisible((WebElement) radiobutton);
		driver.findElement(radiobutton).click();
		driver.findElement(name).sendKeys("cucumber");
		driver.findElement(lastname).sendKeys("cucumber");
		driver.findElement(password).sendKeys("adminadmin");

		Select select = new Select(driver.findElement(drpday));
		select.selectByValue("10");
		Select sel = new Select(driver.findElement(drpMonth));
		sel.selectByValue("3");
		Select se = new Select(driver.findElement(drpYear));
		se.selectByValue("1996");
		driver.findElement(addressa).sendKeys("19 Thy kINGDOM Cometh");
		driver.findElement(addressb).sendKeys("Everlasting Lane");
		driver.findElement(company).sendKeys("Cov Ass Global Ltd");
		driver.findElement(city).sendKeys("lAGOS State");

		Select state = new Select(driver.findElement(drpstate));
		state.selectByValue("4");
		driver.findElement(zipcode).sendKeys("10004");

		//Select country = new Select(driver.findElement(addressa));
		//country.selectByValue("21");

		driver.findElement(other).sendKeys("Extra Info");

		driver.findElement(homphone).sendKeys("02093932933");
		driver.findElement(mobile).sendKeys("076555444545");

		driver.findElement(alias).sendKeys("kINGDOM Cometh");


	}


	public void setInValidCredentials(){
		driver.findElement(radiobutton).click();
		driver.findElement(name).sendKeys("83012129191938");
		driver.findElement(lastname).sendKeys("*))(**((");
		driver.findElement(password).sendKeys("adm*72721");

		Select select = new Select(driver.findElement(drpday));
		select.selectByValue("10");

		Select sel = new Select(driver.findElement(drpMonth));
		sel.selectByValue("3");

		Select se = new Select(driver.findElement(drpYear));
		se.selectByValue("1996");

		driver.findElement(addressa).sendKeys("19 Thy kINGDOM Cometh");
		driver.findElement(addressb).sendKeys("Everlasting Lane");
		driver.findElement(company).sendKeys("Cov Ass Global Ltd");
		driver.findElement(city).sendKeys("lAGOS State");

		Select state = new Select(driver.findElement(drpstate));
		state.selectByValue("4");
		driver.findElement(zipcode).sendKeys("10004");


		driver.findElement(other).sendKeys("Extra Info");

		driver.findElement(homphone).sendKeys("02093932933");
		driver.findElement(mobile).sendKeys("076555444545");

		driver.findElement(alias).sendKeys("kINGDOM Cometh");


	}

	public void verifyUrl(){
       String exp = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
		Assert.assertEquals(driver.getCurrentUrl(), exp);
	}
	public void verifyPageTitle(){

		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - My Store");
	}



	public void clickRegisterButton() throws InterruptedException {
		driver.findElement(register).click();
		Thread.sleep(3000);
	}

	public String errorMessage() {

		return driver.findElement(error).getText();
	}

}
