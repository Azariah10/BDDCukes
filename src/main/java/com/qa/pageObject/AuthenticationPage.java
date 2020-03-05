package com.qa.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Random;

public class AuthenticationPage {

	Random ran = new Random();
	 public WebDriver driver;

	 public AuthenticationPage(WebDriver driver) {
	 	this.driver = driver;
	 }
	 	By heading = By.xpath("//h1[@class='page-heading']");
	 	By email = By.xpath(" //input[@id='email_create']");
	 	By button = By.xpath("//form[@id='create-account_form']//span[1]");
	 	
	 	
	 	public void pageValidation(){

	 		String text = driver.findElement(heading).getText();
			Assert.assertEquals(text, "AUTHENTICATION");
	 	}
	 	
	 	
	 	public void setEmail() {
	 		for (int i = 0; i<1; i++){
              String mail = "ecomm"+ran.nextInt(1000)+ "@yopmail.com";
              System.out.println(mail);
				driver.findElement(email).sendKeys(mail);
			}

	 	}
	 	
	 	public void clickCreateAccountButton() {
	 		driver.findElement(button).click();
	 	}
	 	
	 }
