import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeTest {

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			//Launch chrome browser
			WebDriver driver = new ChromeDriver();
			
			//maximize the window
			driver.manage().window().maximize();
			
			//Create WebDriverWait object 
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			//Using implicitlyWait() for findElement and findElements
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//navigate to webpage
			driver.get("https://youtube.com");
	        Thread.sleep(2000);
			
	        //Enter song name 
	        driver.findElement(By.name("search_query")).sendKeys("Leo song");
			Thread.sleep(2000);
			
			//click on Search button
			driver.findElement(By.id("search-icon-legacy")).click();
	      
			//Create object of Actions class
			Actions action=new Actions(driver);
			
			//Scroll window till song is visible
			action.scrollToElement(driver.findElement(By.xpath("//yt-formatted-string[.='LEO - Naa Ready Song Video | Thalapathy Vijay | Lokesh Kanagaraj | Anirudh Ravichander']")));		
			Thread.sleep(2000);
			
			//Click on song name
			driver.findElement(By.xpath("//yt-formatted-string[.='LEO - Naa Ready Song Video | Thalapathy Vijay | Lokesh Kanagaraj | Anirudh Ravichander']")).click();
			Thread.sleep(2000);
			
			//Click on full screen button
			driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();

			try {
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath("//div[.='Skip']/../..//button")));
				
				//Click on skip ad button
				driver.findElement(By.xpath("//div[.='Skip']/../..//button")).click();
			} catch (Exception e) {
				System.out.println("Skip add not found");
			}

			try {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='No thanks']")));
			
				//Click on No Thanks button
				driver.findElement(By.xpath("//yt-button-renderer[@id='dismiss-button']")).click();

			} catch (Exception e) {
				System.out.println("No thanks not found");
			}

			Thread.sleep(5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@title='Pause (k)']")));
		
			//Click on pause button
			driver.findElement(By.xpath("//button[@title='Pause (k)']")).click();
			Thread.sleep(5000);

			//Resume the video
			driver.findElement(By.xpath("//video")).click();
			Thread.sleep(5000);

			// click on escape button
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			
			//Clear search text field
			driver.findElement(By.name("search_query")).clear();
			Thread.sleep(1000);
			
			//Enter video name
			driver.findElement(By.name("search_query")).sendKeys("kgf 2 tamil shooting scene", Keys.ENTER);
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//a[@href='/watch?v=9PBvOwwdxvg&pp=ygUaa2dmIDIgdGFtaWwgc2hvb3Rpbmcgc2NlbmU%3D']/../..")));
			
			//Click on the video
			driver.findElement(
					By.xpath("//a[@href='/watch?v=9PBvOwwdxvg&pp=ygUaa2dmIDIgdGFtaWwgc2hvb3Rpbmcgc2NlbmU%3D']/../.."))
					.click();
			
			//Full screen the video
			driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();

			try {
				wait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath("//div[.='Skip']/../..//button")));
				
				//Click on "Skip ad" button
				driver.findElement(By.xpath("//div[.='Skip']/../..//button")).click();
			} catch (Exception e) {
				System.out.println("Skip add not found");
			}
			Actions action1=new Actions(driver);
			
			for(int i=0;i<17;i++) {
			action1.keyDown(Keys.ARROW_RIGHT).perform();
			action1.keyUp(Keys.ARROW_RIGHT).perform();
			Thread.sleep(100);
			}
			
			try {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='No thanks']")));
				
				//Click on No thanks button
				driver.findElement(By.xpath("//yt-button-renderer[@id='dismiss-button']")).click();

			} catch (Exception e) {
				System.out.println("No thanks not found");
			}
			Thread.sleep(5000);

			//Close browser
			driver.quit();
		}
}
