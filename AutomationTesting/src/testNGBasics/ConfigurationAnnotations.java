package testNGBasics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("Before suit",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite",true);
	}
	
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("After test",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before class",true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("After class",true);
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("After method",true);
	}
	
	@Test
	public void test1() {
		Reporter.log("Test case 1",true);
	}
	
	@Test
	public void test2() {
		Reporter.log("Test case 2",true);
	}
	
	@Test
	public void test3() {
		Reporter.log("Test case 3",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before method",true);
	}
	
	
	
	
}
