package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://bookmyshow.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Chennai");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//strong[text()='Chennai']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@alt='Chandramukhi 2']")).click();
	    
	}
}
