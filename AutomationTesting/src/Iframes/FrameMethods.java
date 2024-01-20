package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FrameMethods {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
				WebDriver driver=new ChromeDriver();
				
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Navigate to web page
				driver.get("https://demoapps.qspiders.com/");
				Thread.sleep(2000);
				//Click on Iframes
				driver.findElement(By.xpath("//section[.='Frames']")).click();
				Thread.sleep(2000);
				//Click on iframes
				driver.findElement(By.xpath("//section[.='iframes']")).click();
				Thread.sleep(2000);
				
				WebElement loginIframe = driver.findElement(By.cssSelector("[title='Login Form']"));
				
				//Switch to Iframe using iframe WebElement
				driver.switchTo().frame(loginIframe);
				driver.findElement(By.id("username")).sendKeys("Deepika");
	}
}
