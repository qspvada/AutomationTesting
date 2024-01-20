package grooming;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(10000);
		String parentId=driver.getWindowHandle();
		
		System.out.println(parentId);
		driver.findElement(By.id("compare")).click();
//		System.out.println(parentId);
		
		Thread.sleep(3000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		
		for(String str:allWindowId) {
			driver.switchTo().window(str);
			if(driver.getCurrentUrl().contains("flipkart.com")) {
				driver.manage().window().maximize();
				break;
			}
		}
		
		
//		Thread.sleep(2000);
//		driver.findElement(By.id("identifierId")).sendKeys("nandan@gmail.com");
//		Thread.sleep(2000);
	}
}
