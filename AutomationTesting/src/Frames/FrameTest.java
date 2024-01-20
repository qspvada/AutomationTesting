package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch browser
		WebDriver driver=new  ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to web page
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(2000);
		//Click on Frames
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
	//Click on iframes
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		
		
		//Switch the driver focus to iframe 1
		driver.switchTo().frame(0);
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys("ajay");
		Thread.sleep(2000);
		//Enter password
		driver.findElement(By.id("password")).sendKeys("kamalakannan");
		Thread.sleep(2000);
		//Click on Login button
		driver.findElement(By.cssSelector("[type=submit]")).click();

		
	}
}
