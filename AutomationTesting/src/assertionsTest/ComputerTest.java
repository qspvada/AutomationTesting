package assertionsTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ComputerTest {

	@Test
	public void notebook_Computer_001() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		//Verify NoteBooks link is not displayed
		WebElement notebooksLink=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(.,'Notebooks')]"));
		boolean isNotebooksDisplayed = notebooksLink.isDisplayed();
	
		//SoftAssert
		SoftAssert soft=new SoftAssert();
		soft.assertFalse(isNotebooksDisplayed, "Notebooks is Displayed");
		
		//Verify Desktops link is not displayed
		WebElement desktopsLink=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(.,'Desktops')]"));
		boolean isDesktopsDisplayed = desktopsLink.isDisplayed();
		soft.assertFalse(isDesktopsDisplayed, "Desktops is displayed");
		
		//Verify Accessories is not displayed
		WebElement accessoriesLink=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(.,'Accessories')]"));
		boolean isAccessoriesDisplayed=accessoriesLink.isDisplayed();
		soft.assertFalse(isAccessoriesDisplayed,"Accessories is displayed");
		
		//Mouse hover on computer and verify Desktops, Notebooks and Accessories links are displayed
        Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(.,'Computers')]"))).perform();		
		
		//Verify Desktops is displayed 
		isDesktopsDisplayed=desktopsLink.isDisplayed();
		soft.assertTrue(isDesktopsDisplayed,"Desktops is not displayed");
		
		//Verify Notebooks is displayed
		isNotebooksDisplayed=notebooksLink.isDisplayed();
		soft.assertTrue(isNotebooksDisplayed,"Notebooks is not displayed");
		
		//Verify Accessories is displayed
		isAccessoriesDisplayed=accessoriesLink.isDisplayed();
		soft.assertTrue(isAccessoriesDisplayed,"Accessories is not displayed");
		
		//Close browser
		driver.quit();
		
		//Print all the assertion errors.
		soft.assertAll();
	}
}
