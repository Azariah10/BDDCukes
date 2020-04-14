package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TShirtPage {
	public WebDriver driver;
	
	public TShirtPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By shirt = By.xpath("//a[@class='product_img_link']//img[@class='replace-2x img-responsive']");
	By clour = By.xpath("//a[@id='color_14']");
	By cart = By.xpath("//span[contains(text(),'Add to cart')]");
	By price = By.xpath("//span[@id='our_price_display']");
	By plus = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']//span");
	By size = By.xpath("//select[@id='group_1']");
	By cont = By.xpath("//span[@class='continue btn btn-default button exclusive-medium']//span[1]");
	By ptocheckout = By.xpath("//span[contains(text(),'Proceed to checkout')]");
	By searchbutton = By.xpath("//button[@name='submit_search']");
	 By searchfield = By.xpath("//input[@id='search_query_top']");
	
	public boolean verifyPageWithPrice() {
		
		return driver.findElement(price).isDisplayed();
	}
	
	public void clickProductImage() {
		
		driver.findElement(shirt).click();
	}
	
	public void clickCart() {
		
		driver.findElement(cart).click();
	}
	
	public void selectMediumSize() {
		
		Select select = new Select(driver.findElement(size));
		select.selectByValue("2");
	}
	
public void selectLargeSize() {
		
		Select select = new Select(driver.findElement(size));
		select.selectByValue("3");
	}
	
	public void selectColur() {
		
		driver.findElement(clour);
	}
	public void continueShopping() {
		driver.findElement(cont).click();
	}
	
	public void increaseQuantity() {
		
		for( int i=1; i<3; i++) {
			driver.findElement(plus).click();
		}
	}
	
	public void proceedToCheckout() {
		driver.findElement(ptocheckout).click();
		
	}
	public void searchforTshirt() {
		driver.findElement(searchfield).sendKeys("t-shirt");
		//driver.findElement(searchfield).sendKeys(Keys.DOWN);
		driver.findElement(searchbutton).click();
	}

}
