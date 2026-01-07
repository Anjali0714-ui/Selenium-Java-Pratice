package javaPackage;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/alerts");
		
		//Accept Alert - Using javascript Executor
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		//Dismiss the alert '
		
	
		jse.executeScript("document.getElementById('confirmButton').click()");
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dissimed");
		

	}

}
