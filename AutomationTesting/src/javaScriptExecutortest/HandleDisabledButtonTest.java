package javaScriptExecutortest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledButtonTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("jdk-8u391-linux-aarch64.rpm")).click();
	
	    Thread.sleep(2000);
	    
	    WebElement disabledButton = driver.findElement(By.partialLinkText("Download jdk-8u391-linux-aarch64.rpm"));
	
	    JavascriptExecutor je=(JavascriptExecutor) driver;
	
	    je.executeScript("arguments[0].click();", disabledButton);
	
	}
}
