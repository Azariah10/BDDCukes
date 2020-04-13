package PagePanel;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Locators.LoginUserPage;
import Resource.BaseClass;

public class LoginUserPagePanel extends BaseClass
{
	LoginUserPage loginUserPage = new LoginUserPage();
	
	public LoginUserPagePanel()
	{

		loginUserPage = PageFactory.initElements(driver, LoginUserPage.class);
	}
	
	public void enterUserName(String str) throws Throwable
	{
		System.out.println("Entering username");
		loginUserPage.usernameTxtBox.click();
		Thread.sleep(1000);
		loginUserPage.usernameTxtBox.clear();
		Thread.sleep(1000);
		loginUserPage.usernameTxtBox.sendKeys(str);
	}
	
	public void enterPassword(String str)
	{
		loginUserPage.passwordTxtBox.sendKeys(str);
	}
	
	public void clickLoginBtn()
	{
		loginUserPage.loginBtn.click();
	}
	
	public void clickOnSettingBtn()
	{
		loginUserPage.settingsBtn.click();
	}
	
	public void validateLogo() 
	{
		loginUserPage.logo.isDisplayed();
	}
	
	public void logout()
	{
		loginUserPage.logoutBtn.click();
	}
	
	public void validateLogout(String str)
	{
		String actualMsg1 = loginUserPage.logoutMsg.getText();
		System.out.println("Actual message is: "+actualMsg1);
		Assert.assertEquals(actualMsg1, str);
		
	}

	public void validateFailedLogin(String str){

		String actualMsg = loginUserPage.validationMsg.getText();
		Assert.assertEquals(actualMsg, str);

	}
	

}
