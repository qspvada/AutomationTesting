package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		//Open browser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.com");
		
		Thread.sleep(2000);
		
	System.out.println(	driver.findElement(By.id("nav-logo")).isDisplayed());
	
	driver.quit();
	}
}
