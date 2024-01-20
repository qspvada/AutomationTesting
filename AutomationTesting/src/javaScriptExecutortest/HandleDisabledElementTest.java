package javaScriptExecutortest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElementTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='Disabled']")).click();
		
		WebElement emailtextField = driver.findElement(By.id("email"));
		WebElement passowrdTextField = driver.findElement(By.id("password"));
		System.out.println(driver.findElement(By.id("name")).isEnabled());
	
		WebElement nameTextField = driver.findElement(By.id("name"));
   	
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].value='kamalakannan';", nameTextField,passowrdTextField,emailtextField);
	}
}
