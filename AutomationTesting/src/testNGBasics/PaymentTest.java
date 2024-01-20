package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PaymentTest {

	@Test
	public void paymentTest1() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("payment test 1",true);
		driver.quit();
	}
	
	@Test
	public void paymentTest2() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("payment test 2",true);
		driver.quit();
	}
	
	@Test
	public void paymentTest3() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("payment test 3",true);
		driver.quit();
	}
}
