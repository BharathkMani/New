package Com.qa.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pom.pack.Log_in;
import com.pom.pack.Printer;
import com.pom.pack.homepage;
import BaseClass.TestBase;
import Utilities.ExtentReport;

public class Hometest extends TestBase{
	Log_in lo;
	homepage home;
	Printer print;
	public Hometest() throws Exception {
		super();
	}
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		lo=new Log_in();
		lo.log(prop.getProperty("username"), prop.getProperty("password"));
		home=new homepage();
	}
	@Test
	public void homet() throws Exception {
		print=home.homeaction();
		//ExtentReport.extent(this.getClass().getName());
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
