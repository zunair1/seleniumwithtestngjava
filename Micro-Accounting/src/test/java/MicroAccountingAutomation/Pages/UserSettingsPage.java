package MicroAccountingAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSettingsPage {
	
WebDriver driver;
	
    @FindBy(xpath="//li[contains(text(),'settings')]")
    WebElement settingsButton;
    
    @FindBy(name="userName")
    WebElement userNameOnSettingsPage;
    
    @FindBy(className="btn-3")
    WebElement saveButton;
    
    public UserSettingsPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    public void clickSettingsButton(){
    	settingsButton.click();
    }
    
    public void setUpdatedUserName(String updateUserName){
    	userNameOnSettingsPage.clear();
    	userNameOnSettingsPage.sendKeys(updateUserName);     
    }

    public void userSettingUserName(String updateUserName){
        //Fill user name
        this.setUpdatedUserName(updateUserName);
        saveButton.click();
        
    }
}
