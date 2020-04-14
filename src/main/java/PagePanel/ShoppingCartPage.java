package PagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
	
	WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		
		this.driver =driver;
	}

	
	
	By title = By.xpath("//span[@class='navigation_page']");
	By msg = By.xpath("//p[@class='alert alert-warning']");
	
	By item = By.xpath("//td[@class='cart_description']//a[contains(text(),'Blouse')]");
	By price = By.xpath("//span[@id='total_price']");
	By trash = By.xpath("//i[@class='icon-trash']");
	By qty = By.xpath("//input[@name='quantity_1_3_0_236417']");
	
	public String verifyCartTitle() {
		
		return driver.findElement(title).getText();
	}
	
	
	public String statusMessage() {
		
		return driver.findElement(msg).getText();
	}
	
	public String verifyitemPresent() {
		
		return driver.findElement(item).getText();
	}
	
	public String verifyItemPrice() {
		
		return driver.findElement(price).getText();
	}
	
	public void deleteItem() {
		
		driver.findElement(trash).click();
	}
	
	public String VerifyQuantiy() {
		return driver.findElement(qty).getText();
		
	}
}


