package screenshotTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenShotTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		////Navigate to webpage
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		
		//Type cast WebDriver reference to  TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Take WebPage Screenshot
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		//Create a new File
		File permanent=new File("./Screenshots/photo.png");
		
		//Copy Photo from temporary file to permanent file 
		FileHandler.copy(temp, permanent);
		
		//Close the browser
		driver.close();
	}
}
