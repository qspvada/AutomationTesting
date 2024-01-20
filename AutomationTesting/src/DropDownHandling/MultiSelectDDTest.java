package DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDDTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to web page
		driver.get("file:///C:/Users/User/Desktop/msdd.html");
		
		//Find the multi-select dropdown
		WebElement multiSelectDropDown = driver.findElement(By.id("s1"));
		
		//Creating Select class object
		Select select=new Select(multiSelectDropDown);
		
		//Check the drop down in single select or multi select
		System.out.println(select.isMultiple());
		
		//Select option by using index
		select.selectByIndex(3);
		Thread.sleep(1000);
		
		//Select option by using value
		select.selectByValue("sql");
		Thread.sleep(1000);
		
		//Select option by using Visible text
		select.selectByVisibleText("Manual Testing");
		Thread.sleep(3000);
		
		//get all the Selected options from the drop down
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		//Print the text of all selected options
		for (WebElement webElement : selectedOptions) {
			System.out.println(webElement.getText());
		}
		
		//Print the text of first selected option
		System.out.println(select.getFirstSelectedOption().getText());
		
		//Print the text of all options using getWrappedElement()
		System.out.println("  \nwrapped elements");
		System.out.println(select.getWrappedElement().getText());
		
		//Deselect option by using Index
		select.deselectByIndex(1);
		
		//Deselect option by using Value
		select.deselectByValue("manual");
		
		//Deselect option by using Visible text
		select.deselectByVisibleText("Selenium");
		
		//Deselect all options  
		select.deselectAll();
		
		//Close the browser
		driver.quit();
	}
}
