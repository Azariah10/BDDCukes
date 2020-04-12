package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHQUserPage 
{
	@FindBy(name = "email")
	public WebElement usernameTxtBox;
	
	@FindBy(name = "password")
	public WebElement passwordTxtBox;
	
	@FindBy(name = "login")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id='root']/div/div[1]/nav/div[1]/div/div")
	public WebElement settingsBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	public WebElement logoutBtn;
	
	@FindBy(xpath = "//*[contains(text(),'You have been logged out of Concrete! Please close this window')]")
	public WebElement logoutMsg;
	
	@FindBy(className = "login-button")
	public WebElement logoutPageLoginBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Forgotten your password?')]")
	public WebElement forgetPass;
	
	@FindBy(xpath = "//*[contains(text(),'Terms & Conditions')]")
	public WebElement termsAndConditionLink;
	
	@FindBy (xpath = "//img")
	public WebElement logo;

	@FindBy (xpath = "//p[@id='error_box']")
	public WebElement validationMsg;
}
