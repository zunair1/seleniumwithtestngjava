package MicroAccountingAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class LoginPage {
    /**
     * All WebElements are identified by @FindBy annotation
     */
	
	//Positive Scenario - login
    WebDriver driver;
    @FindBy(name="email")
    WebElement userLoginEmail;
    @FindBy(name="password")
    WebElement userLoginPassword;    
    @FindBy(className="btn-1")
    WebElement login;
    
    //Positive Scenario - logout
    @FindBy(xpath="//*[@src ='img/user-icon.jpg']")
    WebElement userProfileImage;
    
    @FindBy(xpath="//li[contains(text(),'log out')]")
    WebElement logoutButton;
    
   //Negative Scenario - login
    @FindBy(className="alert-danger")
    WebElement loginFailure;
    
    
    public LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
    	userLoginEmail.sendKeys(strUserName);     
    }
    //Set password in password textbox
    public void setPassword(String strPassword){
    	userLoginPassword.sendKeys(strPassword);
    }
    //Click on login button
    public void clickLogin(){
            login.click();
    }
   
    
    public void loginToMicroAccouting(String strUserName,String strPassword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPassword);
        //Click Login button
        this.clickLogin();
        
    }
    //logout function
    public void clickOnUserProfile() {
    	userProfileImage.click();
    }
    
    public void logoutFromMicroAccounting() {
    	userProfileImage.click();
    	logoutButton.click();
    }
    
    //Negative test case - login failure function
    public void loginFailureOnWrongCredentials() {
    	String invalidCredentials = loginFailure.getText();
    	Assert.assertEquals(invalidCredentials, "Invalid Credentials");
    }
}