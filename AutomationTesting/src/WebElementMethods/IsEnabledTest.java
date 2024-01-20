package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the url
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(2000);
		
		boolean registerButton = driver.findElement(By.xpath("//button[.='Register']")).isEnabled();
		
		System.out.println("Before enter credentials: "+registerButton);
		
		
		driver.findElement(By.id("name")).sendKeys("Gopal");
		
		driver.findElement(By.id("email")).sendKeys("sriram@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("sriram@420");
		
		boolean registerButtonAfterEnterData = driver.findElement(By.xpath("//button[.='Register']")).isEnabled();
		
		System.out.println("After enter credentials "+registerButtonAfterEnterData);
		
		if(registerButton==false && registerButtonAfterEnterData==true) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		//Close browser
		driver.quit();
	}
}
