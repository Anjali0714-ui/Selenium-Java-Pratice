package javaPackage;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.facebook.com");
		 
		 // Enter Username
		 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 
		 //Fetch input box attribute value
		 System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		 
		 // Use explicit wait to check if password field is visible
		 WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
	}

}
