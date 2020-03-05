package com.qa.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilities {
	
	public WebDriver driver;
	public static WebDriverWait wait;


    public utilities(WebDriver driver) {
	 this.driver=driver;
	}



	public static void scrollToElement(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",element);
    }
    
   
     
    public static void waitFor(long time){

        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void  wait_until_MobileElementIs_Clickable(WebDriver driver, By locator) {
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
}


}
