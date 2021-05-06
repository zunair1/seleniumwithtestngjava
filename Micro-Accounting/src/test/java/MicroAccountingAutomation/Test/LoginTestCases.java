package MicroAccountingAutomation.Test;
import MicroAccountingAutomation.Pages.*;
import Utils.ExtentReport.ExtentTestManager;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LoginTestCases extends TestRunner{
	
	
@Test(priority=1,description="Verify that User can login with correct username and password", groups={"Smoke","Regression"})

public void successfullUserLogin(Method method){
	
	ExtentTestManager.startTest(method.getName(),"Verify that User can login with correct username and password");
	
	LoginPage loginObjectOne =  new LoginPage(driver);
	loginObjectOne.loginToMicroAccouting("test3@test.com", "test1234");
	HomePage homePageObjectOne =  new HomePage(driver);
	homePageObjectOne.verifyLoggedInSuccessfully();
	}


@Test(priority=2, description="verify that User can successfully logout", groups={"Smoke","Regression"})
public void successfullUserLogout(Method method) {
	
	ExtentTestManager.startTest(method.getName(),"verify that User can successfully logout");
	
	LoginPage loginObjectTwo =  new LoginPage(driver);
	loginObjectTwo.loginToMicroAccouting("test3@test.com", "test1234");
	loginObjectTwo.logoutFromMicroAccounting();
	} 


@Test(priority=3, description="verify that with wrong username and password user gets the Invalid Credentials warning", groups= {"Regression"})
public void loginFailureVerification() {
	LoginPage loginObject =  new LoginPage(driver);
	loginObject.loginToMicroAccouting("test3@test.com", "test123774");
	loginObject.loginFailureOnWrongCredentials();
	
}

}
 

