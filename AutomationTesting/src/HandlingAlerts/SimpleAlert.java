package HandlingAlerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to web page
		driver.get("https://demoapps.qspiders.com/alert");
		
		//Click on AlertBox button
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(1000);
		
		//Handle simple alert
		driver.switchTo().alert().sendKeys("amul baby");
		Thread.sleep(1000);
		
//		//Click on Confirm link
//		driver.findElement(By.partialLinkText("Confirm")).click();
//		
//		//Click on Confirm Box button
//		driver.findElement(By.tagName("button")).click();
//		Thread.sleep(2000);
//		
//		//Print the text of confirm alert
//		System.out.println(driver.switchTo().alert().getText());
//		
//		//Click on the Cancel button of confirm alert
//		driver.switchTo().alert().dismiss();
//		
//		//Click on the prompt link
//		driver.findElement(By.linkText("Prompt")).click();
//		
//		//Click on the Prompt Alert Box button
//		driver.findElement(By.tagName("button")).click();
//		Thread.sleep(2000);
//		
//		//Enter "yes" in the alert text box 
//		driver.switchTo().alert().sendKeys("no");
//		
//		//Click on the Okay Button of alert
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		
		//Close the browser
		driver.quit();
	}
}
