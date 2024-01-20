package assertionsTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertTest {

	@Test
	public void loginTest() throws InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to webpage
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		//Click on Login link
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		//Enter email
		driver.findElement(By.id("Email")).sendKeys("nandanms@gmail.com");
		Thread.sleep(2000);
		
		//Enter password
		driver.findElement(By.id("Password")).sendKeys("nandan@1234");
		Thread.sleep(2000);
		
		//Click on Login Button
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		Thread.sleep(2000);

		//Verify the user is logged in to the application
		boolean actualResult = driver.findElement(By.linkText("Log out")).isDisplayed();
		
		boolean expectedResult=false;
		
		//HardAssert
		Assert.assertEquals(actualResult, expectedResult);
		
		//Hard assert with error message
//		Assert.assertEquals(actualResult, expectedResult,"Log out link is not displayed");
		
//		Assert.assertTrue(actualResult,"Log Out link is not displayed");

//		Assert.assertFalse(actualResult,"Log Out link is not displayed");
		
//		Assert.fail("Intentionally failing the test scripts");
		
		driver.quit();

	Reporter.log("Test case completed",true);
		
	}
}
