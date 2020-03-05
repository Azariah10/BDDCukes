package com.qa.pageObject;

import com.qa.resource.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage extends Base {
	

//	@FindBy (xpath = "//input[@id='email']")
	//WebElement username;
	
	//@FindBy (xpath = "//input[@id='passwd']")
	//WebElement password;
	
	//@FindBy (xpath = "//p[@class='submit']//span[1]")
	//WebElement button;
	  
	By uname = By.xpath("//input[@id='email']");
	By pword = By.xpath("//input[@id='passwd']");
	By button = By.xpath("//p[@class='submit']//span[1]");
	
		
	
	//public LoginPage() {
		//PageFactory.initElements(driver, this);
	//}
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 public void setUsername(String usernname)
		{
		 driver.findElement(uname).sendKeys(usernname);
		}
	 public void setPassword(String pwd)
		{
			driver.findElement(pword).sendKeys(pwd);
		}
	 public void clickBtton()
		{
			driver.findElement(button).click();
		}
	
	
	//public void setCredentials (String uname, String pwd) {
			
	//username.
	//password.sendKeys(pwd);
	//button.click();
	
//	return new HomePage();
	

	}

