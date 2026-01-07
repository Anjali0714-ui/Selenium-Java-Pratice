package javaPackage;
import java.time.Duration;
import java.util.concurrent.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseSimulation2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable");
		
		// Switching Frame
		
		driver.switchTo().frame(0);
		
		// Draggable Web Element
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		// Dropable Web Element
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		// Drag and Drop
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
