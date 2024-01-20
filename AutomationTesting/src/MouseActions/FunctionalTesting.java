package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FunctionalTesting {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Navigate to website
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		//Identify the computersLink
		WebElement computersLink=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(.,'Computers')]"));
		
		Actions action=new Actions(driver);
		
		//Move mouse cursor on top of computers link
		action.moveToElement(computersLink);
		//Click on Desktops link
		WebElement desktopsLink=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(.,'Desktops')]"));
		
		action.click(desktopsLink).perform();
		
		String expectedResult="Desktops";
		
		String actualResult=driver.findElement(By.xpath("//h1")).getText();
		
		if(expectedResult.equals(actualResult)) {
			System.out.println(actualResult);
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("test case is failed");
		}
	}
}
