package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {


	@Test(groups = "Smoke")
	public void registerTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Reporter.log("Register Priority smoke",true);
		
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
	@Test(groups = "ST")
	public void paymentTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Payment ST",true);
		Thread.sleep(2000);
		driver.quit();
	}
}
