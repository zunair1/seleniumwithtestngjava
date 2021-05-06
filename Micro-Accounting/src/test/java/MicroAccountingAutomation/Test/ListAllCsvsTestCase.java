package MicroAccountingAutomation.Test;
import MicroAccountingAutomation.Pages.HomePage;
import MicroAccountingAutomation.Pages.LoginPage;
import Utils.ExtentReport.ExtentTestManager;

import java.lang.reflect.Method;

import org.testng.annotations.Test;



public class ListAllCsvsTestCase extends TestRunner {
	
@Test(description="verify that if user can click on View CSVS", groups= {"Smoke","Regression"})
	public void ViewCsvs(Method method) {
	
	ExtentTestManager.startTest(method.getName(),"verify that if user can click on View CSVS");
	
		LoginPage loginObjectThree =  new LoginPage(driver);
		loginObjectThree.loginToMicroAccouting("test3@test.com", "test1234");
		HomePage homePageObjectTwo =  new HomePage(driver);
		homePageObjectTwo.clickViewCsvs();
		homePageObjectTwo.verifyAllCsvsListed();
	}

}
