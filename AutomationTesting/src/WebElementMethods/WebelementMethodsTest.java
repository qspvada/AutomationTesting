package WebElementMethods;

import org.checkerframework.checker.units.qual.g;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethodsTest {

	public static void main(String[] args) throws InterruptedException {

		// Launch browser
		WebDriver driver = new ChromeDriver();

		// Maximizze the browser
		driver.manage().window().maximize();

		// Enter the url
		driver.get("https://demowebshop.tricentis.com/");

		/*
		 * isDisplayed
		 */
//		
//		//Verify the regiser link is displayed
//		boolean register=driver.findElement(By.xpath("//a[.='Register']")).isDisplayed();
//	if (register) {
//		System.out.println("test case pass register is displayed");
//	}
//	else System.out.println("Fail");
//	
//	
//	//Verify the Desktops link is not dispalyed
//	boolean desktops = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(.,'Desktops')]")).isDisplayed();
//	
//	if(!desktops) {
//		System.out.println("Test case pass. Desktops is not displayed");
//	}
//	else {
//		System.out.println("Fail");
//	}

		/*
		 * isSelected
		 */

//		// Verify the radio button is selected or not
//		boolean before=driver.findElement(By.id("pollanswers-1")).isSelected();
//
//		driver.findElement(By.id("pollanswers-1")).click();
//
//		// Verify the radio button is selected or not
//		boolean after=driver.findElement(By.id("pollanswers-1")).isSelected();
//		
//		
//		if(after && !before) System.out.println("Pass");
//		else System.out.println("Fail");
		
		
		
		/*
		 * submit()
		 */
		
//		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
//		driver.findElement(By.id("small-searchterms")).submit();
		
//		driver.findElement(By.xpath("//span[@class='ui-helper-hidden-accessible']")).submit();
//		Thread.sleep(3000);
		
		
		
		/*
		 * getText()
		 */
//		String giftCardText=driver.findElement(By.partialLinkText("Gift Cards")).getText();
//		
//		if(giftCardText.equals("Gift Cards")) System.out.println("Test case pass");
//		else System.out.println("Fail");
//		

		/*
		 * getAttribute()
		 */
//		System.out.println(driver.findElement(By.id("name")).getAttribute("placeholder"));
		
		
		/*
		 * getCssValue()
		 * 
		 */
//	System.out.println(	driver.findElement(By.partialLinkText("Register")).getCssValue("color"));
		
		
		/*
		 * getTagName()
		 * 
		 */
		
//		System.out.println(	driver.findElement(By.partialLinkText("Register")).getTagName());
		
		
		/*
		 * getSize()
		 */
		
//		driver.findElement(By.partialLinkText("Register")).click();
//		
//		Thread.sleep(1000);
//		int firstNameHeight = driver.findElement(By.id("FirstName")).getSize().getHeight();
//		int firstNameWidth = driver.findElement(By.id("FirstName")).getSize().getWidth();
//		//System.out.println("Width of name Text field: "+driver.findElement(By.id("FirstName")).getSize().width);
//
//		
//		int lastNameHeight = driver.findElement(By.id("LastName")).getSize().getHeight();
//		int lastNameWidth = driver.findElement(By.id("LastName")).getSize().getWidth();
//		
//		
//		if (firstNameHeight==lastNameHeight && firstNameWidth==lastNameWidth) {
//			System.out.println(firstNameHeight);
//			System.out.println(lastNameHeight);
//			System.out.println();
//			
//			System.out.println(firstNameWidth);
//			System.out.println(lastNameWidth);
//			
//			System.out.println("\n Test case pass");
//			
//		}
//		else 
//		{System.out.println(firstNameHeight);
//		System.out.println(lastNameHeight);
//		System.out.println();
//		
//		System.out.println(firstNameWidth);
//		System.out.println(lastNameWidth);
//			System.out.println("\nTest case fail");
//		}
		
		
		
		
		/*
		 * getLocation
		 */
//		
//		driver.findElement(By.partialLinkText("Register")).click();
//		System.out.println(driver.findElement(By.id("FirstName")).getLocation().y);
		
		
		
		/*
		 * getRect()
		 */
		driver.findElement(By.partialLinkText("Register")).click();
		System.out.println(driver.findElement(By.id("FirstName")).getRect().height+" Height");
		System.out.println(driver.findElement(By.id("FirstName")).getRect().width+" width");
		System.out.println(driver.findElement(By.id("FirstName")).getRect().x+" X");
		System.out.println(driver.findElement(By.id("FirstName")).getRect().y+ " Y");
		driver.quit();

	}

}
