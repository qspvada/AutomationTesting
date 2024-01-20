package grooming;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");
		
		
		Thread.sleep(2000);
	
         TakesScreenshot ts=(TakesScreenshot) driver;
//        File src=ts.getScreenshotAs(OutputType.FILE);
         
         File src = driver.findElement(By.partialLinkText("HOLIDAYS")).getScreenshotAs(OutputType.FILE);
        
         String date=LocalDateTime.now().toString();
         
         date= date.toString().replace(":", "_").replace("-", "_");
         
       File dest=new File("./Screenshots/"+date+"_photo.png");
        
        
        
        FileHandler.copy(src, dest);
        
         
	}
}
