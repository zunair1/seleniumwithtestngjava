package MicroAccountingAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadCsvPage {
	WebDriver driver;
	
    @FindBy(xpath="//a[contains(text(),'New')]")
    WebElement newCsvsAddButton;
    
    @FindBy(name="file")
    WebElement uploadFileButton;
    
    @FindBy(xpath="//button[contains(text(),'Submit')]")
    WebElement submitFileButton;
    
    public UploadCsvPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    public void clickNewCsvsButton() {
    	newCsvsAddButton.click();
    }
    
    public void clickUploadButton() {
    	String workingDir = System.getProperty("user.dir");
    	uploadFileButton.sendKeys(workingDir + "/testAksam.csv");
    	submitFileButton.click();
    	System.out.println(workingDir);
    }
    
    

}
