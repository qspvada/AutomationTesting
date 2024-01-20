package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Enter the URL
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		
		Thread.sleep(2000);
		
		//Clear Email text field
		driver.findElement(By.id("email")).clear();
		
		//Clear password text field
		driver.findElement(By.id("password")).clear();
		
		//Enter email
		driver.findElement(By.id("email")).sendKeys("anirudh@gmail.com");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("1234567890");
	}
}
