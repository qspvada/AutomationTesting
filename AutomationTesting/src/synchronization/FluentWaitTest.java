package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTest {

	public static void main(String[] args) {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to web page
		driver.get("https://www.shoppersstack.com/");
		
		//Create an Object of FluentWait
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		//Give time-out duration
		wait.withTimeout(Duration.ofSeconds(10));
		//Set polling time
		wait.pollingEvery(Duration.ofSeconds(1));
		//Ignore exception
		wait.ignoring(NoSuchElementException.class);
		
		//Wait until the condition satisfied
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
		
		//Click on login button
		driver.findElement(By.id("loginBtn")).click();
		
		
		
		
		//close browser
		driver.quit();
	}
}
