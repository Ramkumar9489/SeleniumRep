package Reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public  class ExtentReportManager {
	
	
	
	 static ExtentReports reports;
	
	public static ExtentReports getReport()
	{
		if (reports==null)
		{
			 reports =new ExtentReports();
			 Date d=new Date();
			 String screenshotfolder=d.toString().replaceAll(":", "-")+"\\screenshots";
			 String path=System.getProperty("user.dir")+"//Reports//"+screenshotfolder;
			 String reportFolder=System.getProperty("user.dir")+"//Reports//"+d.toString().replaceAll(":", "-");
			
			 File f=new File(path);
			 f.mkdirs();
			ExtentSparkReporter sparkReporter=new ExtentSparkReporter(reportFolder);
			
			
			sparkReporter.config().setReportName("Demo Extent report");
			sparkReporter.config().setDocumentTitle("Automation Reports");
			sparkReporter.config().setTheme(Theme.STANDARD);
			sparkReporter.config().setEncoding("utf-8");
			reports.attachReporter(sparkReporter);
		}
		
		return reports;
		
	}
	
	

}
