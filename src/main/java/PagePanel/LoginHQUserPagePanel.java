package PagePanel;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Pages.LoginHQUserPage;
import Resource.BaseClass;

public class LoginHQUserPagePanel extends BaseClass
{
	LoginHQUserPage loginHQUserPage = new LoginHQUserPage();
	
	public LoginHQUserPagePanel() 
	{
		loginHQUserPage = PageFactory.initElements(driver, LoginHQUserPage.class);
	}
	
	public void enterUserName(String str) throws Throwable
	{
		System.out.println("Entering username");
		loginHQUserPage.usernameTxtBox.click();
		Thread.sleep(1000);
		loginHQUserPage.usernameTxtBox.clear();
		Thread.sleep(1000);
		loginHQUserPage.usernameTxtBox.sendKeys(str);
	}
	
	public void enterPassword(String str)
	{
		loginHQUserPage.passwordTxtBox.sendKeys(str);
	}
	
	public void clickLoginBtn()
	{
		loginHQUserPage.loginBtn.click();		
	}
	
	public void clickOnSettingBtn()
	{
		loginHQUserPage.settingsBtn.click();
	}
	
	public void validateLogo() 
	{
		loginHQUserPage.logo.isDisplayed();
	}
	
	public void logout()
	{
		loginHQUserPage.logoutBtn.click();
	}
	
	public void validateLogout(String str)
	{
		String actualMsg1 = loginHQUserPage.logoutMsg.getText();
		System.out.println("Actual message is: "+actualMsg1);
		Assert.assertEquals(actualMsg1, str);
		
	}
	
	

}
