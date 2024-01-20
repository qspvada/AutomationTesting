package DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdownTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to webpage
		driver.get("https://demowebshop.tricentis.com/books?orderby=11");
		
		//Find sort by dropdown
		WebElement sortBy=driver.findElement(By.id("products-orderby"));
		
		//Create object of Select class to handle Sort By drop down
		Select select=new Select(sortBy);
		
		//Check the drop down is single select or multi select
		System.out.println(select.isMultiple());
		
		//Select the option using index
		select.selectByIndex(2);

		//Select option using value
		select.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
		
		//Select option using Visible text
		select.selectByVisibleText("Created on");
		Thread.sleep(2000);
		
		//Find Page size drop down
		WebElement pageSize = driver.findElement(By.id("products-pagesize"));
		
		//Create object of select class to handle page size drop down
		Select select2=new Select(pageSize);
		
		//Select option by using index
		select2.selectByIndex(2);
		
		//Call deselect option to single select drop down
//		select.deselectAll(); //This method will throw UnsupportedOperationException
		
		//Find all the options from the Sort By drop down
		List<WebElement> allOptions = select.getOptions();
		
		//Print the text of all options of Sort By drop down
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
		}
		
		//Find all the options from the Page Size drop down
		List<WebElement> allPageOptions = select2.getOptions();
		
		System.out.println();
		
		//Print the text of all options of Sort By drop down
		for (WebElement webElement : allPageOptions) {
			System.out.println(webElement.getText());
		}
		
		//Close the browser
		driver.quit();
		
		
	}
}
