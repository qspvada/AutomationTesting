package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
       
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		
		Select select=new Select(dropdown);
		
		//To check the drop down is single select or multi select
		System.out.println(select.isMultiple());
		
		//To select the option using index
		select.selectByIndex(2);
//		select.selectByIndex(3);
		
		dropdown = driver.findElement(By.id("products-orderby"));
		select=new Select(dropdown);
		//To Select the option by using value
		select.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
		
//		dropdown = driver.findElement(By.id("products-orderby"));
//		select=new Select(dropdown);
//		
//		//To select the option using visible text
//		select.selectByVisibleText("Price: Low to High");
//		Thread.sleep(2000);
//		
//		//To get all the options 
//		List<WebElement> allOptions = select.getOptions();
//		
//		for(WebElement element:allOptions) {
//			System.out.println(element.getText());
//		}
		driver.quit();
		
		
	}
}
