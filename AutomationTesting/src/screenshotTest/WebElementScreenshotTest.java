package screenshotTest;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshotTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Launch browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://facebook.com");
		Thread.sleep(2000);

		// Get the current date and time
		LocalDateTime systemDate = LocalDateTime.now();

		// Replace : and - with underscore(_)
		String date = systemDate.toString().replace("-", "_").replace(":", "_");

		// Identify the login button
		WebElement loginButton = driver.findElement(By.cssSelector("[alt=Facebook]"));

		// Get the screenshot of login button
		File temp = loginButton.getScreenshotAs(OutputType.FILE);

		// Concatenate date with photo name
		File perm = new File("./Screenshots/" + date + ".png");

		// Copy photo from temporary file to permanent file
		FileHandler.copy(temp, perm);
		
		Thread.sleep(2000);

		// Close the browser
		driver.quit();
	}
}
