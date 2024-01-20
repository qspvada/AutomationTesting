package screenshotTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
        JavascriptExecutor je=(JavascriptExecutor) driver;
        Thread.sleep(2000);

		 je.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//h2[.='Work from home essentials']")));
		
		File temp=driver.findElement(By.xpath("//h2[.='New looks for the new season']/../../..")).getScreenshotAs(OutputType.FILE);
	
		File dest=new File("./Screenshots/amazon.png");
		
		FileHandler.copy(temp, dest);
	
		
	}
}
