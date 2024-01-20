package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demoapps.qspiders.com/");
		
		//Click on button link
		driver.findElement(By.xpath("//section[.='Button']")).click();
		
		//Click on Right click button
		driver.findElement(By.xpath("//a[.='Right Click']")).click();
		
		//Right click on first Right click button
		WebElement rightClickButton = driver.findElement(By.xpath("//p[contains(.,'1. Are you satisfied')]/..//button"));
	
		//Create the object of Actions class
		Actions action=new Actions(driver);
		
		//Perform rightClick action on rightClick button
		action.contextClick(rightClickButton).perform();
		
		//Click on the yes button
		driver.findElement(By.xpath("//div[.='Yes']")).click();
		
		//Verify the message
		String message=driver.findElement(By.xpath("//p[contains(.,'1. Are you')]//following-sibling::span")).getText();

	   if(message.equals("You selected \"Yes\"")) {
		   System.out.println("Test case is passed");
	   }
	   else {
		   System.out.println("Test case is failed");
	   }
	}
}
