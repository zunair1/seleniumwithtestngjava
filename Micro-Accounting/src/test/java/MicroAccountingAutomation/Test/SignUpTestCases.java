package MicroAccountingAutomation.Test;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.util.Random;
import MicroAccountingAutomation.Pages.*;
import Utils.ExtentReport.ExtentTestManager;
 

public class SignUpTestCases extends TestRunner{
	
@Test(priority=1,description="Verify that User can SignUp with correct username,password and comfirm password", groups= {"Smoke", "Regression"})

	public void successfullUserSignUp(Method method){
	
		ExtentTestManager.startTest(method.getName(),"Verify that User can SignUp with correct username,password and comfirm password");
		Random rand = new Random();
		int upperbound = 1125;
		int int_random = rand.nextInt(upperbound);
		String UserName = "testHAA"+ int_random + "@test.com";
		SignUpPage SignUpObject =  new SignUpPage(driver);
		SignUpObject.clickSignUpUrl();
		SignUpObject.SignUpToMicroAccouting(UserName, "test1234", "test1234");
		
		}

}
