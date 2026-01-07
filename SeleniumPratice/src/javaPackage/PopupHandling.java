package javaPackage;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/browser-windows");
		
		// Step1 Tab Handling
		Thread.sleep(2000);
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('tabButton').click()");
		
		// get the total no.of tabs /windows
		
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID); 
		Iterator<String> abc = allWindowsID.iterator();
		String win1 = abc.next();
		String win2 = abc.next();
		
		// print the title of parent window
		
		driver.switchTo().window(win1);
		System.out.println("Parent Window Id:" +win1);
		System.out.println(driver.getTitle());
		
		
		// Print the current Url of child tab
		
		Thread.sleep(2000);
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println("child Window Id:" +win2);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		// Step 2 window /popup handling
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('windowButton').click()");
		
		// print the title of child window
		Set<String> allWindowsID2 = driver.getWindowHandles();
		System.out.println(allWindowsID2);
		Iterator<String> abc1 = allWindowsID2.iterator();
		String win3 = abc1.next();
		String win4 = abc1.next();
		Thread.sleep(2000);
		System.out.println("child Window Id:" +win4);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
		System.out.println("windows popup and tab handled");
		
		}

}
