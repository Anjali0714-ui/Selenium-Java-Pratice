package javaPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 class OpenApplication1 
 {
	 public static void main(String[] args) throws InterruptedException
	 {
		// TODO Auto-generated method stub
		 System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com");
		 
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 driver.manage().deleteAllCookies();
		 
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.google.com");
		 
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 
		 Thread.sleep(2000);
		 driver.close();
		 
		}

}
