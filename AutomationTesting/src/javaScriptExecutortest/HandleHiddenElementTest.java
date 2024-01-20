package javaScriptExecutortest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenElementTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0,200);");
		
		Thread.sleep(2000);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		
		WebElement hiddenTF = driver.findElement(By.id("displayed-text"));
	
	    je.executeScript("arguments[0].value='Hey Prabhu';", hiddenTF);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("show-textbox")).click();
	}
}
