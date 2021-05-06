package MicroAccountingAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCsvsPage {
	WebDriver driver;
	
	@FindBy(name="csvDates")
	 WebElement searchCsvsCalender;
	
	@FindBy(xpath="//span[contains(text(),'4')][1]")
	 WebElement startDate;
	
	@FindBy(xpath="//span[contains(text(),'28')][2]")
	 WebElement endDate;
	
	@FindBy(xpath="//button[contains(text(),'Filter')]")
	WebElement filterButton;
	
	public SearchCsvsPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
        
    }
	
	public void selectFilterDates() throws InterruptedException {
		searchCsvsCalender.click();
		startDate.click();
		Thread.sleep(2000);
		endDate.click();
	    filterButton.click();
		
	}
	

}
