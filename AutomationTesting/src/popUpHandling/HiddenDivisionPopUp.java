package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("._18u87m._3WuvDp")).sendKeys("saran@gmail.com");
		
		driver.findElement(By.xpath("//button[.='Request OTP']")).click();
		
		//driver.findElement(By.xpath("//span[.='✕']")).click();
		System.out.println(driver.findElement(By.xpath("//span//span[.='Mobiles']")).getText());
//	driver.findElement(By.name("q")).sendKeys("mobile for Neha");
	
	}
}
