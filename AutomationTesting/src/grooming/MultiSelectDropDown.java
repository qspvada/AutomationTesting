package grooming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//label[.='Country']/..//select"));
	
		Select select=new Select(dropdown);
		
		select.selectByIndex(4);
		select.selectByVisibleText("India");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Canada");
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.deselectByVisibleText("United States");
		select.deselectByValue("Canada");
		
		select.deselectByVisibleText("India");
	select.deselectAll();
		
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		driver.quit();
	}
}
