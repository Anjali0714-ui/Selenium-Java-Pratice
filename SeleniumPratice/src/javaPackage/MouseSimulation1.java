package javaPackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		// Create a electronic web Element Ref
		
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		
		//Mouse hover to electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Mobiles']")).click();
		
		//KeyBoard Operation
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("Men Option Clicked");
		
		//Right click on web Page
			
		Thread.sleep(2000);
		act.contextClick().build().perform();
		act.sendKeys(men, Keys.ENTER).build().perform();
		act.sendKeys(men, Keys.ENTER).build().perform();
		act.contextClick(electro).build().perform();
	}

}
