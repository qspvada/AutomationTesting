package testNGBasics;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.FileUtility;

public class RegisterationTest {

	@DataProvider(name="register")
	public String[][] registerData() throws EncryptedDocumentException, IOException {
		
		return FileUtility.readRowDataFromExcel("register");
	}
	
	@Test(dataProvider ="register" )
	public void registerTest_001( String firstName, String lastName, String email,String password, String confirmPassword) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		//Click on Register link
		driver.findElement(By.linkText("Register")).click();
		
		//Click on male radio button
		driver.findElement(By.id("gender-male")).click();
		
		//Enter Firstname
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		
		//Enter last name
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		
		//Enter email
		driver.findElement(By.id("Email")).sendKeys(email);
		
		//Enter password
		driver.findElement(By.id("Password")).sendKeys(password);
		
		//Enter confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		
		//Click on Register button
		driver.findElement(By.id("register-button")).click();
		
		driver.quit();
		
	}
}
