package javaScriptExecutortest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(3000);
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
//		//Scroll down the window by 500PX
//		je.executeScript("window.scrollBy(0,500);");
//		
//		Thread.sleep(3000);
//		je.executeScript("window.scrollBy(0,500);");
//		
//		Thread.sleep(3000);
//		je.executeScript("window.scrollTo(0,3000)");
//		
//		
		WebElement downloadLink = driver.findElement(By.partialLinkText("jdk-8u391-linux-aarch64.rpm"));
		
		je.executeScript("arguments[0].scrollIntoView(true);", downloadLink);
		
	}
}
