package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Naviagte to url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(2000);
		
		WebElement rome = driver.findElement(By.id("box6"));
		
		
		WebElement italy = driver.findElement(By.id("box106"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(rome, italy).perform();
	}
}
