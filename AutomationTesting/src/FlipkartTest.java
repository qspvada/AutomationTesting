

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://flipkart.com");
		try {
		driver.findElement(By.xpath("//span[@role='button']")).click();
		}
		catch(Exception e) {
			System.out.println("Pop up not found");
		}
		driver.findElement(By.name("q")).sendKeys("men footwear");
		
		driver.findElement(By.xpath("//button")).click();
		
		driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/image/612/612/xif0q/sandal/t/z/s/11-sl03-amico-tan-original-imagynhszm47hyv7-bb.jpeg?q=70']")).click();
	
		Set<String> childWindows = driver.getWindowHandles();
		
		for(String childwindow: childWindows) {
			driver.switchTo().window(childwindow);
			if(driver.getCurrentUrl().contains("density-men-olive-sports")) {
				break;
			}
		}
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		//je.executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//span[text()='Frequently Bought Together']")) );
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/div/input")).sendKeys("cutting@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/div/input")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Enter Mobile number']/../../input")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/div/input")).submit();
	}
}
