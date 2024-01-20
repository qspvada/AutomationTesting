package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.swiggy.com/");
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
//		action.keyDown(Keys.ARROW_DOWN).perform();
//		action.keyUp(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		
		action.keyDown(Keys.PAGE_DOWN).perform();
		action.keyUp(Keys.PAGE_DOWN).perform();
		
		 WebElement searchFiled = driver.findElement(By.id("location"));
	
	    action.keyDown(searchFiled, Keys.SHIFT).sendKeys("chennai").keyUp(Keys.SHIFT).sendKeys("vadapalani").perform();
	}
}
