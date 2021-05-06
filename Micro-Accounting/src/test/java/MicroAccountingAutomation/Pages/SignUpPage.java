package MicroAccountingAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpPage {
	
	WebDriver driver;
	
    @FindBy(className="signup")
    WebElement SignUpUrl;
    @FindBy(id="user_email")
    WebElement userSignUpEmail;
    @FindBy(name="passwordHash")
    WebElement userSignUpPassword;    
    @FindBy(name="password2")
    WebElement userReSignUpPassword;
    @FindBy(xpath="//button[contains(text(),'Sign Up')]")
    WebElement signUpButton;
    
    @FindBy(xpath="//div[contains(text(),\"You have registered successfully\")]")
    WebElement successfullSignUpMsgVerification;
    

    
    
    public SignUpPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    //Set user name in textbox
    public void setSignUpUserName(String strSignUpUserName){
    	userSignUpEmail.sendKeys(strSignUpUserName);     
    }
    //Set password in password textbox
    public void setSignUpPassword(String strSignUpPassword){
    	userSignUpPassword.sendKeys(strSignUpPassword);
    }
    //Set confirm password in password textbox
    public void setSignUpRePassword(String strSignUpRePassword){
    	userReSignUpPassword.sendKeys(strSignUpRePassword);
    }
    public void clickSignUpUrl(){
    	SignUpUrl.click();
    }
    //Click on login button
    public void clickSignUp(){
    	signUpButton.click();
    }  


    public void SignUpToMicroAccouting(String strSignUpUserName,String strSignUpPassword, String strSignUpRePassword){
        //Fill user name
        this.setSignUpUserName(strSignUpUserName);
        //Fill password
        this.setSignUpPassword(strSignUpPassword);
        //Fill Confirm password
        this.setSignUpRePassword(strSignUpRePassword);
        //Click SignUp Button
        this.clickSignUp();
        
        Assert.assertEquals(successfullSignUpMsgVerification.getText(), "You have registered successfully");
        
    }
}
