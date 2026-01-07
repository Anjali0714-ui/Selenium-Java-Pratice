package javaPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	    public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        Thread.sleep(3000);
	        System.out.println(driver.getTitle());
	     
	     
	        driver.quit();
	    }
	}


