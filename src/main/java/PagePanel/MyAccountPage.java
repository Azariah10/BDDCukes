package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage {
 
	 public WebDriver driver;
	
	 
	 By link = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
	 By orderhistrory = By.xpath("//span[contains(text(),'Order history and details')]");
	 By creditslips = By.xpath("//span[contains(text(),'My credit slips')]");
	 By personalinfo = By.xpath(" //span[contains(text(),'My personal information')]");
	 By wishlist = By.xpath("//span[contains(text(),'My wishlists')]");
	 By searchfield = By.xpath("//input[@id='search_query_top']");
	 By searchbutton = By.xpath("//button[@name='submit_search']");
	 By tshirt =  By.xpath("//a[@title = 'T-shirts' and @href = 'http://automationpractice.com/index.php?id_category=5&controller=category']");
	 
	
	public MyAccountPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By heading = By.xpath("//h1[@class='page-heading']");
	
	public void getHeading() {
		
	String act = driver.findElement(heading).getText();
		Assert.assertEquals(act, "MY ACCOUNT");
	}
	
	
	public boolean verifyPresecnceOfTabs() {
		driver.findElement(orderhistrory).isDisplayed();
		driver.findElement(creditslips).isDisplayed();
		driver.findElement(personalinfo).isDisplayed();
		return driver.findElement(wishlist).isDisplayed();
		
	}
	
	public void searchforItem() {
		driver.findElement(searchfield).sendKeys("dresses");
		//driver.findElement(searchfield).sendKeys(Keys.DOWN);
		driver.findElement(searchbutton).click();
	}
	
	public void clickTshirtLink() {
		driver.findElement(tshirt).click();
	}

	public void searchforTshirt() {
		driver.findElement(searchfield).sendKeys("t-shirt");
		//driver.findElement(searchfield).sendKeys(Keys.DOWN);
		driver.findElement(searchbutton).click();
	}
}
