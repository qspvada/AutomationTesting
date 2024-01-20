package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	@Test(groups = "Smoke")
	public void registerTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Reporter.log("Register depends Smoke",true);
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	@Test(groups = "RT")
	public void loginTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		Reporter.log("Login RT",true);
		Thread.sleep(2000);	
		driver.quit();
	}
	@Test(groups = "Smoke")
	public void paymentTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Payment Smoke",true);
		Thread.sleep(2000);
		driver.quit();
	}
	
	

	
	
}
