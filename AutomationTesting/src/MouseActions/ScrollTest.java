package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class ScrollTest {
public static void main(String[] args) throws InterruptedException {
	
	//Launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	
	//Maximize the browser window
	driver.manage().window().maximize();
	
	//navigate to url
	driver.get("https://www.swiggy.com/");
	
	
	Actions action=new Actions(driver);
	Thread.sleep(2000);
	
	//Scroll down the window
	action.scrollByAmount(0, 1000).perform();
	
	Thread.sleep(2000);

	WebElement purulia = driver.findElement(By.xpath("//a[.='purulia']"));
	
	//Scroll until Purulia is visible in the web page
	action.scrollToElement(purulia).perform();
	
	Thread.sleep(2000);
	WheelInput.ScrollOrigin origin=WheelInput.ScrollOrigin.fromElement(purulia);

    //Scroll down from origin
	action.scrollFromOrigin(origin, 0, 1000).perform();
	Thread.sleep(2000);
	
	//Scroll up
	action.scrollByAmount(1000, -1000).perform();
}
}
