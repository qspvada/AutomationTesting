package grooming;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindodwsTest {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/4");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allWindow = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String child : allWindow) {
			driver.switchTo().window(child);
			String url=driver.getCurrentUrl();
			
			if(url.contains("flipkart.com")) {
				//driver.close();
				break;
			}
		}
		
		driver.switchTo().window(parent);
		driver.close();
		
		//driver.manage().window().maximize();
		
		//driver.switchTo().window(null)
		
		
		
	}
}
