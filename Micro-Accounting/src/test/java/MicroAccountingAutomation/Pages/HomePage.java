package MicroAccountingAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
    @FindBy(className="alert-success")
    WebElement userHomePage;
    
    @FindBy(partialLinkText="View cs")
    WebElement viewCsvsOnHomePage;
    
    @FindBy(partialLinkText="+ New")
    WebElement listOfAllCsvsPage;
    
    
    public HomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    //Click on login button
    public void verifyLoggedInSuccessfully(){
            Assert.assertTrue(userHomePage.isDisplayed());
    }  
    
    public void clickViewCsvs() {
    	viewCsvsOnHomePage.click();
    }
    
    public void verifyAllCsvsListed(){
    	String textOfNewButton = listOfAllCsvsPage.getText();
        Assert.assertEquals(textOfNewButton, "+ New");
    }
    
}
