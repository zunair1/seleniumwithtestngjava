package MicroAccountingAutomation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utils.SendEmailOfReport.SendEmailOfExtentReport;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestRunner {
		 public WebDriver driver;
		 
@BeforeClass(groups= {"Smoke","Regression"})
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");     
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1400,800");  
        driver = new ChromeDriver(options);  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://microaccounttest.ihpapp.com");
		
			}

@AfterClass(groups= {"Smoke","Regression"})
	public void broweserClosure() {
	driver.close();
	}

@AfterSuite(groups= {"Smoke"})
@Parameters({"email","emailPassword"})
	public void sentEmail(String email,String emailPassword) {
	
	SendEmailOfExtentReport sendEmailOfExtentReportObj = new SendEmailOfExtentReport();
	sendEmailOfExtentReportObj.sendEmail(email,emailPassword);
	}

}
