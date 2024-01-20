package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitTest {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(100));
		
		driver.get("https://www.shoppersstack.com/");
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBt")));
//		driver.findElement(By.id("loginBt")).click();
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Email")));
		driver.findElement(By.id("Email")).sendKeys("anirudh@gmail.com");
		
		
	}
}
