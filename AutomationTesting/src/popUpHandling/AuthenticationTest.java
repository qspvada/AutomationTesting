package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationTest {

	public static void main(String[] args) {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Navigate to URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
