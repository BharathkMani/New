package Utilities;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport 
{
	
public static void extent(String testname) throws IOException {
ExtentHtmlReporter report= new ExtentHtmlReporter("./ExtentReport/Report.html");
ExtentReports extent=new ExtentReports();

extent.attachReporter(report);
ExtentTest logger=extent.createTest(testname);
logger.log(Status.INFO, testname);
extent.flush();
		/*
		 * ExtentTest logger1=extent.createTest(testname); logger1.pass("pass case",
		 * MediaEntityBuilder.createScreenCaptureFromPath("./Screenshots/"+testname+
		 * ".jpeg").build()); extent.flush();
		 */
}

}
