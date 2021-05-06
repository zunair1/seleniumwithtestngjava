package MicroAccountingAutomation.Test;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import MicroAccountingAutomation.Pages.HomePage;
import MicroAccountingAutomation.Pages.LoginPage;
import MicroAccountingAutomation.Pages.SearchCsvsPage;
import Utils.ExtentReport.ExtentTestManager;

public class SearchCsvsTestCase extends TestRunner {
	@Test(description="verify that if user can click on search CSVS", groups= {"Smoke","Regression"})
	public void ViewCsvs(Method method) throws InterruptedException {
	
	ExtentTestManager.startTest(method.getName(),"verify that if user can click on View CSVS");
	
		LoginPage loginObjectThree =  new LoginPage(driver);
		loginObjectThree.loginToMicroAccouting("test3@test.com", "test1234");
		HomePage homePageObjectTwo =  new HomePage(driver);
		homePageObjectTwo.clickViewCsvs();
		homePageObjectTwo.verifyAllCsvsListed();
		SearchCsvsPage searchcsvsObj = new SearchCsvsPage(driver);
		searchcsvsObj.selectFilterDates();
	}


}
