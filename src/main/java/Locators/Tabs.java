package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs {

    @FindBy(css = "[data-testid ='app-nav-button-Everything']")
    public WebElement everythingTab;

    @FindBy(xpath = "//div[contains(text(),'Tasks')]")
    public WebElement taskTab;

    @FindBy (xpath = "//div[contains(text(),'Files')]")
    public  WebElement filesTab;

    @FindBy(xpath = " //div[contains(text(),'Forms')]")
    public WebElement formsTab;

    @FindBy(xpath = "//div[contains(text(),'Publish')]")
    public WebElement publishTab;

    @FindBy(xpath = "//span[contains(text(),'To Do, latest')]")
    public WebElement toDoTxt;

    @FindBy (xpath = "//span[contains(text(),'My menu')]")
    public  WebElement myMenuTxt;

    @FindBy(xpath = "//div[@class='sc-AykKC sc-fzXfQW dRsOSY']")
    public  WebElement filesTxt;



}
