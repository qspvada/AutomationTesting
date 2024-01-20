package popUpHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingChildPopUp {

	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Navigate to web page
		driver.get("https://www.shoppersstack.com/products_page/3");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Click on compare link
		 WebElement elemenet = driver.findElement(By.id("compare"));
		Thread.sleep(2000);
		
		//Get the address of current window
		String parentWindow=driver.getWindowHandle();
		
		//System.out.println(parentWindow);
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		for (String child : allWindows) {
			driver.switchTo().window(child);
		
			if(driver.getCurrentUrl().contains("flipkart.com")) {
				break;
			}
		}
		
		
		driver.switchTo().window(parentWindow);
		
		//driver.manage().window().maximize();
		
//		if (allWindows.size()==4) {
//			System.out.println("Pass");
//		}
//		else System.out.println("Fail");
		
		
		Thread.sleep(5000);
		
		
		
		
		
	Actions action=new Actions(driver);
	
	action.moveToElement(elemenet).perform();
	
	action.click(elemenet).perform();
	
	action.contextClick(elemenet).perform();
	
	action.doubleClick(elemenet).perform();
	
	action.dragAndDrop(elemenet, elemenet).perform();
	
	action.clickAndHold(elemenet).perform();
	
	action.release(elemenet).perform();
	
	action.scrollByAmount(0, -2000).perform();
	
	action.scrollToElement(elemenet).perform();
	
	WheelInput.ScrollOrigin origin=WheelInput.ScrollOrigin.fromElement(elemenet);
	
	action.scrollFromOrigin(origin, 0, -2000).perform();
		
	
	action.keyDown(Keys.ARROW_DOWN).perform();
	action.keyUp(Keys.ARROW_DOWN).perform();
	action.keyDown(elemenet, Keys.ARROW_UP);
	
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
