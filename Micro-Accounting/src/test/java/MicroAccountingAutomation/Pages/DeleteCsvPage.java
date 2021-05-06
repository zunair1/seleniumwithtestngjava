package MicroAccountingAutomation.Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeleteCsvPage {
	WebDriver driver;
	
	@FindBy(className="table")
    WebElement allCsvsTable;
	
	@FindBy(xpath="//div[contains(text(),'Csv deleted')]")
	WebElement deletionSuccessMessage;
	
	@FindBy(xpath="//a[contains(text(),'Delete')]")
	WebElement deleteButton;
	
	public DeleteCsvPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

	public void deleteCsv() {
		//WebElement table = allCsvsTable;
		//int numberOfdeleteButton = table.findElements(By.xpath("//a[contains(text(),'Delete')]")).size();
		/*for(int i = 0; i<numberOfdeleteButton;) {
			WebElement lastAppearedDeleteButton = table.findElements(By.xpath("//a[contains(text(),'Delete')]")).get(numberOfdeleteButton);
			lastAppearedDeleteButton.click();
			break;
		}*/
		deleteButton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals(deletionSuccessMessage.getText(), "Csv deleted");
		
	}
}
