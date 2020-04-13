package PagePanel;

import Locators.LoginUserPage;
import Locators.Tabs;
import Resource.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TabPanel extends BaseClass {

        Tabs tab = new Tabs();

	public TabPanel()
        {
            tab = PageFactory.initElements(driver, Tabs.class);
        }

        public void clickEverythingTab(){

	    tab.everythingTab.click();

	}

        public void clickTaskTab(){

	    tab.taskTab.click();

	}

         public void clickFilesTab(){

	    tab.filesTab.click();

	}

        public void clickFormsTab(){

	    tab.formsTab.click();

     }

        public void clickPublishTab(){

	    tab.publishTab.click();

	}

	public  void verifyPresenceOfTextEverythingTab(){

        Assert.assertTrue(tab.toDoTxt.isDisplayed());
    }

    public void verifyPresenceOfMyMenuTxt(){

	    Assert.assertTrue(tab.myMenuTxt.isDisplayed(), "Text not visible");
    }

    public  void  verifyPresenceOfFilesText(){

	    Assert.assertTrue(tab.filesTxt.isDisplayed());
    }

}
