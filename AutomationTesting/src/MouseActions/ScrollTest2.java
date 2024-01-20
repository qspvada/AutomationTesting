package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class ScrollTest2 {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//navigate to URL
		driver.get("https://amazon.com");
		
		//Scroll down
		Actions action=new Actions(driver);
//		Thread.sleep(2000);
//		action.scrollByAmount(0, 2000).perform();
//		Thread.sleep(2000);
//		action.scrollByAmount(0, 1000).perform();
//		
//		Thread.sleep(2000);
//		action.scrollByAmount(0, -2000).perform();
		WebElement conjuring = driver.findElement(By.xpath("//span[.='Conjuring 7-Film Collection, The (Blu-ray)']"));
		
//		action.scrollToElement(conjuring).perform();
		
		WheelInput.ScrollOrigin origin=WheelInput.ScrollOrigin.fromElement(conjuring);
		
		action.scrollFromOrigin(origin, 0, -1000).perform();
		
		
	}
}
