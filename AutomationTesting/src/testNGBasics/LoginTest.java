package testNGBasics;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.FileUtility;

public class LoginTest {

	
	@DataProvider
	public String[][] loginData() throws EncryptedDocumentException, IOException{
		return FileUtility.readRowDataFromExcel("login");
	}
	
	@Test(dataProvider = "loginData")
	public void loginTest1(String email, String password) {
		WebDriver driver=new ChromeDriver();
		Reporter.log("login test 1",true);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		
		
		
		driver.quit();
	}
}
//	
//	@Test
//	public void loginTest2() {
//		WebDriver driver=new ChromeDriver();
//		Reporter.log("login test 2",true);
//		driver.quit();
//	}
//	
//	@Test
//	public void loginTest3() {
//		WebDriver driver=new ChromeDriver();
//		Reporter.log("login test 3",true);
//		driver.quit();
//	}
//	
//	@Test
//	public void loginTest4() {
//		WebDriver driver=new ChromeDriver();
//		Reporter.log("login test 4",true);
//		driver.quit();
//	}
//	
//	@Test
//	public void loginTest5() {
//		WebDriver driver=new ChromeDriver();
//		Reporter.log("login test 5",true);
//		driver.quit();
//	}
	

