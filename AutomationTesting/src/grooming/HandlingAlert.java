package grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/alert/prompt");
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("yes");
		
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		driver.quit();
	}
}
