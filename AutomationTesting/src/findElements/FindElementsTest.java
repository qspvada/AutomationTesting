package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to website
		driver.get("https://demoapps.qspiders.com/checkbox");
		
		Thread.sleep(2000);
		
		//Find all Check boxes
		List<WebElement> allChekBox = driver.findElements(By.xpath("//input[@type='cckbox']"));
		
		//Print the total number of Check boxes
		System.out.println(allChekBox.size());
		
		//Select all the checkboxes
		for (WebElement webElement : allChekBox) {
		webElement.click();
		}
		
		//Close the browser
		driver.quit();
	}
}
