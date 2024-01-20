package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://demoapps.qspiders.com/");

		// Click on button link
		driver.findElement(By.xpath("//section[.='Button']")).click();

		// Click on double click link
		driver.findElement(By.xpath("//a[.='Double Click']")).click();

		// Double click on Yes button
		WebElement yesButton = driver
				.findElement(By.xpath("//p[contains(.,'1. Are you')]//following-sibling::button[.='Yes']"));
		Actions action = new Actions(driver);

		action.doubleClick(yesButton).perform();
		if (driver.findElement(By.xpath("//p[contains(.,'1. Are you')]//following-sibling::span")).getText()
				.equals("You selected \"Yes\"")) {
			System.out.println("Test case is Passed");

		} else {
			System.out.println("test case is failed");
		}
	}
}
