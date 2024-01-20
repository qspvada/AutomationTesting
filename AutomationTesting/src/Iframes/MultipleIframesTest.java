package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframesTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to web page
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		//Click on Iframes
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		
		//Click on iframes
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		
		//Click on Multiple iframes
		driver.findElement(By.partialLinkText("Multiple")).click();
		Thread.sleep(2000);
		
		//Switch to iframe
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys("tamilpuri");
		Thread.sleep(2000);
		
		//Enter email
		driver.findElement(By.id("email")).sendKeys("puri.pongal@gmail.com");
		Thread.sleep(2000);
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("puri@potato");
		Thread.sleep(2000);
		
		//Click on sign up button
		driver.findElement(By.cssSelector("[type=submit")).click();
		
		//Switch back to parent frame
		driver.switchTo().parentFrame();
		
		//Switch to Login frame (iframe1)
		driver.switchTo().frame(0);
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys("nandan");
		
		
	}
}
