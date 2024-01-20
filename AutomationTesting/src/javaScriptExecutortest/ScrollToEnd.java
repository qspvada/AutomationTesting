package javaScriptExecutortest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToEnd {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.zomato.com/india");
	
	Thread.sleep(4000);
	
	JavascriptExecutor je=(JavascriptExecutor) driver;
	
	//Scroll to bottom of the page using scrollBy()
//	je.executeScript("window.scrollBy(0,document.body.scrollHeight);");

	//Scroll to Bottom of the page using scrollTo()
	je.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	
	//Scroll to  the top of the page
	je.executeScript("window.scrollTo(0,0);");
}
}
