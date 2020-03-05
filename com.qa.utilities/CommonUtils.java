package utilities;

import static utilities.WebElementUtils.waitForVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	private WebDriverWait wait;

	public static WebDriver driver;
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    public static void clickOnElement(WebElement element) {
        waitForVisible(element);
        element.click();
    }

    public static void sendKeysTo(WebElement element, String text){
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }
    public static void scrollToElement(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",element);
    }
    
}
