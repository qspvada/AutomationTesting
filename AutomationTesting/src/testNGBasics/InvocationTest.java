package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationTest {

	@Test(groups = "RT")
	public void addToCart() {
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("Add to cart Test RT",true);
		driver.quit();
	}
}
