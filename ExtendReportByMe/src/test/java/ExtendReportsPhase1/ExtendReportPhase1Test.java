package ExtendReportsPhase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReportPhase1Test {
	public ExtentReports reports;
	public ExtentTest test;

	@BeforeClass
	public void extendReportSetup() {

		reports = new ExtentReports(System.getProperty("user.dir") + "/ExtentReportResults.html");

		test = reports.startTest("ExtendBasic");

	}

	@Test
	public void Testcase() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		String pagetitle = d.getTitle();
		System.out.println(pagetitle);
		if(d.getTitle().equals("Amazon.com. Spend less. Smile more."))
		{
		test.log(LogStatus.PASS, "Navigate to correct URL");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Not Navigating to correct URL");
		}
	}
	
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		String pagetitle = d.getTitle();
		System.out.println(pagetitle);
		if(d.getTitle().equals("Amazon.com. Spend less. Smile more."))
		{
		test.log(LogStatus.PASS, "Navigate to correct URL");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Not Navigating to correct URL");
		}	
	}

	@AfterClass
	public void extendreportend() {
		reports.endTest(test);
		reports.flush();
	}
}
