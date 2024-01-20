package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("Connect to databse",true);	
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Close connection to database",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before test",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After test",true);	
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before class",true);
		String browser=FileUtility.getProperty("browser");
		String url=FileUtility.getProperty("url");
		
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("After class",true);
		driver.quit();
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("Log out");
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Login");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(FileUtility.getProperty("email"));
		
		driver.findElement(By.id("Password")).sendKeys(FileUtility.getProperty("password"));
		
		driver.findElement(By.cssSelector("[value='Log in']")).click();
	}
	
}
