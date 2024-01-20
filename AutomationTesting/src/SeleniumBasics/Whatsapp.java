package SeleniumBasics;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://web.whatsapp.com/");
		
		driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']/..")).sendKeys("own group");
	
		driver.findElement(By.xpath("//span//span[.='own group']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='to2l77zo gfz4du6o ag5g9lrv bze30y65 kao4egtt']")).sendKeys("7090046379",Keys.ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[.='7090046379']/../..")).click();
		
		
		driver.findElement(By.xpath("//span[.='+91 70900 46379']/..")).click();
		
		driver.findElement(By.xpath("(//div[@role='button'])[31]")).click();
		
		File f=new File("C:\\Users\\User\\Desktop\\Mouse and keyboard actions.txt");
		String path=f.getAbsolutePath();
		driver.findElement(By.xpath("//span[.='Photos & Videos']")).sendKeys(path);
		
	}
}
