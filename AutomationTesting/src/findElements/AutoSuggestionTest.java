package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://google.com");
		
		Thread.sleep(2000);
		
		//Enter dindigul thalappakatti in serach box
		driver.switchTo().activeElement().sendKeys("dindigul thalappakatti");
		
		Thread.sleep(2000);
		
		//Find all the suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span[not(.='')]"));
	
	    //Print the total number of suggestions
		System.out.println(allSuggestions.size());
		
//		Print the text of all the Suggestions
		for (WebElement webElement : allSuggestions) {
			System.out.println(webElement.getText());
		}
		
		driver.quit();
	}
}
