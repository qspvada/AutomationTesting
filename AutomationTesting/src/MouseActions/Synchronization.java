package MouseActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	//Script to get the text of all the liks present in shoppersstack home page
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement element:allLinks) {
			System.out.println(element.getText());
		}
	}
}
