package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {

	public WebDriver driver;

	public DressesPage(WebDriver driver) {

		this.driver = driver;
	}

	public DressesPage() {

		PageFactory.initElements(driver, this);
	}

	//@FindBy(xpath = "//img[@alt='Blouse']")
	//WebElement blouse;

	By addtocart = By.xpath("//span[contains(text(),'Add to cart')]");
	By ptocheckout = By.xpath("//span[contains(text(),'Proceed to checkout')]");
	By blouse = By.xpath("//img[@alt='Blouse']");

	public void hoverOnImageAndClick() {
		Actions hover = new Actions(driver);
	//	hover.moveToElement(blouse).build().perform();
		driver.findElement(addtocart).click();

	}

	public void clickProceedToCheckout() {

		driver.findElement(ptocheckout).click();
	}

	public void selectItem() {
		
	}
	
	
	public  void clickOnBlouseImage() {
			driver.findElement(blouse).click();
			
		}
		
	

}
