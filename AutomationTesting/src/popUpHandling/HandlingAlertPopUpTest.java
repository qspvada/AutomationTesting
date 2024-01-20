package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUpTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the brwoser
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to url
		driver.get("https://demoapps.qspiders.com/alert");
		
		//click on Alert Box button
		driver.findElement(By.id("buttonAlert2")).click();
		
		Thread.sleep(2000);
		
		//Switch to Simple alert and click on accept
//		driver.switchTo().alert().accept();
		
		//Switch to Simple alert and click on dismiss
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		//Click on Confirm link
		driver.findElement(By.linkText("Confirm")).click();
		Thread.sleep(2000);
		
		//Click on Confirm Box button
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		
		//Switch to alert and get the text
		System.out.println(driver.switchTo().alert().getText());
		
		//Switch to Confirm alert and click on Okay button
//		driver.switchTo().alert().accept();
		
		//Switch to alert and click on Cancel button
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		//Click on prompt link
		driver.findElement(By.linkText("Prompt")).click();
		Thread.sleep(2000);
		
		//Click on Prompt alert button
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		
		//Switch to alert and enter "yes" in the alert text field
		driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(2000);
		
		//Switch to alert and click on Okay button
		driver.switchTo().alert().accept();
	}
}
