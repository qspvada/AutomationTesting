package MulipleWindowsTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MuliWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to web page
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(2000);
		
		//Click on compare button
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
		
		//get the address / window handle of current window
		String parent = driver.getWindowHandle();
		
		//Get the address / window handle of all the windows
		Set<String> allID = driver.getWindowHandles();
		
		//Switch to window by using URL
		for (String child : allID) {
			driver.switchTo().window(child);
			Thread.sleep(2000);
			driver.close();
		}
//		
//		
//		//Click on all button in amazon child window
//		driver.findElement(By.id("nav-hamburger-menu")).click();
//		Thread.sleep(4000);
//		
//		
//		//Close all browsers
//		driver.close();
	}
}
