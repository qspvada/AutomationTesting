package grooming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author User
 *
 */
public class HandlingDropDowns {
	
	/**
	 * This method will do the login test
	 */
	public static void logintest() {
		
	}
	
public static void main(String[] args) throws InterruptedException {
	
	//Launch browser
	ChromeDriver driver=new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Navigate to url
	driver.get("https://demowebshop.tricentis.com/");
	
	//Click on Books
	driver.findElement(By.partialLinkText("Books")).click();
	
	Thread.sleep(2000);
	//Identify the dropdown
	WebElement dropDown = driver.findElement(By.id("products-orderby"));
	
	Select select=new Select(dropDown);
	
	//Check it is single select or multi select dropdown
	
	select.deselectByIndex(0);
	List<WebElement> allOptions = select.getOptions();
	
	//System.out.println(select.isMultiple());

	//select.selectByIndex(2);
	
	//select.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
	
	select.selectByVisibleText("Created on");
	select.deselectByIndex(1);
	
	
}
}
