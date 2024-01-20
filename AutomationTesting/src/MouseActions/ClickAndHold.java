package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Enter the url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(2000);
		
		//Click and hold tyhe Madrid button
		WebElement madridButton = driver.findElement(By.id("box1"));
		
		WebElement spain = driver.findElement(By.id("box107"));
		
		Actions action=new Actions(driver);
		
		action.clickAndHold(madridButton).perform();
		
		action.release(spain).perform();
	}
}
