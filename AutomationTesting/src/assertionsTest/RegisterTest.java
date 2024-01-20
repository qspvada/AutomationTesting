package assertionsTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterTest {

	@Test
	public void registerTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Identify Register link
		WebElement registerLink = driver.findElement(By.linkText("Log in"));
		
		//Verify Register link is displayed
        Assert.assertTrue(registerLink.isDisplayed(), "Register link is not displayed");
        
        //Click on Register link
        registerLink.click();
        
        //Get the text of Page heading
        String actualResult = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        
        //Verify Register page is displayed
        Assert.assertEquals(actualResult, "Register");
        
        //Close the browser
        driver.quit();
        
        Reporter.log("Test case completed",true);
	}
}
