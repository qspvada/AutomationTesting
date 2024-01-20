package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://Swiggy.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("location")).sendKeys("Chennai", Keys.ENTER);
		
		driver.findElement(By.xpath("//span[.='Chennai, Tamil Nadu, India']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Search']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys("Pandian");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Hotel Pandian']")).click();
		
		driver.findElement(By.xpath("//div[.='Hotel Pandian']")).click();
		
		Thread.sleep(2000);
		
		WebElement friedRice= driver.findElement(By.xpath("//h3[.='Chicken Fried Rice']/../.././..//div[.='ADD']"));
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		action.scrollToElement(friedRice);
		
		Thread.sleep(2000);
		friedRice.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='View Cart']")).click();
	}
}
