package MicroAccountingAutomation.Test;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

import MicroAccountingAutomation.Pages.*;
import Utils.ExtentReport.ExtentTestManager;

public class UploadCsvsTestCase extends TestRunner {
	
	@Test(description="verify that if user can upload a csv file", groups= {"Smoke","Regression"})
	public void uploadCsvsFile(Method method) {
		
		ExtentTestManager.startTest(method.getName(),"verify that if user can upload a csv file");
		
		LoginPage loginObject =  new LoginPage(driver);
		loginObject.loginToMicroAccouting("test3@test.com", "test1234");
		HomePage homePageObj = new HomePage(driver);
		homePageObj.clickViewCsvs();
		UploadCsvPage uploadCsvObj = new UploadCsvPage(driver);
		uploadCsvObj.clickNewCsvsButton();
		uploadCsvObj.clickUploadButton();
		

	}
}
