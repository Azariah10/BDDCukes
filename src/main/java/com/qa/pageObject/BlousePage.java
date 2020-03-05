package com.qa.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BlousePage {

	public WebDriver driver;
	
	public BlousePage (WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public BlousePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	By blouse = By.xpath("//h1[contains(text(),'Blouse')]");
	
	By sizes = By.xpath("//select[@id='group_1']");
	By colour = By.xpath("//a[@id='color_8']");
	By add = By.xpath("//span[contains(text(),'Add to cart')]");
	By checkout = By.xpath("//span[contains(text(),'Proceed to checkout')]");
	
	
	
	public String verifyPage(){
		
		
		return driver.findElement(blouse).getText();
		
	}
	
	public void changeItemSize() {
		Select size = new Select(driver.findElement(sizes));
		size.selectByVisibleText("L");
			
	}
	
	public void selectColour() {
		
		driver.findElement(colour).click();
	}
	
	
	public void addToCart() {
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		   //js.executeScript("arguments[0].scrollIntoView();", add);
		driver.findElement(add).click();
	}
	
	public void proceedToCheckout() {
			
			driver.findElement(checkout).click();
			
	}
}
