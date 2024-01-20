package MulipleWindowsTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demoapps.qspiders.com/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.id("browserButton2")).click();
		
		String parent=driver.getWindowHandle();
		
		Set<String> childWindows = driver.getWindowHandles();
		
		childWindows.remove(parent);
		
		for (String child : childWindows) {
			driver.switchTo().window(child);
			if(driver.getTitle().contains("Sign")) {
				Thread.sleep(2000);
				driver.findElement(By.id("username")).sendKeys("manikandan");
				Thread.sleep(2000);
				driver.findElement(By.id("email")).sendKeys("mani@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.id("password")).sendKeys("mani@143");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[type=submit]")).click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				break;
			}
		}
		
		for (String child : childWindows) {
			driver.switchTo().window(child);
			
			if(driver.getTitle().contains("Login")) {
				Thread.sleep(2000);
				driver.findElement(By.id("username")).sendKeys("manikandan");
				Thread.sleep(2000);
				driver.findElement(By.id("password")).sendKeys("mani@143");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[type=submit]")).click();
			}
		}
	}
	
}
