package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterTest {

	@Test
	public void registerTest1() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("register test 1",true);
		driver.quit();
	}
	
	//To disable the execution of this method
	@Test(enabled = false)
	public void registerTest2() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("register test 2",true);
		driver.quit();
	}
	
	@Test(enabled = true)
	public void registerTest3() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("register test 3",true);
		driver.quit();
	}
	
	@Test(enabled = true)
	public void registerTest4() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("register test 4",true);
		driver.quit();
	}
	
	//To disable the execution of this method
	@Test(enabled = false)
	public void registerTest5() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("register test 5",true);
		driver.quit();
	}
}
