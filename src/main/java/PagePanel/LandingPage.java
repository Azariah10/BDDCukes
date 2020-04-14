package PagePanel;

import Resource.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPage extends BaseClass {
	public WebDriver driver;

	// @FindBy(xpath = "//a[@class='login']")
	// WebElement login;
	By login = By.xpath("//a[@class='login']");
	By image = By.xpath("//img[@class='logo img-responsive']");
	By cart = By.xpath("//b[contains(text(),'Cart')]");

	@FindBy(xpath = "//img[@title='Blouse']")
    WebElement productImage;
	@FindBy(xpath = "//a[@data-id-product ='2']")
    WebElement addToCart;
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement proceed;

	// By productImage = By.xpath("//img[@title='Blouse']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public boolean verifyImagePresent() {
		return driver.findElement(image).isDisplayed();

	}

	public void clickCart() {

		driver.findElement(cart).click();
	}

	// }

	public void clickLoginBtton() {
		 driver.findElement(login).click();
	}

	// public WebElement clickLoginButton() {
	// return login;

	public void hoverOnImage() {
		Actions hover = new Actions(driver);
		hover.moveToElement(productImage).build().perform();
		addToCart.click();

	}

	public void clickProceedToCheckout() {

		proceed.click();
	}

}
