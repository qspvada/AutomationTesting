package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {
public static void main(String[] args) throws InterruptedException {
	//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to url
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		//Click on Popups
		driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
		Thread.sleep(2000);
		
		//click on Date
		driver.findElement(By.xpath("//section[.='Date Picker']")).click();
		Thread.sleep(2000);
		//Click on Select A Date
		driver.findElement(By.cssSelector("[placeholder='Select A Date']")).click();
		Thread.sleep(2000);
		
		//Get the text of month and year from calendar
		WebElement month=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));
		
		//Compare the month and year and click on previous month button
		while(!(month.getText().equals("May 2001"))) {
			
			driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
		}
		//Click on the date of birth
		driver.findElement(By.xpath("//div[.='4']")).click();
		
		Thread.sleep(4000);
		
		//Close the browser
		driver.quit();
}
}
