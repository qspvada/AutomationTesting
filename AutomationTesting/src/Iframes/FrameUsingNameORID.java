package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameUsingNameORID {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		
		//Switch to frame using name
		driver.switchTo().frame("demo_parent_iframe");
		Thread.sleep(2000);		
		
		driver.findElement(By.id("u_5_5")).click();
	
		//Switch to frame using id
		driver.switchTo().frame("iframe1");
		
		Thread.sleep(2000);		
		driver.findElement(By.id("u_5_6")).click();
	}
}
