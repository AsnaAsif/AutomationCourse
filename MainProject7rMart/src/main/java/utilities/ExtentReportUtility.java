package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	
	//this is for get HTML report of testing details 
	
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() // sumchorized to avoid overlap during multiple running
	{

		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");

		reporter.config().setReportName("7rMartProject");

		extentReports.attachReporter(reporter);

		extentReports.setSystemInfo("Organization", "Obsqura");

		extentReports.setSystemInfo("Name", " Asna Mohamed Asif "); 

		return extentReports;

	}



}
