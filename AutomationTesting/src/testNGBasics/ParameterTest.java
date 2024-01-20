package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	@Parameters({"browser","URL","email","password"})
	@Test
	public void loginTest_003(String browser,String url,  String email, String password) {
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		//Maximize browser
		driver.manage().window().maximize();
		//Enter URL
		driver.get(url);
		//Enter email
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
