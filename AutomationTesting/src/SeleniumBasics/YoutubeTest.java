package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeTest {
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Use implicitly wait to achieve synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Naviagte to Youtube.com
		driver.get("https://youtube.com");
		Thread.sleep(2000);
		//Identify search text field and search for leo song
		driver.findElement(By.name("search_query")).sendKeys("leo song");
		
		//Click on search button
		driver.findElement(By.id("search-icon-legacy")).click();
		
		//Scroll to the song name
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		//je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/IqwIOlhfCak/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDDuVsH8f_j1yK4PhbrwV8F9tuXWg']")));
		Thread.sleep(3000);
		//Click on the song image
		driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/IqwIOlhfCak/hq720.jpg?sqp=-oaymwEpCNAFEJQDSFryq4qpAxsIARUAAIhCGAHYAQHiAQwIGhACGAYgATgBQAE=&rs=AOn4CLDYse081XGZmgfHd4O84kuiAcFKlA']")).click();
		try {
		//Click on skip ads button
		driver.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-skip-button-text']")).click();
	
		}
		catch (Exception e) {
			
		
		
		}
	}

}
