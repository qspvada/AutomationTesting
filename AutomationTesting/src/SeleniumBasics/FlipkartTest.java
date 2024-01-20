package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("men footwear");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/image/612/612/xif0q/sandal/t/z/s/11-sl03-amico-tan-original-imagynhszm47hyv7-bb.jpeg?q=70']")).click();
	
		
		Set<String> childWindows = driver.getWindowHandles();
		
		for(String childwindow: childWindows) {
			driver.switchTo().window(childwindow);
			if(driver.getCurrentUrl().contains("density-men-olive-sports")) {
				break;
			}
		}
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		je.executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//span[text()='Frequently Bought Together']")) );
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	}
}
