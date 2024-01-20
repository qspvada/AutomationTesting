package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeTest {

	
	@Test
	public void register() {
	System.out.println("register");
	}
	@AfterMethod
	public void am() {
		System.out.println("am");
	}
	@BeforeSuite
	public void bs() {
		System.out.println("BeforeSuit");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("AfterSuit");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("BT");
	}
	
	@AfterTest
	public void at() {
		System.out.println("at");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("BC");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("AC");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("bm");
	}
	
	@Test
	public void addToCart() {
		System.out.println("Add to acrt");
	}
//	
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("Login");
	}
//	
}
