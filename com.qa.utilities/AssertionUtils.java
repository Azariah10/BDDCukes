package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertionUtils {
	
	public static WebDriver driver;
	
    public AssertionUtils(WebDriver driver) {
		this.driver=driver;
	}

	public static void assertPresent(WebElement element) {
        waitForVisible(element);
        Assert.assertTrue(element.isDisplayed());
    }

    private static void waitForVisible(WebElement element) {
    }

    public static void assertNotPresent(WebElement element) {
        Assert.assertTrue(!element.isDisplayed());
    }

    public static void assertEquals(WebElement element, String actual, String expected) {
        waitForVisible(element);
        Assert.assertTrue(actual.contains(expected));
    }

    public static void assertEquals(WebElement element, String expected) {
        waitForVisible(element);
        Assert.assertTrue(element.getText().contains(expected));
    }

    public static  void assertPageTitle(String expected) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contentEquals(expected));
    }
}
