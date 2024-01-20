package grooming;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/fileUpload");
		
		Thread.sleep(2000);

		
		File file=new File("C:\\Users\\User\\Desktop\\Selenium Folder\\selenium notes 2.pdf");
		
	
		driver.findElement(By.id("fileInput")).sendKeys(file.getAbsolutePath());
		
	}
}
