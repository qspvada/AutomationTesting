package popUpHandling;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) {
		
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to url
		driver.get("https://demoapps.qspiders.com/");
		
		//Click on Popups
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		
		// Click on File Uploads
		driver.findElement(By.xpath("//section[.='File Uploads']")).click();
	
	
		File f=new File("C:\\Users\\User\\Desktop\\resume.pdf");
		
		String path	=	f.getAbsolutePath();
		
		
		//Click on Choose file button
		driver.findElement(By.id("fileInput")).sendKeys(path);
	
		
		
	
	}
}
