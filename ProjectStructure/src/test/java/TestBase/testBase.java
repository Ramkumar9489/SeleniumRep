package TestBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Reports.ExtentReportManager;

public class testBase {
	
	
	public ExtentReports reports;
	public ExtentTest test;
	@BeforeMethod
	public void init(ITestResult result)
	{
		reports=ExtentReportManager.getReport();
		String testName=result.getMethod().getMethodName();
		test=reports.createTest(testName);
		
				
	}
	
	@AfterMethod
	public void flushreport()
	{
		reports.flush();
		
	}

}
