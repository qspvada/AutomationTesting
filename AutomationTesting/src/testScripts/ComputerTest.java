package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;

public class ComputerTest extends BaseClass {

	@Test
	public void bookstest1() {
		Reporter.log("Test case 1",true);
		
		driver.findElement(By.linkText("BOOKS")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText(), "Books");
	}

	
	@Test
	public void addBookToCartTest() {
		Reporter.log("Add book to cart test",true);
		driver.findElement(By.linkText("BOOKS")).click();
		
		driver.findElement(By.xpath("//h2/a[.='Computing and Internet']/../..//input")).click();
	}

	@Test
	public void bookstest() {
		Reporter.log("Books test 2",true);
        driver.findElement(By.linkText("COMPUTERS")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText(), "Computers");
	
	}
	
	
}
