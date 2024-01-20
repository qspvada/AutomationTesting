package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinksTest {

	
	public static void main(String[] args) throws InterruptedException {
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to web page
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		//Get the text of all the links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for (WebElement webElement : allLinks) {
			System.out.println(webElement.getText());
		}
		
		//Print total number of links.
		System.out.println(allLinks.size());
	}
}
