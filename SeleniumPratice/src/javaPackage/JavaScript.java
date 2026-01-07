package javaPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		
		// javascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// locate web element using javascript
		
		jse.executeScript("document.getElementById('email').value='abc@gmail.com';");
		jse.executeScript("document.getElementsByName('pass')[0].value='abc123';");
		jse.executeScript("document.getElementsByName('login')[0].click();");
		
		//scroll down using javascript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");
		

		//scroll up using javascript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-500)");
		
	}

}
