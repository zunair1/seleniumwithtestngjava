package MicroAccountingAutomation.Test;
import MicroAccountingAutomation.Pages.*;
import Utils.ExtentReport.ExtentTestManager;

import org.testng.annotations.Test;
import java.lang.reflect.Method;


public class updateSettingsTestCase extends TestRunner{
	
@Test(description="verify that if user can update its username in Settings", groups= {"Smoke","Regression"})
	public void updateUserNameOnSettingsPage(Method method) {
	
	ExtentTestManager.startTest(method.getName(),"verify that if user can update its username in Settings");
		LoginPage loginObject =  new LoginPage(driver);
		loginObject.loginToMicroAccouting("test3@test.com", "test1234");
		loginObject.clickOnUserProfile();
		UserSettingsPage updateUsernameObject =  new UserSettingsPage(driver);
		updateUsernameObject.clickSettingsButton();
		updateUsernameObject.userSettingUserName("Michal");
		
		
	}

}
