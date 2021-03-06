package Com.qa.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.pack.Address;
import com.pom.pack.Log_in;
import com.pom.pack.Printer;
import com.pom.pack.homepage;

import BaseClass.TestBase;
import Utilities.ExtentReport;

public class Printertest extends TestBase {
	Log_in lo;
	homepage home;
	Printer print;
	Address addres;
	public Printertest() throws Exception {
		super();
	}
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		lo=new Log_in();
		lo.log(prop.getProperty("username"), prop.getProperty("password"));
		home=new homepage();
		home.homeaction();
		print=new Printer();
	}
	@Test
	public void data() throws Exception {
		 print.products();
	//	ExtentReport.extent(this.getClass().getName());
	}
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}
	
}
